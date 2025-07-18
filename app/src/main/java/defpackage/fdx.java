package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdx extends agtu implements agvb {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ agum c;
    final /* synthetic */ fdy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdx(Duration duration, agum agumVar, fdy fdyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = duration;
        this.c = agumVar;
        this.d = fdyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Duration duration = this.b;
            this.a = 1;
            if (zty.a(duration, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.c.a();
        this.d.a = null;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fdx(this.b, this.c, this.d, agswVar);
    }
}
