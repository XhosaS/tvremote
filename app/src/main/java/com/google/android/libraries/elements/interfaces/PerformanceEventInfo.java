package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PerformanceEventInfo {
    final Long commandExtensionId;
    final JsPerformanceEventInfo jsPerformanceEventInfo;
    final Integer materializationCount;
    final Integer measurementCount;
    final String nodeIdentifier;
    final String templateUri;

    public PerformanceEventInfo(String str, String str2, Integer num, Integer num2, Long l, JsPerformanceEventInfo jsPerformanceEventInfo) {
        this.templateUri = str;
        this.nodeIdentifier = str2;
        this.materializationCount = num;
        this.measurementCount = num2;
        this.commandExtensionId = l;
        this.jsPerformanceEventInfo = jsPerformanceEventInfo;
    }

    public Long getCommandExtensionId() {
        return this.commandExtensionId;
    }

    public JsPerformanceEventInfo getJsPerformanceEventInfo() {
        return this.jsPerformanceEventInfo;
    }

    public Integer getMaterializationCount() {
        return this.materializationCount;
    }

    public Integer getMeasurementCount() {
        return this.measurementCount;
    }

    public String getNodeIdentifier() {
        return this.nodeIdentifier;
    }

    public String getTemplateUri() {
        return this.templateUri;
    }

    public String toString() {
        return "PerformanceEventInfo{templateUri=" + this.templateUri + ",nodeIdentifier=" + this.nodeIdentifier + ",materializationCount=" + this.materializationCount + ",measurementCount=" + this.measurementCount + ",commandExtensionId=" + this.commandExtensionId + ",jsPerformanceEventInfo=" + String.valueOf(this.jsPerformanceEventInfo) + "}";
    }
}
