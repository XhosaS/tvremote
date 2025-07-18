package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snd extends agtu implements agvb {
    int a;
    final /* synthetic */ snh b;
    final /* synthetic */ sgo c;
    final /* synthetic */ int d;
    final /* synthetic */ sdj e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snd(snh snhVar, sgo sgoVar, int i, sdj sdjVar, agsw agswVar) {
        super(2, agswVar);
        this.b = snhVar;
        this.c = sgoVar;
        this.d = i;
        this.e = sdjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((snd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
                zyd zydVarI = zxn.i(this.e.f);
                zydVarI.getClass();
                this.a = 1;
                objB = ahkr.b(zydVarI, this);
                if (objB == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (ruc) objB;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        Object objD = skj.d(1);
        if (true == (objA instanceof agpj)) {
            objA = objD;
        }
        snh snhVar = this.b;
        sgo sgoVar = this.c;
        int i = this.d;
        ruc rucVar = (ruc) objA;
        rucVar.getClass();
        rqo rqoVar = rpp.a;
        rqs rqsVarA = new rqw(new rpz("AUDIO_FOCUS_RELEASE_DONE", false, ypv.a, 127, rpq.AUDIO_FOCUS_RELEASE, new int[]{126}, rpp.a, rpp.c, rpp.d)).a((rty.b(rucVar.c) != 0 ? r2 : 1) - 1, "audio_focus_release_status");
        ((rqt) rqsVarA).i("focus_release", String.valueOf(i));
        snhVar.x(rqsVarA, sgoVar);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        snd sndVar = new snd(this.b, this.c, this.d, this.e, agswVar);
        sndVar.f = obj;
        return sndVar;
    }
}
