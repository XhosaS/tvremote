package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iun extends agtu implements agvb {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ iup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iun(Duration duration, iup iupVar, agsw agswVar) {
        super(2, agswVar);
        this.b = duration;
        this.c = iupVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iun) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Duration duration = this.b;
            this.a = 1;
            if (ahnx.a(duration, this) == agtgVar) {
                return agtgVar;
            }
        }
        iup iupVar = this.c;
        iupVar.d.a(iupVar);
        iupVar.c = null;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iun(this.b, this.c, agswVar);
    }
}
