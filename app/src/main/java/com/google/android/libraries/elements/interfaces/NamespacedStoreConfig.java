package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NamespacedStoreConfig {
    public static final NamespacedStoreConfig EMPTY_CONFIG = new NamespacedStoreConfig(false, false, false);
    final boolean preferInlineObserverQueue;
    final boolean preferInlineTxQueue;
    final boolean useLockyByteStore;

    public NamespacedStoreConfig(boolean z, boolean z2, boolean z3) {
        this.useLockyByteStore = z;
        this.preferInlineTxQueue = z2;
        this.preferInlineObserverQueue = z3;
    }

    public boolean getPreferInlineObserverQueue() {
        return this.preferInlineObserverQueue;
    }

    public boolean getPreferInlineTxQueue() {
        return this.preferInlineTxQueue;
    }

    public boolean getUseLockyByteStore() {
        return this.useLockyByteStore;
    }

    public String toString() {
        return "NamespacedStoreConfig{useLockyByteStore=" + this.useLockyByteStore + ",preferInlineTxQueue=" + this.preferInlineTxQueue + ",preferInlineObserverQueue=" + this.preferInlineObserverQueue + "}";
    }
}
