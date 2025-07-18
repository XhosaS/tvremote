package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbn {
    public static final bcm a = new bcm();

    public static final yow a(yil yilVar, bao baoVar) {
        yilVar.get(yqe.c);
        return new bdd(baoVar.h(), yilVar);
    }

    public static final void b(Object obj, Object obj2, yjv yjvVar, bao baoVar) {
        boolean zF = baoVar.F(obj) | baoVar.F(obj2);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zF || objT == ban.a) {
            objT = new bbj(yjvVar);
            basVar.ae(objT);
        }
    }

    public static final void c(Object obj, yjv yjvVar, bao baoVar) {
        boolean zF = baoVar.F(obj);
        Object objG = baoVar.g();
        if (zF || objG == ban.a) {
            objG = new bbj(yjvVar);
            baoVar.A(objG);
        }
    }

    public static final void d(Object[] objArr, yjv yjvVar, bao baoVar) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= baoVar.F(obj);
        }
        Object objG = baoVar.g();
        if (zF || objG == ban.a) {
            baoVar.A(new bbj(yjvVar));
        }
    }

    public static final void e(Object obj, Object obj2, yjz yjzVar, bao baoVar) {
        yil yilVarH = baoVar.h();
        boolean zF = baoVar.F(obj) | baoVar.F(obj2);
        Object objG = baoVar.g();
        if (zF || objG == ban.a) {
            objG = new bbu(yilVarH, yjzVar);
            baoVar.A(objG);
        }
    }

    public static final void f(Object obj, yjz yjzVar, bao baoVar) {
        yil yilVarH = baoVar.h();
        boolean zF = baoVar.F(obj);
        Object objG = baoVar.g();
        if (zF || objG == ban.a) {
            objG = new bbu(yilVarH, yjzVar);
            baoVar.A(objG);
        }
    }

    public static final void g(yjk yjkVar, bao baoVar) {
        baoVar.s(yjkVar);
    }
}
