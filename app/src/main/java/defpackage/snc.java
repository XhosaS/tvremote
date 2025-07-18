package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snc extends agtu implements agvb {
    int a;
    final /* synthetic */ snh b;
    final /* synthetic */ sgo c;
    final /* synthetic */ int d;
    final /* synthetic */ sdj e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snc(snh snhVar, sgo sgoVar, int i, sdj sdjVar, agsw agswVar) {
        super(2, agswVar);
        this.b = snhVar;
        this.c = sgoVar;
        this.d = i;
        this.e = sdjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((snc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
                zyd zydVarI = zxn.i(this.e.e);
                zydVarI.getClass();
                this.a = 1;
                objB = ahkr.b(zydVarI, this);
                if (objB == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (rts) objB;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        Object objC = skj.c(1);
        if (true == (objA instanceof agpj)) {
            objA = objC;
        }
        snh snhVar = this.b;
        sgo sgoVar = this.c;
        int i = this.d;
        rts rtsVar = (rts) objA;
        rtsVar.getClass();
        rqo rqoVar = rpp.a;
        rqs rqsVarA = new rqw(new rpz("AUDIO_FOCUS_ACQUIRE_DONE", false, ypv.a, 125, rpq.AUDIO_FOCUS_ACQUIRE, new int[]{124}, rpp.a, rpp.c, rpp.d)).a((rtu.b(rtsVar.c) != 0 ? r2 : 1) - 1, "audio_focus_acquire_status");
        ((rqt) rqsVarA).i("focus_acquire", String.valueOf(i));
        snhVar.x(rqsVarA, sgoVar);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        snc sncVar = new snc(this.b, this.c, this.d, this.e, agswVar);
        sncVar.f = obj;
        return sncVar;
    }
}
