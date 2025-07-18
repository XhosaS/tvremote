package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbh implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final /* synthetic */ int g;
    private final Object h;

    public jbh(jwq jwqVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i) {
        this.g = i;
        this.h = jwqVar;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.e = xcqVar3;
        this.b = xcqVar4;
        this.f = xcqVar5;
        this.c = xcqVar6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.g) {
            case 0:
                return new jbg((ldv) this.h.b(), (ino) this.a.b(), (kw) this.b.b(), (mdw) this.c.b(), (lfz) this.d.b(), ((kqw) this.e).b(), (yow) this.f.b());
            case 1:
                lfn lfnVar = (lfn) this.b.b();
                iea ieaVarB = ((kqg) this.h).b();
                vvd vvdVar = (vvd) this.d.b();
                imu imuVarB = ((imv) this.a).b();
                final imx imxVarB = ((imy) this.e).b();
                xlp xlpVarB = ((xlq) this.c).b();
                lfnVar.getClass();
                vvdVar.getClass();
                final xcq xcqVar = this.f;
                xcqVar.getClass();
                wyn wynVar = new wyn(wbb.x(vvdVar.d(wzw.S), yfm.s(imuVarB, sij.ad(new yfo() { // from class: imz
                    @Override // defpackage.yfo, defpackage.yfn
                    public final Object b() {
                        return ImmutableList.of((imx) new usb(((inb) xcqVar).b()), imxVarB);
                    }
                }))));
                String strBp = lfnVar.bp();
                strBp.getClass();
                if (strBp.length() > 0) {
                    krd.b("Using Slendro hostname  ".concat(strBp));
                    wynVar = (wyn) wynVar.M(uqt.a, strBp);
                }
                ldy ldyVar = (ldy) ieaVarB;
                return (wyn) (ldyVar.a().m() ? (wyn) wynVar.M(uqx.a, new uqx(((ksn) ldyVar.a().g()).a)) : (wyn) ((wyn) wynVar.L(imuVarB)).M(ush.c, new usg(xlpVarB.h()))).K(lfnVar.aF(), TimeUnit.MILLISECONDS);
            case 2:
                xcq xcqVar2 = this.a;
                xcq xcqVar3 = this.d;
                return new lkt(this.b, this.f, this.c, (yfo) this.h, xcqVar3, xcqVar2, (short[]) null);
            case 3:
                xcq xcqVar4 = this.e;
                Context contextA = ((rgq) this.d).a();
                mdw mdwVar = (mdw) xcqVar4.b();
                isy isyVar = (isy) this.c.b();
                ?? r0 = this.h;
                xjl xjlVarB = ((xjm) this.f).b();
                ldv ldvVar = (ldv) r0.b();
                ((kqw) this.a).b();
                return new kmb(contextA, mdwVar, isyVar, xjlVarB, ldvVar, (lie) this.b.b());
            case 4:
                return new ldy(((rgq) this.b).a(), (SharedPreferences) this.e.b(), (kwy) this.f.b(), xcl.a(this.c), ((Boolean) this.a.b()).booleanValue(), (Runnable) this.h.b(), a$$ExternalSyntheticApiModelOutline0.m13m(this.d.b()));
            case 5:
                xcq xcqVar5 = this.f;
                xcq xcqVar6 = this.a;
                xcq xcqVar7 = this.c;
                return new lhr((yfo) this.h, this.d, this.b, this.e, xcqVar7, xcqVar6, xcqVar5);
            case 6:
                return new lwb((lfn) this.b.b(), ((rgq) this.f).a(), (ldv) this.h.b(), (idf) this.e.b(), (idf) this.d.b(), (lfx) this.a.b(), ((lwc) this.c).a(), 1);
            case 7:
                return new lwb((lfn) this.b.b(), (ldv) this.h.b(), (idf) this.e.b(), (idf) this.d.b(), (lfx) this.a.b(), ((lwc) this.c).a(), ((rgq) this.f).a(), 0);
            case 8:
                ldv ldvVar2 = (ldv) this.h.b();
                idf idfVar = (idf) this.a.b();
                String str = (String) this.d.b();
                Executor executor = (Executor) this.f.b();
                lfn lfnVar2 = (lfn) this.b.b();
                String str2 = (String) this.e.b();
                return ktw.z(lfb.b(str2, ".cw", executor), ldvVar2, idfVar, new lbj(str, 15, (short[]) null), (vvq) xbh.a.a(7, null), xbh.class, mag.i, lfnVar2.aI(), lfnVar2.aI(), ((Boolean) this.c.b()).booleanValue());
            case 9:
                ldv ldvVar3 = (ldv) this.h.b();
                lyz lyzVar = (lyz) this.f.b();
                xcq xcqVar8 = this.b;
                xcq xcqVar9 = this.d;
                xcq xcqVar10 = this.a;
                lkt lktVarB = ((mci) this.c).b();
                Executor executorA = ((kqt) xcqVar10).a();
                Executor executorA2 = ((kqt) xcqVar9).a();
                return new mck(ldvVar3, lyzVar, lktVarB, executorA, executorA2);
            case 10:
                return ((jwq) this.h).ae(((xkv) this.a).b(), ((kqg) this.d).b(), (kuw) this.e.b(), (lyz) this.b.b(), (ExecutorService) this.f.b(), (mct) this.c.b());
            case 11:
                xcq xcqVar11 = this.c;
                jzs jzsVarB = ((owb) this.e).b();
                ovk ovkVar = (ovk) xcqVar11.b();
                oum oumVar = (oum) this.b.b();
                Object obj = this.h;
                yow yowVarD = igh.d();
                ((rmk) obj).a();
                ((rmk) this.f).a();
                return new ovq(jzsVarB, ovkVar, oumVar, yowVarD, this.d, ((rmk) this.a).a());
            case 12:
                return new pgb(((mdx) this.h).a(), xcl.a(this.f), (String) this.a.b(), (oyi) this.e.b(), (oxp) this.b.b(), (pfs) this.c.b(), this.d);
            case 13:
                return new pww((qbr) this.a.b(), xcl.a(this.f), xcl.a(this.e), (pvg) this.d.b(), (rbi) this.c.b(), (osk) this.h.b(), (yyk) this.b.b());
            default:
                return new qsk(((qoe) this.f).a(), (qja) this.a.b(), (osk) this.b.b(), (tst) ((xcn) this.c).a, (qbd) this.d.b(), ((qle) this.e).b(), (pvg) this.h.b());
        }
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i) {
        this.g = i;
        this.h = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
        this.d = xcqVar5;
        this.e = xcqVar6;
        this.f = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, byte[] bArr) {
        this.g = i;
        this.b = xcqVar;
        this.h = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
        this.f = xcqVar5;
        this.e = xcqVar6;
        this.c = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, char[] cArr) {
        this.g = i;
        this.b = xcqVar;
        this.e = xcqVar2;
        this.f = xcqVar3;
        this.c = xcqVar4;
        this.h = xcqVar5;
        this.d = xcqVar6;
        this.a = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, float[] fArr) {
        this.g = i;
        this.b = xcqVar;
        this.f = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
        this.h = xcqVar5;
        this.e = xcqVar6;
        this.c = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, int[] iArr) {
        this.g = i;
        this.b = xcqVar;
        this.e = xcqVar2;
        this.f = xcqVar3;
        this.c = xcqVar4;
        this.a = xcqVar5;
        this.h = xcqVar6;
        this.d = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, short[] sArr) {
        this.g = i;
        this.d = xcqVar;
        this.e = xcqVar2;
        this.c = xcqVar3;
        this.f = xcqVar4;
        this.h = xcqVar5;
        this.a = xcqVar6;
        this.b = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, boolean[] zArr) {
        this.g = i;
        this.h = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.e = xcqVar4;
        this.c = xcqVar5;
        this.a = xcqVar6;
        this.f = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, byte[][] bArr) {
        this.g = i;
        this.b = xcqVar;
        this.d = xcqVar2;
        this.a = xcqVar3;
        this.f = xcqVar4;
        this.h = xcqVar5;
        this.e = xcqVar6;
        this.c = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, char[][] cArr) {
        this.g = i;
        this.h = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.f = xcqVar4;
        this.b = xcqVar5;
        this.e = xcqVar6;
        this.c = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, float[][] fArr) {
        this.g = i;
        this.a = xcqVar;
        this.f = xcqVar2;
        this.e = xcqVar3;
        this.d = xcqVar4;
        this.c = xcqVar5;
        this.h = xcqVar6;
        this.b = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, int[][] iArr) {
        this.g = i;
        this.e = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
        this.h = xcqVar4;
        this.f = xcqVar5;
        this.d = xcqVar6;
        this.a = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, short[][] sArr) {
        this.g = i;
        this.h = xcqVar;
        this.f = xcqVar2;
        this.c = xcqVar3;
        this.a = xcqVar4;
        this.d = xcqVar5;
        this.b = xcqVar6;
        this.e = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, boolean[][] zArr) {
        this.g = i;
        this.h = xcqVar;
        this.f = xcqVar2;
        this.a = xcqVar3;
        this.e = xcqVar4;
        this.b = xcqVar5;
        this.c = xcqVar6;
        this.d = xcqVar7;
    }

    public jbh(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, byte[][][] bArr) {
        this.g = i;
        this.f = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
        this.d = xcqVar5;
        this.e = xcqVar6;
        this.h = xcqVar7;
    }
}
