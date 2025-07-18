package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llc extends em {
    private final lks e;
    private final lkc f;

    public llc() {
        throw null;
    }

    @Override // defpackage.em
    public final void a() {
        this.e.m();
    }

    @Override // defpackage.em
    public final void b() {
        this.e.n();
    }

    @Override // defpackage.em
    public final void c() {
        this.e.p();
    }

    @Override // defpackage.em
    public final void d() {
        this.e.q();
    }

    @Override // defpackage.em
    public final void e(long j) {
        this.e.t(0, (int) j, true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof llc) {
            llc llcVar = (llc) obj;
            if (this.e.equals(llcVar.e) && this.f.equals(llcVar.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.em
    public final void f() {
        this.f.e();
    }

    @Override // defpackage.em
    public final void g() {
        this.f.f();
    }

    @Override // defpackage.em
    public final void h() {
        this.e.g();
    }

    public final int hashCode() {
        return ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        lkc lkcVar = this.f;
        return "MediaSessionEventCallback{director=" + String.valueOf(this.e) + ", bingeWatchHelperInterface=" + String.valueOf(lkcVar) + "}";
    }

    public llc(lks lksVar, lkc lkcVar) {
        if (lksVar == null) {
            throw new NullPointerException("Null director");
        }
        this.e = lksVar;
        if (lkcVar == null) {
            throw new NullPointerException("Null bingeWatchHelperInterface");
        }
        this.f = lkcVar;
    }
}
