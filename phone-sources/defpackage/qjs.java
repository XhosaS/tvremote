package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjs implements qdp {
    public final boolean a;
    private final Throwable b;
    private final int c;

    public qjs(Throwable th, int i, boolean z) {
        this.b = th;
        this.c = i;
        this.a = z;
    }

    @Override // defpackage.qdi
    public final Throwable a() {
        return this.b;
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
        if (!(obj instanceof qjs)) {
            return false;
        }
        qjs qjsVar = (qjs) obj;
        return yks.e(this.b, qjsVar.b) && this.c == qjsVar.c && this.a == qjsVar.a;
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
        int iHashCode = this.b.hashCode() * 31;
        int i = this.c;
        a.bw(i);
        return ((iHashCode + i) * 31) + a.q(this.a);
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
        return "TokenRegenerationFailure(exception=" + this.b + ", failureType=" + ((Object) osk.as(this.c)) + ", hasDeletedToken=" + this.a + ")";
    }
}
