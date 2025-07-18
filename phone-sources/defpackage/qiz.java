package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qiz implements qdp {
    public final IOException a;
    public final int b;

    public qiz(IOException iOException, int i) {
        this.a = iOException;
        this.b = i;
    }

    @Override // defpackage.qdi
    public final /* synthetic */ Throwable a() {
        return this.a;
    }

    @Override // defpackage.qdi
    public final int b() {
        return this.b;
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
        if (!(obj instanceof qiz)) {
            return false;
        }
        qiz qizVar = (qiz) obj;
        return yks.e(this.a, qizVar.a) && this.b == qizVar.b;
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
        int i = this.b;
        a.bw(i);
        return iHashCode + i;
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
        return "AuthTokenTransientFailure(exception=" + this.a + ", failureType=" + ((Object) osk.as(this.b)) + ")";
    }
}
