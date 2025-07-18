package defpackage;

import android.content.Context;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvs implements Cloneable {
    protected boolean A;
    protected boolean B;
    protected eny E;
    public dwn F;
    public dtm G;
    public boolean[] H;
    protected long I;
    protected int J;
    protected int K;
    protected int L;
    protected int M;
    protected dwa N;
    protected int O;
    private boolean R;
    private boolean S;
    protected final Context a;
    protected dww f;
    protected dtu g;
    protected dtu h;
    protected dtu i;
    protected dtu j;
    protected dtu k;
    protected dtu l;
    protected Drawable m;
    protected Drawable n;
    protected PathEffect o;
    public dtm p;
    protected String q;
    protected String r;
    protected dyq s;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    protected String w;
    public List y;
    protected boolean z;
    private List P = new ArrayList(4);
    public final List b = new ArrayList(2);
    protected final int[] c = new int[4];
    protected final int[] d = new int[4];
    protected final float[] e = new float[4];
    protected int C = -1;
    protected int D = 0;
    private boolean Q = false;
    public Set x = new HashSet();

    protected dvs(dru druVar) {
        this.a = druVar.a;
    }

    protected static void C(dzu dzuVar, Drawable drawable) {
        Rect rect = new Rect();
        drawable.getPadding(rect);
        if (rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) {
            rect = null;
        }
        if (rect != null) {
            dzuVar.z(1, rect.left);
            dzuVar.z(2, rect.top);
            dzuVar.z(3, rect.right);
            dzuVar.z(4, rect.bottom);
        }
    }

    private static dtu S(dtu dtuVar, dtu dtuVar2) {
        if (dtuVar == null) {
            return dtuVar2;
        }
        if (dtuVar2 == null) {
            return dtuVar;
        }
        if (!(dtuVar instanceof dtc)) {
            return new dtc(dtuVar, dtuVar2);
        }
        dtc dtcVar = (dtc) dtuVar;
        dtcVar.a.add(dtuVar2);
        return dtcVar;
    }

    public static dvs i(dve dveVar, dru druVar, dvs dvsVar, drq drqVar, dxo dxoVar, String str, Set set) {
        dru druVar2 = dxoVar.b;
        if (!(dvsVar instanceof dwn)) {
            List list = dvsVar.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!set.contains(((dxo) list.get(i)).b.i())) {
                }
            }
            String strP = dvsVar.p();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(strP)) {
                    boolean z = ebc.a;
                    dvs dvsVarClone = dvsVar.clone();
                    dvsVarClone.P = new ArrayList(dvsVar.a());
                    dvsVarClone.x = null;
                    w(dveVar, dvsVar);
                    dru druVarE = dvsVarClone.e();
                    int iA = dvsVar.a();
                    int i2 = 0;
                    while (i2 < iA) {
                        dvs dvsVarH = dvsVar.h(i2);
                        int iMax = Math.max(0, dvsVarH.b() - 1);
                        dve dveVar2 = dveVar;
                        dvsVarClone.u(i(dveVar2, druVarE, dvsVarH, dvsVarH.k(iMax).a, (dxo) dvsVarH.b.get(iMax), dvsVarH.k(iMax).b.i(), set));
                        i2++;
                        dveVar = dveVar2;
                    }
                    return dvsVarClone;
                }
            }
            x(dveVar, dvsVar);
            return dvsVar;
        }
        return duy.c(dveVar, druVar, drqVar, true, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Type inference failed for: r3v7, types: [duv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [duv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eoe o(defpackage.dvt r10, defpackage.dvs r11, defpackage.eoe r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvs.o(dvt, dvs, eoe):eoe");
    }

    static void w(dve dveVar, dvs dvsVar) {
        for (dxo dxoVar : dvsVar.b) {
            dxy dxyVar = dveVar.c;
            dxyVar.getClass();
            drq drqVar = dxoVar.a;
            if (!drqVar.f()) {
                dxyVar.o(dxoVar.b.i());
            } else if (drqVar.U()) {
                dxyVar.g(dxoVar.b.i(), dxoVar.c);
            }
        }
    }

    static void x(dve dveVar, dvs dvsVar) {
        int iA = dvsVar.a();
        w(dveVar, dvsVar);
        for (int i = 0; i < iA; i++) {
            x(dveVar, dvsVar.h(i));
        }
    }

    public static void z(dvs dvsVar, dvs dvsVar2) {
        if (dvsVar.R) {
            return;
        }
        if (dvsVar2 == null) {
            dvsVar.R = true;
        } else {
            if (dvsVar2.D == 8) {
                dvsVar.L(4);
            }
            dww dwwVar = dvsVar2.f;
            if (dwwVar != null && dwwVar.E == 2) {
                dvsVar.j().o(false);
            }
            dvsVar.R = true;
        }
        for (int i = 0; i < dvsVar.a(); i++) {
            z(dvsVar.h(i), dvsVar);
        }
    }

    public final void A(dtu dtuVar) {
        this.I |= 4194304;
        this.j = S(this.j, dtuVar);
    }

    public final void B(drl drlVar) {
        drlVar.b("DefaultInternalNode 0x%08X", Integer.valueOf(System.identityHashCode(this)));
        drlVar.a();
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((dvs) it.next()).B(drlVar);
        }
        for (int i = 0; i < a(); i++) {
            dvs dvsVarH = h(i);
            if (dvsVarH == null) {
                drlVar.c("NULL CHILD");
            } else {
                dvsVarH.B(drlVar);
            }
        }
        drlVar.d();
    }

    public final void D(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.I |= 134217728;
        this.q = str;
        this.r = str2;
    }

    public final void E(dyq dyqVar) {
        this.I |= 4294967296L;
        this.s = dyqVar;
    }

    public final void F(dtu dtuVar) {
        this.I |= 16777216;
        this.i = S(this.i, dtuVar);
    }

    public final void G(dtu dtuVar) {
        this.I |= 2147483648L;
        this.l = S(this.l, dtuVar);
    }

    public final void H(dtu dtuVar) {
        this.I |= 1048576;
        this.g = S(this.g, dtuVar);
    }

    public final boolean I() {
        return !TextUtils.isEmpty(this.q);
    }

    public final boolean J() {
        eny enyVar = this.E;
        return enyVar == null || enyVar == eny.INHERIT;
    }

    public final void K() {
        this.I |= 8589934592L;
    }

    public final void L(int i) {
        this.I |= 128;
        this.D = i;
    }

    public final void M(dtu dtuVar) {
        this.I |= 8388608;
        this.k = S(this.k, dtuVar);
    }

    public final void N() {
        this.I |= 536870912;
        this.B = true;
    }

    public final void O() {
        this.I |= 1073741824;
        this.B = true;
    }

    public void P(int[] iArr, int[] iArr2, float[] fArr) {
        this.I |= 268435456;
        System.arraycopy(iArr, 0, this.c, 0, 4);
        System.arraycopy(iArr2, 0, this.d, 0, 4);
        System.arraycopy(fArr, 0, this.e, 0, 4);
        this.o = null;
    }

    public final void Q() {
        this.I |= 256;
        this.A = false;
    }

    public final void R() {
        this.I |= 524288;
        this.n = null;
    }

    public final int a() {
        return this.P.size();
    }

    public final int b() {
        return this.b.size();
    }

    public final drq c() {
        return ((dxo) this.b.get(r0.size() - 1)).a;
    }

    public final drq d() {
        return ((dxo) this.b.get(0)).a;
    }

    public final dru e() {
        return ((dxo) this.b.get(0)).b;
    }

    public dvk f(dve dveVar, eoe eoeVar, dvk dvkVar) {
        return new dvk(dveVar, e(), this, eoeVar, dvkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final dvs clone() {
        try {
            dvs dvsVar = (dvs) super.clone();
            dvsVar.Q = true;
            return dvsVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final dvs h(int i) {
        return (dvs) this.P.get(i);
    }

    public final dww j() {
        dww dwwVar;
        if (this.S) {
            if (this.f == null) {
                dwwVar = new dww();
            }
            return this.f;
        }
        this.S = true;
        dwwVar = new dww();
        dww dwwVar2 = this.f;
        if (dwwVar2 != null) {
            dwwVar2.c(dwwVar);
        }
        this.f = dwwVar;
        return this.f;
    }

    public final dxo k(int i) {
        return (dxo) this.b.get(i);
    }

    public final dxo l() {
        return (dxo) this.b.get(0);
    }

    protected dzu m(eoe eoeVar) {
        return new dzu(eoeVar);
    }

    public dzu n(eoe eoeVar) {
        int i;
        dzu dzuVarM = m(eoeVar);
        eny enyVar = this.E;
        if (enyVar != null) {
            eoeVar.g(enyVar);
        }
        int i2 = this.O;
        if (i2 != 0) {
            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(((YogaNodeJNIBase) eoeVar).c, i2 - 1);
        }
        int i3 = this.J;
        if (i3 != 0) {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(((YogaNodeJNIBase) eoeVar).c, i3 - 1);
        }
        int i4 = this.K;
        if (i4 != 0) {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(((YogaNodeJNIBase) eoeVar).c, i4 - 1);
        }
        int i5 = this.L;
        if (i5 != 0) {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(((YogaNodeJNIBase) eoeVar).c, i5 - 1);
        }
        int i6 = this.M;
        if (i6 != 0) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(((YogaNodeJNIBase) eoeVar).c, i6 - 1);
        }
        dwa dwaVar = this.N;
        if (dwaVar != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) eoeVar;
            yogaNodeJNIBase.e = dwaVar;
            YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.c, true);
        }
        Iterator it = this.b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            drq drqVar = ((dxo) it.next()).a;
            if (this.F == null || !drq.aa(drqVar)) {
                drk drkVar = drqVar.o;
                if (drkVar != null) {
                    Drawable drawable = drkVar.e;
                    if (drawable != null) {
                        C(dzuVarM, drawable);
                    }
                    dri driVar = drkVar.d;
                    if (driVar != null) {
                        if ((driVar.a & 1) != 0) {
                            dzuVarM.s(driVar.b);
                        }
                        if ((driVar.a & 2) != 0) {
                            dzuVarM.r(driVar.c);
                        }
                        if ((4 & driVar.a) != 0) {
                            dzuVarM.q(driVar.d);
                        }
                        if ((driVar.a & 8) != 0) {
                            dzuVarM.p(driVar.e);
                        }
                        if ((driVar.a & 16) != 0) {
                            dzuVarM.m(driVar.f);
                        }
                        if ((driVar.a & 32) != 0) {
                            dzuVarM.l(driVar.g);
                        }
                        if ((driVar.a & 64) != 0) {
                            dzuVarM.h(driVar.h);
                        }
                        if ((driVar.a & 128) != 0) {
                            dzuVarM.g(driVar.i);
                        }
                        if ((driVar.a & 256) != 0) {
                            dzuVarM.o(driVar.j);
                        }
                        if ((driVar.a & 512) != 0) {
                            dzuVarM.n(driVar.k);
                        }
                        if ((driVar.a & 1024) != 0) {
                            dzuVarM.k(driVar.l);
                        }
                        if ((driVar.a & 2048) != 0) {
                            dzuVarM.j(driVar.m);
                        }
                        if ((driVar.a & 4096) != 0) {
                            dzuVarM.i(driVar.s);
                        }
                        if ((driVar.a & 8192) != 0) {
                            dzuVarM.t(driVar.C);
                        }
                        if ((driVar.a & 16384) != 0) {
                            dzuVarM.C();
                        }
                        if ((driVar.a & 32768) != 0) {
                            dzuVarM.e(driVar.n);
                        }
                        if ((driVar.a & 65536) != 0) {
                            dzuVarM.f(driVar.o);
                        }
                        if ((driVar.a & 131072) != 0) {
                            dzuVarM.d(driVar.p);
                        }
                        if ((driVar.a & 262144) != 0) {
                            dzuVarM.c(driVar.q);
                        }
                        if ((driVar.a & 524288) != 0) {
                            dzuVarM.b(driVar.r);
                        }
                        if ((driVar.a & 1048576) != 0) {
                            dzuVarM.u(driVar.D);
                        }
                        if ((driVar.a & 2097152) != 0) {
                            for (int i7 = 0; i7 < 9; i7++) {
                                float fC = driVar.t.c(i7);
                                if (!enx.a(fC)) {
                                    dzuVarM.B(enz.b(i7), (int) fC);
                                }
                            }
                        }
                        if ((driVar.a & 4194304) != 0) {
                            for (int i8 = 0; i8 < 9; i8++) {
                                float fC2 = driVar.y.c(i8);
                                if (!enx.a(fC2)) {
                                    dzuVarM.A(enz.b(i8), fC2);
                                }
                            }
                        }
                        if ((driVar.a & 8388608) != 0) {
                            for (int i9 = 0; i9 < 9; i9++) {
                                float fC3 = driVar.w.c(i9);
                                if (!enx.a(fC3)) {
                                    dzuVarM.z(enz.b(i9), (int) fC3);
                                }
                            }
                        }
                        if ((driVar.a & 16777216) != 0) {
                            for (int i10 = 0; i10 < 9; i10++) {
                                float fC4 = driVar.x.c(i10);
                                if (!enx.a(fC4)) {
                                    dzuVarM.y(enz.b(i10), fC4);
                                }
                            }
                        }
                        if ((driVar.a & 33554432) != 0) {
                            for (int i11 = 0; i11 < 9; i11++) {
                                float fC5 = driVar.u.c(i11);
                                if (!enx.a(fC5)) {
                                    dzuVarM.x(enz.b(i11), (int) fC5);
                                }
                            }
                        }
                        if ((driVar.a & 67108864) != 0) {
                            while (i < 9) {
                                float fC6 = driVar.v.c(i);
                                if (!enx.a(fC6)) {
                                    dzuVarM.w(enz.b(i), fC6);
                                }
                                i++;
                            }
                        }
                        if (!enx.a(driVar.z)) {
                            dzuVarM.v(1, driVar.z);
                        }
                        if (!enx.a(driVar.A)) {
                            dzuVarM.v(2, driVar.A);
                        }
                        if (!enx.a(driVar.B)) {
                            dzuVarM.v(3, driVar.B);
                        }
                    }
                }
            } else {
                dwn dwnVar = this.F;
                dww dwwVar = dwnVar.f;
                if (dwwVar != null) {
                    s(dwwVar);
                }
                if ((this.I & 128) == 0 || this.D == 0) {
                    L(dwnVar.D);
                }
                if ((dwnVar.I & 256) != 0) {
                    boolean z = dwnVar.A;
                    Q();
                }
                if ((dwnVar.I & 8589934592L) != 0) {
                    K();
                }
                if ((dwnVar.I & 262144) != 0) {
                    t(dwnVar.m);
                }
                if ((dwnVar.I & 524288) != 0) {
                    Drawable drawable2 = dwnVar.n;
                    R();
                }
                if (dwnVar.B) {
                    this.B = true;
                }
                if ((dwnVar.I & 1048576) != 0) {
                    H(dwnVar.g);
                }
                if ((dwnVar.I & 2097152) != 0) {
                    y(dwnVar.h);
                }
                if ((dwnVar.I & 4194304) != 0) {
                    A(dwnVar.j);
                }
                if ((dwnVar.I & 8388608) != 0) {
                    M(dwnVar.k);
                }
                if ((dwnVar.I & 16777216) != 0) {
                    F(dwnVar.i);
                }
                if ((dwnVar.I & 2147483648L) != 0) {
                    G(dwnVar.l);
                }
                String str = dwnVar.w;
                if (str != null) {
                    this.w = str;
                }
                int[] iArr = dwnVar.P;
                if (iArr != null) {
                    int[] iArr2 = dwnVar.d;
                    float[] fArr = dwnVar.e;
                    PathEffect pathEffect = dwnVar.o;
                    P(iArr, iArr2, fArr);
                }
                if ((dwnVar.I & 134217728) != 0) {
                    D(dwnVar.q, dwnVar.r);
                }
                if ((dwnVar.I & 4294967296L) != 0) {
                    E(dwnVar.s);
                }
                if ((dwnVar.I & 536870912) != 0) {
                    N();
                }
                if ((dwnVar.I & 1073741824) != 0) {
                    O();
                }
                if (dwnVar.C != -1) {
                    this.C = 0;
                }
                dtm dtmVar = dwnVar.Q;
                boolean[] zArr = dwnVar.R;
                this.G = dtmVar;
                this.H = zArr;
                Drawable drawable3 = this.m;
                if (drawable3 != null) {
                    C(dzuVarM, drawable3);
                }
            }
        }
        if ((this.I & 268435456) != 0) {
            int i12 = 0;
            while (i12 < 4) {
                dzuVarM.a(i12 != 0 ? i12 != 1 ? i12 != 2 ? 4 : 3 : 2 : 1, this.c[i12]);
                i12++;
            }
        }
        if (this.G != null) {
            while (i < 9) {
                float fC7 = this.G.c(i);
                if (!enx.a(fC7)) {
                    int iB = enz.b(i);
                    boolean[] zArr2 = this.H;
                    if (zArr2 == null || !zArr2[iB - 1]) {
                        dzuVarM.z(iB, (int) fC7);
                    } else {
                        dzuVarM.y(iB, fC7);
                    }
                }
                i++;
            }
        }
        this.z = dzuVarM.e;
        return dzuVarM;
    }

    public final String p() {
        return ((dxo) this.b.get(r0.size() - 1)).b.i();
    }

    public final String q() {
        return ((dxo) this.b.get(0)).b.i();
    }

    public final void r(drq drqVar) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(drqVar);
    }

    public final void s(dww dwwVar) {
        if (this.S || this.f != null) {
            dwwVar.c(j());
        } else {
            this.f = dwwVar;
        }
    }

    public final void t(Drawable drawable) {
        this.I |= 262144;
        this.m = drawable;
    }

    public final void u(dvs dvsVar) {
        if (dvsVar != null) {
            this.P.add(this.P.size(), dvsVar);
        }
    }

    public final void v(dve dveVar, dru druVar, drq drqVar) {
        if (drqVar != null) {
            u(duy.c(dveVar, druVar, drqVar, false, null));
        }
    }

    public final void y(dtu dtuVar) {
        this.I |= 2097152;
        this.h = S(this.h, dtuVar);
    }
}
