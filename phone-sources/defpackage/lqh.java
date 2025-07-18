package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lqh implements tsv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lqh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [idw, java.lang.Object] */
    @Override // defpackage.tsv
    public final boolean apply(Object obj) {
        switch (this.b) {
            case 0:
                int i = lqi.b;
                return this.a.b(((lqf) obj).a);
            case 1:
                kte kteVar = (kte) obj;
                if (kteVar.b) {
                    kte kteVar2 = (kte) this.a;
                    if (!kteVar2.b && kteVar.a.equals(kteVar2.a) && kteVar.c.equals(kteVar2.c) && kteVar.d.equals(kteVar2.d)) {
                        return true;
                    }
                }
                return false;
            case 2:
                vau vauVar = (vau) obj;
                if (!FluentIterable.from(vauVar.c).anyMatch(new efc(16))) {
                    return false;
                }
                val valVar = vauVar.b;
                if (valVar == null) {
                    valVar = val.a;
                }
                if (!kgu.p(valVar)) {
                    val valVar2 = vauVar.b;
                    if (valVar2 == null) {
                        valVar2 = val.a;
                    }
                    krd.c("Invalid asset id. id:".concat(String.valueOf(valVar2.c)));
                    return false;
                }
                val valVar3 = vauVar.b;
                if (valVar3 == null) {
                    valVar3 = val.a;
                }
                lqq lqqVar = (lqq) ((lqr) this.a).get(valVar3);
                if (lqqVar == null) {
                    val valVar4 = vauVar.b;
                    if (valVar4 == null) {
                        valVar4 = val.a;
                    }
                    krd.c("Does not have ancestors. id:".concat(String.valueOf(valVar4.c)));
                    return false;
                }
                val valVar5 = vauVar.b;
                if (valVar5 == null) {
                    valVar5 = val.a;
                }
                vak vakVarB = vak.b(valVar5.b);
                if (vakVarB == null) {
                    vakVarB = vak.UNRECOGNIZED;
                }
                int iOrdinal = vakVarB.ordinal();
                if (iOrdinal == 4 ? !lqqVar.b.g() || lqqVar.c.g() : iOrdinal == 5 ? !(lqqVar.b.g() && lqqVar.c.g()) : lqqVar.b.g() || lqqVar.c.g()) {
                    val valVar6 = vauVar.b;
                    if (valVar6 == null) {
                        valVar6 = val.a;
                    }
                    krd.c("Does not have valid ancestors. id:".concat(String.valueOf(valVar6.c)));
                    return false;
                }
                if (FluentIterable.from(gag.t(vauVar).b).anyMatch(new efc(13))) {
                    return true;
                }
                val valVar7 = vauVar.b;
                if (valVar7 == null) {
                    valVar7 = val.a;
                }
                krd.c("Does not have valid purchase. id:".concat(String.valueOf(valVar7.c)));
                return false;
            case 3:
                int i2 = lxh.p;
                return ((kva) this.a).b((ksy) obj).b;
            case 4:
                this.a.b((kvf) obj);
                return true;
            case 5:
                this.a.b((kuo) obj);
                return true;
            case 6:
                return obj != ((qwn) ((yyh) this.a).b).b.a();
            case 7:
                return Iterables.any(((quy) this.a).p(obj), new mcp(4));
            default:
                return ((quy) this.a).n(obj) != null;
        }
    }
}
