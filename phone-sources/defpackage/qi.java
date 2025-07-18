package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qi implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bte bteVar, yih yihVar) {
        int i = 3;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Object objK = kv.k(bteVar, new akx((qj) this.a, (yih) null, 1), yihVar);
                return objK == yio.a ? objK : ygi.a;
            case 1:
                Object objB = ((qg) this.a).b(bteVar, yihVar);
                return objB == yio.a ? objB : ygi.a;
            case 2:
                btv btvVar = new btv();
                yle yleVar = new yle();
                Object obj = this.a;
                ty tyVar = (ty) obj;
                bvc bvcVar = tyVar.g;
                yleVar.a = bvcVar != null ? bty.s(bvcVar) : 0L;
                Object objK2 = yoz.k(new tu(bteVar, tyVar, new auf(obj, btvVar, i2), new gk((Object) btvVar, (Object) bteVar, obj, 3, (byte[]) null), new sw(obj, 2), new sw(obj, i), new vi(tyVar, yleVar, btvVar, i2), null), yihVar);
                return objK2 == yio.a ? objK2 : ygi.a;
            case 3:
                Object objK3 = yoz.k(new akq((alg) this.a, bteVar, (yih) null, 0), yihVar);
                yio yioVar = yio.a;
                if (objK3 != yioVar) {
                    objK3 = ygi.a;
                }
                return objK3 == yioVar ? objK3 : ygi.a;
            case 4:
                Object objR = ((alg) this.a).r(bteVar, true, yihVar);
                return objR == yio.a ? objR : ygi.a;
            case 5:
                Object objR2 = ((alg) this.a).r(bteVar, false, yihVar);
                return objR2 == yio.a ? objR2 : ygi.a;
            case 6:
                Object objK4 = kv.k(bteVar, new agq(new ahf(this.a, 0), null), yihVar);
                yio yioVar2 = yio.a;
                if (objK4 != yioVar2) {
                    objK4 = ygi.a;
                }
                return objK4 == yioVar2 ? objK4 : ygi.a;
            case 7:
                Object objK5 = kv.k(bteVar, new ahr((ahs) this.a, null), yihVar);
                return objK5 == yio.a ? objK5 : ygi.a;
            case 8:
                Object objK6 = yoz.k(new akq((ajq) this.a, bteVar, (yih) null, 1), yihVar);
                return objK6 == yio.a ? objK6 : ygi.a;
            case 9:
                Object objG = wf.g(bteVar, null, new ars(this.a, 7), yihVar, 7);
                return objG == yio.a ? objG : ygi.a;
            default:
                Object obj2 = this.a;
                Object objG2 = wf.g(bteVar, new avl((avn) obj2, null), new ars(obj2, 16), yihVar, 3);
                return objG2 == yio.a ? objG2 : ygi.a;
        }
    }
}
