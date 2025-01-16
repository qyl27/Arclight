package io.izzel.arclight.gradle.extension

enum ArclightPlatformType {
    VANILLA,
    FORGE,
    NEOFORGE,
    FABRIC,
    ;

    boolean isForgeLike() {
        return this == FORGE || this == NEOFORGE
    }

    boolean isFabricLike() {
        return this == FABRIC
    }

    boolean isVanillaLike() {
        return this == VANILLA || this == FABRIC
    }
}
