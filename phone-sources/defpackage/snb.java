package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snb implements sna {
    long a = 0;

    @Override // defpackage.sna
    public final uvf a() {
        vtw vtwVarM = uvf.a.m();
        long j = this.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uvf uvfVar = (uvf) vtwVarM.b;
        uvfVar.b = 1;
        uvfVar.c = Long.valueOf(j);
        return (uvf) vtwVarM.r();
    }

    @Override // defpackage.sna
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof snb) && this.a == ((snb) obj).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
