package com.adobe.aem.guides.wkdy.core.models.impl;

import com.adobe.aem.guides.wkdy.core.models.CustomImageModel;
import com.adobe.cq.wcm.core.components.models.Image;
import lombok.experimental.Delegate;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.via.ResourceSuperType;

@Model( adaptables = {  SlingHttpServletRequest.class }, adapters = {Image.class},
        resourceType = { CustomImageModelImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CustomImageModelImpl implements Image {
    public static final String RESOURCE_TYPE = "wkdy/components/custom-image";

    @Self
    @Via(type = ResourceSuperType.class)
    @Delegate
    private Image image;

    @ValueMapValue
    private String caption;

    public Image getImage() {
        return image;
    }
    public String getCaption() {
        return this.caption;
    }


}
