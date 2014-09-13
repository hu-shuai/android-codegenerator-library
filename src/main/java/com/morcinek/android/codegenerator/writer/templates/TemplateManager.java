package com.morcinek.android.codegenerator.writer.templates;

/**
 * Copyright 2014 Tomasz Morcinek. All rights reserved.
 */
public class TemplateManager {

    private String template;

    public TemplateManager(String template) {
        this.template = template;
    }

    public void addTemplateValue(String key, String value) {
        template = template.replace(getKeyWrapper(key), value);
    }

    public String getTemplate() {
        return template.replaceAll("\\$\\{\\w+\\}", "");
    }

    private String getKeyWrapper(String key) {
        return "${" + key + "}";
    }
}
