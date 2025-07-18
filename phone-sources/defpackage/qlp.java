package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlp implements qdm, qlo {
    private final Throwable a;
    private final boolean b;
    private final int c = 43;

    public qlp(Throwable th, boolean z) {
        this.a = th;
        this.b = z;
    }

    @Override // defpackage.qdi
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.qdi
    public final int b() {
        return 43;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ Object c() {
        return osk.an(this);
    }

    @Override // defpackage.qdl
    public final /* synthetic */ Object d() {
        return osk.ao(this);
    }

    @Override // defpackage.qdl
    public final /* synthetic */ String e() {
        return osk.ap(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlp)) {
            return false;
        }
        qlp qlpVar = (qlp) obj;
        if (!yks.e(this.a, qlpVar.a) || this.b != qlpVar.b) {
            return false;
        }
        int i = qlpVar.c;
        return true;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ Throwable f() {
        return osk.aq(this);
    }

    @Override // defpackage.qdl
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a.bw(43);
        return ((iHashCode + a.q(this.b)) * 31) + 43;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ int k() {
        return osk.ar(this);
    }

    @Override // defpackage.qlo
    public final boolean l() {
        return this.b;
    }

    public final String toString() {
        return "RegistrationPermanentAuthFailure(exception=" + this.a + ", isRegistrationStoredInBackend=" + this.b + ", failureType=BACKEND_AUTH_FAILURE)";
    }
}
