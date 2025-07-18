package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdc implements bzx {
    public yjz a;
    private bpu b;
    private final cbc c;
    private yjk d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private boe o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final bnf u;
    private long e = 9223372034707292159L;
    private final float[] g = boa.e();
    private clx j = new cly(1.0f, 1.0f);
    private cmi k = cmi.a;
    private final bpo l = new bpo();
    private long n = bop.a;
    private boolean r = true;
    private final yjv t = new cbq(this, 4);

    public cdc(bpu bpuVar, bnf bnfVar, cbc cbcVar, yjz yjzVar, yjk yjkVar) {
        this.b = bpuVar;
        this.u = bnfVar;
        this.c = cbcVar;
        this.a = yjzVar;
        this.d = yjkVar;
    }

    private final void m(boolean z) {
        if (z != this.i) {
            this.i = z;
            cbc cbcVar = this.c;
            if (!z) {
                if (cbcVar.s) {
                    return;
                }
                cbcVar.q.remove(this);
                List list = cbcVar.r;
                if (list != null) {
                    list.remove(this);
                    return;
                }
                return;
            }
            if (!cbcVar.s) {
                cbcVar.q.add(this);
                return;
            }
            List arrayList = cbcVar.r;
            if (arrayList == null) {
                arrayList = new ArrayList();
                cbcVar.r = arrayList;
            }
            arrayList.add(this);
        }
    }

    private final void n() {
        if (Build.VERSION.SDK_INT < 26) {
            this.c.invalidate();
            return;
        }
        cbc cbcVar = this.c;
        ViewParent parent = cbcVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(cbcVar, cbcVar);
        }
    }

    private final float[] o() {
        float[] fArrE = this.h;
        if (fArrE == null) {
            fArrE = boa.e();
            this.h = fArrE;
        }
        if (this.q) {
            this.q = false;
            float[] fArrP = p();
            if (this.r) {
                return fArrP;
            }
            if (!cbp.w(fArrP, fArrE)) {
                fArrE[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrE[0])) {
            return null;
        }
        return fArrE;
    }

    private final float[] p() {
        if (this.p) {
            bpu bpuVar = this.b;
            long jP = bpuVar.m;
            if ((9223372034707292159L & jP) == 9205357640488583168L) {
                jP = d.p(clw.y(this.e));
            }
            float[] fArr = this.g;
            bpw bpwVar = bpuVar.a;
            int i = (int) (4294967295L & jP);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat(i);
            float fC = bpwVar.c();
            float fD = bpwVar.d();
            float fE = bpwVar.e();
            float fSin = (float) Math.sin(0.0d);
            float fCos = (float) Math.cos(0.0d);
            float fSin2 = (float) Math.sin(0.0d);
            float fCos2 = (float) Math.cos(0.0d);
            double d = fC * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d);
            float fCos3 = (float) Math.cos(d);
            float f = fSin * fSin2;
            float f2 = ((fCos3 * fCos2) + (fSin3 * f)) * fD;
            float f3 = fSin3 * fCos * fD;
            float f4 = fSin * fCos2;
            float f5 = -fSin2;
            float f6 = ((fCos3 * f5) + (fSin3 * f4)) * fD;
            float f7 = -fSin3;
            float f8 = ((f7 * fCos2) + (f * fCos3)) * fE;
            float f9 = fCos * fCos3 * fE;
            float f10 = ((f7 * f5) + (fCos3 * f4)) * fE;
            fArr[0] = f2;
            fArr[1] = f3;
            fArr[2] = f6;
            fArr[3] = 0.0f;
            fArr[4] = f8;
            fArr[5] = f9;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = fCos * fSin2;
            fArr[9] = -fSin;
            fArr[10] = fCos * fCos2;
            fArr[11] = 0.0f;
            float f11 = -fIntBitsToFloat;
            float f12 = (fSin * 0.0f) + fCos;
            fArr[12] = ((f2 * f11) - (f8 * fIntBitsToFloat2)) + (fCos2 * 0.0f) + (f12 * fSin2) + fIntBitsToFloat;
            fArr[13] = ((f3 * f11) - (f9 * fIntBitsToFloat2)) + ((fCos * 0.0f) - fSin) + fIntBitsToFloat2;
            fArr[14] = ((f11 * f6) - (fIntBitsToFloat2 * f10)) + (fSin2 * 0.0f) + (f12 * fCos2);
            fArr[15] = 1.0f;
            this.p = false;
            this.r = bnj.z(fArr);
        }
        return this.g;
    }

    @Override // defpackage.bzx
    public final long a(long j, boolean z) {
        float[] fArrP;
        if (z) {
            fArrP = o();
            if (fArrP == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrP = p();
        }
        return this.r ? j : boa.a(fArrP, j);
    }

    @Override // defpackage.bzx
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        m(false);
        bnf bnfVar = this.u;
        if (bnfVar != null) {
            bnfVar.c(this.b);
            cbc cbcVar = this.c;
            dhk dhkVar = cbcVar.aa;
            dhkVar.d();
            ((bfz) dhkVar.b).o(new WeakReference(this, (ReferenceQueue) dhkVar.a));
            cbcVar.q.remove(this);
        }
    }

    @Override // defpackage.bzx
    public final void c(bnp bnpVar, bpu bpuVar) {
        i();
        this.s = this.b.b() > 0.0f;
        bpo bpoVar = this.l;
        bpn bpnVar = bpoVar.b;
        bpnVar.e(bnpVar);
        bpnVar.a = bpuVar;
        brx.k(bpoVar, this.b);
    }

    @Override // defpackage.bzx
    public final void d(bmw bmwVar, boolean z) {
        float[] fArrO = z ? o() : p();
        if (this.r) {
            return;
        }
        if (fArrO == null) {
            bmwVar.b(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            boa.b(fArrO, bmwVar);
        }
    }

    @Override // defpackage.bzx
    public final void e(long j) {
        cbc cbcVar = this.c;
        if (cbcVar.g) {
            cbcVar.z(-4.0f);
        }
        bpu bpuVar = this.b;
        if (!a.s(bpuVar.k, j)) {
            bpuVar.k = j;
            bpuVar.j(j, bpuVar.l);
        }
        n();
    }

    @Override // defpackage.bzx
    public final void f(long j) {
        if (a.s(j, this.e)) {
            return;
        }
        cbc cbcVar = this.c;
        if (cbcVar.g) {
            cbcVar.z(-4.0f);
        }
        this.e = j;
        invalidate();
    }

    @Override // defpackage.bzx
    public final void g(yjz yjzVar, yjk yjkVar) {
        bnf bnfVar = this.u;
        if (bnfVar == null) {
            bty.a("currently reuse is only supported when we manage the layer lifecycle");
            throw new yfs();
        }
        if (!this.b.j) {
            bty.b("layer should have been released before reuse");
        }
        this.b = bnfVar.a();
        this.f = false;
        this.a = yjzVar;
        this.d = yjkVar;
        this.p = false;
        this.q = false;
        this.r = true;
        boa.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            boa.c(fArr);
        }
        this.n = bop.a;
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.bzx
    public final void h(float[] fArr) {
        boa.d(fArr, p());
    }

    @Override // defpackage.bzx
    public final void i() {
        if (this.i) {
            if (!a.s(this.n, bop.a)) {
                bpu bpuVar = this.b;
                if (!a.s(bpuVar.l, this.e)) {
                    float fA = bop.a(this.n) * ((int) (this.e >> 32));
                    float fB = bop.b(this.n) * ((int) (this.e & 4294967295L));
                    bpuVar.i((Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32));
                }
            }
            bpu bpuVar2 = this.b;
            clx clxVar = this.j;
            cmi cmiVar = this.k;
            long j = this.e;
            yjv yjvVar = this.t;
            if (!a.s(bpuVar2.l, j)) {
                bpuVar2.l = j;
                bpuVar2.j(bpuVar2.k, j);
                if (bpuVar2.f == 9205357640488583168L) {
                    bpuVar2.e = true;
                    bpuVar2.d();
                }
            }
            bpuVar2.b = clxVar;
            bpuVar2.c = cmiVar;
            bpuVar2.d = yjvVar;
            bpw bpwVar = bpuVar2.a;
            bpuVar2.g();
            m(false);
        }
    }

    @Override // defpackage.bzx
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        m(true);
    }

    @Override // defpackage.bzx
    public final void j(boi boiVar) {
        yjk yjkVar;
        int i;
        yjk yjkVar2;
        int i2 = boiVar.a | this.m;
        this.k = boiVar.p;
        this.j = boiVar.o;
        int i3 = i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        if (i3 != 0) {
            this.n = boiVar.j;
        }
        if ((i2 & 1) != 0) {
            bpu bpuVar = this.b;
            float f = boiVar.b;
            bpw bpwVar = bpuVar.a;
            if (bpwVar.d() != f) {
                bpwVar.y(f);
            }
        }
        if ((i2 & 2) != 0) {
            bpu bpuVar2 = this.b;
            float f2 = boiVar.c;
            bpw bpwVar2 = bpuVar2.a;
            if (bpwVar2.e() != f2) {
                bpwVar2.z(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.b.h(boiVar.d);
        }
        if ((i2 & 8) != 0) {
            bpw bpwVar3 = this.b.a;
        }
        if ((i2 & 16) != 0) {
            bpw bpwVar4 = this.b.a;
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            bpu bpuVar3 = this.b;
            float f3 = boiVar.e;
            bpw bpwVar5 = bpuVar3.a;
            if (bpwVar5.f() != f3) {
                bpwVar5.A(f3);
                bpuVar3.e = true;
                bpuVar3.d();
            }
            if (boiVar.e > 0.0f && !this.s && (yjkVar2 = this.d) != null) {
                yjkVar2.a();
            }
        }
        if ((i2 & 64) != 0) {
            bpu bpuVar4 = this.b;
            long j = boiVar.f;
            bpw bpwVar6 = bpuVar4.a;
            long jI = bpwVar6.i();
            long j2 = bnq.a;
            if (!a.s(j, jI)) {
                bpwVar6.p(j);
            }
        }
        if ((i2 & 128) != 0) {
            bpu bpuVar5 = this.b;
            long j3 = boiVar.g;
            bpw bpwVar7 = bpuVar5.a;
            long j4 = bpwVar7.j();
            long j5 = bnq.a;
            if (!a.s(j3, j4)) {
                bpwVar7.B(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            bpu bpuVar6 = this.b;
            float f4 = boiVar.h;
            bpw bpwVar8 = bpuVar6.a;
            if (bpwVar8.c() != f4) {
                bpwVar8.x(f4);
            }
        }
        if ((i2 & 256) != 0) {
            bpw bpwVar9 = this.b.a;
        }
        if ((i2 & 512) != 0) {
            bpw bpwVar10 = this.b.a;
        }
        if ((i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            bpu bpuVar7 = this.b;
            float f5 = boiVar.i;
            bpw bpwVar11 = bpuVar7.a;
            if (bpwVar11.b() != f5) {
                bpwVar11.r(f5);
            }
        }
        if (i3 != 0) {
            if (a.s(this.n, bop.a)) {
                this.b.i(9205357640488583168L);
            } else {
                bpu bpuVar8 = this.b;
                float fA = bop.a(this.n) * ((int) (this.e >> 32));
                bpuVar8.i((Float.floatToRawIntBits(bop.b(this.n) * ((int) (this.e & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32));
            }
        }
        if ((i2 & 16384) != 0) {
            bpu bpuVar9 = this.b;
            boolean z2 = boiVar.l;
            if (bpuVar9.n != z2) {
                bpuVar9.n = z2;
                bpuVar9.e = true;
                bpuVar9.d();
            }
        }
        if ((131072 & i2) != 0) {
            bpw bpwVar12 = this.b.a;
            if (!yks.e(null, null)) {
                bpwVar12.E();
            }
        }
        if ((262144 & i2) != 0) {
            bpw bpwVar13 = this.b.a;
            if (!yks.e(null, null)) {
                bpwVar13.D();
            }
        }
        if ((524288 & i2) != 0) {
            bpu bpuVar10 = this.b;
            int i4 = boiVar.q;
            bpw bpwVar14 = bpuVar10.a;
            if (!a.r(bpwVar14.g(), i4)) {
                bpwVar14.q(i4);
            }
        }
        if ((32768 & i2) != 0) {
            bpu bpuVar11 = this.b;
            int i5 = boiVar.m;
            if (a.r(i5, 0)) {
                i = 0;
            } else if (a.r(i5, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!a.r(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            bpw bpwVar15 = bpuVar11.a;
            if (!a.r(bpwVar15.h(), i)) {
                bpwVar15.t(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (yks.e(this.o, boiVar.r)) {
            z = false;
        } else {
            boe boeVar = boiVar.r;
            this.o = boeVar;
            if (boeVar != null) {
                bpu bpuVar12 = this.b;
                if (boeVar instanceof boc) {
                    bmy bmyVar = ((boc) boeVar).a;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(bmyVar.b);
                    float f6 = bmyVar.c;
                    bpuVar12.k((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(bmyVar.d - r11) << 32) | (Float.floatToRawIntBits(bmyVar.e - f6) & 4294967295L), 0.0f);
                } else if (boeVar instanceof bob) {
                    bpuVar12.l(((bob) boeVar).a);
                } else {
                    if (!(boeVar instanceof bod)) {
                        throw new yfu();
                    }
                    bod bodVar = (bod) boeVar;
                    bni bniVar = bodVar.b;
                    if (bniVar != null) {
                        bpuVar12.l(bniVar);
                    } else {
                        bmz bmzVar = bodVar.a;
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(bmzVar.a);
                        float fB = bmzVar.b();
                        float fA2 = bmzVar.a();
                        bpuVar12.k((jFloatToRawIntBits2 << 32) | (Float.floatToRawIntBits(bmzVar.b) & 4294967295L), (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA2) & 4294967295L), Float.intBitsToFloat((int) (bmzVar.h >> 32)));
                    }
                }
                if ((boeVar instanceof bob) && Build.VERSION.SDK_INT < 33 && (yjkVar = this.d) != null) {
                    yjkVar.a();
                }
                z = true;
            }
        }
        this.m = boiVar.a;
        if (i2 != 0 || z) {
            n();
            cbc cbcVar = this.c;
            if (cbcVar.g) {
                cbcVar.z(0.0f);
            }
        }
    }

    @Override // defpackage.bzx
    public final boolean k(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        bpu bpuVar = this.b;
        if (!bpuVar.n) {
            return true;
        }
        boe boeVarC = bpuVar.c();
        if (boeVarC instanceof boc) {
            bmy bmyVar = ((boc) boeVarC).a;
            return bmyVar.b <= fIntBitsToFloat && fIntBitsToFloat < bmyVar.d && bmyVar.c <= fIntBitsToFloat2 && fIntBitsToFloat2 < bmyVar.e;
        }
        if (!(boeVarC instanceof bod)) {
            if (boeVarC instanceof bob) {
                return ccf.f(((bob) boeVarC).a, fIntBitsToFloat, fIntBitsToFloat2);
            }
            throw new yfu();
        }
        bmz bmzVar = ((bod) boeVarC).a;
        float f = bmzVar.a;
        if (fIntBitsToFloat >= f) {
            float f2 = bmzVar.c;
            if (fIntBitsToFloat < f2) {
                float f3 = bmzVar.b;
                if (fIntBitsToFloat2 >= f3) {
                    float f4 = bmzVar.d;
                    if (fIntBitsToFloat2 >= f4) {
                        return false;
                    }
                    long j2 = bmzVar.e;
                    long j3 = bmzVar.f;
                    int i = (int) (j3 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= bmzVar.b()) {
                        long j4 = bmzVar.h;
                        long j5 = bmzVar.g;
                        int i3 = (int) (j5 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= bmzVar.b()) {
                            int i5 = (int) (j4 & 4294967295L);
                            int i6 = (int) (j2 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= bmzVar.a()) {
                                int i7 = (int) (j5 & 4294967295L);
                                int i8 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= bmzVar.a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i6) + f3;
                                    float fIntBitsToFloat5 = f2 - Float.intBitsToFloat(i);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i8) + f3;
                                    float fIntBitsToFloat7 = f2 - Float.intBitsToFloat(i3);
                                    float fIntBitsToFloat8 = f4 - Float.intBitsToFloat(i7);
                                    float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i5);
                                    float fIntBitsToFloat10 = f + Float.intBitsToFloat(i4);
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        return ccf.e(fIntBitsToFloat, fIntBitsToFloat2, j2, fIntBitsToFloat3, fIntBitsToFloat4);
                                    }
                                    if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        return ccf.e(fIntBitsToFloat, fIntBitsToFloat2, j4, fIntBitsToFloat10, fIntBitsToFloat9);
                                    }
                                    if (fIntBitsToFloat > fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        return ccf.e(fIntBitsToFloat, fIntBitsToFloat2, j3, fIntBitsToFloat5, fIntBitsToFloat6);
                                    }
                                    if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) {
                                        return true;
                                    }
                                    return ccf.e(fIntBitsToFloat, fIntBitsToFloat2, j5, fIntBitsToFloat7, fIntBitsToFloat8);
                                }
                            }
                        }
                    }
                    bni bniVar = new bni((byte[]) null);
                    bnj.t(bniVar, bmzVar);
                    return ccf.f(bniVar, fIntBitsToFloat, fIntBitsToFloat2);
                }
            }
        }
        return false;
    }

    @Override // defpackage.bzx
    public final float[] l() {
        return p();
    }
}
