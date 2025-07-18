package com.google.android.libraries.elements.adl;

import android.os.Process;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpbUnsafe {
    public static final boolean a;
    public static final boolean b;

    static {
        a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        b = Process.is64Bit();
    }

    private UpbUnsafe() {
    }
}
