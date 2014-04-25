package com.jllugo.isliu.somethingcool;

public enum Craft {
    WIZARD, COBBLER, BALLERINA, MIME;

    public static Craft fromName(String name) {
        String upperName = name.toUpperCase();

        if (upperName.equals(WIZARD.name())) return WIZARD;
        if (upperName.equals(COBBLER.name())) return COBBLER;
        if (upperName.equals(BALLERINA.name())) return BALLERINA;
        if (upperName.equals(MIME.name())) return MIME;

        throw new IllegalArgumentException("INVALID CRAFT!");
    }
}

