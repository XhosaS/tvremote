package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwc extends agtu implements agvb {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ iwd c;
    final /* synthetic */ ite d;
    final /* synthetic */ Duration e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwc(Duration duration, iwd iwdVar, ite iteVar, Duration duration2, agsw agswVar) {
        super(2, agswVar);
        this.b = duration;
        this.c = iwdVar;
        this.d = iteVar;
        this.e = duration2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iwc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ahbt ahbtVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        if (i == 0) {
            agpl.b(obj);
            ahbtVar = (ahbt) this.f;
            Duration duration = this.b;
            this.f = ahbtVar;
            this.a = 1;
            if (zty.a(duration, this) != agtgVar) {
            }
            return agtgVar;
        }
        ahbtVar = (ahbt) (i != 1 ? this.f : this.f);
        agpl.b(obj);
        while (ahbu.d(ahbtVar)) {
            this.c.a(this.d);
            Duration duration2 = this.e;
            this.f = ahbtVar;
            this.a = 2;
            if (zty.a(duration2, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        iwc iwcVar = new iwc(this.b, this.c, this.d, this.e, agswVar);
        iwcVar.f = obj;
        return iwcVar;
    }
}
