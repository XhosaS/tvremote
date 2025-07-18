package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaq {
    public static final int a;
    public final Object b;
    public final boolean c;
    private final int d;

    static {
        int[] iArr = {1, 2};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                throw null;
            }
            i |= i3;
        }
        a = i;
    }

    public iaq(Object obj, int i, boolean z) {
        this.b = obj;
        this.d = i;
        this.c = z;
    }

    public final boolean a(int i) {
        return (i & this.d) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaq)) {
            return false;
        }
        iaq iaqVar = (iaq) obj;
        return yks.e(this.b, iaqVar.b) && this.d == iaqVar.d && this.c == iaqVar.c;
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.d) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "StoreRequest(key=" + this.b + ", skippedCaches=" + this.d + ", refresh=" + this.c + ")";
    }
}
