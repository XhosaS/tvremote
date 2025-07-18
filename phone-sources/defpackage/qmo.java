package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmo implements qmp {
    private final Throwable a;
    private final int b = 55;

    public qmo(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.qdi
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.qdi
    public final int b() {
        return 55;
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
        if (!(obj instanceof qmo)) {
            return false;
        }
        qmo qmoVar = (qmo) obj;
        if (!yks.e(this.a, qmoVar.a)) {
            return false;
        }
        int i = qmoVar.b;
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
        a.bw(55);
        return iHashCode + 55;
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
        return "HttpTokenResetFailure(exception=" + this.a + ", failureType=TOKEN_RESET_FAILURE)";
    }
}
