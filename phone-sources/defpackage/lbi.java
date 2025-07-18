package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbi implements idf {
    private final Class a;

    public lbi(Class cls) {
        this.a = cls;
    }

    private static ieg a(Class cls, kzw kzwVar) {
        throw new ClassCastException("Expected " + cls.toString() + " but got " + kaf.j(kaf.k(kzwVar.b)));
    }

    private final void c(Class cls, kzw kzwVar) {
        Class cls2 = this.a;
        if (cls2.isAssignableFrom(cls)) {
            return;
        }
        a(cls2, kzwVar);
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        kzw kzwVar = (kzw) obj;
        int iK = kaf.k(kzwVar.b);
        if (iK == 0) {
            throw null;
        }
        switch (iK - 1) {
            case 0:
                c(kvf.class, kzwVar);
                return ieg.f(lbn.a.b(kzwVar.b == 1 ? (lbl) kzwVar.c : lbl.a));
            case 1:
                c(kwn.class, kzwVar);
                return ieg.f(kzj.f.b(kzwVar.b == 2 ? (lcg) kzwVar.c : lcg.a));
            case 2:
                c(kwl.class, kzwVar);
                return ieg.f(kzj.e.b(kzwVar.b == 3 ? (lcd) kzwVar.c : lcd.a));
            case 3:
                c(kuo.class, kzwVar);
                return ieg.f(kzj.h.b(kzwVar.b == 4 ? (lau) kzwVar.c : lau.a));
            case 4:
                c(kvj.class, kzwVar);
                return ieg.f(kzj.d.b(kzwVar.b == 5 ? (lbr) kzwVar.c : lbr.a));
            case 5:
                c(kue.class, kzwVar);
                return ieg.f(kzj.c.b(kzwVar.b == 6 ? (laq) kzwVar.c : laq.a));
            case 6:
            case 10:
            default:
                return a(this.a, kzwVar);
            case 7:
                c(kvh.class, kzwVar);
                return ieg.f(lbv.a.b(kzwVar.b == 8 ? (lbp) kzwVar.c : lbp.a));
            case 8:
                c(kwq.class, kzwVar);
                return ieg.f(lbv.b.b(kzwVar.b == 9 ? (lci) kzwVar.c : lci.a));
            case 9:
                c(ksq.class, kzwVar);
                return ieg.f(kzj.a.b(kzwVar.b == 10 ? (kzi) kzwVar.c : kzi.a));
            case 11:
                c(kut.class, kzwVar);
                return ieg.f(lbf.a.apply(kzwVar.b == 13 ? (lbe) kzwVar.c : lbe.a));
        }
    }
}
