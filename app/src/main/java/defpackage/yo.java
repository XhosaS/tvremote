package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yo extends yv {
    public int at;
    public int au;
    public int c;
    public final yy a = new yy(this);
    public final zb b = new zb(this);
    public zs aI = null;
    public boolean d = false;
    public final yc as = new yc();
    public int av = 0;
    public int aw = 0;
    yl[] ax = new yl[4];
    yl[] ay = new yl[4];
    public int az = 257;
    public boolean aA = false;
    public boolean aB = false;
    public WeakReference aC = null;
    public WeakReference aD = null;
    public WeakReference aE = null;
    public WeakReference aF = null;
    final HashSet aG = new HashSet();
    public final yx aH = new yx();

    public static void O(yn ynVar, zs zsVar, yx yxVar) {
        int i;
        int i2;
        if (zsVar == null) {
            return;
        }
        if (ynVar.ai == 8 || (ynVar instanceof yr) || (ynVar instanceof yj)) {
            yxVar.c = 0;
            yxVar.d = 0;
            return;
        }
        int[] iArr = ynVar.ar;
        yxVar.i = iArr[0];
        yxVar.j = iArr[1];
        yxVar.a = ynVar.h();
        yxVar.b = ynVar.g();
        yxVar.g = false;
        yxVar.h = 0;
        boolean z = yxVar.i == 3;
        boolean z2 = yxVar.j == 3;
        boolean z3 = z && ynVar.Y > 0.0f;
        boolean z4 = z2 && ynVar.Y > 0.0f;
        if (z && ynVar.F(0) && ynVar.t == 0 && !z3) {
            yxVar.i = 2;
            if (z2 && ynVar.u == 0) {
                yxVar.i = 1;
            }
            z = false;
        }
        if (z2 && ynVar.F(1) && ynVar.u == 0 && !z4) {
            yxVar.j = 2;
            if (z && ynVar.t == 0) {
                yxVar.j = 1;
            }
            z2 = false;
        }
        if (ynVar.e()) {
            yxVar.i = 1;
            z = false;
        }
        if (ynVar.f()) {
            yxVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (ynVar.v[0] == 4) {
                yxVar.i = 1;
            } else if (!z2) {
                if (yxVar.j == 1) {
                    i2 = yxVar.b;
                } else {
                    yxVar.i = 2;
                    zsVar.a(ynVar, yxVar);
                    i2 = yxVar.d;
                }
                yxVar.i = 1;
                yxVar.a = (int) (ynVar.Y * i2);
            }
        }
        if (z4) {
            if (ynVar.v[1] == 4) {
                yxVar.j = 1;
            } else if (!z) {
                if (yxVar.i == 1) {
                    i = yxVar.a;
                } else {
                    yxVar.j = 2;
                    zsVar.a(ynVar, yxVar);
                    i = yxVar.c;
                }
                yxVar.j = 1;
                float f = i;
                if (ynVar.Z == -1) {
                    yxVar.b = (int) (f / ynVar.Y);
                } else {
                    yxVar.b = (int) (ynVar.Y * f);
                }
            }
        }
        zsVar.a(ynVar, yxVar);
        ynVar.B(yxVar.c);
        ynVar.x(yxVar.d);
        ynVar.G = yxVar.f;
        ynVar.u(yxVar.e);
        yxVar.h = 0;
        boolean z5 = yxVar.g;
    }

    private final void Q(ym ymVar, yh yhVar) {
        yc ycVar = this.as;
        ycVar.h(yhVar, ycVar.c(ymVar), 0, 5);
    }

    private final void R(ym ymVar, yh yhVar) {
        yc ycVar = this.as;
        ycVar.h(ycVar.c(ymVar), yhVar, 0, 5);
    }

    private final void S() {
        this.av = 0;
        this.aw = 0;
    }

    @Override // defpackage.yn
    public final void C(boolean z, boolean z2) {
        super.C(z, z2);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((yn) this.aJ.get(i)).C(z, z2);
        }
    }

    public final void M(int i) {
        this.az = i;
        yc.a = N(512);
    }

    public final boolean N(int i) {
        return (this.az & i) == i;
    }

    final void a(yn ynVar, int i) {
        if (i == 0) {
            int i2 = this.av + 1;
            yl[] ylVarArr = this.ay;
            int length = ylVarArr.length;
            if (i2 >= length) {
                this.ay = (yl[]) Arrays.copyOf(ylVarArr, length + length);
            }
            yl[] ylVarArr2 = this.ay;
            int i3 = this.av;
            ylVarArr2[i3] = new yl(ynVar, 0, this.d);
            this.av = i3 + 1;
            return;
        }
        int i4 = this.aw + 1;
        yl[] ylVarArr3 = this.ax;
        int length2 = ylVarArr3.length;
        if (i4 >= length2) {
            this.ax = (yl[]) Arrays.copyOf(ylVarArr3, length2 + length2);
        }
        yl[] ylVarArr4 = this.ax;
        int i5 = this.aw;
        ylVarArr4[i5] = new yl(ynVar, 1, this.d);
        this.aw = i5 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05f1 A[PHI: r4
  0x05f1: PHI (r4v1 int) = (r4v0 int), (r4v44 int) binds: [B:137:0x0230, B:143:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x071d A[Catch: Exception -> 0x06a0, TRY_ENTER, TryCatch #0 {Exception -> 0x06a0, blocks: (B:386:0x068c, B:405:0x06cf, B:431:0x071d, B:432:0x0725, B:434:0x072b), top: B:605:0x068c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08ba A[Catch: Exception -> 0x08e8, TryCatch #4 {Exception -> 0x08e8, blocks: (B:522:0x08aa, B:524:0x08ae, B:531:0x08ba, B:533:0x08d1, B:535:0x08d5, B:536:0x08d9), top: B:613:0x08aa }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x095b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0968 A[LOOP:14: B:563:0x0966->B:564:0x0968, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0781 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v48, types: [yj] */
    /* JADX WARN: Type inference failed for: r5v49, types: [yj] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // defpackage.yv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 2650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo.c():void");
    }

    @Override // defpackage.yn
    public final void q(StringBuilder sb) {
        sb.append(String.valueOf(this.m).concat(":{\n"));
        sb.append("  actualWidth:" + this.W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        ArrayList arrayList = this.aJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((yn) arrayList.get(i)).q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // defpackage.yv, defpackage.yn
    public final void r() {
        this.as.k();
        this.at = 0;
        this.au = 0;
        super.r();
    }
}
