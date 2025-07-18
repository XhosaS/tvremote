package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComponentConfig {
    final boolean componentClearStateOnSet;
    final boolean disableAsyncComponentUpdateCallbacks;
    final boolean disableFbConversion;
    final boolean disableSharedElementArenaAllocation;
    final boolean ekoCallTransformEviction;
    final boolean ekoStoreParsedCallTransforms;
    final int elementHashMode;
    final boolean enableEkoNoSerialization;
    final int enableEkoVersion;
    final boolean enableKnownFieldsModelParsing;
    final boolean enableNativeTemplateResolution;
    final boolean enableRenderNextPerformanceLogging;
    final boolean enableWasmNoSerialization;
    final boolean reuseSubscriptionProcessors;
    final boolean suppressPriorModelCheck;
    final boolean useElementProtoPtr;
    final boolean usePriorModelHash;
    final boolean useSubscriptionProcessorMap;

    public ComponentConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.reuseSubscriptionProcessors = z;
        this.useSubscriptionProcessorMap = z2;
        this.usePriorModelHash = z3;
        this.suppressPriorModelCheck = z4;
        this.useElementProtoPtr = z5;
        this.elementHashMode = i;
        this.disableAsyncComponentUpdateCallbacks = z6;
        this.disableFbConversion = z7;
        this.ekoStoreParsedCallTransforms = z8;
        this.ekoCallTransformEviction = z9;
        this.enableEkoNoSerialization = z10;
        this.enableEkoVersion = i2;
        this.enableRenderNextPerformanceLogging = z11;
        this.enableKnownFieldsModelParsing = z12;
        this.componentClearStateOnSet = z13;
        this.disableSharedElementArenaAllocation = z14;
        this.enableNativeTemplateResolution = z15;
        this.enableWasmNoSerialization = z16;
    }

    public boolean getComponentClearStateOnSet() {
        return this.componentClearStateOnSet;
    }

    public boolean getDisableAsyncComponentUpdateCallbacks() {
        return this.disableAsyncComponentUpdateCallbacks;
    }

    public boolean getDisableFbConversion() {
        return this.disableFbConversion;
    }

    public boolean getDisableSharedElementArenaAllocation() {
        return this.disableSharedElementArenaAllocation;
    }

    public boolean getEkoCallTransformEviction() {
        return this.ekoCallTransformEviction;
    }

    public boolean getEkoStoreParsedCallTransforms() {
        return this.ekoStoreParsedCallTransforms;
    }

    public int getElementHashMode() {
        return this.elementHashMode;
    }

    public boolean getEnableEkoNoSerialization() {
        return this.enableEkoNoSerialization;
    }

    public int getEnableEkoVersion() {
        return this.enableEkoVersion;
    }

    public boolean getEnableKnownFieldsModelParsing() {
        return this.enableKnownFieldsModelParsing;
    }

    public boolean getEnableNativeTemplateResolution() {
        return this.enableNativeTemplateResolution;
    }

    public boolean getEnableRenderNextPerformanceLogging() {
        return this.enableRenderNextPerformanceLogging;
    }

    public boolean getEnableWasmNoSerialization() {
        return this.enableWasmNoSerialization;
    }

    public boolean getReuseSubscriptionProcessors() {
        return this.reuseSubscriptionProcessors;
    }

    public boolean getSuppressPriorModelCheck() {
        return this.suppressPriorModelCheck;
    }

    public boolean getUseElementProtoPtr() {
        return this.useElementProtoPtr;
    }

    public boolean getUsePriorModelHash() {
        return this.usePriorModelHash;
    }

    public boolean getUseSubscriptionProcessorMap() {
        return this.useSubscriptionProcessorMap;
    }

    public String toString() {
        return "ComponentConfig{reuseSubscriptionProcessors=" + this.reuseSubscriptionProcessors + ",useSubscriptionProcessorMap=" + this.useSubscriptionProcessorMap + ",usePriorModelHash=" + this.usePriorModelHash + ",suppressPriorModelCheck=" + this.suppressPriorModelCheck + ",useElementProtoPtr=" + this.useElementProtoPtr + ",elementHashMode=" + this.elementHashMode + ",disableAsyncComponentUpdateCallbacks=" + this.disableAsyncComponentUpdateCallbacks + ",disableFbConversion=" + this.disableFbConversion + ",ekoStoreParsedCallTransforms=" + this.ekoStoreParsedCallTransforms + ",ekoCallTransformEviction=" + this.ekoCallTransformEviction + ",enableEkoNoSerialization=" + this.enableEkoNoSerialization + ",enableEkoVersion=" + this.enableEkoVersion + ",enableRenderNextPerformanceLogging=" + this.enableRenderNextPerformanceLogging + ",enableKnownFieldsModelParsing=" + this.enableKnownFieldsModelParsing + ",componentClearStateOnSet=" + this.componentClearStateOnSet + ",disableSharedElementArenaAllocation=" + this.disableSharedElementArenaAllocation + ",enableNativeTemplateResolution=" + this.enableNativeTemplateResolution + ",enableWasmNoSerialization=" + this.enableWasmNoSerialization + "}";
    }
}
