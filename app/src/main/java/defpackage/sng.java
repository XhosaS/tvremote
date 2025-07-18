package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sng extends agtu implements agvb {
    int a;
    final /* synthetic */ snh b;
    final /* synthetic */ sgo c;
    final /* synthetic */ Integer d;
    final /* synthetic */ rvw e;
    final /* synthetic */ zyd f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sng(snh snhVar, sgo sgoVar, Integer num, rvw rvwVar, zyd zydVar, agsw agswVar) {
        super(2, agswVar);
        this.b = snhVar;
        this.c = sgoVar;
        this.d = num;
        this.e = rvwVar;
        this.f = zydVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sng) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        Object objB;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
                objB = obj;
            } else {
                agpl.b(obj);
                zyd zydVar = this.f;
                this.a = 1;
                objB = ahkr.b(zydVar, this);
                if (objB == agtgVar) {
                    return agtgVar;
                }
            }
            objA = rwk.b(((rvr) objB).c);
            if (objA == null) {
                objA = rwk.UNKNOWN_DISCONNECT_REASON;
            }
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        boolean z = objA instanceof agpj;
        rwk rwkVar = rwk.FAILED_GETTING_DISCONNECT_REASON;
        if (true == z) {
            objA = rwkVar;
        }
        objA.getClass();
        snh snhVar = this.b;
        sgo sgoVar = this.c;
        Integer num = this.d;
        rvw rvwVar = this.e;
        rqo rqoVar = rpp.a;
        rqs rqsVarA = new rqw(new rpz("AUDIO_ROUTE_DISCONNECT_DONE", false, ypv.a, 104, rpq.AUDIO_ROUTE_DISCONNECT, new int[]{103}, rpp.a, rpp.c, rpp.d)).a(((rwk) objA).N, "disconnect_route_reason");
        rqt rqtVar = (rqt) rqsVarA;
        rqtVar.i("route_disconnect", snhVar.y(num));
        abxc abxcVar = snh.b;
        ahov ahovVar = ahov.a;
        ahon ahonVar = new ahon();
        snb snbVar = snh.a;
        ahod.b(snbVar.a(sgoVar), ahonVar);
        ahou ahouVar = ahou.a;
        ahot ahotVar = new ahot();
        int iB = snbVar.b(rvwVar);
        if ((ahotVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahotVar.y();
        }
        ahou ahouVar2 = (ahou) ahotVar.b;
        ahouVar2.c = iB - 1;
        ahouVar2.b = 1 | ahouVar2.b;
        abxd abxdVarV = ahotVar.v();
        abxdVarV.getClass();
        ahou ahouVar3 = (ahou) abxdVarV;
        if ((ahonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahonVar.y();
        }
        ahov ahovVar2 = (ahov) ahonVar.b;
        ahovVar2.g = ahouVar3;
        ahovVar2.c |= 64;
        rqtVar.f(abxcVar, ahod.a(ahonVar));
        snhVar.x(rqsVarA, sgoVar);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        sng sngVar = new sng(this.b, this.c, this.d, this.e, this.f, agswVar);
        sngVar.g = obj;
        return sngVar;
    }
}
