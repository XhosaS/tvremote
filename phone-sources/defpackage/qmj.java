package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmj implements qdp, qmi {
    private final Throwable a;
    private final qpv b;
    private final int c;

    public qmj(Throwable th, qpv qpvVar, int i) {
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
        if (!(obj instanceof qmj)) {
            return false;
        }
        qmj qmjVar = (qmj) obj;
        return yks.e(this.a, qmjVar.a) && yks.e(this.b, qmjVar.b) && this.c == qmjVar.c;
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
        return true;
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
        return "AuthTransientFailure(exception=" + this.a + ", account=" + this.b + ", failureType=" + ((Object) osk.as(this.c)) + ")";
    }
}
