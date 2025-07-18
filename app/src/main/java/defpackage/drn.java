package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class drn {
    private final dru a;
    public final dxl b;
    public final drq c;

    protected drn(dru druVar, drq drqVar) {
        this.b = druVar.e;
        this.c = drqVar;
        this.a = druVar;
        if (druVar.c != null) {
            drqVar.k = druVar.i();
        }
        drqVar.p = druVar.a;
    }

    protected static void j(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    public final void A(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 8;
        driVar.e = f;
    }

    public final void B(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 4;
        driVar.d = i;
    }

    public final void C(float f) {
        drk drkVarK = this.c.k();
        drkVarK.g = true;
        drkVarK.F().z(f);
    }

    public final void D(float f) {
        drk drkVarK = this.c.k();
        drkVarK.g = true;
        drkVarK.F().A(f);
    }

    public final void E(dyq dyqVar) {
        if (dyqVar == null) {
            throw new IllegalArgumentException("TransitionKeyType must not be null");
        }
        drj drjVarD = this.c.k().D();
        drjVarD.a |= 131072;
        drjVarD.h = dyqVar;
    }

    public final void F(Object obj) {
        this.c.k().F().E(obj);
    }

    public final void G(dtu dtuVar) {
        drj drjVarD = this.c.k().D();
        drjVarD.a |= 8;
        drjVarD.b = dtuVar;
    }

    public final void H(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 2;
        driVar.c = f;
    }

    public final void I(int i, float f) {
        L(i, this.b.a(f));
    }

    public final void J(int i, float f) {
        int iA = this.b.a(f);
        drj drjVarD = this.c.k().D();
        drjVarD.a |= 256;
        if (drjVarD.e == null) {
            drjVarD.e = new dtm();
        }
        drjVarD.e.e(i, iA);
    }

    public final void K(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 64;
        driVar.h = i;
    }

    public final void L(int i, int i2) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 8388608;
        if (driVar.w == null) {
            driVar.w = new dtm();
        }
        driVar.w.e(i, i2);
    }

    public final void M(dtl dtlVar) {
        this.c.j().put(1, dtlVar);
    }

    public final void N(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 32768;
        driVar.n = f;
    }

    public final void O(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 65536;
        driVar.o = f;
    }

    public final void P(boolean z) {
        this.c.k().F().q(z);
    }

    public final void Q(int i, int i2) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 33554432;
        if (driVar.u == null) {
            driVar.u = new dtm();
        }
        driVar.u.e(i, i2);
    }

    public final void R(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 256;
        driVar.j = i;
    }

    public final void S(dtu dtuVar) {
        this.c.k().F().v(dtuVar);
    }

    public final void T(int i, int i2) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 2097152;
        if (driVar.t == null) {
            driVar.t = new dtm();
        }
        driVar.t.e(i, i2);
    }

    public final void U(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 1048576;
        driVar.D = i;
    }

    public final void V(dtl dtlVar) {
        this.c.j().put(4, dtlVar);
    }

    public final void W(dtl dtlVar) {
        this.c.j().put(5, dtlVar);
    }

    public final void X(dtu dtuVar) {
        this.c.k().F().B(dtuVar);
    }

    public final void Y(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 1;
        driVar.b = i;
    }

    public final void Z() {
        this.c.k().g = true;
    }

    public abstract drq a();

    public final drn i(float f) {
        Y(this.b.a(f));
        return this;
    }

    public final void k(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 8192;
        driVar.C = i;
    }

    public void l(float f) {
        drk drkVarK = this.c.k();
        drkVarK.F().g(f);
        drkVarK.a = (byte) (f == 1.0f ? drkVarK.a & (-9) : drkVarK.a | 8);
    }

    public final void m(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 524288;
        driVar.r = f;
    }

    public final void n(Drawable drawable) {
        drk drkVarK = this.c.k();
        drkVarK.a = (byte) (drkVarK.a | 1);
        drkVarK.e = drawable;
    }

    public final void o(dre dreVar) {
        drj drjVarD = this.c.k().D();
        drjVarD.a |= 8192;
        drjVarD.j = dreVar;
    }

    public final void p(dtu dtuVar) {
        this.c.k().F().h(dtuVar);
    }

    public void q(boolean z) {
        this.c.k().F().j(z);
    }

    public void r() {
        this.c.k().F().i = false;
    }

    public void s(CharSequence charSequence) {
        this.c.k().F().l(charSequence);
    }

    public final void t(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 262144;
        driVar.q = f;
    }

    public final void u(int i) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 131072;
        driVar.p = i;
    }

    public final void v(dtu dtuVar) {
        this.c.k().F().p(dtuVar);
    }

    public final void w(float f) {
        K(this.b.a(f));
    }

    public final void x(float f) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 128;
        driVar.i = f;
    }

    public final void y(String str) {
        if (str == null) {
            dru druVar = this.a;
            drq drqVar = druVar.c;
            dsr.c(2, a.e(drqVar != null ? drqVar.d() : "unknown component", "Setting a null key from ", " which is usually a mistake! If it is not, explicitly set the String 'null'"), eev.a(druVar));
            str = "null";
        }
        drq drqVar2 = this.c;
        drqVar2.m = true;
        drqVar2.l = str;
    }

    public final void z(eny enyVar) {
        dri driVar = (dri) this.c.k().E();
        driVar.a |= 4096;
        driVar.s = enyVar;
    }
}
