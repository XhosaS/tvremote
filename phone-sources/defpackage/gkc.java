package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkc extends gju {
    private gju[] A;
    ArrayList v;
    int w;
    boolean x;
    private boolean y;
    private int z;

    public gkc(byte[] bArr) {
        this();
        R(1);
        P(new gjk(2));
        P(new gji());
        P(new gjk(1));
    }

    private final void T(gju gjuVar) {
        this.v.add(gjuVar);
        gjuVar.f = this;
    }

    private final void U(gju[] gjuVarArr) {
        Arrays.fill(gjuVarArr, (Object) null);
        this.A = gjuVarArr;
    }

    private final gju[] V() {
        gju[] gjuVarArr = this.A;
        this.A = null;
        if (gjuVarArr == null) {
            gjuVarArr = new gju[this.v.size()];
        }
        return (gju[]) this.v.toArray(gjuVarArr);
    }

    @Override // defpackage.gju
    public final /* bridge */ /* synthetic */ void D(View view) {
        for (int i = 0; i < this.v.size(); i++) {
            ((gju) this.v.get(i)).D(view);
        }
        super.D(view);
    }

    @Override // defpackage.gju
    public final void F(Class cls) {
        for (int i = 0; i < this.v.size(); i++) {
            ((gju) this.v.get(i)).F(cls);
        }
        super.F(cls);
    }

    @Override // defpackage.gju
    public final /* bridge */ /* synthetic */ void H(View view) {
        for (int i = 0; i < this.v.size(); i++) {
            ((gju) this.v.get(i)).H(view);
        }
        super.H(view);
    }

    @Override // defpackage.gju
    public final void K() {
        this.z |= 2;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((gju) this.v.get(i)).K();
        }
    }

    @Override // defpackage.gju
    public final /* synthetic */ void L(long j) {
        this.a = j;
    }

    @Override // defpackage.gju
    public final void M(gli gliVar) {
        this.r = gliVar;
        this.z |= 8;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((gju) this.v.get(i)).M(gliVar);
        }
    }

    @Override // defpackage.gju
    public final void N(gli gliVar) {
        super.N(gliVar);
        this.z |= 4;
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                ((gju) this.v.get(i)).N(gliVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.gju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(android.view.ViewGroup r13, defpackage.isy r14, defpackage.isy r15, java.util.ArrayList r16, java.util.ArrayList r17) {
        /*
            r12 = this;
            long r0 = r12.a
            java.util.ArrayList r2 = r12.v
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L3d
            java.util.ArrayList r5 = r12.v
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            gju r6 = (defpackage.gju) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            boolean r5 = r12.y
            if (r5 != 0) goto L22
            if (r4 != 0) goto L30
            r4 = r3
        L22:
            long r9 = r6.a
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2d
            long r9 = r9 + r0
            r6.L(r9)
            goto L30
        L2d:
            r6.L(r0)
        L30:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.O(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkc.O(android.view.ViewGroup, isy, isy, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void P(gju gjuVar) {
        T(gjuVar);
        long j = this.b;
        if (j >= 0) {
            gjuVar.I(j);
        }
        if ((this.z & 1) != 0) {
            gjuVar.J(this.c);
        }
        if ((this.z & 2) != 0) {
            gjuVar.K();
        }
        if ((this.z & 4) != 0) {
            gjuVar.N(this.s);
        }
        if ((this.z & 8) != 0) {
            gjuVar.M(this.r);
        }
    }

    @Override // defpackage.gju
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void I(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.v) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gju) this.v.get(i)).I(j);
        }
    }

    public final void R(int i) {
        this.y = i == 0;
    }

    @Override // defpackage.gju
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J(TimeInterpolator timeInterpolator) {
        this.z |= 1;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gju) this.v.get(i)).J(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.gju
    public final void b(gke gkeVar) {
        if (B(gkeVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gju gjuVar = (gju) arrayList.get(i);
                if (gjuVar.B(gkeVar.b)) {
                    gjuVar.b(gkeVar);
                    gkeVar.c.add(gjuVar);
                }
            }
        }
    }

    @Override // defpackage.gju
    public final void c(gke gkeVar) {
        if (B(gkeVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gju gjuVar = (gju) arrayList.get(i);
                if (gjuVar.B(gkeVar.b)) {
                    gjuVar.c(gkeVar);
                    gkeVar.c.add(gjuVar);
                }
            }
        }
    }

    @Override // defpackage.gju
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.gju
    public final boolean d() {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            if (!((gju) this.v.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.v.size();
    }

    public final gju g(int i) {
        if (i < 0 || i >= this.v.size()) {
            return null;
        }
        return (gju) this.v.get(i);
    }

    @Override // defpackage.gju
    /* renamed from: i */
    public final gju clone() {
        gkc gkcVar = (gkc) super.clone();
        gkcVar.v = new ArrayList();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            gkcVar.T(((gju) this.v.get(i)).clone());
        }
        return gkcVar;
    }

    @Override // defpackage.gju
    public final String m(String str) {
        String strM = super.m(str);
        for (int i = 0; i < this.v.size(); i++) {
            strM = strM + "\n" + ((gju) this.v.get(i)).m(str.concat("  "));
        }
        return strM;
    }

    @Override // defpackage.gju
    public final void n() {
        super.n();
        gju[] gjuVarArrV = V();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            gjuVarArrV[i].n();
        }
        U(gjuVarArrV);
    }

    @Override // defpackage.gju
    public final void o(gke gkeVar) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((gju) this.v.get(i)).o(gkeVar);
        }
    }

    @Override // defpackage.gju
    public final void t(View view) {
        super.t(view);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((gju) this.v.get(i)).t(view);
        }
    }

    @Override // defpackage.gju
    public final void u() {
        this.o = 0L;
        gka gkaVar = new gka(this);
        for (int i = 0; i < this.v.size(); i++) {
            gju gjuVar = (gju) this.v.get(i);
            gjuVar.C(gkaVar);
            gjuVar.u();
            long j = gjuVar.o;
            if (this.y) {
                this.o = Math.max(this.o, j);
            } else {
                long j2 = this.o;
                gjuVar.q = j2;
                this.o = j2 + j;
            }
        }
    }

    @Override // defpackage.gju
    public final void v(View view) {
        super.v(view);
        gju[] gjuVarArrV = V();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            gjuVarArrV[i].v(view);
        }
        U(gjuVarArrV);
    }

    @Override // defpackage.gju
    protected final void w() {
        if (this.v.isEmpty()) {
            y();
            r();
            return;
        }
        gkb gkbVar = new gkb(this);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gju) arrayList.get(i)).C(gkbVar);
        }
        this.w = this.v.size();
        if (this.y) {
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((gju) arrayList2.get(i2)).w();
            }
            return;
        }
        for (int i3 = 1; i3 < this.v.size(); i3++) {
            ((gju) this.v.get(i3 - 1)).C(new gjz((gju) this.v.get(i3)));
        }
        gju gjuVar = (gju) this.v.get(0);
        if (gjuVar != null) {
            gjuVar.w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkc.x(long, long):void");
    }

    @Override // defpackage.gju
    public final boolean z() {
        for (int i = 0; i < this.v.size(); i++) {
            if (((gju) this.v.get(i)).z()) {
                return true;
            }
        }
        return false;
    }

    public gkc() {
        this.v = new ArrayList();
        this.y = true;
        this.x = false;
        this.z = 0;
    }
}
