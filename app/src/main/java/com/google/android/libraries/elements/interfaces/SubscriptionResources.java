package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubscriptionResources {
    final BlockRegistryProvider blockRegistryProvider;
    final String blockRegistryRef;
    final ClientDataObservable clientDataObservable;
    final EnvironmentDataSource envSource;
    final SubscriptionObserverConfig observerConfig;

    public SubscriptionResources(SubscriptionObserverConfig subscriptionObserverConfig, EnvironmentDataSource environmentDataSource, ClientDataObservable clientDataObservable, String str, BlockRegistryProvider blockRegistryProvider) {
        this.observerConfig = subscriptionObserverConfig;
        this.envSource = environmentDataSource;
        this.clientDataObservable = clientDataObservable;
        this.blockRegistryRef = str;
        this.blockRegistryProvider = blockRegistryProvider;
    }

    public BlockRegistryProvider getBlockRegistryProvider() {
        return this.blockRegistryProvider;
    }

    public String getBlockRegistryRef() {
        return this.blockRegistryRef;
    }

    public ClientDataObservable getClientDataObservable() {
        return this.clientDataObservable;
    }

    public EnvironmentDataSource getEnvSource() {
        return this.envSource;
    }

    public SubscriptionObserverConfig getObserverConfig() {
        return this.observerConfig;
    }

    public String toString() {
        BlockRegistryProvider blockRegistryProvider = this.blockRegistryProvider;
        ClientDataObservable clientDataObservable = this.clientDataObservable;
        EnvironmentDataSource environmentDataSource = this.envSource;
        return "SubscriptionResources{observerConfig=" + String.valueOf(this.observerConfig) + ",envSource=" + String.valueOf(environmentDataSource) + ",clientDataObservable=" + String.valueOf(clientDataObservable) + ",blockRegistryRef=" + this.blockRegistryRef + ",blockRegistryProvider=" + String.valueOf(blockRegistryProvider) + "}";
    }
}
