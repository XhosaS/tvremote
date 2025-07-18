package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ClientDataObservable {
    public static final long INVALID_SUBSCRIPTION = -1;

    public abstract byte[] getClientData();

    public abstract long subscribe(ClientDataObserver clientDataObserver);

    public abstract void unsubscribe(long j);
}
