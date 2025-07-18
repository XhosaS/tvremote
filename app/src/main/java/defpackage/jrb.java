package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jrb {
    private final String E;
    public static final float[] a = {-4.0f, -1.0f, 3.5f, -4.5f};
    private static final int[] D = {0, 2, 3, 1};
    public static final jrb b = new jqj();
    public static final jrb c = new jqt();
    public static final jrb d = new jqu();
    public static final jrb e = new jqv();
    public static final jrb f = new jqw();
    public static final jrb g = new jqx();
    public static final jrb h = new jqy();
    public static final jrb i = new jqz();
    public static final jrb j = new jra();
    public static final jrb k = new jpz();
    public static final jrb l = new jqa();
    public static final jrb m = new jqb();
    public static final jrb n = new jqc();
    public static final jrb o = new jqd();
    public static final jrb p = new jqe();
    public static final jrb q = new jqf();
    public static final jrb r = new jqg();
    public static final jrb s = new jqh();
    public static final jrb t = new jqi();
    public static final jrb u = new jqk();
    public static final jrb v = new jql();
    public static final jrb w = new jqm();
    public static final jrb x = new jqn();
    public static final jrb y = new jqo();
    public static final jrb z = new jqp();
    public static final jrb A = new jqq();
    public static final jrb B = new jqr();
    public static final jrb C = new jqs();

    public jrb(String str) {
        this.E = str;
    }

    public static float e(long j2, int i2) {
        return ((j2 - (D[i2] * 50)) % 1200) / 1200.0f;
    }

    public static void f(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.b(true);
            jriVar.d(true);
            jriVar.e(true);
            jriVar.c(true);
        }
    }

    public static void g(jrj jrjVar, long j2) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            o(jrjVar, (jri) it.next(), j2);
        }
    }

    public static void h(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.k.c(1.0f);
            jriVar.g.c(-6.0f);
            if (jriVar == jrjVar.s()) {
                jriVar.f.c(-2.0f);
            }
            if (jriVar == jrjVar.v()) {
                jriVar.f.c(2.0f);
            }
        }
    }

    public static void i(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.d.b = true;
            jriVar.d(false);
            jriVar.b(false);
            jriVar.e(false);
            jriVar.c(false);
            jriVar.f.f(true);
        }
    }

    public static void j(jrj jrjVar) {
        jri jriVarQ = jrjVar.q();
        jriVarQ.c.c(12.0f);
        jriVarQ.d.c(3.1415927f);
        jri jriVarS = jrjVar.s();
        jriVarS.c.c(4.0f);
        jriVarS.d.c(3.1415927f);
        jri jriVarV = jrjVar.v();
        jriVarV.c.c(4.0f);
        jriVarV.d.c(0.0f);
        jri jriVarR = jrjVar.r();
        jriVarR.c.c(12.0f);
        jriVarR.d.c(0.0f);
    }

    public static void k(jrj jrjVar) {
        jrjVar.q().k.c(1.0f);
        jrjVar.s().f.c(-2.0f);
        jrjVar.v().f.c(2.0f);
        jrjVar.r().k.c(1.0f);
        if (jrjVar.q().k.f > 0.66f) {
            jrjVar.s().k.c(1.0f);
            jrjVar.v().k.c(1.0f);
        }
    }

    public static void l(jrj jrjVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            int iP = jrjVar.p(jriVar);
            boolean z2 = zArr[iP];
            jrh jrhVar = jriVar.d;
            jrhVar.b = z2;
            jrhVar.c(fArr4[iP]);
            jriVar.c.c(fArr3[iP] * 1.0416666f);
            jriVar.f.c(fArr2[iP] * 1.0416666f);
            jriVar.g.c(a[iP] * 1.0416666f);
            jriVar.e.c(fArr[iP] * 1.0416666f);
        }
    }

    public static boolean m(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            float f2 = ((jri) it.next()).d.f;
            if (f2 > 0.3926991f && f2 < 2.7488937f) {
                return false;
            }
            if (f2 > 3.5342917f && f2 < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(jrj jrjVar) {
        return jrjVar.q().d.e == 3.1415927f && jrjVar.s().d.e == 3.1415927f && jrjVar.v().d.e == 0.0f && jrjVar.r().d.e == 0.0f;
    }

    public static void o(jrj jrjVar, jri jriVar, long j2) {
        int iP = jrjVar.p(jriVar);
        if (jriVar == jrjVar.r()) {
            iP = 3;
        }
        jriVar.g.c((float) Math.sin((((j2 - (iP * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f));
    }

    public static void p(jri jriVar, int i2, float f2) {
        jriVar.g.c(a[i2] + ((float) Math.sin(f2 * 6.2831855f)));
    }

    public static void q(jrj jrjVar) {
        jrjVar.l(3.0f);
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.c.c(5.656f);
            jriVar.g.c(0.0f);
        }
        jrjVar.w(jrjVar.q(), 4.712389f);
        jrjVar.q().d.c(4.712389f);
        jrjVar.s().d.c(0.0f);
        jrjVar.v().d.c(1.5707964f);
        jrjVar.r().d.c(3.1415927f);
    }

    public abstract void a(jrj jrjVar);

    public abstract void b(jrj jrjVar);

    public abstract boolean c(long j2, long j3, jrj jrjVar);

    public final String toString() {
        return this.E;
    }
}
