package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpz {
    public final int a(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return (-2147483639) + i3 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public final void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a.k(i2, i, "index: ", ", size: "));
        }
    }

    public final void c(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a.k(i2, i, "index: ", ", size: "));
        }
    }

    public final void d(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(a.k(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }
}
