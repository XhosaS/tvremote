package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyc implements ykb {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public jyc(op opVar, fwr fwrVar, bib bibVar, bcb bcbVar, bdy bdyVar, int i) {
        this.f = i;
        this.a = opVar;
        this.c = fwrVar;
        this.b = bibVar;
        this.e = bcbVar;
        this.d = bdyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [bib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, yy] */
    @Override // defpackage.ykb
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        fwr fwrVarPrevious;
        if (this.f == 0) {
            ((Number) obj4).intValue();
            ((le) obj).getClass();
            ((fwr) obj2).getClass();
            bkp bkpVarA = wv.o(bkp.g, this.a).a(zi.c);
            Object obj5 = this.e;
            jyb jybVar = (jyb) this.b;
            fwv fwvVar = (fwv) obj5;
            jxl.F(bkpVarA, fwvVar, jybVar, (mdw) this.d, this.c, (bao) obj3, 0);
            return ygi.a;
        }
        le leVar = (le) obj;
        fwr fwrVar = (fwr) obj2;
        bao baoVar = (bao) obj3;
        ((Number) obj4).intValue();
        boolean zE = yks.e(((op) this.a).a(), this.c);
        if (!((Boolean) this.e.a()).booleanValue() && !zE) {
            List listI = a.i(this.d);
            ListIterator listIterator = listI.listIterator(listI.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fwrVarPrevious = 0;
                    break;
                }
                fwrVarPrevious = listIterator.previous();
                if (yks.e(fwrVar, (fwr) fwrVarPrevious)) {
                    break;
                }
            }
            fwrVar = fwrVarPrevious;
        }
        if (fwrVar == null) {
            baoVar.x(105930827);
        } else {
            baoVar.x(-1520603530);
            fus.E(fwrVar, this.b, bga.k(-1263531443, new awh(fwrVar, leVar, 9, null), baoVar), baoVar, 384);
        }
        baoVar.p();
        return ygi.a;
    }

    public jyc(yy yyVar, fwv fwvVar, jyb jybVar, mdw mdwVar, List list, int i) {
        this.f = i;
        this.a = yyVar;
        this.e = fwvVar;
        this.b = jybVar;
        this.d = mdwVar;
        this.c = list;
    }
}
