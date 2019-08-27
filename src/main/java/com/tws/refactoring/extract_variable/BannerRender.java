package com.tws.refactoring.extract_variable;

public class BannerRender {

    public static final String MAC = "MAC";
    public static final String IE = "IE";
    public static final String IE_ON_MAC = "IE on Mac?";
    public static final String BANNER = "banner";

    public String renderBanner(String platform, String browser) {//¼Ópublic
    	boolean per1=platform.toUpperCase().indexOf(MAC) > -1;
    	boolean per2=browser.toUpperCase().indexOf(IE) > -1;
        if (per1 &&per2) {
            return IE_ON_MAC;
        }
        return BANNER;
    }
}
