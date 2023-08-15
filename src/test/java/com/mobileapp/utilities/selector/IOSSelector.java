package com.mobileapp.utilities.selector;

import com.mobileapp.utilities.model.ElementInfo;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class IOSSelector implements Selector {

    @Override
    public By getElementInfoToBy(ElementInfo elementInfo) {
        By by = null;
        if (elementInfo.getIosType().equalsIgnoreCase("css")) {
            by = MobileBy.cssSelector(elementInfo.getIosValue());
        } else if (elementInfo.getIosValue().equalsIgnoreCase("id")) {
            by = MobileBy.id(elementInfo.getIosValue());
        } else if (elementInfo.getIosType().equalsIgnoreCase("xpath")) {
            by = MobileBy.xpath(elementInfo.getIosValue());
        } else if (elementInfo.getIosType().equalsIgnoreCase("class")) {
            by = MobileBy.className(elementInfo.getIosValue());
        } else if (elementInfo.getIosType().equalsIgnoreCase("name")) {
            by = MobileBy.name(elementInfo.getIosValue());
        } else if (elementInfo.getIosType().equalsIgnoreCase("classChain")) {
            by = MobileBy.iOSClassChain(elementInfo.getIosValue());
        }
        return by;
    }

    @Override
    public int getElementInfoToIndex(ElementInfo elementInfo) {
        return elementInfo.getIosIndex();
    }
}
