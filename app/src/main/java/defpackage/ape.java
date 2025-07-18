package defpackage;

import androidx.datastore.core.NativeSharedCounter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ape {
    public static final NativeSharedCounter a;

    static {
        System.loadLibrary("datastore_shared_counter");
        a = new NativeSharedCounter();
    }
}
