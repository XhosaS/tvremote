package com.google.android.libraries.elements.adl;

import defpackage.mir;
import defpackage.mis;
import defpackage.mit;
import defpackage.miu;
import defpackage.miv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpbMiniTable {
    private static final UpbArena b = new UpbArena(UpbArena.jniNewInstance());
    public final long a;

    public UpbMiniTable(long j) {
        this.a = j;
    }

    public static UpbMiniTable b(String str) {
        UpbMiniTable upbMiniTable;
        UpbArena upbArena = b;
        synchronized (upbArena) {
            upbMiniTable = new UpbMiniTable(jniDecode(str, upbArena.a));
        }
        return upbMiniTable;
    }

    public static UpbMiniTable c(String str) {
        UpbMiniTable upbMiniTable;
        UpbArena upbArena = b;
        synchronized (upbArena) {
            upbMiniTable = new UpbMiniTable(jniDecodeEnum(str, upbArena.a));
        }
        return upbMiniTable;
    }

    private static native long jniDecode(String str, long j);

    private static native long jniDecodeDbg(String str, long j, String str2);

    private static native long jniDecodeEnum(String str, long j);

    private native long jniDecodeExtension(String str, long j, long j2, long j3);

    private native int[] jniGetField(long j, int i);

    private native void jniRegisterLinks(long j, long[] jArr);

    public final long a(String str, UpbMiniTable upbMiniTable) {
        long jJniDecodeExtension;
        UpbArena upbArena = b;
        synchronized (upbArena) {
            jJniDecodeExtension = jniDecodeExtension(str, this.a, upbMiniTable.a, upbArena.a);
        }
        return jJniDecodeExtension;
    }

    public final miv d(int i) {
        miv mitVar;
        int[] iArrJniGetField = jniGetField(this.a, i);
        int length = iArrJniGetField.length;
        if (length < 2 || length > 4) {
            throw new InternalError("Upb internal error: C++ failed to return a valid mini table field.");
        }
        int i2 = iArrJniGetField[0];
        int i3 = iArrJniGetField[1];
        if (length == 2) {
            mitVar = new mir(i2, i3);
        } else if (length == 3) {
            mitVar = iArrJniGetField[2] == -1 ? new miu(i2, i3) : new mis(i2, i3);
        } else {
            int i4 = iArrJniGetField[2];
            int i5 = iArrJniGetField[3];
            mitVar = new mit(i2, i3);
        }
        if (mitVar.a == i) {
            return mitVar;
        }
        throw new InternalError("Upb internal error: inconsistent field number returned from C++");
    }

    public final void e(UpbMiniTable... upbMiniTableArr) {
        long[] jArr = new long[upbMiniTableArr.length];
        for (int i = 0; i < upbMiniTableArr.length; i++) {
            jArr[i] = upbMiniTableArr[i].a;
        }
        jniRegisterLinks(this.a, jArr);
    }
}
