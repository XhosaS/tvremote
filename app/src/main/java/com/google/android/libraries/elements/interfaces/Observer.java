package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Observer {
    public abstract Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord);
}
