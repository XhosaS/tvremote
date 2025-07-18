package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gep extends agtu implements agvb {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ agum c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gep(Duration duration, agum agumVar, agsw agswVar) {
        super(2, agswVar);
        this.b = duration;
        this.c = agumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gep) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gep(this.b, this.c, agswVar);
    }
}
