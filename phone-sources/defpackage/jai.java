package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.videos.R;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jai implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final /* synthetic */ int f;
    private final Object g;

    public jai(kqf kqfVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i) {
        this.f = i;
        this.g = kqfVar;
        this.e = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
        this.d = xcqVar4;
        this.b = xcqVar5;
    }

    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v113, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v145, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.f) {
            case 0:
                xcq xcqVar = this.b;
                Context contextA = ((rgq) this.a).a();
                Executor executor = (Executor) xcqVar.b();
                Executor executor2 = (Executor) this.c.b();
                kw kwVar = (kw) this.d.b();
                xcq xcqVar2 = this.e;
                iea ieaVarB = ((kqg) this.g).b();
                lfn lfnVar = (lfn) xcqVar2.b();
                executor.getClass();
                executor2.getClass();
                kwVar.getClass();
                lfnVar.getClass();
                yow yowVarL = yoz.l(ylh.ai(executor2));
                yow yowVarL2 = yoz.l(ylh.ai(executor));
                String string = contextA.getString(R.string.gtv_application_name);
                string.getClass();
                return new jah(contextA, kwVar, yowVarL, yowVarL2, ieaVarB, lfnVar, string);
            case 1:
                xcq xcqVar3 = this.e;
                return new izz(((lea) this.g).b(), (ijy) xcqVar3.b(), ((lgg) this.b).b(), (ikf) this.a.b(), (ikh) this.c.b(), (isi) this.d.b());
            case 2:
                xcq xcqVar4 = this.a;
                return new lhr(((rgq) this.e).a(), (kdh) xcqVar4.b(), (SharedPreferences) this.d.b(), ((jdn) this.b).b(), (ljj) this.c.b(), ((kqg) this.g).b());
            case 3:
                ?? r1 = this.g;
                xcq xcqVar5 = this.d;
                xkf xkfVarB = ((xkg) this.c).b();
                jdr jdrVarB = ((jds) xcqVar5).b();
                yow yowVar = (yow) r1.b();
                euc eucVar = (euc) this.e.b();
                iea ieaVar = (iea) this.a.b();
                ino inoVar = (ino) this.b.b();
                yowVar.getClass();
                eucVar.getClass();
                ieaVar.getClass();
                inoVar.getClass();
                if (!xkfVarB.g() || !xkfVarB.b()) {
                    return new lgj(ieaVar, inoVar);
                }
                ((tug) jdt.a.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/offline/OfflineModule$Companion", "providesDownloadService", 71, "OfflineModule.kt")).s("Flag exoplayerv3DownloadEnabled(): using Kinetoscope Download Observables Publisher");
                return new jdm(jdrVarB, yowVar, eucVar);
            case 4:
                xcq xcqVar6 = this.d;
                xcq xcqVar7 = this.a;
                xcq xcqVar8 = this.b;
                ?? r6 = this.g;
                return new lkt(this.e, this.c, (yfo) r6, xcqVar8, xcqVar7, xcqVar6, (byte[]) null, (byte[]) null, (char[]) null);
            case 5:
                ?? r8 = this.g;
                xcq xcqVar9 = this.b;
                xcq xcqVar10 = this.d;
                xcq xcqVar11 = this.e;
                return new lkt(this.a, this.c, xcqVar11, xcqVar10, xcqVar9, (yfo) r8, (char[]) null, (byte[]) null);
            case 6:
                leu leuVar = (leu) this.e.b();
                leu leuVar2 = (leu) this.c.b();
                leu leuVar3 = (leu) this.a.b();
                xcq xcqVar12 = this.b;
                return ((kqf) this.g).y(leuVar, leuVar2, leuVar3, ((lpf) this.d).b(), (leu) xcqVar12.b());
            case 7:
                lfn lfnVar2 = (lfn) this.a.b();
                xcq xcqVar13 = this.c;
                xcq xcqVar14 = this.d;
                return ((kqf) this.g).h(lfnVar2, ((kqg) this.e).b(), ((kqq) xcqVar14).b(), (lyz) xcqVar13.b(), (ExecutorService) this.b.b());
            case 8:
                return new ljn((lfn) this.g.b(), (Executor) this.a.b(), (mem) this.c.b(), (SharedPreferences) this.b.b(), ((rgq) this.e).a(), ((xmi) this.d).b());
            case 9:
                return new lkt((SharedPreferences) this.d.b(), (lie) this.e.b(), (lld) this.b.b(), (lgr) this.a.b(), ((lkw) this.g).b(), ((llb) this.c).b());
            case 10:
                xcq xcqVar15 = this.b;
                ?? r9 = this.g;
                xcq xcqVar16 = this.a;
                xcq xcqVar17 = this.d;
                return new lkt(this.c, this.e, xcqVar17, xcqVar16, (yfo) r9, xcqVar15);
            case 11:
                xcq xcqVar18 = this.e;
                Context contextA2 = ((rgq) this.g).a();
                lfn lfnVar3 = (lfn) xcqVar18.b();
                Executor executor3 = (Executor) this.a.b();
                xcq xcqVar19 = this.d;
                return new lnk(contextA2, lfnVar3, executor3, ((maf) this.b).b(), ((lnv) this.c).b(), (lny) xcqVar19.b());
            case 12:
                ldv ldvVar = (ldv) this.g.b();
                idf idfVar = (idf) this.c.b();
                String str = (String) this.e.b();
                lfn lfnVar4 = (lfn) this.a.b();
                boolean zBooleanValue = ((Boolean) this.d.b()).booleanValue();
                lfb lfbVar = (lfb) this.b.b();
                idh idhVarD = idh.d();
                idhVarD.e(ktw.z(lfbVar, ldvVar, idfVar, new lbj(str, 14, (char[]) null), (vvq) xbf.a.a(7, null), xbf.class, lzv.i, lfnVar4.aB(), lfnVar4.aB(), zBooleanValue));
                return idhVarD.b(new jxt(new ltu(13), 8));
            case 13:
                ldv ldvVar2 = (ldv) this.g.b();
                idf idfVar2 = (idf) this.c.b();
                String str2 = (String) this.e.b();
                lfn lfnVar5 = (lfn) this.a.b();
                return ktw.z((lfb) this.d.b(), ldvVar2, idfVar2, new lbj(str2, 10, (byte[]) null), (vvq) xbk.a.a(7, null), xbk.class, lyo.i, lfnVar5.aH(), 86400000L, ((Boolean) this.b.b()).booleanValue());
            case 14:
                return new lxk((idf) this.e.b(), (Executor) this.d.b(), ((kqg) this.g).b(), (lys) this.a.b(), (ids) this.b.b(), (lfx) this.c.b());
            case 15:
                return new lhr((lyz) this.c.b(), (SharedPreferences) this.b.b(), (ltv) this.d.b(), (kuw) this.g.b(), ((kpw) this.e).b(), (lfn) this.a.b());
            case 16:
                ldv ldvVar3 = (ldv) this.g.b();
                lyz lyzVar = (lyz) this.a.b();
                ltt lttVar = (ltt) this.d.b();
                xcq xcqVar20 = this.c;
                return new mcx(ldvVar3, lyzVar, lttVar, ((kqt) this.b).a(), ((kqt) this.e).a(), (lie) xcqVar20.b());
            case 17:
                return new mkj(((rgq) this.a).a(), (lfn) this.e.b(), (idf) this.d.b(), (SharedPreferences) this.b.b(), (ldv) this.g.b(), (Executor) this.c.b());
            case 18:
                ouy ouyVar = (ouy) this.d.b();
                xcq xcqVar21 = this.c;
                xcq xcqVar22 = this.b;
                Object obj = this.g;
                return new ovr(ouyVar, igh.c(), ((rmk) obj).a(), ((rmk) xcqVar22).a(), (oum) xcqVar21.b(), this.a, ((rgq) this.e).a());
            case 19:
                ouy ouyVar2 = (ouy) this.d.b();
                xcq xcqVar23 = this.c;
                xcq xcqVar24 = this.b;
                Object obj2 = this.g;
                return new ovx(ouyVar2, igh.c(), ((rmk) obj2).a(), ((rmk) xcqVar24).a(), (oum) xcqVar23.b(), this.a, ((rgq) this.e).a());
            default:
                return new pwl(((qoe) this.c).a(), (ntp) this.e.b(), (rbi) this.g.b(), (rbi) this.b.b(), (pvg) this.a.b(), (Set) ((xcn) this.d).a);
        }
    }

    public jai(kqf kqfVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[] bArr) {
        this.f = i;
        this.g = kqfVar;
        this.a = xcqVar;
        this.e = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
        this.b = xcqVar5;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.g = xcqVar5;
        this.e = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, byte[] bArr) {
        this.f = i;
        this.g = xcqVar;
        this.e = xcqVar2;
        this.b = xcqVar3;
        this.a = xcqVar4;
        this.c = xcqVar5;
        this.d = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, char[] cArr) {
        this.f = i;
        this.e = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
        this.c = xcqVar5;
        this.g = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, float[] fArr) {
        this.f = i;
        this.g = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.b = xcqVar4;
        this.e = xcqVar5;
        this.d = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, int[] iArr) {
        this.f = i;
        this.e = xcqVar;
        this.c = xcqVar2;
        this.g = xcqVar3;
        this.b = xcqVar4;
        this.a = xcqVar5;
        this.d = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, short[] sArr) {
        this.f = i;
        this.c = xcqVar;
        this.d = xcqVar2;
        this.g = xcqVar3;
        this.e = xcqVar4;
        this.a = xcqVar5;
        this.b = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, boolean[] zArr) {
        this.f = i;
        this.a = xcqVar;
        this.c = xcqVar2;
        this.e = xcqVar3;
        this.d = xcqVar4;
        this.b = xcqVar5;
        this.g = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, byte[][] bArr) {
        this.f = i;
        this.d = xcqVar;
        this.e = xcqVar2;
        this.b = xcqVar3;
        this.a = xcqVar4;
        this.g = xcqVar5;
        this.c = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, char[][] cArr) {
        this.f = i;
        this.c = xcqVar;
        this.e = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
        this.g = xcqVar5;
        this.b = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, float[][] fArr) {
        this.f = i;
        this.e = xcqVar;
        this.d = xcqVar2;
        this.g = xcqVar3;
        this.a = xcqVar4;
        this.b = xcqVar5;
        this.c = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, int[][] iArr) {
        this.f = i;
        this.g = xcqVar;
        this.c = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.d = xcqVar5;
        this.b = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, short[][] sArr) {
        this.f = i;
        this.g = xcqVar;
        this.e = xcqVar2;
        this.a = xcqVar3;
        this.b = xcqVar4;
        this.c = xcqVar5;
        this.d = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, boolean[][] zArr) {
        this.f = i;
        this.g = xcqVar;
        this.c = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.b = xcqVar5;
        this.d = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, byte[][][] bArr) {
        this.f = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.g = xcqVar4;
        this.e = xcqVar5;
        this.a = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, char[][][] cArr) {
        this.f = i;
        this.g = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
        this.e = xcqVar5;
        this.c = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, float[][][] fArr) {
        this.f = i;
        this.c = xcqVar;
        this.e = xcqVar2;
        this.g = xcqVar3;
        this.b = xcqVar4;
        this.a = xcqVar5;
        this.d = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, int[][][] iArr) {
        this.f = i;
        this.d = xcqVar;
        this.g = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
        this.a = xcqVar5;
        this.e = xcqVar6;
    }

    public jai(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, short[][][] sArr) {
        this.f = i;
        this.a = xcqVar;
        this.e = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
        this.g = xcqVar5;
        this.c = xcqVar6;
    }
}
