package com.github.mdstoy.sample.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JacksonSampleObject {

    private Integer notOutputPrivate = 0;

    protected Integer notOutputProtected = 1;

    public Integer outputPublic = 2;

    private Integer outputPrivateWithPublicGetter = 3;

    public Integer getOutputPrivateWithPublicGetter() {
        return outputPrivateWithPublicGetter;
    }

    protected Integer outputProtectedWithGetter = 4;

    public Integer getOutputProtectedWithGetter() {
        return outputProtectedWithGetter;
    }

    private Integer getNotOutputPrivateGetter() {
        return 5;
    }

    protected Integer getNotOutputProtectedGetter() {
        return 6;
    }

    public Integer getOutputPublicGetter() {
        return 7;
    }

    @JsonIgnore
    public Integer notOutputPublicWithIgnoreAnnotation = 8;

    @JsonIgnore
    public Integer getNotOutputPublicGetterWithIgnoreAnnotation() {
        return 9;
    }

    private Boolean outputBoolean = true;

    public Boolean isOutputBoolean() {
        return outputBoolean;
    }

    public Integer isNotOutput() {
        return 10;
    }

    public Boolean getOutputBooleanGetter() {
        return true;
    }

    public Boolean canNotOutputBooleanMethod() {
        return false;
    }

}
