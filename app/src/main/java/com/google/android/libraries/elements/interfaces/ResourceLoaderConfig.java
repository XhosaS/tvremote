package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ResourceLoaderConfig {
    final String bytesPath;
    final Long cacheCap;
    final Long cacheExpirationBuffer;
    final Long cachePurgeBytes;
    final Boolean enableAlreadyProcessedFix;
    final Boolean enableLruPurge;
    final Boolean enableLruPurgeKillSwitch;
    final Boolean enablePackedResourceTags;
    final Integer maxBuildLabels;
    final Integer maxTags;
    final String metadataPath;

    public ResourceLoaderConfig(Integer num, Integer num2, String str, String str2, Long l, Long l2, Boolean bool, Long l3, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.maxTags = num;
        this.maxBuildLabels = num2;
        this.bytesPath = str;
        this.metadataPath = str2;
        this.cacheCap = l;
        this.cacheExpirationBuffer = l2;
        this.enableLruPurge = bool;
        this.cachePurgeBytes = l3;
        this.enableLruPurgeKillSwitch = bool2;
        this.enableAlreadyProcessedFix = bool3;
        this.enablePackedResourceTags = bool4;
    }

    public String getBytesPath() {
        return this.bytesPath;
    }

    public Long getCacheCap() {
        return this.cacheCap;
    }

    public Long getCacheExpirationBuffer() {
        return this.cacheExpirationBuffer;
    }

    public Long getCachePurgeBytes() {
        return this.cachePurgeBytes;
    }

    public Boolean getEnableAlreadyProcessedFix() {
        return this.enableAlreadyProcessedFix;
    }

    public Boolean getEnableLruPurge() {
        return this.enableLruPurge;
    }

    public Boolean getEnableLruPurgeKillSwitch() {
        return this.enableLruPurgeKillSwitch;
    }

    public Boolean getEnablePackedResourceTags() {
        return this.enablePackedResourceTags;
    }

    public Integer getMaxBuildLabels() {
        return this.maxBuildLabels;
    }

    public Integer getMaxTags() {
        return this.maxTags;
    }

    public String getMetadataPath() {
        return this.metadataPath;
    }

    public String toString() {
        return "ResourceLoaderConfig{maxTags=" + this.maxTags + ",maxBuildLabels=" + this.maxBuildLabels + ",bytesPath=" + this.bytesPath + ",metadataPath=" + this.metadataPath + ",cacheCap=" + this.cacheCap + ",cacheExpirationBuffer=" + this.cacheExpirationBuffer + ",enableLruPurge=" + this.enableLruPurge + ",cachePurgeBytes=" + this.cachePurgeBytes + ",enableLruPurgeKillSwitch=" + this.enableLruPurgeKillSwitch + ",enableAlreadyProcessedFix=" + this.enableAlreadyProcessedFix + ",enablePackedResourceTags=" + this.enablePackedResourceTags + "}";
    }
}
