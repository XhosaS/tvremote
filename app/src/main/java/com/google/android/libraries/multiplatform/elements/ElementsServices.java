package com.google.android.libraries.multiplatform.elements;

import defpackage.wl;
import defpackage.ww;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ElementsServices implements AutoCloseable {
    static {
        long[] jArr;
        wl wlVar = new wl();
        long[] jArr2 = ww.a;
        int iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(6));
        wlVar.d = iMax;
        if (iMax == 0) {
            jArr = ww.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
        }
        wlVar.a = jArr;
        long[] jArr3 = wlVar.a;
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr3[i] = (jArr3[i] & (~j)) | j;
        wlVar.b = new int[iMax];
        wlVar.c = new Object[iMax];
    }

    private static native long[] jniGetRenderConfig();

    private static native void jniSetIsAccessibilityEnabled(boolean z);

    private static native void jniSetRenderConfig(long j, long j2);

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
