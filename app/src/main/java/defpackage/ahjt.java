package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjt extends agtu implements agvb {
    int a;
    final /* synthetic */ ahgr[] b;
    final /* synthetic */ int c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ ahfn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahjt(ahgr[] ahgrVarArr, int i, AtomicInteger atomicInteger, ahfn ahfnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahgrVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = ahfnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahjt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        AtomicInteger atomicInteger;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                ahgr[] ahgrVarArr = this.b;
                int i = this.c;
                ahgr ahgrVar = ahgrVarArr[i];
                ahjs ahjsVar = new ahjs(this.e, i);
                this.a = 1;
                if (ahgrVar.fD(ahjsVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.e.u(null);
            }
            return agpu.a;
        } finally {
            if (this.d.decrementAndGet() == 0) {
                this.e.u(null);
            }
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ahjt(this.b, this.c, this.d, this.e, agswVar);
    }
}
