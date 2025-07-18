package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class JsPerformanceEventInfo {
    final Integer bindingExtensionId;
    final String functionName;
    final long identifier;
    final boolean isSynchronous;
    final String moduleIdentifier;
    final int statusCode;
    final String statusMessage;

    public JsPerformanceEventInfo(long j, int i, String str, String str2, String str3, boolean z, Integer num) {
        this.identifier = j;
        this.statusCode = i;
        this.statusMessage = str;
        this.moduleIdentifier = str2;
        this.functionName = str3;
        this.isSynchronous = z;
        this.bindingExtensionId = num;
    }

    public Integer getBindingExtensionId() {
        return this.bindingExtensionId;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public long getIdentifier() {
        return this.identifier;
    }

    public boolean getIsSynchronous() {
        return this.isSynchronous;
    }

    public String getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String toString() {
        return "JsPerformanceEventInfo{identifier=" + this.identifier + ",statusCode=" + this.statusCode + ",statusMessage=" + this.statusMessage + ",moduleIdentifier=" + this.moduleIdentifier + ",functionName=" + this.functionName + ",isSynchronous=" + this.isSynchronous + ",bindingExtensionId=" + this.bindingExtensionId + "}";
    }
}
