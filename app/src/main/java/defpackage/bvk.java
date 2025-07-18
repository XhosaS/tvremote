package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bvk extends bvc {
    int w;
    private bvc[] z;
    public ArrayList u = new ArrayList();
    public boolean v = true;
    boolean x = false;
    private int y = 0;

    private final void N(bvc bvcVar) {
        this.u.add(bvcVar);
        bvcVar.g = this;
    }

    private final bvc[] O() {
        bvc[] bvcVarArr = this.z;
        this.z = null;
        if (bvcVarArr == null) {
            bvcVarArr = new bvc[this.u.size()];
        }
        return (bvc[]) this.u.toArray(bvcVarArr);
    }

    @Override // defpackage.bvc
    public final void A(bum bumVar) {
        super.A(bumVar);
        this.y |= 4;
        if (this.u != null) {
            for (int i = 0; i < this.u.size(); i++) {
                ((bvc) this.u.get(i)).A(bumVar);
            }
        }
    }

    @Override // defpackage.bvc
    public final boolean C() {
        for (int i = 0; i < this.u.size(); i++) {
            if (((bvc) this.u.get(i)).C()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bvc
    public final /* bridge */ /* synthetic */ void G(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((bvc) this.u.get(i)).G(view);
        }
        this.d.add(view);
    }

    @Override // defpackage.bvc
    public final /* bridge */ /* synthetic */ void I(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((bvc) this.u.get(i)).I(view);
        }
        this.d.remove(view);
    }

    @Override // defpackage.bvc
    public final /* bridge */ /* synthetic */ void J() {
        this.y |= 1;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bvc) this.u.get(i)).J();
            }
        }
    }

    @Override // defpackage.bvc
    public final void K() {
        this.y |= 2;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bvc) this.u.get(i)).K();
        }
    }

    @Override // defpackage.bvc
    public final /* synthetic */ void L(long j) {
        this.a = j;
    }

    @Override // defpackage.bvc
    public final /* bridge */ /* synthetic */ void M() {
        ArrayList arrayList;
        this.b = 0L;
        if (this.b < 0 || (arrayList = this.u) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bvc) this.u.get(i)).M();
        }
    }

    @Override // defpackage.bvc
    public final void b(bvl bvlVar) {
        if (E(bvlVar.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bvc bvcVar = (bvc) arrayList.get(i);
                if (bvcVar.E(bvlVar.b)) {
                    bvcVar.b(bvlVar);
                    bvlVar.c.add(bvcVar);
                }
            }
        }
    }

    @Override // defpackage.bvc
    public final void c(bvl bvlVar) {
        if (E(bvlVar.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bvc bvcVar = (bvc) arrayList.get(i);
                if (bvcVar.E(bvlVar.b)) {
                    bvcVar.c(bvlVar);
                    bvlVar.c.add(bvcVar);
                }
            }
        }
    }

    @Override // defpackage.bvc
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.bvc
    public final boolean d() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            if (!((bvc) this.u.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final bvc f(int i) {
        if (i < 0 || i >= this.u.size()) {
            return null;
        }
        return (bvc) this.u.get(i);
    }

    public final void g(bvc bvcVar) {
        N(bvcVar);
        if (this.b >= 0) {
            bvcVar.M();
        }
        if ((this.y & 1) != 0) {
            bvcVar.J();
        }
        if ((this.y & 2) != 0) {
            bvcVar.K();
        }
        if ((this.y & 4) != 0) {
            bvcVar.A(this.q);
        }
        if ((this.y & 8) != 0) {
            bvcVar.z(this.p);
        }
    }

    @Override // defpackage.bvc
    /* renamed from: i */
    public final bvc clone() {
        bvk bvkVar = (bvk) super.clone();
        bvkVar.u = new ArrayList();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            bvkVar.N(((bvc) this.u.get(i)).clone());
        }
        return bvkVar;
    }

    @Override // defpackage.bvc
    public final String m(String str) {
        String strM = super.m(str);
        for (int i = 0; i < this.u.size(); i++) {
            strM = strM + "\n" + ((bvc) this.u.get(i)).m(str.concat("  "));
        }
        return strM;
    }

    @Override // defpackage.bvc
    protected final void n() {
        super.n();
        bvc[] bvcVarArrO = O();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            bvcVarArrO[i].n();
        }
        Arrays.fill(bvcVarArrO, (Object) null);
        this.z = bvcVarArrO;
    }

    @Override // defpackage.bvc
    public final void o(bvl bvlVar) {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bvc) this.u.get(i)).o(bvlVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.bvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(android.view.ViewGroup r13, defpackage.bvm r14, defpackage.bvm r15, java.util.ArrayList r16, java.util.ArrayList r17) {
        /*
            r12 = this;
            long r0 = r12.a
            java.util.ArrayList r2 = r12.u
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L3d
            java.util.ArrayList r5 = r12.u
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            bvc r6 = (defpackage.bvc) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            boolean r5 = r12.v
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
            r6.r(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.r(android.view.ViewGroup, bvm, bvm, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // defpackage.bvc
    public final void u(View view) {
        super.u(view);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bvc) this.u.get(i)).u(view);
        }
    }

    @Override // defpackage.bvc
    public final void v() {
        this.r = 0L;
        bvi bviVar = new bvi(this);
        for (int i = 0; i < this.u.size(); i++) {
            bvc bvcVar = (bvc) this.u.get(i);
            bvcVar.F(bviVar);
            bvcVar.v();
            long j = bvcVar.r;
            if (this.v) {
                this.r = Math.max(this.r, j);
            } else {
                long j2 = this.r;
                bvcVar.t = j2;
                this.r = j2 + j;
            }
        }
    }

    @Override // defpackage.bvc
    public final void w(View view) {
        super.w(view);
        bvc[] bvcVarArrO = O();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            bvcVarArrO[i].w(view);
        }
        Arrays.fill(bvcVarArrO, (Object) null);
        this.z = bvcVarArrO;
    }

    @Override // defpackage.bvc
    protected final void x() {
        if (this.u.isEmpty()) {
            B();
            s();
            return;
        }
        bvj bvjVar = new bvj(this);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bvc) arrayList.get(i)).F(bvjVar);
        }
        this.w = this.u.size();
        if (this.v) {
            ArrayList arrayList2 = this.u;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((bvc) arrayList2.get(i2)).x();
            }
            return;
        }
        for (int i3 = 1; i3 < this.u.size(); i3++) {
            ((bvc) this.u.get(i3 - 1)).F(new bvh((bvc) this.u.get(i3)));
        }
        bvc bvcVar = (bvc) this.u.get(0);
        if (bvcVar != null) {
            bvcVar.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.y(long, long):void");
    }

    @Override // defpackage.bvc
    public final void z(bus busVar) {
        this.p = busVar;
        this.y |= 8;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bvc) this.u.get(i)).z(busVar);
        }
    }
}
