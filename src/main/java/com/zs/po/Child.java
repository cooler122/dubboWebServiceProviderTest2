package com.zs.po;

public class Child {
    private Integer childId;

    private String childName;

    private Integer parentId;

    private String childInformation;

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName == null ? null : childName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getChildInformation() {
        return childInformation;
    }

    public void setChildInformation(String childInformation) {
        this.childInformation = childInformation == null ? null : childInformation.trim();
    }
}