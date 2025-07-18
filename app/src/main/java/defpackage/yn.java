package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yn {
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
    public final ym K;
    public final ym L;
    public final ym M;
    public final ym N;
    public final ym O;
    final ym P;
    final ym Q;
    public final ym R;
    public final ym[] S;
    protected final ArrayList T;
    public final boolean[] U;
    public yn V;
    public int W;
    public int X;
    public float Y;
    public int Z;
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
    protected final yn[] an;
    protected final yn[] ao;
    public int ap;
    public int aq;
    public final int[] ar;
    private boolean b;
    public yz f;
    public yz g;
    public String m;
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
    public zi h = null;
    public zk i = null;
    public final boolean[] j = {true, true};
    private boolean a = true;
    public int k = -1;
    public int l = -1;

    public yn() {
        new HashMap();
        this.b = false;
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
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ym ymVar = new ym(this, 2);
        this.K = ymVar;
        ym ymVar2 = new ym(this, 3);
        this.L = ymVar2;
        ym ymVar3 = new ym(this, 4);
        this.M = ymVar3;
        ym ymVar4 = new ym(this, 5);
        this.N = ymVar4;
        ym ymVar5 = new ym(this, 6);
        this.O = ymVar5;
        ym ymVar6 = new ym(this, 8);
        this.P = ymVar6;
        ym ymVar7 = new ym(this, 9);
        this.Q = ymVar7;
        ym ymVar8 = new ym(this, 7);
        this.R = ymVar8;
        this.S = new ym[]{ymVar, ymVar3, ymVar2, ymVar4, ymVar5, ymVar8};
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
        this.an = new yn[]{null, null};
        this.ao = new yn[]{null, null};
        this.ap = -1;
        this.aq = -1;
        arrayList.add(ymVar);
        arrayList.add(ymVar2);
        arrayList.add(ymVar3);
        arrayList.add(ymVar4);
        arrayList.add(ymVar6);
        arrayList.add(ymVar7);
        arrayList.add(ymVar8);
        arrayList.add(ymVar5);
    }

    private final void M(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private final boolean N(int i) {
        ym ymVar;
        ym ymVar2;
        ym[] ymVarArr = this.S;
        int i2 = i + i;
        ym ymVar3 = ymVarArr[i2];
        ym ymVar4 = ymVar3.e;
        return (ymVar4 == null || ymVar4.e == ymVar3 || (ymVar2 = (ymVar = ymVarArr[i2 + 1]).e) == null || ymVar2.e != ymVar) ? false : true;
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
    private final void O(defpackage.yc r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.yh r34, defpackage.yh r35, int r36, boolean r37, defpackage.ym r38, defpackage.ym r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.O(yc, boolean, boolean, boolean, boolean, yh, yh, int, boolean, ym, ym, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private final void P(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        sb.append(str);
        sb.append(" :  {\n");
        String str2 = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "MATCH_PARENT" : "MATCH_CONSTRAINT" : "WRAP_CONTENT" : "FIXED";
        if (i6 == 0) {
            throw null;
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        M(sb, "      size", i, 0);
        M(sb, "      min", i2, 0);
        M(sb, "      max", i3, Integer.MAX_VALUE);
        M(sb, "      matchMin", i4, 0);
        M(sb, "      matchDef", i5, 0);
        c(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private final void a(StringBuilder sb, String str, ym ymVar) {
        if (ymVar.e == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(ymVar.e);
        sb.append("'");
        if (ymVar.g != Integer.MIN_VALUE || ymVar.f != 0) {
            sb.append(",");
            sb.append(ymVar.f);
            if (ymVar.g != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(ymVar.g);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private final void c(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public final void A(int i) {
        if (i < 0) {
            this.ad = 0;
        } else {
            this.ad = i;
        }
    }

    public final void B(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void C(boolean z, boolean z2) {
        int i;
        int i2;
        zi ziVar = this.h;
        boolean z3 = z & ziVar.h;
        zk zkVar = this.i;
        boolean z4 = z2 & zkVar.h;
        int i3 = ziVar.i.f;
        int i4 = zkVar.i.f;
        int i5 = ziVar.j.f;
        int i6 = zkVar.j.f;
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

    public void D(yc ycVar, boolean z) {
        int i;
        zk zkVar;
        zi ziVar;
        int iA = ycVar.a(this.K);
        int iA2 = ycVar.a(this.L);
        int iA3 = ycVar.a(this.M);
        int iA4 = ycVar.a(this.N);
        if (z && (ziVar = this.h) != null) {
            zc zcVar = ziVar.i;
            if (zcVar.i) {
                zc zcVar2 = ziVar.j;
                if (zcVar2.i) {
                    iA = zcVar.f;
                    iA3 = zcVar2.f;
                }
            }
        }
        if (z && (zkVar = this.i) != null) {
            zc zcVar3 = zkVar.i;
            if (zcVar3.i) {
                zc zcVar4 = zkVar.j;
                if (zcVar4.i) {
                    iA2 = zcVar3.f;
                    iA4 = zcVar4.f;
                }
            }
        }
        if (iA3 - iA < 0 || iA4 - iA2 < 0 || iA == Integer.MIN_VALUE || iA == Integer.MAX_VALUE || iA2 == Integer.MIN_VALUE || iA2 == Integer.MAX_VALUE || iA3 == Integer.MIN_VALUE || iA3 == Integer.MAX_VALUE || iA4 == Integer.MIN_VALUE || iA4 == Integer.MAX_VALUE) {
            iA4 = 0;
            iA = 0;
            iA2 = 0;
            iA3 = 0;
        }
        this.aa = iA;
        this.ab = iA2;
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int i2 = iA3 - iA;
        int[] iArr = this.ar;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.W;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = iA4 - iA2;
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
            this.k = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.l = i11;
        }
    }

    final boolean E() {
        return (this instanceof yu) || (this instanceof yr);
    }

    public final boolean F(int i) {
        if (i == 0) {
            return (this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0) < 2;
        }
        return ((this.L.e != null ? 1 : 0) + (this.N.e != null ? 1 : 0)) + (this.O.e != null ? 1 : 0) < 2;
    }

    public final boolean G(int i, int i2) {
        ym ymVar;
        ym ymVar2;
        ym ymVar3;
        ym ymVar4;
        if (i == 0) {
            ym ymVar5 = this.K;
            ym ymVar6 = ymVar5.e;
            return ymVar6 != null && ymVar6.c && (ymVar4 = (ymVar3 = this.M).e) != null && ymVar4.c && (ymVar4.a() - ymVar3.b()) - (ymVar5.e.a() + ymVar5.b()) >= i2;
        }
        ym ymVar7 = this.L;
        ym ymVar8 = ymVar7.e;
        if (ymVar8 != null && ymVar8.c && (ymVar2 = (ymVar = this.N).e) != null && ymVar2.c && (ymVar2.a() - ymVar.b()) - (ymVar7.e.a() + ymVar7.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        ym ymVar = this.K;
        ym ymVar2 = ymVar.e;
        if (ymVar2 != null && ymVar2.e == ymVar) {
            return true;
        }
        ym ymVar3 = this.M;
        ym ymVar4 = ymVar3.e;
        return ymVar4 != null && ymVar4.e == ymVar3;
    }

    public final boolean I() {
        ym ymVar = this.L;
        ym ymVar2 = ymVar.e;
        if (ymVar2 != null && ymVar2.e == ymVar) {
            return true;
        }
        ym ymVar3 = this.N;
        ym ymVar4 = ymVar3.e;
        return ymVar4 != null && ymVar4.e == ymVar3;
    }

    public final boolean J() {
        return this.a && this.ai != 8;
    }

    public ym K(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? this.R : this.O : this.N : this.M : this.L : this.K;
    }

    public final void L(int i, yn ynVar, int i2, int i3, int i4) {
        K(i).j(ynVar.K(i2), i3, i4);
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
    /* JADX WARN: Type inference failed for: r13v44, types: [yo] */
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
    public void b(defpackage.yc r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.b(yc, boolean):void");
    }

    public boolean d() {
        return this.ai != 8;
    }

    public boolean e() {
        if (this.b) {
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
        if (this.ai == 8) {
            return 0;
        }
        return this.X;
    }

    public final int h() {
        if (this.ai == 8) {
            return 0;
        }
        return this.W;
    }

    public final int i() {
        yn ynVar = this.V;
        return ynVar != null ? ((yo) ynVar).at + this.aa : this.aa;
    }

    public final int j() {
        yn ynVar = this.V;
        return ynVar != null ? ((yo) ynVar).au + this.ab : this.ab;
    }

    public final yn k(int i) {
        ym ymVar;
        ym ymVar2;
        if (i == 0) {
            ym ymVar3 = this.M;
            ymVar2 = ymVar3.e;
            if (ymVar2 == null || ymVar2.e != ymVar3) {
                return null;
            }
        } else if (i != 1 || (ymVar2 = (ymVar = this.N).e) == null || ymVar2.e != ymVar) {
            return null;
        }
        return ymVar2.d;
    }

    public final yn l(int i) {
        ym ymVar;
        ym ymVar2;
        if (i == 0) {
            ym ymVar3 = this.K;
            ymVar2 = ymVar3.e;
            if (ymVar2 == null || ymVar2.e != ymVar3) {
                return null;
            }
        } else if (i != 1 || (ymVar2 = (ymVar = this.L).e) == null || ymVar2.e != ymVar) {
            return null;
        }
        return ymVar2.d;
    }

    public final zn m(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void n(yo yoVar, yc ycVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            yt.a(yoVar, ycVar, this);
            hashSet.remove(this);
            b(ycVar, yoVar.N(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ym) it.next()).d.n(yoVar, ycVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ym) it2.next()).d.n(yoVar, ycVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ym) it3.next()).d.n(yoVar, ycVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ym) it4.next()).d.n(yoVar, ycVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ym) it5.next()).d.n(yoVar, ycVar, hashSet, 1, true);
            }
        }
    }

    public final void o(yc ycVar) {
        ycVar.c(this.K);
        ycVar.c(this.L);
        ycVar.c(this.M);
        ycVar.c(this.N);
        if (this.ac > 0) {
            ycVar.c(this.O);
        }
    }

    public final void p() {
        if (this.h == null) {
            this.h = new zi(this);
        }
        if (this.i == null) {
            this.i = new zk(this);
        }
    }

    public void q(StringBuilder sb) {
        sb.append("  " + this.m + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.aa);
        sb.append("\n");
        sb.append("    actualTop:" + this.ab);
        sb.append("\n");
        a(sb, "left", this.K);
        a(sb, "top", this.L);
        a(sb, "right", this.M);
        a(sb, "bottom", this.N);
        a(sb, "baseline", this.O);
        a(sb, "centerX", this.P);
        a(sb, "centerY", this.Q);
        int[] iArr = this.E;
        int i = this.W;
        int i2 = this.ad;
        int i3 = iArr[0];
        int i4 = this.w;
        int i5 = this.t;
        float f = this.y;
        int[] iArr2 = this.ar;
        int i6 = iArr2[0];
        float[] fArr = this.am;
        float f2 = fArr[0];
        P(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.X;
        int i8 = this.ae;
        int i9 = iArr[1];
        int i10 = this.z;
        int i11 = this.u;
        float f3 = this.B;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        P(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.Y;
        int i13 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("],\n");
        }
        c(sb, "    horizontalBias", this.af, 0.5f);
        c(sb, "    verticalBias", this.ag, 0.5f);
        M(sb, "    horizontalChainStyle", this.ak, 0);
        M(sb, "    verticalChainStyle", this.al, 0);
        sb.append("  }");
    }

    public void r() {
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.R.d();
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
        this.x = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
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
        this.a = true;
        int[] iArr3 = this.v;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.k = -1;
        this.l = -1;
    }

    public final void s() {
        this.b = false;
        this.n = false;
        this.o = false;
        this.p = false;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ym ymVar = (ym) arrayList.get(i);
            ymVar.c = false;
            ymVar.b = 0;
        }
    }

    public void t(yb ybVar) {
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.O.i();
        this.R.i();
        this.P.i();
        this.Q.i();
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

    public final void u(int i) {
        this.ac = i;
        this.G = i > 0;
    }

    public final void v(int i, int i2) {
        if (this.b) {
            return;
        }
        this.K.e(i);
        this.M.e(i2);
        this.aa = i;
        this.W = i2 - i;
        this.b = true;
    }

    public final void w(int i, int i2) {
        if (this.n) {
            return;
        }
        this.L.e(i);
        this.N.e(i2);
        this.ab = i;
        this.X = i2 - i;
        if (this.G) {
            this.O.e(i + this.ac);
        }
        this.n = true;
    }

    public final void x(int i) {
        this.X = i;
        int i2 = this.ae;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void y(int i, int i2) {
        this.I = i;
        this.J = i2;
        this.a = false;
    }

    public final void z(int i) {
        if (i < 0) {
            this.ae = 0;
        } else {
            this.ae = i;
        }
    }
}
