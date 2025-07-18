package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjf {
    public static final Object a = new Object();

    public static final int a(bje bjeVar) {
        bjm bjmVar = bjeVar.a;
        bjmVar.getClass();
        return ((bjj) bjb.e(bjmVar)).c;
    }

    public static final bjj b(bje bjeVar) {
        bjm bjmVar = bjeVar.a;
        bjmVar.getClass();
        return (bjj) bjb.j(bjmVar, bjeVar);
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final boolean d(bjj bjjVar, int i, bgf bgfVar, boolean z) {
        boolean z2;
        synchronized (a) {
            int i2 = bjjVar.b;
            if (i2 == i) {
                bjjVar.a = bgfVar;
                z2 = true;
                if (z) {
                    bjjVar.c++;
                }
                bjjVar.b = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final boolean e(bje bjeVar, yjv yjvVar) {
        int i;
        bgf bgfVar;
        Object objA;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (a) {
                bjm bjmVar = bjeVar.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgl bglVarJ = bgfVar.j();
            objA = yjvVar.a(bglVarJ);
            bgf bgfVarC = bglVarJ.c();
            if (yks.e(bgfVarC, bgfVar)) {
                break;
            }
            bjm bjmVar2 = bjeVar.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = d((bjj) bjb.l(bjmVar2, bjeVar, bitVarB), i, bgfVarC, true);
            }
            bjb.t(bitVarB, bjeVar);
        } while (!zD);
        return ((Boolean) objA).booleanValue();
    }

    public static final void f() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
