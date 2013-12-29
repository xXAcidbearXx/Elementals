package net.tds.elementals.client.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.tds.elementals.item.ItemSpawningCrystal;
import net.tds.elementals.packet.PacketUpdatePetName;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiPetName extends GuiScreen {

	private GuiTextField nameField;

	private final ItemStack petStack;
	private GuiButton doneBtn;
	private GuiButton cancelBtn;

	public GuiPetName(ItemStack stack) {

		this.petStack = stack;
	}

	public void updateScreen() {
		this.nameField.updateCursorCounter();
	}

	public void initGui() {

		Keyboard.enableRepeatEvents(true);
		this.buttonList.clear();
		this.buttonList.add(this.doneBtn = new GuiButton(0, this.width / 2 - 100, this.height / 4 + 96 + 12, I18n.getString("gui.done")));
		this.buttonList.add(this.cancelBtn = new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 + 12, I18n.getString("gui.cancel")));
		this.nameField = new GuiTextField(this.fontRenderer, this.width / 2 - 150, 60, 300, 20);
		this.nameField.setMaxStringLength(18);
		this.nameField.setFocused(true);
		this.doneBtn.enabled = this.nameField.getText().trim().length() > 0;
	}

	public void onGuiClosed() {

		Keyboard.enableRepeatEvents(false);
	}

	protected void actionPerformed(GuiButton button) {

		if (button.enabled) {

			if (button.id == 1) {

				closeGui();
			} 

			else if (button.id == 0) {

				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				DataOutputStream dos = new DataOutputStream(baos);

				if (this.petStack != null && this.petStack.getItem() != null && this.petStack.getItem() instanceof ItemSpawningCrystal) {

					try {
						
						dos.writeUTF(this.nameField.getText().trim());
						dos.writeUTF(this.mc.thePlayer.username);
						dos.writeInt(this.mc.theWorld.provider.dimensionId);
						Packet250CustomPayload packet = new PacketUpdatePetName(baos.toByteArray());
						PacketDispatcher.sendPacketToAllPlayers(packet);
					} catch(Exception e) {
						
						e.printStackTrace();
					}
				}
				closeGui();
			}
		}
	}
	
	private void closeGui() {
		
		this.mc.displayGuiScreen(null);
		this.mc.setIngameFocus();
	}

	protected void keyTyped(char par1, int par2) {

		this.nameField.textboxKeyTyped(par1, par2);
		this.doneBtn.enabled = this.nameField.getText().trim().length() > 0;

		if (par2 != 28 && par2 != 156) {

			if (par2 == 1) {

				this.actionPerformed(this.cancelBtn);
			}

		} 

		else {

			this.actionPerformed(this.doneBtn);
		}
	}

	protected void mouseClicked(int par1, int par2, int par3) {

		super.mouseClicked(par1, par2, par3);
		this.nameField.mouseClicked(par1, par2, par3);
	}

	public void drawScreen(int par1, int par2, float par3) {

		this.drawDefaultBackground();
		this.drawCenteredString(this.fontRenderer, I18n.getString("gui.petName.title"), this.width / 2, 20,16777215);
		this.drawString(this.fontRenderer, I18n.getString("gui.petName.box"), this.width / 2 - 150, 47, 10526880);
		this.drawString(this.fontRenderer, I18n.getString("gui.petName.info"), this.width / 2 - 150, 97, 10526880);
		this.nameField.drawTextBox();
		super.drawScreen(par1, par2, par3);
	}
}