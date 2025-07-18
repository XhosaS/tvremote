package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmh extends agtu implements agvb {
    int a;
    final /* synthetic */ jmi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmh(jmi jmiVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jmiVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jmi jmiVar = this.b;
            this.a = 1;
            obj = jmiVar.a.b(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        xgn xgnVar = ((xfp) obj).h;
        if (xgnVar == null) {
            xgnVar = xgn.a;
        }
        abxs abxsVar = xgnVar.e;
        abxsVar.getClass();
        Iterator it = agqq.x(this.b.b).iterator();
        while (it.hasNext()) {
            ((jme) it.next()).ar(abxsVar);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jmh(this.b, agswVar);
    }
}
