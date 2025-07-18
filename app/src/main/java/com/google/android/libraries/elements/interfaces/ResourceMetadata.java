package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ResourceMetadata {
    final ArrayList dependencies;
    final boolean enableModuleHashing;
    final String resourceIdentifier;
    final Long resourceTag;
    final ResourceType resourceType;
    final String securityVerifier;

    public ResourceMetadata(String str, ResourceType resourceType, Long l, ArrayList arrayList, String str2, boolean z) {
        this.resourceIdentifier = str;
        this.resourceType = resourceType;
        this.resourceTag = l;
        this.dependencies = arrayList;
        this.securityVerifier = str2;
        this.enableModuleHashing = z;
    }

    public ArrayList getDependencies() {
        return this.dependencies;
    }

    public boolean getEnableModuleHashing() {
        return this.enableModuleHashing;
    }

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public Long getResourceTag() {
        return this.resourceTag;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public String getSecurityVerifier() {
        return this.securityVerifier;
    }

    public String toString() {
        ArrayList arrayList = this.dependencies;
        return "ResourceMetadata{resourceIdentifier=" + this.resourceIdentifier + ",resourceType=" + String.valueOf(this.resourceType) + ",resourceTag=" + this.resourceTag + ",dependencies=" + String.valueOf(arrayList) + ",securityVerifier=" + this.securityVerifier + ",enableModuleHashing=" + this.enableModuleHashing + "}";
    }
}
