package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfx {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public cfx(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }

    public static /* synthetic */ cfx a(cfx cfxVar, Object obj, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            obj = cfxVar.a;
        }
        if ((i3 & 2) != 0) {
            i = cfxVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = cfxVar.c;
        }
        return new cfx(obj, i, i2, cfxVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfx)) {
            return false;
        }
        cfx cfxVar = (cfx) obj;
        return yks.e(this.a, cfxVar.a) && this.b == cfxVar.b && this.c == cfxVar.c && yks.e(this.d, cfxVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public cfx(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        cko.a("Reversed range is not supported");
    }
}
