package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ndf {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {-4.0f, -1.0f, 3.5f, -4.5f};
    private static final int[] c = {0, 2, 3, 1};

    public static float a(long j, int i) {
        return ((j - (c[i] * 50)) % 1200) / 1200.0f;
    }

    public static float b(long j, long j2, long j3) {
        return (j2 - j) / j3;
    }

    static void c(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.r(true);
            next.t(true);
            next.u(true);
            next.s(true);
        }
    }

    public static void d(ndm ndmVar) {
        ndmVar.b.j(12.0f);
        ndmVar.c.j(9.0f);
        ndmVar.d.j(14.0f);
        ndmVar.e.j(8.0f);
    }

    public static void e(ndm ndmVar, ndl ndlVar, long j) {
        int iC = ndmVar.c(ndlVar);
        if (ndlVar == ndmVar.e) {
            iC = 3;
        }
        ndlVar.j((float) Math.sin((((j - (iC * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f));
    }

    public static void f(ndm ndmVar, long j) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            e(ndmVar, it.next(), j);
        }
    }

    public static void g(ndl ndlVar, int i, float f) {
        ndlVar.j(b[i] + ((float) Math.sin(f * 6.2831855f)));
    }

    public static void h(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.o(1);
            next.j(-6.0f);
            if (next == ndmVar.c) {
                next.i(-2.0f);
            }
            if (next == ndmVar.d) {
                next.i(2.0f);
            }
        }
    }

    static void i(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.v(true);
            next.t(false);
            next.r(false);
            next.u(false);
            next.s(false);
            next.d.h(true);
        }
    }

    public static void j(ndm ndmVar) {
        ndl ndlVar = ndmVar.b;
        ndlVar.k(12.0f);
        ndlVar.g(3.1415927f);
        ndl ndlVar2 = ndmVar.c;
        ndlVar2.k(4.0f);
        ndlVar2.g(3.1415927f);
        ndl ndlVar3 = ndmVar.d;
        ndlVar3.k(4.0f);
        ndlVar3.g(0.0f);
        ndl ndlVar4 = ndmVar.e;
        ndlVar4.k(12.0f);
        ndlVar4.g(0.0f);
    }

    static void k(ndm ndmVar) {
        ndl ndlVar = ndmVar.b;
        ndlVar.o(1);
        ndl ndlVar2 = ndmVar.c;
        ndlVar2.i(-2.0f);
        ndl ndlVar3 = ndmVar.d;
        ndlVar3.i(2.0f);
        ndmVar.e.o(1);
        if (ndlVar.b() > 0.66f) {
            ndlVar2.o(1);
            ndlVar3.o(1);
        }
    }

    public static void l(ndm ndmVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            int iC = ndmVar.c(next);
            next.v(zArr[iC]);
            next.g(fArr4[iC]);
            next.k(fArr3[iC] * 1.0416666f);
            next.i(fArr2[iC] * 1.0416666f);
            next.j(b[iC] * 1.0416666f);
            next.m(fArr[iC] * 1.0416666f);
        }
    }

    public static boolean m(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            float fA = it.next().a();
            if (fA > 0.3926991f && fA < 2.7488937f) {
                return false;
            }
            if (fA > 3.5342917f && fA < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    public static void n(ndm ndmVar) {
        ndmVar.j(3.0f);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.k(5.656f);
            next.j(0.0f);
        }
        ndl ndlVar = ndmVar.b;
        ndmVar.f(4.712389f, ndlVar);
        ndlVar.g(4.712389f);
        ndmVar.c.g(0.0f);
        ndmVar.d.g(1.5707964f);
        ndmVar.e.g(3.1415927f);
    }
}
