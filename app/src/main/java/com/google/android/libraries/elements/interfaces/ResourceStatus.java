package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ResourceStatus {
    final String identifier;
    final boolean rehydratedResponse;
    final StatusInResponse status;

    public ResourceStatus(String str, StatusInResponse statusInResponse, boolean z) {
        this.identifier = str;
        this.status = statusInResponse;
        this.rehydratedResponse = z;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public boolean getRehydratedResponse() {
        return this.rehydratedResponse;
    }

    public StatusInResponse getStatus() {
        return this.status;
    }

    public String toString() {
        return "ResourceStatus{identifier=" + this.identifier + ",status=" + String.valueOf(this.status) + ",rehydratedResponse=" + this.rehydratedResponse + "}";
    }
}
