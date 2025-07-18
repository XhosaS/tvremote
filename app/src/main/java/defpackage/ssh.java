package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssh extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ ssi c;
    final /* synthetic */ ahcb d;
    final /* synthetic */ zyd e;
    final /* synthetic */ sry f;
    final /* synthetic */ sst g;
    final /* synthetic */ sqn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssh(ssi ssiVar, ahcb ahcbVar, zyd zydVar, sry sryVar, sst sstVar, sqn sqnVar, agsw agswVar) {
        super(2, agswVar);
        this.c = ssiVar;
        this.d = ahcbVar;
        this.e = zydVar;
        this.f = sryVar;
        this.g = sstVar;
        this.h = sqnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ssh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        agtg agtgVar = agtg.a;
        if (this.b != 0) {
            obj2 = this.a;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            ssi ssiVar = this.c;
            ahcb ahcbVar = this.d;
            skw skwVar = ssiVar.e;
            this.a = skwVar;
            this.b = 1;
            Object objA = ahcbVar.a(this);
            if (objA == agtgVar) {
                return agtgVar;
            }
            obj2 = skwVar;
            obj = objA;
        }
        final sqn sqnVar = this.h;
        rzb rzbVar = (rzb) obj;
        agum agumVar = new agum() { // from class: ssg
            @Override // defpackage.agum
            public final Object a() {
                return Integer.valueOf(sqnVar.a());
            }
        };
        zyd zydVar = this.e;
        ssi ssiVar2 = this.c;
        sry sryVar = this.f;
        smv smvVar = new smv(sryVar.b, new Integer(this.g.a), new Integer(sryVar.a), 4);
        rzbVar.getClass();
        skw skwVar2 = (skw) obj2;
        ahbt ahbtVar = (ahbt) skwVar2.a.a();
        ahbtVar.getClass();
        sbs sbsVar = (sbs) skwVar2.b.a();
        sbsVar.getClass();
        mcw mcwVar = (mcw) skwVar2.c.a();
        mcwVar.getClass();
        return new skv(rzbVar, agumVar, zydVar, ssiVar2.d, smvVar, ahbtVar, sbsVar, mcwVar);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ssh(this.c, this.d, this.e, this.f, this.g, this.h, agswVar);
    }
}
