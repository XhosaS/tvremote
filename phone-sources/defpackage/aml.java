package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aml {
    public final int a;
    public final int b;
    public final int c;
    public final cgz d;

    public aml(int i, int i2, int i3, cgz cgzVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = cgzVar;
    }

    public final amn a(int i) {
        return new amn(kv.M(this.d, i), i);
    }

    public final String b() {
        return this.d.a.a.b;
    }

    public final int c() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
        int i = this.a;
        sb.append(i);
        sb.append('-');
        cgz cgzVar = this.d;
        sb.append((Object) cko.k(kv.M(cgzVar, i)));
        sb.append(',');
        int i2 = this.b;
        sb.append(i2);
        sb.append('-');
        sb.append((Object) cko.k(kv.M(cgzVar, i2)));
        sb.append("), prevOffset=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
