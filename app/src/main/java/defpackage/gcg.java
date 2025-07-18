package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcg extends agtu implements agvb {
    int a;
    final /* synthetic */ gci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcg(gci gciVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gciVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gcg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Object objA = this.b.a.a();
            objA.getClass();
            Duration durationB = acbh.b((abwf) objA);
            durationB.getClass();
            this.a = 1;
            if (zty.a(durationB, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gcg(this.b, agswVar);
    }
}
