package com.adobe.aem.guides.wkdy.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = { SlingHttpServletRequest.class }, resourceType = { TestModel.RESOURCE_TYPE },
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestModel {
    protected static final String RESOURCE_TYPE = "wkdy/components/helloworld";

    @ValueMapValue
    private String text;

    public String getText() {
        return text;
    }

    @PostConstruct
    protected void init() {
        // initialization code
    }

}
