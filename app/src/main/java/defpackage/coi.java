package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class coi extends agtu implements agvb {
    int a;
    final /* synthetic */ cic b;
    final /* synthetic */ cld c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ zyd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coi(cic cicVar, cld cldVar, AtomicInteger atomicInteger, zyd zydVar, agsw agswVar) {
        super(2, agswVar);
        this.b = cicVar;
        this.c = cldVar;
        this.d = atomicInteger;
        this.e = zydVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            cic cicVar = this.b;
            cld cldVar = this.c;
            this.a = 1;
            obj = cor.a(cicVar, cldVar, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        this.d.set(((Number) obj).intValue());
        this.e.cancel(true);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new coi(this.b, this.c, this.d, this.e, agswVar);
    }
}
