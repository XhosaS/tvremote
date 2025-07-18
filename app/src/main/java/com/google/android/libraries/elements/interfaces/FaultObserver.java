package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FaultObserver {
    public abstract Status storeDidFault(ByteStore byteStore, String str);
}
