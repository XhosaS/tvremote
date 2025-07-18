package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnp implements lnn {
    public int a;
    public boolean b;
    public int c;
    public int d = 0;
    private final lie e;
    private final lny f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private int l;
    private int m;
    private Throwable n;
    private int o;

    public lnp(lie lieVar, lny lnyVar) {
        this.e = lieVar;
        this.f = lnyVar;
    }

    @Override // defpackage.lnn
    public final void a(int i, lih lihVar) {
        this.e.c(i, lihVar);
    }

    @Override // defpackage.lnn
    public final void b(int i, lih lihVar) {
        this.e.d(i, lihVar);
    }

    @Override // defpackage.lnn
    public final void c(int i, int i2, int i3, String str, int i4) {
        this.e.Q(i, i2, i3);
    }

    @Override // defpackage.lnn
    public final void d(int i, int i2, kzo kzoVar, boolean z) {
        String str;
        String str2;
        String strL;
        if (kzoVar != null) {
            str = kzoVar.c;
            int iBm = a.bm(kzoVar.f);
            if (iBm == 0) {
                iBm = 1;
            }
            str2 = true != kzoVar.e ? "" : "5.1";
            strL = kaf.l(iBm);
        } else {
            str = null;
            str2 = null;
            strL = null;
        }
        this.e.L(i, i2, this.g, this.h, this.i, this.j, this.k, ieg.a(str), ieg.a(strL), ieg.a(str2), z);
    }

    @Override // defpackage.lnn
    public final void e(int i, int i2) {
        this.e.M(i, i2);
    }

    @Override // defpackage.lnn
    public final void f(int i, int i2) {
        this.e.P(i, this.g, this.h, this.i, this.j, this.k, i2, this.l, this.m, this.n, new jbj(this, 20));
    }

    @Override // defpackage.lnn
    public final void g(int i, int i2, int i3, int i4) {
        this.e.Q(i, i2, i4);
    }

    @Override // defpackage.lnn
    public final void h(int i, int i2, int i3) {
        this.e.R(i, i2, i3);
    }

    @Override // defpackage.lnn
    public final void i(int i, int i2, int i3, boolean z) {
        this.e.S(i, i2, i3, z);
    }

    @Override // defpackage.lnn
    public final void k(int i, int i2, boolean z, int i3) {
        this.e.V(i, i2, z, i3);
    }

    @Override // defpackage.lnn
    public final void l(int i, kwx kwxVar) {
        this.e.W(i, kwxVar == null ? ieg.a : ieg.a(kwxVar.languageCode()));
    }

    @Override // defpackage.lnn
    public final void m(int i, kwx kwxVar, Throwable th) {
        this.e.X(i, kwxVar == null ? ieg.a : ieg.a(kwxVar.languageCode()));
    }

    @Override // defpackage.lnn
    public final void n(int i, kwx kwxVar) {
        this.e.Y(i, kwxVar == null ? ieg.a : ieg.a(kwxVar.languageCode()));
    }

    @Override // defpackage.lnn
    public final void o(int i, int i2, boolean z, int i3) {
        if (!z) {
            this.e.T(i, i3, i2, this.o);
        } else {
            this.o = i2;
            this.e.U(i, i3, i2);
        }
    }

    @Override // defpackage.lnn
    public final void p(int i) {
        this.d = i;
    }

    @Override // defpackage.lnn
    public final void q(int i, lne lneVar) {
        vtw vtwVarM = wiy.a.m();
        int i2 = lneVar.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wiy wiyVar = (wiy) vucVar;
        wiyVar.b |= 1;
        wiyVar.c = i2;
        int i3 = lneVar.h;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wiy wiyVar2 = (wiy) vucVar2;
        wiyVar2.b |= 2;
        wiyVar2.d = i3;
        int i4 = lneVar.i;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        wiy wiyVar3 = (wiy) vucVar3;
        wiyVar3.b |= 131072;
        wiyVar3.v = i4;
        int i5 = lneVar.j;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        vuc vucVar4 = vtwVarM.b;
        wiy wiyVar4 = (wiy) vucVar4;
        wiyVar4.b |= 262144;
        wiyVar4.w = i5;
        int i6 = lneVar.m;
        if (!vucVar4.A()) {
            vtwVarM.u();
        }
        vuc vucVar5 = vtwVarM.b;
        wiy wiyVar5 = (wiy) vucVar5;
        wiyVar5.b |= 16384;
        wiyVar5.s = i6;
        int i7 = lneVar.n;
        if (!vucVar5.A()) {
            vtwVarM.u();
        }
        vuc vucVar6 = vtwVarM.b;
        wiy wiyVar6 = (wiy) vucVar6;
        wiyVar6.b |= 64;
        wiyVar6.i = i7;
        int i8 = lneVar.k;
        if (!vucVar6.A()) {
            vtwVarM.u();
        }
        vuc vucVar7 = vtwVarM.b;
        wiy wiyVar7 = (wiy) vucVar7;
        wiyVar7.b |= 16;
        wiyVar7.g = i8;
        int i9 = lneVar.l;
        if (!vucVar7.A()) {
            vtwVarM.u();
        }
        vuc vucVar8 = vtwVarM.b;
        wiy wiyVar8 = (wiy) vucVar8;
        wiyVar8.b |= 32;
        wiyVar8.h = i9;
        int i10 = lneVar.d;
        if (!vucVar8.A()) {
            vtwVarM.u();
        }
        vuc vucVar9 = vtwVarM.b;
        wiy wiyVar9 = (wiy) vucVar9;
        wiyVar9.b |= 4;
        wiyVar9.e = i10;
        int i11 = lneVar.e;
        if (!vucVar9.A()) {
            vtwVarM.u();
        }
        wiy wiyVar10 = (wiy) vtwVarM.b;
        wiyVar10.b |= 8;
        wiyVar10.f = i11;
        ArrayList arrayList = new ArrayList(lneVar.b);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wiy wiyVar11 = (wiy) vtwVarM.b;
        vuj vujVar = wiyVar11.j;
        if (!vujVar.c()) {
            wiyVar11.j = vuc.q(vujVar);
        }
        vsf.h(arrayList, wiyVar11.j);
        HashSet hashSet = lneVar.a;
        int size = hashSet.size();
        int[] iArr = new int[size];
        Iterator it = hashSet.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = ((Integer) it.next()).intValue();
            i12++;
        }
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            vtw vtwVarM2 = ucg.a.m();
            int iL = kff.l(i14);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucg ucgVar = (ucg) vtwVarM2.b;
            ucgVar.c = iL - 1;
            ucgVar.b |= 1;
            ucg ucgVar2 = (ucg) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wiy wiyVar12 = (wiy) vtwVarM.b;
            ucgVar2.getClass();
            vun vunVar = wiyVar12.r;
            if (!vunVar.c()) {
                wiyVar12.r = vuc.s(vunVar);
            }
            wiyVar12.r.add(ucgVar2);
        }
        int i15 = lneVar.f;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar10 = vtwVarM.b;
        wiy wiyVar13 = (wiy) vucVar10;
        wiyVar13.b |= 128;
        wiyVar13.k = i15;
        int i16 = lneVar.g;
        if (!vucVar10.A()) {
            vtwVarM.u();
        }
        vuc vucVar11 = vtwVarM.b;
        wiy wiyVar14 = (wiy) vucVar11;
        wiyVar14.b |= 256;
        wiyVar14.l = i16;
        int i17 = lneVar.o;
        if (!vucVar11.A()) {
            vtwVarM.u();
        }
        vuc vucVar12 = vtwVarM.b;
        wiy wiyVar15 = (wiy) vucVar12;
        wiyVar15.b |= 512;
        wiyVar15.m = i17;
        int i18 = lneVar.p;
        if (!vucVar12.A()) {
            vtwVarM.u();
        }
        vuc vucVar13 = vtwVarM.b;
        wiy wiyVar16 = (wiy) vucVar13;
        wiyVar16.b |= 1024;
        wiyVar16.n = i18;
        int i19 = lneVar.q;
        if (!vucVar13.A()) {
            vtwVarM.u();
        }
        vuc vucVar14 = vtwVarM.b;
        wiy wiyVar17 = (wiy) vucVar14;
        wiyVar17.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wiyVar17.o = i19;
        int i20 = lneVar.r;
        if (!vucVar14.A()) {
            vtwVarM.u();
        }
        vuc vucVar15 = vtwVarM.b;
        wiy wiyVar18 = (wiy) vucVar15;
        wiyVar18.b |= 65536;
        wiyVar18.u = i20;
        int i21 = lneVar.s;
        if (!vucVar15.A()) {
            vtwVarM.u();
        }
        vuc vucVar16 = vtwVarM.b;
        wiy wiyVar19 = (wiy) vucVar16;
        wiyVar19.b |= 32768;
        wiyVar19.t = i21;
        long j = lneVar.t;
        if (j > 0) {
            long j2 = lneVar.u / j;
            if (!vucVar16.A()) {
                vtwVarM.u();
            }
            vuc vucVar17 = vtwVarM.b;
            wiy wiyVar20 = (wiy) vucVar17;
            wiyVar20.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            wiyVar20.p = (int) j2;
            int i22 = (int) (lneVar.v / lneVar.t);
            if (!vucVar17.A()) {
                vtwVarM.u();
            }
            wiy wiyVar21 = (wiy) vtwVarM.b;
            wiyVar21.b |= 8192;
            wiyVar21.q = i22;
        }
        lie lieVar = this.e;
        lieVar.N(i, this.g, this.h, this.i, this.j, this.k, (wiy) vtwVarM.r(), new lnt(this, 1));
        lieVar.b(mep.a);
    }

    @Override // defpackage.lnn
    public final void s(int i, int i2, int i3, int i4, Throwable th) {
        this.l = i3;
        this.m = i4;
        this.n = th;
        this.e.O(i, this.g, this.h, this.i, this.j, this.k, i2, i3, i4, th, new jbj(this, 19));
    }

    @Override // defpackage.lnn
    public final void w(String str, String str2, String str3, String str4, String str5, boolean z, final boolean z2, final int i, boolean z3, TokenData tokenData, boolean z4) {
        this.a = 5;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.k = z;
        this.b = z2;
        this.c = i;
        this.l = -1;
        this.m = 0;
        this.n = null;
        String strA = z4 ? "" : this.f.a();
        this.j = strA;
        this.e.ax(str2, str3, str4, str5, strA, z, tokenData, new idy() { // from class: lno
            @Override // defpackage.idy
            public final void c(Object obj) {
                vtw vtwVar = (vtw) obj;
                wja wjaVar = ((wjm) vtwVar.b).d;
                if (wjaVar == null) {
                    wjaVar = wja.a;
                }
                int i2 = i;
                boolean z5 = z2;
                vtw vtwVar2 = (vtw) wjaVar.a(5, null);
                vtwVar2.x(wjaVar);
                wja wjaVarI = lnu.i(vtwVar2, 5, z5, i2, 0);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wjm wjmVar = (wjm) vtwVar.b;
                wjaVarI.getClass();
                wjmVar.d = wjaVarI;
                wjmVar.b |= 2;
            }
        });
    }

    @Override // defpackage.lnn
    public final void v() {
    }

    @Override // defpackage.lnn
    public final void j(boolean z) {
    }

    @Override // defpackage.lnn
    public final void r(long j) {
    }

    @Override // defpackage.lnn
    public final void t(long j) {
    }

    @Override // defpackage.lnn
    public final void u(boolean z) {
    }
}
