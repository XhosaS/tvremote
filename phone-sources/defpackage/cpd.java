package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpd {
    public int A;
    public float B;
    int C;
    float D;
    public final int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final cpc K;
    public final cpc L;
    public final cpc M;
    public final cpc N;
    public final cpc O;
    final cpc P;
    final cpc Q;
    public final cpc R;
    public final cpc[] S;
    protected final ArrayList T;
    public final boolean[] U;
    public cpd V;
    int W;
    public int X;
    public float Y;
    public int Z;
    private boolean a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public float af;
    public float ag;
    public Object ah;
    public int ai;
    public String aj;
    public int ak;
    public int al;
    public final float[] am;
    public final cpd[] an;
    public final cpd[] ao;
    public int ap;
    public int aq;
    public final int[] ar;
    public cpn f;
    public cpn g;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean e = false;
    public cpv h = null;
    public cpx i = null;
    public final boolean[] j = {true, true};
    public boolean k = true;
    public int l = -1;
    public int m = -1;

    public cpd() {
        new HashMap();
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = new int[2];
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        cpc cpcVar = new cpc(this, 2);
        this.K = cpcVar;
        cpc cpcVar2 = new cpc(this, 3);
        this.L = cpcVar2;
        cpc cpcVar3 = new cpc(this, 4);
        this.M = cpcVar3;
        cpc cpcVar4 = new cpc(this, 5);
        this.N = cpcVar4;
        cpc cpcVar5 = new cpc(this, 6);
        this.O = cpcVar5;
        cpc cpcVar6 = new cpc(this, 8);
        this.P = cpcVar6;
        cpc cpcVar7 = new cpc(this, 9);
        this.Q = cpcVar7;
        cpc cpcVar8 = new cpc(this, 7);
        this.R = cpcVar8;
        this.S = new cpc[]{cpcVar, cpcVar3, cpcVar2, cpcVar4, cpcVar5, cpcVar8};
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.U = new boolean[2];
        this.ar = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        this.ai = 0;
        this.aj = null;
        this.ak = 0;
        this.al = 0;
        this.am = new float[]{-1.0f, -1.0f};
        this.an = new cpd[]{null, null};
        this.ao = new cpd[]{null, null};
        this.ap = -1;
        this.aq = -1;
        arrayList.add(cpcVar);
        arrayList.add(cpcVar2);
        arrayList.add(cpcVar3);
        arrayList.add(cpcVar4);
        arrayList.add(cpcVar6);
        arrayList.add(cpcVar7);
        arrayList.add(cpcVar8);
        arrayList.add(cpcVar5);
    }

    private final boolean a(int i) {
        cpc cpcVar;
        cpc cpcVar2;
        cpc[] cpcVarArr = this.S;
        int i2 = i + i;
        cpc cpcVar3 = cpcVarArr[i2];
        cpc cpcVar4 = cpcVar3.e;
        return (cpcVar4 == null || cpcVar4.e == cpcVar3 || (cpcVar2 = (cpcVar = cpcVarArr[i2 + 1]).e) == null || cpcVar2.e != cpcVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b9 A[PHI: r2
  0x04b9: PHI (r2v34 int) = (r2v33 int), (r2v38 int), (r2v38 int), (r2v38 int) binds: [B:284:0x04a9, B:286:0x04af, B:287:0x04b1, B:289:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(defpackage.cov r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.coy r34, defpackage.coy r35, int r36, boolean r37, defpackage.cpc r38, defpackage.cpc r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpd.c(cov, boolean, boolean, boolean, boolean, coy, coy, int, boolean, cpc, cpc, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    protected final void A(int i, boolean z) {
        this.U[i] = z;
    }

    public final void B(int i, int i2) {
        this.I = i;
        this.J = i2;
        this.k = false;
    }

    public final void C(int i) {
        if (i < 0) {
            this.ae = 0;
        } else {
            this.ae = i;
        }
    }

    public final void D(int i) {
        if (i < 0) {
            this.ad = 0;
        } else {
            this.ad = i;
        }
    }

    public final void E(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void F(boolean z, boolean z2) {
        int i;
        int i2;
        cpv cpvVar = this.h;
        boolean z3 = z & cpvVar.h;
        cpx cpxVar = this.i;
        boolean z4 = z2 & cpxVar.h;
        int i3 = cpvVar.i.f;
        int i4 = cpxVar.i.f;
        int i5 = cpvVar.j.f;
        int i6 = cpxVar.j.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aa = i3;
        }
        if (z4) {
            this.ab = i4;
        }
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.ar[0] == 1 && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i9 = this.ad;
            if (i8 < i9) {
                this.W = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.ar[1] == 1 && i10 < (i = this.X)) {
                i10 = i;
            }
            this.X = i10;
            int i11 = this.ae;
            if (i10 < i11) {
                this.X = i11;
            }
        }
    }

    final boolean G() {
        return (this instanceof cpk) || (this instanceof cph);
    }

    public final boolean H(int i) {
        if (i == 0) {
            return (this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0) < 2;
        }
        return ((this.L.e != null ? 1 : 0) + (this.N.e != null ? 1 : 0)) + (this.O.e != null ? 1 : 0) < 2;
    }

    public final boolean I(int i, int i2) {
        cpc cpcVar;
        cpc cpcVar2;
        cpc cpcVar3;
        cpc cpcVar4;
        if (i == 0) {
            cpc cpcVar5 = this.K;
            cpc cpcVar6 = cpcVar5.e;
            return cpcVar6 != null && cpcVar6.c && (cpcVar4 = (cpcVar3 = this.M).e) != null && cpcVar4.c && (cpcVar4.a() - cpcVar3.b()) - (cpcVar5.e.a() + cpcVar5.b()) >= i2;
        }
        cpc cpcVar7 = this.L;
        cpc cpcVar8 = cpcVar7.e;
        if (cpcVar8 != null && cpcVar8.c && (cpcVar2 = (cpcVar = this.N).e) != null && cpcVar2.c && (cpcVar2.a() - cpcVar.b()) - (cpcVar7.e.a() + cpcVar7.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        cpc cpcVar = this.K;
        cpc cpcVar2 = cpcVar.e;
        if (cpcVar2 != null && cpcVar2.e == cpcVar) {
            return true;
        }
        cpc cpcVar3 = this.M;
        cpc cpcVar4 = cpcVar3.e;
        return cpcVar4 != null && cpcVar4.e == cpcVar3;
    }

    public final boolean K() {
        cpc cpcVar = this.L;
        cpc cpcVar2 = cpcVar.e;
        if (cpcVar2 != null && cpcVar2.e == cpcVar) {
            return true;
        }
        cpc cpcVar3 = this.N;
        cpc cpcVar4 = cpcVar3.e;
        return cpcVar4 != null && cpcVar4.e == cpcVar3;
    }

    public final boolean L() {
        return this.k && this.ai != 8;
    }

    public cpc M(int i) {
        switch (i - 1) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            default:
                return this.Q;
        }
    }

    public final int N(int i) {
        return i == 0 ? O() : P();
    }

    public final int O() {
        return this.ar[0];
    }

    public final int P() {
        return this.ar[1];
    }

    public final void Q(int i, cpd cpdVar, int i2, int i3) {
        int i4;
        boolean z;
        int i5 = 4;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2) {
                    i2 = 2;
                } else if (i2 != 4) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return;
                        } else {
                            i2 = 5;
                        }
                    }
                    Q(3, cpdVar, i2, 0);
                    Q(5, cpdVar, i2, 0);
                    M(7).l(cpdVar.M(i2), 0);
                    return;
                }
                Q(2, cpdVar, i2, 0);
                Q(4, cpdVar, i2, 0);
                M(7).l(cpdVar.M(i2), 0);
                return;
            }
            cpc cpcVarM = M(2);
            cpc cpcVarM2 = M(4);
            cpc cpcVarM3 = M(3);
            cpc cpcVarM4 = M(5);
            boolean z2 = true;
            if ((cpcVarM == null || !cpcVarM.j()) && (cpcVarM2 == null || !cpcVarM2.j())) {
                Q(2, cpdVar, 2, 0);
                Q(4, cpdVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((cpcVarM3 == null || !cpcVarM3.j()) && (cpcVarM4 == null || !cpcVarM4.j())) {
                Q(3, cpdVar, 3, 0);
                Q(5, cpdVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                M(7).l(cpdVar.M(7), 0);
                return;
            } else if (z) {
                M(8).l(cpdVar.M(8), 0);
                return;
            } else {
                if (z2) {
                    M(9).l(cpdVar.M(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8) {
            if (i2 == 2) {
                i4 = 2;
            } else if (i2 == 4) {
                i4 = 4;
            } else {
                i = 8;
            }
            cpc cpcVarM5 = M(2);
            cpc cpcVarM6 = cpdVar.M(i4);
            cpc cpcVarM7 = M(4);
            cpcVarM5.l(cpcVarM6, 0);
            cpcVarM7.l(cpcVarM6, 0);
            M(8).l(cpcVarM6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            cpc cpcVarM8 = cpdVar.M(i2);
            M(3).l(cpcVarM8, 0);
            M(5).l(cpcVarM8, 0);
            M(9).l(cpcVarM8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            M(2).l(cpdVar.M(2), 0);
            M(4).l(cpdVar.M(4), 0);
            M(8).l(cpdVar.M(8), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            M(3).l(cpdVar.M(3), 0);
            M(5).l(cpdVar.M(5), 0);
            M(9).l(cpdVar.M(9), 0);
            return;
        }
        cpc cpcVarM9 = M(i);
        cpc cpcVarM10 = cpdVar.M(i2);
        if (cpcVarM9.k(cpcVarM10)) {
            if (i == 6) {
                cpc cpcVarM11 = M(3);
                cpc cpcVarM12 = M(5);
                if (cpcVarM11 != null) {
                    cpcVarM11.e();
                }
                if (cpcVarM12 != null) {
                    cpcVarM12.e();
                }
            } else if (i == 3 || i == 5) {
                cpc cpcVarM13 = M(6);
                if (cpcVarM13 != null) {
                    cpcVarM13.e();
                }
                cpc cpcVarM14 = M(7);
                if (cpcVarM14.e != cpcVarM10) {
                    cpcVarM14.e();
                }
                cpc cpcVarC = M(i).c();
                cpc cpcVarM15 = M(9);
                if (cpcVarM15.j()) {
                    cpcVarC.e();
                    cpcVarM15.e();
                }
            } else {
                if (i == 2) {
                    i5 = i;
                } else if (i == 4) {
                }
                cpc cpcVarM16 = M(7);
                if (cpcVarM16.e != cpcVarM10) {
                    cpcVarM16.e();
                }
                cpc cpcVarC2 = M(i5).c();
                cpc cpcVarM17 = M(8);
                if (cpcVarM17.j()) {
                    cpcVarC2.e();
                    cpcVarM17.e();
                }
            }
            cpcVarM9.l(cpcVarM10, i3);
        }
    }

    public final void R(int i, cpd cpdVar, int i2, int i3, int i4) {
        M(i).n(cpdVar.M(i2), i3, i4, true);
    }

    public final void S(int i) {
        this.ar[0] = i;
    }

    public final void T(int i) {
        this.ar[1] = i;
    }

    public void U(boolean z) {
        int i;
        cpx cpxVar;
        cpv cpvVar;
        int iO = cov.o(this.K);
        int iO2 = cov.o(this.L);
        int iO3 = cov.o(this.M);
        int iO4 = cov.o(this.N);
        if (z && (cpvVar = this.h) != null) {
            cpq cpqVar = cpvVar.i;
            if (cpqVar.i) {
                cpq cpqVar2 = cpvVar.j;
                if (cpqVar2.i) {
                    iO = cpqVar.f;
                    iO3 = cpqVar2.f;
                }
            }
        }
        if (z && (cpxVar = this.i) != null) {
            cpq cpqVar3 = cpxVar.i;
            if (cpqVar3.i) {
                cpq cpqVar4 = cpxVar.j;
                if (cpqVar4.i) {
                    iO2 = cpqVar3.f;
                    iO4 = cpqVar4.f;
                }
            }
        }
        if (iO3 - iO < 0 || iO4 - iO2 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO = 0;
            iO2 = 0;
            iO3 = 0;
            iO4 = 0;
        }
        this.aa = iO;
        this.ab = iO2;
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int i2 = iO3 - iO;
        int[] iArr = this.ar;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.W;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = iO4 - iO2;
        if (iArr[1] == 1 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i2;
        this.X = i5;
        int i6 = this.ae;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.ad;
        if (i2 < i7) {
            this.W = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.x;
        if (i8 > 0 && i3 == 3) {
            this.W = Math.min(i7, i8);
        }
        int i9 = this.A;
        if (i9 > 0 && iArr[1] == 3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i2 != i10) {
            this.l = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.m = i11;
        }
    }

    public void V(ivx ivxVar) {
        this.K.m();
        this.L.m();
        this.M.m();
        this.N.m();
        this.O.m();
        this.R.m();
        this.P.m();
        this.Q.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v44, types: [cpe] */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.cov r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpd.b(cov, boolean):void");
    }

    public boolean d() {
        return this.ai != 8;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public boolean f() {
        if (this.n) {
            return true;
        }
        return this.L.c && this.N.c;
    }

    public final int g() {
        return l() + this.X;
    }

    public final int h() {
        if (this.ai == 8) {
            return 0;
        }
        return this.X;
    }

    public final int i() {
        return k() + this.W;
    }

    public final int j() {
        if (this.ai == 8) {
            return 0;
        }
        return this.W;
    }

    public final int k() {
        cpd cpdVar = this.V;
        return cpdVar != null ? ((cpe) cpdVar).as + this.aa : this.aa;
    }

    public final int l() {
        cpd cpdVar = this.V;
        return cpdVar != null ? ((cpe) cpdVar).at + this.ab : this.ab;
    }

    public final cpd m(int i) {
        cpc cpcVar;
        cpc cpcVar2;
        if (i == 0) {
            cpc cpcVar3 = this.M;
            cpcVar2 = cpcVar3.e;
            if (cpcVar2 == null || cpcVar2.e != cpcVar3) {
                return null;
            }
        } else if (i != 1 || (cpcVar2 = (cpcVar = this.N).e) == null || cpcVar2.e != cpcVar) {
            return null;
        }
        return cpcVar2.d;
    }

    public final cpd n(int i) {
        cpc cpcVar;
        cpc cpcVar2;
        if (i == 0) {
            cpc cpcVar3 = this.K;
            cpcVar2 = cpcVar3.e;
            if (cpcVar2 == null || cpcVar2.e != cpcVar3) {
                return null;
            }
        } else if (i != 1 || (cpcVar2 = (cpcVar = this.L).e) == null || cpcVar2.e != cpcVar) {
            return null;
        }
        return cpcVar2.d;
    }

    public final cpz o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(cpe cpeVar, cov covVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            cpj.a(cpeVar, covVar, this);
            hashSet.remove(this);
            b(covVar, cpeVar.Z(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((cpc) it.next()).d.p(cpeVar, covVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((cpc) it2.next()).d.p(cpeVar, covVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((cpc) it3.next()).d.p(cpeVar, covVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((cpc) it4.next()).d.p(cpeVar, covVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((cpc) it5.next()).d.p(cpeVar, covVar, hashSet, 1, true);
            }
        }
    }

    public final void q(cpc cpcVar, cpc cpcVar2, int i) {
        if (cpcVar.d == this) {
            Q(cpcVar.i, cpcVar2.d, cpcVar2.i, i);
        }
    }

    public final void r(cov covVar) {
        covVar.b(this.K);
        covVar.b(this.L);
        covVar.b(this.M);
        covVar.b(this.N);
        if (this.ac > 0) {
            covVar.b(this.O);
        }
    }

    public final void s() {
        if (this.h == null) {
            this.h = new cpv(this);
        }
        if (this.i == null) {
            this.i = new cpx(this);
        }
    }

    public void t() {
        this.K.e();
        this.L.e();
        this.M.e();
        this.N.e();
        this.O.e();
        this.P.e();
        this.Q.e();
        this.R.e();
        this.V = null;
        this.F = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        int[] iArr = this.ar;
        iArr[0] = 1;
        iArr[1] = 1;
        this.ah = null;
        this.ai = 0;
        this.ak = 0;
        this.al = 0;
        float[] fArr = this.am;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.q = -1;
        this.r = -1;
        int[] iArr2 = this.E;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.t = 0;
        this.u = 0;
        this.y = 1.0f;
        this.B = 1.0f;
        this.x = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.A = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.w = 0;
        this.z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.k = true;
        int[] iArr3 = this.v;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.aj != null) {
            str = "id: " + this.aj + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.aa);
        sb.append(", ");
        sb.append(this.ab);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        sb.append(this.X);
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cpc) arrayList.get(i)).e();
        }
    }

    public final void v() {
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cpc cpcVar = (cpc) arrayList.get(i);
            cpcVar.c = false;
            cpcVar.b = 0;
        }
    }

    public final void w(int i) {
        this.ac = i;
        this.G = i > 0;
    }

    public final void x(int i, int i2) {
        if (this.a) {
            return;
        }
        this.K.f(i);
        this.M.f(i2);
        this.aa = i;
        this.W = i2 - i;
        this.a = true;
    }

    public final void y(int i, int i2) {
        if (this.n) {
            return;
        }
        this.L.f(i);
        this.N.f(i2);
        this.ab = i;
        this.X = i2 - i;
        if (this.G) {
            this.O.f(i + this.ac);
        }
        this.n = true;
    }

    public final void z(int i) {
        this.X = i;
        int i2 = this.ae;
        if (i < i2) {
            this.X = i2;
        }
    }
}
