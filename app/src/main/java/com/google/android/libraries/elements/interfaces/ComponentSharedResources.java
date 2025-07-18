package com.google.android.libraries.elements.interfaces;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComponentSharedResources {
    final DevResourceManager devResourceManager;
    final HashMap foreignFunctions;
    final TemplateMetadataRepository templateMetadataRepository;

    public ComponentSharedResources(HashMap map, DevResourceManager devResourceManager, TemplateMetadataRepository templateMetadataRepository) {
        this.foreignFunctions = map;
        this.devResourceManager = devResourceManager;
        this.templateMetadataRepository = templateMetadataRepository;
    }

    public DevResourceManager getDevResourceManager() {
        return this.devResourceManager;
    }

    public HashMap getForeignFunctions() {
        return this.foreignFunctions;
    }

    public TemplateMetadataRepository getTemplateMetadataRepository() {
        return this.templateMetadataRepository;
    }

    public String toString() {
        TemplateMetadataRepository templateMetadataRepository = this.templateMetadataRepository;
        DevResourceManager devResourceManager = this.devResourceManager;
        return "ComponentSharedResources{foreignFunctions=" + String.valueOf(this.foreignFunctions) + ",devResourceManager=" + String.valueOf(devResourceManager) + ",templateMetadataRepository=" + String.valueOf(templateMetadataRepository) + "}";
    }
}
