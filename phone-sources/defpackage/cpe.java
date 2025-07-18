package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpe extends cpl {
    public int as;
    public int at;
    public int b;
    public final cvi aI = new cvi(this);
    public final cpp a = new cpp(this);
    public cqf aH = null;
    public boolean c = false;
    public final cov d = new cov();
    public int au = 0;
    public int av = 0;
    public cpb[] aw = new cpb[4];
    public cpb[] ax = new cpb[4];
    public int ay = 257;
    public boolean az = false;
    public boolean aA = false;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    public WeakReference aE = null;
    final HashSet aF = new HashSet();
    public final cpm aG = new cpm();

    public static void aa(cpd cpdVar, cqf cqfVar, cpm cpmVar) {
        int i;
        int i2;
        if (cqfVar == null) {
            return;
        }
        if (cpdVar.ai == 8 || (cpdVar instanceof cph) || (cpdVar instanceof cpa)) {
            cpmVar.c = 0;
            cpmVar.d = 0;
            return;
        }
        cpmVar.i = cpdVar.O();
        cpmVar.j = cpdVar.P();
        cpmVar.a = cpdVar.j();
        cpmVar.b = cpdVar.h();
        cpmVar.g = false;
        cpmVar.h = 0;
        boolean z = cpmVar.i == 3;
        boolean z2 = cpmVar.j == 3;
        boolean z3 = z && cpdVar.Y > 0.0f;
        boolean z4 = z2 && cpdVar.Y > 0.0f;
        if (z && cpdVar.H(0) && cpdVar.t == 0 && !z3) {
            cpmVar.i = 2;
            if (z2 && cpdVar.u == 0) {
                cpmVar.i = 1;
            }
            z = false;
        }
        if (z2 && cpdVar.H(1) && cpdVar.u == 0 && !z4) {
            cpmVar.j = 2;
            if (z && cpdVar.t == 0) {
                cpmVar.j = 1;
            }
            z2 = false;
        }
        if (cpdVar.e()) {
            cpmVar.i = 1;
            z = false;
        }
        if (cpdVar.f()) {
            cpmVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (cpdVar.v[0] == 4) {
                cpmVar.i = 1;
            } else if (!z2) {
                if (cpmVar.j == 1) {
                    i2 = cpmVar.b;
                } else {
                    cpmVar.i = 2;
                    cqfVar.a(cpdVar, cpmVar);
                    i2 = cpmVar.d;
                }
                cpmVar.i = 1;
                cpmVar.a = (int) (cpdVar.Y * i2);
            }
        }
        if (z4) {
            if (cpdVar.v[1] == 4) {
                cpmVar.j = 1;
            } else if (!z) {
                if (cpmVar.i == 1) {
                    i = cpmVar.a;
                } else {
                    cpmVar.j = 2;
                    cqfVar.a(cpdVar, cpmVar);
                    i = cpmVar.c;
                }
                cpmVar.j = 1;
                float f = i;
                if (cpdVar.Z == -1) {
                    cpmVar.b = (int) (f / cpdVar.Y);
                } else {
                    cpmVar.b = (int) (cpdVar.Y * f);
                }
            }
        }
        cqfVar.a(cpdVar, cpmVar);
        cpdVar.E(cpmVar.c);
        cpdVar.z(cpmVar.d);
        cpdVar.G = cpmVar.f;
        cpdVar.w(cpmVar.e);
        cpmVar.h = 0;
        boolean z5 = cpmVar.g;
    }

    private final void ac(cpc cpcVar, coy coyVar) {
        cov covVar = this.d;
        covVar.g(coyVar, covVar.b(cpcVar), 0, 5);
    }

    private final void ad(cpc cpcVar, coy coyVar) {
        cov covVar = this.d;
        covVar.g(covVar.b(cpcVar), coyVar, 0, 5);
    }

    private final void ae() {
        this.au = 0;
        this.av = 0;
    }

    @Override // defpackage.cpd
    public final void F(boolean z, boolean z2) {
        super.F(z, z2);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((cpd) this.aJ.get(i)).F(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05f0 A[PHI: r4
  0x05f0: PHI (r4v1 int) = (r4v0 int), (r4v43 int) binds: [B:139:0x0235, B:145:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0714 A[Catch: Exception -> 0x08dc, TryCatch #4 {Exception -> 0x08dc, blocks: (B:386:0x068b, B:395:0x06ae, B:397:0x06ba, B:398:0x06bd, B:400:0x06c1, B:402:0x06cb, B:425:0x06fa, B:405:0x06d4, B:424:0x06f7, B:426:0x0701, B:427:0x0706, B:429:0x070e, B:431:0x0714, B:432:0x071c, B:434:0x0722), top: B:612:0x068b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08ae A[Catch: Exception -> 0x08da, TryCatch #6 {Exception -> 0x08da, blocks: (B:522:0x089d, B:524:0x08a1, B:531:0x08ae, B:533:0x08c5, B:535:0x08c9, B:536:0x08cd), top: B:616:0x089d }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0942 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x094f A[LOOP:14: B:562:0x094d->B:563:0x094f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0774 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.cpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 2620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpe.W():void");
    }

    public final void X(int i) {
        this.ay = i;
        cov.a = Z(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpe.Y(boolean, int):boolean");
    }

    public final boolean Z(int i) {
        return (this.ay & i) == i;
    }

    final void a(cpd cpdVar, int i) {
        if (i == 0) {
            int i2 = this.au + 1;
            cpb[] cpbVarArr = this.ax;
            int length = cpbVarArr.length;
            if (i2 >= length) {
                this.ax = (cpb[]) Arrays.copyOf(cpbVarArr, length + length);
            }
            cpb[] cpbVarArr2 = this.ax;
            int i3 = this.au;
            cpbVarArr2[i3] = new cpb(cpdVar, 0, this.c);
            this.au = i3 + 1;
            return;
        }
        int i4 = this.av + 1;
        cpb[] cpbVarArr3 = this.aw;
        int length2 = cpbVarArr3.length;
        if (i4 >= length2) {
            this.aw = (cpb[]) Arrays.copyOf(cpbVarArr3, length2 + length2);
        }
        cpb[] cpbVarArr4 = this.aw;
        int i5 = this.av;
        cpbVarArr4[i5] = new cpb(cpdVar, 1, this.c);
        this.av = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.cpl, defpackage.cpd
    public final void t() {
        this.d.k();
        this.as = 0;
        this.at = 0;
        super.t();
    }
}
