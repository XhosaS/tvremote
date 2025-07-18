package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyu extends ebe {
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final SparseArray O;
    public final SparseBooleanArray P;

    public eyu() {
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = false;
        this.N = true;
    }

    @Override // defpackage.ebe
    public final /* synthetic */ ebf a() {
        return new eyv(this);
    }

    @Override // defpackage.ebe
    public final /* synthetic */ void d(int i, int i2) {
        super.d(1920, 1080);
    }

    @Override // defpackage.ebe
    public final /* synthetic */ void m(String str) {
        super.m(str);
    }

    @Override // defpackage.ebe
    public final /* synthetic */ void n(String str) {
        super.n(str);
    }

    public final void o(ebb ebbVar) {
        super.c(ebbVar);
    }

    public final void p() {
        super.e();
    }

    protected final void q(ebf ebfVar) {
        super.b(ebfVar);
    }

    public final void r() {
        this.N = false;
    }

    public final void s(Set set) {
        super.g(set);
    }

    public final void t() {
        this.C = true;
    }

    public final void u(int i, int i2) {
        super.d(i, i2);
    }

    public final void v(String str) {
        super.m(str);
    }

    public final void w(String str) {
        super.n(str);
    }

    public final void x(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.P;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public final void y(int i, boolean z) {
        super.l(i, z);
    }

    public eyu(eyv eyvVar) {
        super(eyvVar);
        this.F = eyvVar.ap;
        boolean z = eyvVar.aq;
        this.G = eyvVar.ar;
        boolean z2 = eyvVar.as;
        this.H = eyvVar.at;
        boolean z3 = eyvVar.au;
        this.I = eyvVar.av;
        boolean z4 = eyvVar.aw;
        boolean z5 = eyvVar.ax;
        this.J = eyvVar.ay;
        this.K = eyvVar.az;
        this.L = eyvVar.aA;
        this.M = eyvVar.aB;
        this.N = eyvVar.aC;
        boolean z6 = eyvVar.aD;
        SparseArray sparseArray = eyvVar.aE;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.O = sparseArray2;
        this.P = eyvVar.aF.clone();
    }
}
