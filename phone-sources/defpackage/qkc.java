package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkc implements qdp {
    private final Throwable a;
    private final int b = 6;

    public qkc(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.qdi
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.qdi
    public final int b() {
        return 6;
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
        if (!(obj instanceof qkc)) {
            return false;
        }
        qkc qkcVar = (qkc) obj;
        if (!yks.e(this.a, qkcVar.a)) {
            return false;
        }
        int i = qkcVar.b;
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
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a.bw(6);
        return iHashCode + 6;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // defpackage.qdl
    public final /* synthetic */ int k() {
        return osk.ar(this);
    }

    public final String toString() {
        return "RegistrationTokenFailure(exception=" + this.a + ", failureType=REGISTRATION_TOKEN_NOT_AVAILABLE)";
    }
}
