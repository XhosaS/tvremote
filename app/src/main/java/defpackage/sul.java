package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sul extends agtu implements agvb {
    final /* synthetic */ sum a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sul(sum sumVar, agsw agswVar) {
        super(2, agswVar);
        this.a = sumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sul) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        sum sumVar = this.a;
        long jA = sumVar.i.a() - sum.b;
        long j = sumVar.h;
        if (j < jA) {
            int iLongValue = (int) szr.d(jA - j, sumVar.d).longValue();
            zer zerVar = zfi.a;
            TimeUnit.SECONDS.getClass();
            if (sumVar.j != 2) {
                sumVar.j = 2;
                tae taeVar = sumVar.e;
                rsw rswVar = rsw.a;
                rsv rsvVar = new rsv();
                rtl.b(2, rsvVar);
                final rsw rswVarA = rtl.a(rsvVar);
                final sbl sblVar = (sbl) taeVar;
                sblVar.f.execute(wyo.h(new Runnable() { // from class: sbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        sblVar.i(rswVarA);
                    }
                }));
            }
            sumVar.e.h(new sdx(iLongValue, jA, 4, null), new byte[iLongValue]);
            sumVar.h = jA;
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sul(this.a, agswVar);
    }
}
