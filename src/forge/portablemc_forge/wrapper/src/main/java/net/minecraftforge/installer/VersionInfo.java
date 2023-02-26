package net.minecraftforge.installer;

import argo.jdom.JsonRootNode;

public class VersionInfo {
	
	public static final VersionInfo INSTANCE = new VersionInfo();
	
	public final JsonRootNode versionData;
	
	public VersionInfo() {
		this.versionData = null;
	}

	public static String getMinecraftVersion() {
        return VersionInfo.INSTANCE.versionData.getStringValue("install", "minecraft");
    }
	
}
