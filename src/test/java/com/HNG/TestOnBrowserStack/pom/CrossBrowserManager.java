package com.HNG.TestOnBrowserStack.pom;

import com.HNG.TestOnBrowserStack.pom.Android.SamSungGalaxyS8;
import com.HNG.TestOnBrowserStack.pom.iPhone.IPhoneXSMax;
import com.HNG.TestOnBrowserStack.pom.web.FireFox;

public class CrossBrowserManager {
    private SamSungGalaxyS8 galaxyS8;
    private IPhoneXSMax iPhoneXSMax;
    private FireFox fireFox;

    public CrossBrowserManager() { }

    //Get instance of SamSungGalaxyS8
    public SamSungGalaxyS8 getGalaxyS8(){
        return (galaxyS8==null)? galaxyS8 = new SamSungGalaxyS8(): galaxyS8;
    }

    //Get instance of IPhoneXSMax
    public IPhoneXSMax getIPhoneXSMax(){
        return (iPhoneXSMax==null)? iPhoneXSMax = new IPhoneXSMax(): iPhoneXSMax;
    }

    //Get instance of FireFox
    public FireFox getFireFox(){
        return (fireFox==null)? fireFox = new FireFox(): fireFox;
    }
}
