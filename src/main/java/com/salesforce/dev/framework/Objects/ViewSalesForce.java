package com.salesforce.dev.framework.Objects;

import java.util.List;

/**
 * Created by veronicaon 8/21/2015.
 */
public class ViewSalesForce {
    private String viewName;
    private String uniqueViewName;
    private String filterByOwner;
    private List<FilterView> additionalFields;
    private List<FieldToDisplayView> fieldsDisplay;
    private String restrictVisibility;



    public ViewSalesForce(){}

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    public void setFilterByOwner(String filterByOwner) {
        this.filterByOwner = filterByOwner;
    }

    public void setUniqueViewName(String uniqueViewName) {
        this.uniqueViewName = uniqueViewName;
    }

    public void setAdditionalFields(List<FilterView> additionalFields) {
        this.additionalFields = additionalFields;
    }

    public void setFieldsDisplay(List<FieldToDisplayView> fieldsDisplay) {
        this.fieldsDisplay = fieldsDisplay;
    }

    public void setRestrictVisibility(String restrictVisibility) {
        this.restrictVisibility = restrictVisibility;
    }

    public List<FilterView> getAdditionalFields() {
        return additionalFields;
    }

    public String getFilterByOwner() {
        return filterByOwner;
    }

    public String getViewName() {
        return viewName;
    }

    public String getUniqueViewName() {
        return uniqueViewName;
    }

    public List<FieldToDisplayView> getFieldsDisplay() {
        return fieldsDisplay;
    }

    public String getRestrictVisibility() {
        return restrictVisibility;
    }
}
