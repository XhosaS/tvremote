package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ByteStoreConfig {
    public static final ByteStoreConfig EMPTY_CONFIG = new ByteStoreConfig(false, new NamespacedStoreConfig(false, false, false), false, false);
    final boolean cacheSnapshots;
    final boolean enableAsyncSubscriptions;
    final boolean enableNamespaces;
    final NamespacedStoreConfig namespacedStoreConfig;

    public ByteStoreConfig(boolean z, NamespacedStoreConfig namespacedStoreConfig, boolean z2, boolean z3) {
        this.enableNamespaces = z;
        this.namespacedStoreConfig = namespacedStoreConfig;
        this.enableAsyncSubscriptions = z2;
        this.cacheSnapshots = z3;
    }

    public boolean getCacheSnapshots() {
        return this.cacheSnapshots;
    }

    public boolean getEnableAsyncSubscriptions() {
        return this.enableAsyncSubscriptions;
    }

    public boolean getEnableNamespaces() {
        return this.enableNamespaces;
    }

    public NamespacedStoreConfig getNamespacedStoreConfig() {
        return this.namespacedStoreConfig;
    }

    public String toString() {
        return "ByteStoreConfig{enableNamespaces=" + this.enableNamespaces + ",namespacedStoreConfig=" + String.valueOf(this.namespacedStoreConfig) + ",enableAsyncSubscriptions=" + this.enableAsyncSubscriptions + ",cacheSnapshots=" + this.cacheSnapshots + "}";
    }
}
