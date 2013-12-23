package net.tds.elementals.lib;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class Reference {

	public static final String MOD_ID = "TDS_EL";
	public static final String MOD_NAME = "Elementals";
	public static final String VERSION = "1.0.0"; 
	public static final String PROXY_CLIENT = "net.tds.elementals.proxy.ClientProxy";
	public static final String PROXY_SERVER = "net.tds.elementals.proxy.CommonProxy";
	
	public static Logger logger = Logger.getLogger(MOD_NAME);
	
	static {
		
		logger.setParent(FMLLog.getLogger());
	}
}
