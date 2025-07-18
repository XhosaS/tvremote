package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmq implements qmn {
    public final Set a;
    private final Throwable b;
    private final int c;

    public qmq(Throwable th, Set set) {
        set.getClass();
        this.b = th;
        this.a = set;
        this.c = 59;
    }

    @Override // defpackage.qdi
    public final Throwable a() {
        return this.b;
    }

    @Override // defpackage.qdi
    public final int b() {
        return 59;
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
        if (!(obj instanceof qmq)) {
            return false;
        }
        qmq qmqVar = (qmq) obj;
        if (!yks.e(this.b, qmqVar.b) || !yks.e(this.a, qmqVar.a)) {
            return false;
        }
        int i = qmqVar.c;
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
        int iHashCode = (this.b.hashCode() * 31) + this.a.hashCode();
        a.bw(59);
        return (iHashCode * 31) + 59;
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

    public final String toString() {
        return "RpcBackendFailure(exception=" + this.b + ", accountsFailed=" + this.a + ", failureType=RPC_BACKEND_FAILURE)";
    }
}
