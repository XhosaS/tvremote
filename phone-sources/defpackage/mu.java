package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mu {
    public static final /* synthetic */ int a = 0;
    private static final os b = fh.g(0.0f, 0.0f, null, 7);
    private static final os c;
    private static final os d;

    static {
        Map map = qa.a;
        c = fh.g(0.0f, 0.0f, new cma(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        d = fh.g(0.0f, 0.0f, 1, 3);
    }

    public static final bdy a(float f, my myVar, bao baoVar, int i) {
        if ((i & 2) != 0) {
            myVar = c;
        }
        return d(new cma(f), pm.c, myVar, null, baoVar, 8);
    }

    public static final bdy b(float f, my myVar, bao baoVar, int i) {
        if ((i & 2) != 0) {
            myVar = b;
        }
        if (myVar == b) {
            baoVar.x(1144108831);
            boolean zC = baoVar.C(0.01f);
            Object objG = baoVar.g();
            if (zC || objG == ban.a) {
                objG = fh.g(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                baoVar.A(objG);
            }
            myVar = (os) objG;
            baoVar.p();
        } else {
            baoVar.x(1144218757);
            baoVar.p();
        }
        return d(Float.valueOf(f), pm.a, myVar, Float.valueOf(0.01f), baoVar, 0);
    }

    public static final bdy c(int i, bao baoVar) {
        return d(Integer.valueOf(i), pm.b, d, null, baoVar, 8);
    }

    public static final bdy d(Object obj, bhi bhiVar, my myVar, Object obj2, bao baoVar, int i) {
        byte[] bArr = null;
        if ((i & 4) != 0) {
            Object objG = baoVar.g();
            if (objG == ban.a) {
                objG = fh.g(0.0f, 0.0f, null, 7);
                baoVar.A(objG);
            }
            myVar = (os) objG;
        }
        if ((i & 8) != 0) {
            obj2 = null;
        }
        Object objG2 = baoVar.g();
        Object obj3 = ban.a;
        if (objG2 == obj3) {
            Object bciVar = new bci(null, bcz.c);
            baoVar.A(bciVar);
            objG2 = bciVar;
        }
        bcb bcbVar = (bcb) objG2;
        Object objG3 = baoVar.g();
        if (objG3 == obj3) {
            objG3 = new mr(obj, bhiVar, obj2);
            baoVar.A(objG3);
        }
        mr mrVar = (mr) objG3;
        bdy bdyVarBR = a.bR(null, baoVar);
        if (obj2 != null && (myVar instanceof os)) {
            os osVar = (os) myVar;
            if (!yks.e(osVar.c, obj2)) {
                myVar = new os(osVar.a, osVar.b, obj2);
            }
        }
        bdy bdyVarBR2 = a.bR(myVar, baoVar);
        Object objG4 = baoVar.g();
        if (objG4 == obj3) {
            objG4 = vyf.R(-1, 0, 6);
            baoVar.A(objG4);
        }
        yrz yrzVar = (yrz) objG4;
        boolean zH = baoVar.H(yrzVar) | baoVar.H(obj);
        Object objG5 = baoVar.g();
        if (zH || objG5 == obj3) {
            objG5 = new qm(yrzVar, obj, 1, bArr);
            baoVar.A(objG5);
        }
        bbn.g((yjk) objG5, baoVar);
        boolean zH2 = baoVar.H(yrzVar) | baoVar.H(mrVar) | baoVar.F(bdyVarBR2) | baoVar.F(bdyVarBR);
        Object objG6 = baoVar.g();
        if (zH2 || objG6 == obj3) {
            Object mtVar = new mt(yrzVar, mrVar, bdyVarBR2, bdyVarBR, null);
            baoVar.A(mtVar);
            objG6 = mtVar;
        }
        bbn.f(yrzVar, (yjz) objG6, baoVar);
        bdy bdyVar = (bdy) bcbVar.a();
        return bdyVar == null ? mrVar.a : bdyVar;
    }
}
