package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjj extends agtu implements agvb {
    int a;
    final /* synthetic */ jkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjj(jkx jkxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jkxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Duration duration = jkx.e;
            this.a = 1;
            if (zty.a(duration, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.b.j.q(false);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jjj(this.b, agswVar);
    }
}
