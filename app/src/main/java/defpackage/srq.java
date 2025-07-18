package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class srq extends agtu implements agvb {
    int a;
    final /* synthetic */ srt b;
    final /* synthetic */ agux c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srq(srt srtVar, agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = srtVar;
        this.c = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((srq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                zyd zydVarI = zxn.i(((sjv) ((srd) this.b).c.b).a);
                zydVarI.getClass();
                this.a = 1;
                obj = ahkr.b(zydVarI, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (rvr) obj;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        agux aguxVar = this.c;
        Throwable thA = agpk.a(objA);
        if (thA == null) {
            rwk rwkVarB = rwk.b(((rvr) objA).c);
            if (rwkVarB == null) {
                rwkVarB = rwk.UNKNOWN_DISCONNECT_REASON;
            }
            rwkVarB.getClass();
            aguxVar.a(rwkVarB);
        } else if (!(thA instanceof CancellationException)) {
            aguxVar.a(rwk.FAILED_GETTING_DISCONNECT_REASON);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        srq srqVar = new srq(this.b, this.c, agswVar);
        srqVar.d = obj;
        return srqVar;
    }
}
