package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuq {
    public static final yxo a = new yxo("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final ysx c(yum yumVar, yil yilVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? yumVar : new yvn(yumVar, yilVar, i, i2);
    }

    public static final yuj d(int i, int i2, int i3) {
        if (i > 0 || i2 > 0 || i3 == 1) {
            return new yup(i, i2 + i, i3);
        }
        Objects.toString(vyf.S(i3));
        throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(vyf.S(i3)));
    }

    public static /* synthetic */ yuj e(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i & ((i4 & 1) ^ 1), i2, i3);
    }
}
