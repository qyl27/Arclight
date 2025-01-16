package io.izzel.arclight.gradle.extension

class ArclightPlatform {
    private ArclightPlatformType type

    private String loaderVersion

    ArclightPlatformType getPlatformType() {
        return type
    }

    void setPlatformType(ArclightPlatformType type) {
        this.type = type
    }


    String getLoaderVersion() {
        return loaderVersion
    }

    void setLoaderVersion(String type) {
        this.loaderVersion = type
    }
}
