package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymd extends ymb implements yma {
    public static final ymd d = new ymd(1, 0);

    public ymd(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.yma
    public final /* bridge */ /* synthetic */ Comparable a() {
        throw null;
    }

    @Override // defpackage.yma
    public final /* bridge */ /* synthetic */ Comparable b() {
        throw null;
    }

    @Override // defpackage.ymb, defpackage.yma
    public final boolean d() {
        return this.a > this.b;
    }

    public final Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.ymb
    public final boolean equals(Object obj) {
        if (obj instanceof ymd) {
            if (d() && ((ymd) obj).d()) {
                return true;
            }
            ymd ymdVar = (ymd) obj;
            return this.a == ymdVar.a && this.b == ymdVar.b;
        }
        return false;
    }

    public final Integer f() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.ymb
    public final int hashCode() {
        if (d()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ymb
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
