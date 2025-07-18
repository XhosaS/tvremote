package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clf implements clo {
    private final long a;

    public clf(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        cko.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.clo
    public final float a() {
        return bnq.a(this.a);
    }

    @Override // defpackage.clo
    public final long b() {
        return this.a;
    }

    @Override // defpackage.clo
    public final /* synthetic */ clo c(clo cloVar) {
        return cko.i(this, cloVar);
    }

    @Override // defpackage.clo
    public final /* synthetic */ clo d(yjk yjkVar) {
        return cko.j(this, yjkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clf)) {
            return false;
        }
        long j = this.a;
        long j2 = ((clf) obj).a;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    public final int hashCode() {
        long j = bnq.a;
        return a.k(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) bnq.g(this.a)) + ')';
    }

    @Override // defpackage.clo
    public final void e() {
    }
}
