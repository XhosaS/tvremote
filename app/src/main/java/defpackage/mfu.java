package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfu {
    public static final boolean a(int i) {
        return (i & 1) != 0;
    }

    public static final boolean b(int i) {
        return (i & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int c(int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = i >> 2;
        }
        int iB = z;
        if ((i3 & 2) != 0) {
            iB = b(i);
        }
        int iA = z2;
        if ((i3 & 4) != 0) {
            iA = a(i);
        }
        int i4 = (i2 + i2) | iB;
        return (i4 + i4) | iA;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
