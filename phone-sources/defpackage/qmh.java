package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmh implements qdm, qmi {
    private final Throwable a;
    private final qpv b;
    private final int c;

    public qmh(Throwable th, qpv qpvVar, int i) {
        qpvVar.getClass();
        this.a = th;
        this.b = qpvVar;
        this.c = i;
    }

    @Override // defpackage.qdi
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.qdi
    public final int b() {
        return this.c;
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
        if (!(obj instanceof qmh)) {
            return false;
        }
        qmh qmhVar = (qmh) obj;
        return yks.e(this.a, qmhVar.a) && yks.e(this.b, qmhVar.b) && this.c == qmhVar.c;
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
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = this.c;
        a.bw(i);
        return (iHashCode * 31) + i;
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

    @Override // defpackage.qmi
    public final qpv l() {
        return this.b;
    }

    public final String toString() {
        return "AuthPermanentFailure(exception=" + this.a + ", account=" + this.b + ", failureType=" + ((Object) osk.as(this.c)) + ")";
    }
}
