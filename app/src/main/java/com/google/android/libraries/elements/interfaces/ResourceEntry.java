package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ResourceEntry {
    final byte[] resourceBytes;
    final ResourceMetadata resourceMetadata;

    public ResourceEntry(ResourceMetadata resourceMetadata, byte[] bArr) {
        this.resourceMetadata = resourceMetadata;
        this.resourceBytes = bArr;
    }

    public byte[] getResourceBytes() {
        return this.resourceBytes;
    }

    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    public String toString() {
        byte[] bArr = this.resourceBytes;
        return "ResourceEntry{resourceMetadata=" + String.valueOf(this.resourceMetadata) + ",resourceBytes=" + String.valueOf(bArr) + "}";
    }
}
