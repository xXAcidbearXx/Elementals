package net.tds.magicpets.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWaterBoss extends ModelBase {

	public static ModelRenderer T1;
	public static ModelRenderer T2;
	public static ModelRenderer T3;
	public static ModelRenderer T4;
	public static ModelRenderer T5;
	public static ModelRenderer T6;
	public static ModelRenderer T7;
	public static ModelRenderer T8;
	public static ModelRenderer N1;
	public static ModelRenderer N2;
	public static ModelRenderer H1;
	public static ModelRenderer H2;
	public static ModelRenderer H3;
	public static ModelRenderer H4;
	public static ModelRenderer H5;
	public static ModelRenderer H6;
	public static ModelRenderer H7;
	public static ModelRenderer H8;
	public static ModelRenderer H9;
	public static ModelRenderer H10;
	public static ModelRenderer H11;
	public static ModelRenderer S1;
	public static ModelRenderer S2;
	public static ModelRenderer S3;
	public static ModelRenderer S4;
	public static ModelRenderer S5;
	public static ModelRenderer S6;
	public static ModelRenderer S7;
	public static ModelRenderer S8;
	public static ModelRenderer S9;
	public static ModelRenderer S10;
	public static ModelRenderer S11;
	public static ModelRenderer S12;
	public static ModelRenderer S13;
	public static ModelRenderer S14;
	public static ModelRenderer S15;
	public static ModelRenderer S16;
	public static ModelRenderer S17;
	public static ModelRenderer S18;
	public static ModelRenderer S19;
	public static ModelRenderer S20;
	public static ModelRenderer S21;

	public ModelWaterBoss() {
		
		textureWidth = 83;
		textureHeight = 254;

		T1 = new ModelRenderer(this, 0, 68);
		T1.addBox(0.5F, 0.5F, 4F, 0, 4, 17);
		T1.setRotationPoint(-0.5F, 17.5F, 71F);
		T1.setTextureSize(83, 254);
		T1.mirror = true;
		setRotation(T1, 0F, 0F, 0F);
		T2 = new ModelRenderer(this, 0, 169);
		T2.addBox(-5.5F, -4F, 0F, 11, 11, 16);
		T2.setRotationPoint(0F, 16.5F, 16F);
		T2.setTextureSize(83, 254);
		T2.mirror = true;
		setRotation(T2, 0F, 0F, 0F);
		T3 = new ModelRenderer(this, 0, 144);
		T3.addBox(-4.5F, -4.5F, 0F, 10, 10, 15);
		T3.setRotationPoint(-0.5F, 17.5F, 32F);
		T3.setTextureSize(83, 254);
		T3.mirror = true;
		setRotation(T3, 0F, 0F, 0F);
		T4 = new ModelRenderer(this, 0, 122);
		T4.addBox(-3.5F, -4.5F, 0F, 8, 8, 14);
		T4.setRotationPoint(-0.5F, 18.5F, 47F);
		T4.setTextureSize(83, 254);
		T4.mirror = true;
		setRotation(T4, 0F, 0F, 0F);
		T5 = new ModelRenderer(this, 0, 105);
		T5.addBox(-2.5F, -3.5F, 0F, 6, 6, 11);
		T5.setRotationPoint(-0.5F, 18.5F, 61F);
		T5.setTextureSize(83, 254);
		T5.mirror = true;
		setRotation(T5, 0F, 0F, 0F);
		T6 = new ModelRenderer(this, 0, 89);
		T6.addBox(-1.5F, -1.5F, 0F, 4, 4, 12);
		T6.setRotationPoint(-0.5F, 17.5F, 71F);
		T6.setTextureSize(83, 254);
		T6.mirror = true;
		setRotation(T6, 0F, 0F, 0F);
		T7 = new ModelRenderer(this, 0, 64);
		T7.addBox(0.5F, -3.5F, 4F, 0, 4, 17);
		T7.setRotationPoint(-0.5F, 17.5F, 71F);
		T7.setTextureSize(83, 254);
		T7.mirror = true;
		setRotation(T7, 0F, 0F, 0F);
		T8 = new ModelRenderer(this, 0, 196);
		T8.addBox(-6F, -6F, 0F, 12, 12, 26);
		T8.setRotationPoint(0F, 18F, -10F);
		T8.setTextureSize(83, 254);
		T8.mirror = true;
		setRotation(T8, 0F, 0F, 0F);
		N1 = new ModelRenderer(this, 0, 234);
		N1.addBox(-5F, -5F, 0F, 11, 11, 9);
		N1.setRotationPoint(-0.5F, 17.5F, -19F);
		N1.setTextureSize(83, 254);
		N1.mirror = true;
		setRotation(N1, 0F, 0F, 0F);
		N2 = new ModelRenderer(this, 40, 234);
		N2.addBox(-4F, -4F, 0F, 8, 8, 2);
		N2.setRotationPoint(0F, 18F, -21F);
		N2.setTextureSize(83, 254);
		N2.mirror = true;
		setRotation(N2, 0F, 0F, 0F);
		H1 = new ModelRenderer(this, 0, 7);
		H1.addBox(-4F, -2.7F, -9.7F, 8, 1, 10);
		H1.setRotationPoint(0F, 18F, -21F);
		H1.setTextureSize(83, 254);
		H1.mirror = true;
		setRotation(H1, 0F, 0F, 0F);
		H2 = new ModelRenderer(this, 0, 18);
		H2.addBox(-4F, -4.9F, -3.5F, 8, 2, 3);
		H2.setRotationPoint(0F, 18F, -21F);
		H2.setTextureSize(83, 254);
		H2.mirror = true;
		setRotation(H2, -0.6283185F, 0F, 0F);
		H3 = new ModelRenderer(this, 0, 29);
		H3.addBox(-4F, -7.1F, -7.2F, 8, 2, 6);
		H3.setRotationPoint(0F, 18F, -21F);
		H3.setTextureSize(83, 254);
		H3.mirror = true;
		setRotation(H3, 0.418879F, 0F, 0F);
		H4 = new ModelRenderer(this, 0, 55);
		H4.addBox(-4F, 2F, -8.2F, 8, 2, 3);
		H4.setRotationPoint(0F, 0F, 0F);
		H4.setTextureSize(83, 254);
		H4.mirror = true;
		setRotation(H4, -0.2443461F, 0F, 0F);
		H5 = new ModelRenderer(this, 44, 0);
		H5.addBox(2.7F, -5F, -7F, 1, 2, 5);
		H5.setRotationPoint(0F, 19F, -21F);
		H5.setTextureSize(83, 254);
		H5.mirror = true;
		setRotation(H5, 0F, 0F, 0F);
		H6 = new ModelRenderer(this, 0, 0);
		H6.addBox(-4F, -4F, -2F, 8, 2, 2);
		H6.setRotationPoint(0F, 18F, -21F);
		H6.setTextureSize(83, 254);
		H6.mirror = true;
		setRotation(H6, 0F, 0F, 0F);
		H7 = new ModelRenderer(this, 44, 0);
		H7.addBox(-3.7F, -4F, -7F, 1, 2, 5);
		H7.setRotationPoint(0F, 18F, -21F);
		H7.setTextureSize(83, 254);
		H7.mirror = true;
		setRotation(H7, 0F, 0F, 0F);
		H8 = new ModelRenderer(this, 0, 42);
		H8.addBox(-4F, -1.7F, -10.7F, 8, 2, 11);
		H8.setRotationPoint(0F, 18F, -21F);
		H8.setTextureSize(83, 254);
		H8.mirror = true;
		setRotation(H8, 0F, 0F, 0F);
		H9 = new ModelRenderer(this, 0, 60);
		H9.addBox(-4F, 0.6F, -6F, 8, 2, 6);
		H9.setRotationPoint(0F, 18F, -21F);
		H9.setTextureSize(83, 254);
		H9.mirror = true;
		setRotation(H9, 0.2443461F, 0F, 0F);
		H10 = new ModelRenderer(this, 0, 23);
		H10.addBox(-4F, -6F, -4F, 8, 2, 4);
		H10.setRotationPoint(0F, 18F, -21F);
		H10.setTextureSize(83, 254);
		H10.mirror = true;
		setRotation(H10, 0F, 0F, 0F);
		H11 = new ModelRenderer(this, 0, 37);
		H11.addBox(-4F, -9.6F, -6.2F, 8, 2, 3);
		H11.setRotationPoint(0F, 18F, -21F);
		H11.setTextureSize(83, 254);
		H11.mirror = true;
		setRotation(H11, 0.8901179F, 0F, 0F);
		S1 = new ModelRenderer(this, 57, 56);
		S1.addBox(0F, -5F, 6F, 1, 3, 2);
		S1.setRotationPoint(-0.5F, 18.5F, 61F);
		S1.setTextureSize(83, 254);
		S1.mirror = true;
		setRotation(S1, -0.1745329F, 0F, 0F);
		S2 = new ModelRenderer(this, 57, 18);
		S2.addBox(-3.5F, -9F, 4F, 1, 4, 9);
		S2.setRotationPoint(0F, 18F, -10F);
		S2.setTextureSize(83, 254);
		S2.mirror = true;
		setRotation(S2, -0.1745329F, 0F, 0F);
		S3 = new ModelRenderer(this, 57, 31);
		S3.addBox(2F, -5.5F, 0F, 1, 3, 7);
		S3.setRotationPoint(0F, 16.5F, 16F);
		S3.setTextureSize(83, 254);
		S3.mirror = true;
		setRotation(S3, -0.1745329F, 0F, 0F);
		S4 = new ModelRenderer(this, 57, 31);
		S4.addBox(-3F, -5.5F, 0F, 1, 3, 7);
		S4.setRotationPoint(0F, 16.5F, 16F);
		S4.setTextureSize(83, 254);
		S4.mirror = true;
		setRotation(S4, -0.1745329F, 0F, 0F);
		S5 = new ModelRenderer(this, 57, 31);
		S5.addBox(-3F, -7F, 8F, 1, 3, 7);
		S5.setRotationPoint(0F, 16.5F, 16F);
		S5.setTextureSize(83, 254);
		S5.mirror = true;
		setRotation(S5, -0.1745329F, 0F, 0F);
		S6 = new ModelRenderer(this, 57, 31);
		S6.addBox(2F, -7F, 8F, 1, 3, 7);
		S6.setRotationPoint(0F, 16.5F, 16F);
		S6.setTextureSize(83, 254);
		S6.mirror = true;
		setRotation(S6, -0.1745329F, 0F, 0F);
		S7 = new ModelRenderer(this, 57, 41);
		S7.addBox(1.5F, -6F, 1F, 1, 3, 5);
		S7.setRotationPoint(-0.5F, 17.5F, 32F);
		S7.setTextureSize(83, 254);
		S7.mirror = true;
		setRotation(S7, -0.1745329F, 0F, 0F);
		S8 = new ModelRenderer(this, 57, 41);
		S8.addBox(-1.5F, -6F, 1F, 1, 3, 5);
		S8.setRotationPoint(-0.5F, 17.5F, 32F);
		S8.setTextureSize(83, 254);
		S8.mirror = true;
		setRotation(S8, -0.1745329F, 0F, 0F);
		S9 = new ModelRenderer(this, 57, 41);
		S9.addBox(-1.5F, -7F, 7F, 1, 3, 5);
		S9.setRotationPoint(-0.5F, 17.5F, 32F);
		S9.setTextureSize(83, 254);
		S9.mirror = true;
		setRotation(S9, -0.1745329F, 0F, 0F);
		S10 = new ModelRenderer(this, 57, 41);
		S10.addBox(1.5F, -7F, 7F, 1, 3, 5);
		S10.setRotationPoint(-0.5F, 17.5F, 32F);
		S10.setTextureSize(83, 254);
		S10.mirror = true;
		setRotation(S10, -0.1745329F, 0F, 0F);
		S11 = new ModelRenderer(this, 57, 49);
		S11.addBox(1F, -6.466667F, 1F, 1, 3, 4);
		S11.setRotationPoint(-0.5F, 18.5F, 47F);
		S11.setTextureSize(83, 254);
		S11.mirror = true;
		setRotation(S11, -0.1745329F, 0F, 0F);
		S12 = new ModelRenderer(this, 57, 49);
		S12.addBox(-1F, -6.5F, 1F, 1, 3, 4);
		S12.setRotationPoint(-0.5F, 18.5F, 47F);
		S12.setTextureSize(83, 254);
		S12.mirror = true;
		setRotation(S12, -0.1745329F, 0F, 0F);
		S13 = new ModelRenderer(this, 57, 49);
		S13.addBox(-1F, -7F, 6F, 1, 3, 4);
		S13.setRotationPoint(-0.5F, 18.5F, 47F);
		S13.setTextureSize(83, 254);
		S13.mirror = true;
		setRotation(S13, -0.1745329F, 0F, 0F);
		S14 = new ModelRenderer(this, 57, 49);
		S14.addBox(1F, -7F, 6F, 1, 3, 4);
		S14.setRotationPoint(-0.5F, 18.5F, 47F);
		S14.setTextureSize(83, 254);
		S14.mirror = true;
		setRotation(S14, -0.1745329F, 0F, 0F);
		S15 = new ModelRenderer(this, 57, 56);
		S15.addBox(0F, -4F, 0F, 1, 3, 2);
		S15.setRotationPoint(-0.5F, 18.5F, 61F);
		S15.setTextureSize(83, 254);
		S15.mirror = true;
		setRotation(S15, -0.1745329F, 0F, 0F);
		S16 = new ModelRenderer(this, 57, 56);
		S16.addBox(0F, -4.5F, 3F, 1, 3, 2);
		S16.setRotationPoint(-0.5F, 18.5F, 61F);
		S16.setTextureSize(83, 254);
		S16.mirror = true;
		setRotation(S16, -0.1745329F, 0F, 0F);
		S17 = new ModelRenderer(this, 57, 18);
		S17.addBox(-3.5F, -11F, 15F, 1, 4, 9);
		S17.setRotationPoint(0F, 18F, -10F);
		S17.setTextureSize(83, 254);
		S17.mirror = true;
		setRotation(S17, -0.1745329F, 0F, 0F);
		S18 = new ModelRenderer(this, 57, 0);
		S18.addBox(-5.5F, -3F, 3F, 1, 6, 12);
		S18.setRotationPoint(0F, 18F, -10F);
		S18.setTextureSize(83, 254);
		S18.mirror = true;
		setRotation(S18, 0F, -0.3839724F, 0F);
		S19 = new ModelRenderer(this, 57, 0);
		S19.addBox(4.5F, -3F, 3F, 1, 6, 12);
		S19.setRotationPoint(0F, 18F, -10F);
		S19.setTextureSize(83, 254);
		S19.mirror = true;
		setRotation(S19, 0F, 0.3839724F, 0F);
		S20 = new ModelRenderer(this, 57, 18);
		S20.addBox(2.5F, -9F, 4F, 1, 4, 9);
		S20.setRotationPoint(0F, 18F, -10F);
		S20.setTextureSize(83, 254);
		S20.mirror = true;
		setRotation(S20, -0.1745329F, 0F, 0F);
		S21 = new ModelRenderer(this, 57, 18);
		S21.addBox(2.5F, -11F, 15F, 1, 4, 9);
		S21.setRotationPoint(0F, 18F, -10F);
		S21.setTextureSize(83, 254);
		S21.mirror = true;
		setRotation(S21, -0.1745329F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		T1.render(f5);
		T2.render(f5);
		T3.render(f5);
		T4.render(f5);
		T5.render(f5);
		T6.render(f5);
		T7.render(f5);
		T8.render(f5);
		N1.render(f5);
		N2.render(f5);
		H1.render(f5);
		H2.render(f5);
		H3.render(f5);
		H5.render(f5);
		H6.render(f5);
		H7.render(f5);
		H8.render(f5);
		H9.render(f5);
		H10.render(f5);
		H11.render(f5);
		S1.render(f5);
		S2.render(f5);
		S3.render(f5);
		S4.render(f5);
		S5.render(f5);
		S6.render(f5);
		S7.render(f5);
		S8.render(f5);
		S9.render(f5);
		S10.render(f5);
		S11.render(f5);
		S12.render(f5);
		S13.render(f5);
		S14.render(f5);
		S15.render(f5);
		S16.render(f5);
		S17.render(f5);
		S18.render(f5);
		S19.render(f5);
		S20.render(f5);
		S21.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		
		H9.addChild(H4);
		H9.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * (f1 /2);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
