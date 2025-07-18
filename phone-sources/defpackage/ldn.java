package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldn implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;
    private final xcq h;
    private final xcq i;
    private final /* synthetic */ int j;

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i) {
        this.j = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.g = xcqVar7;
        this.h = xcqVar8;
        this.i = xcqVar9;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        mkh mkhVar = null;
        switch (this.j) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.a.b();
                lyz lyzVar = (lyz) this.b.b();
                mem memVar = (mem) this.c.b();
                xcq xcqVar = this.f;
                return new mta(sharedPreferences, lyzVar, memVar, ((kqk) this.d).b(), ((kqi) this.e).a(), (iea) xcqVar.b(), (lfn) this.g.b(), (ExecutorService) this.h.b(), ((xmi) this.i).b());
            case 1:
                xcq xcqVar2 = this.a;
                xjl xjlVarB = ((xjm) this.f).b();
                isy isyVar = (isy) xcqVar2.b();
                shx shxVar = (shx) this.d.b();
                iyz iyzVar = (iyz) this.h.b();
                yow yowVar = (yow) this.e.b();
                xcq xcqVar3 = this.i;
                xcq xcqVar4 = this.b;
                yow yowVarB = ((kqw) this.c).b();
                Context contextA = ((rgq) xcqVar4).a();
                isy isyVar2 = (isy) xcqVar3.b();
                ldv ldvVar = (ldv) this.g.b();
                isyVar.getClass();
                shxVar.getClass();
                iyzVar.getClass();
                yowVar.getClass();
                isyVar2.getClass();
                ldvVar.getClass();
                return new mdw(xjlVarB, isyVar, shxVar, iyzVar, yowVar, yowVarB, contextA, isyVar2, ldvVar);
            case 2:
                lfn lfnVar = (lfn) this.h.b();
                lyz lyzVar2 = (lyz) this.c.b();
                xcq xcqVar5 = this.e;
                return new lxp(lfnVar, lyzVar2, ((kqg) this.g).b(), (lys) xcqVar5.b(), xcl.a(this.d), (kta) this.b.b(), (lfx) this.a.b(), ((Boolean) this.i.b()).booleanValue(), (idf) this.f.b());
            case 3:
                lfn lfnVar2 = (lfn) this.h.b();
                xcq xcqVar6 = this.i;
                Context contextA2 = ((rgq) this.g).a();
                SharedPreferences sharedPreferences2 = (SharedPreferences) xcqVar6.b();
                ieh iehVar = (ieh) this.c.b();
                lie lieVar = (lie) this.e.b();
                ids idsVar = (ids) this.a.b();
                xcq xcqVar7 = this.f;
                xcq xcqVar8 = this.d;
                idr idrVarA = ((kqu) this.b).a();
                xbw xbwVarA = xcl.a(xcqVar8);
                xbw xbwVarA2 = xcl.a(xcqVar7);
                mjl mjlVar = mih.a;
                if (mjlVar == null) {
                    if (!ksk.p()) {
                        if (lfnVar2.bY()) {
                            mkhVar = (mkh) xbwVarA2.b();
                        } else if (lfnVar2.bX()) {
                            mkhVar = (mkh) xbwVarA.b();
                        }
                    }
                    eu euVar = (eu) iehVar.a();
                    mih.a = new mjl(contextA2, lfnVar2, lieVar, sharedPreferences2, mkhVar, idsVar, euVar, mih.a(contextA2, euVar), idrVarA);
                    mjlVar = mih.a;
                }
                mjlVar.getClass();
                return mjlVar;
            case 4:
                ldv ldvVar2 = (ldv) this.g.b();
                lfz lfzVar = (lfz) this.h.b();
                xcq xcqVar9 = this.c;
                return new msr(ldvVar2, lfzVar, ((kqq) this.i).b(), (Executor) xcqVar9.b(), (Executor) this.e.b(), (lfn) this.f.b(), (SharedPreferences) this.a.b(), ((xhy) this.d).b(), ((kqi) this.b).a());
            case 5:
                xcq xcqVar10 = this.g;
                xbw xbwVarA3 = xcl.a(this.a);
                String str = (String) xcqVar10.b();
                xcl.a(this.b);
                xcq xcqVar11 = this.c;
                xbw xbwVarA4 = xcl.a(this.i);
                uhs uhsVar = (uhs) this.e.b();
                xcq xcqVar12 = this.d;
                xcq xcqVar13 = this.f;
                xbw xbwVarA5 = xcl.a(xcqVar12);
                return new oyz(xbwVarA3, str, this.h, xbwVarA4, uhsVar, xbwVarA5);
            case 6:
                xcq xcqVar14 = this.c;
                Context contextA3 = ((rgq) this.d).a();
                String str2 = (String) xcqVar14.b();
                rbi rbiVar = (rbi) this.a.b();
                oxp oxpVar = (oxp) this.b.b();
                Set set = (Set) ((xcn) this.h).a;
                uhs uhsVar2 = (uhs) this.f.b();
                oxe oxeVarB = ((oxl) this.e).b();
                return new pgh(contextA3, str2, rbiVar, oxpVar, this.g, set, this.i, uhsVar2, oxeVarB);
            case 7:
                qsy qsyVar = (qsy) this.d.b();
                xcq xcqVar15 = this.g;
                xbw xbwVarA6 = xcl.a(this.c);
                pwi pwiVar = (pwi) xcqVar15.b();
                pui puiVar = (pui) this.a.b();
                qjl qjlVarA = ((pxo) this.b).a();
                xcq xcqVar16 = this.i;
                xcq xcqVar17 = this.e;
                return new pug(qsyVar, xbwVarA6, pwiVar, puiVar, qjlVarA, this.h, this.f, xcqVar17, xcqVar16);
            case 8:
                xcq xcqVar18 = this.h;
                Context contextA4 = ((rgq) this.b).a();
                qei qeiVar = (qei) xcqVar18.b();
                tst tstVar = (tst) ((xcn) this.d).a;
                qbp qbpVar = (qbp) this.i.b();
                tst tstVar2 = (tst) ((xcn) this.f).a;
                xcq xcqVar19 = this.c;
                xcq xcqVar20 = this.e;
                return new pzn(contextA4, qeiVar, tstVar, qbpVar, tstVar2, ((qmw) this.g).b(), ((pzb) this.a).b(), ((rmk) xcqVar20).a(), ((qle) xcqVar19).b());
            case 9:
                xcq xcqVar21 = this.h;
                Context contextA5 = ((rgq) this.f).a();
                qei qeiVar2 = (qei) xcqVar21.b();
                pvx pvxVar = (pvx) this.g.b();
                qcg qcgVar = (qcg) this.i.b();
                xcq xcqVar22 = this.a;
                xbw xbwVarA7 = xcl.a(this.e);
                qbp qbpVar2 = (qbp) xcqVar22.b();
                pvg pvgVar = (pvg) this.b.b();
                return new qcd(contextA5, qeiVar2, pvxVar, qcgVar, xbwVarA7, qbpVar2, pvgVar, this.c);
            case 10:
                pva pvaVar = (pva) this.g.b();
                qei qeiVar3 = (qei) this.c.b();
                pzq pzqVar = (pzq) this.b.b();
                Object obj = ((xcn) this.a).a;
                xcq xcqVar23 = this.i;
                return new qse(pvaVar, qeiVar3, pzqVar, ((qod) this.e).b(), ((qom) this.h).b(), ((pzp) xcqVar23).b(), (tst) obj, ((rgq) this.f).a(), new qps());
            default:
                Context contextA6 = ((rgq) this.h).a();
                qth qthVar = (qth) this.e.b();
                qwo qwoVar = (qwo) this.g.b();
                tst tstVar3 = (tst) ((xcn) this.f).a;
                tst tstVar4 = (tst) ((xcn) this.c).a;
                tst tstVar5 = (tst) ((xcn) this.b).a;
                tst tstVar6 = (tst) ((xcn) this.d).a;
                pnl pnlVar = (pnl) this.i.b();
                ExecutorService executorService = (ExecutorService) tstVar6.e(Executors.newCachedThreadPool(rrx.ao()));
                qwm qwmVar = new qwm((byte[]) null);
                Context applicationContext = contextA6.getApplicationContext();
                if (applicationContext == null) {
                    throw new NullPointerException("Null applicationContext");
                }
                qwmVar.a = applicationContext;
                qwmVar.d = rfg.a().a();
                rfd rfdVar = new rfd();
                rfdVar.b(true);
                rfdVar.a = (byte) (rfdVar.a | 2);
                qwmVar.g = rfdVar.a();
                qwmVar.i = new rlx(1);
                if (qthVar == null) {
                    throw new NullPointerException("Null accountConverter");
                }
                qwmVar.c = qthVar;
                if (qwoVar == null) {
                    throw new NullPointerException("Null accountsModel");
                }
                xcq xcqVar24 = this.a;
                qwmVar.b = qwoVar;
                qwmVar.e = new rgr(contextA6, (rjq) xcqVar24.b());
                qwmVar.f = new rik(qthVar, contextA6);
                qwmVar.h(executorService);
                if (pnlVar == null) {
                    throw new NullPointerException("Null vePrimitives");
                }
                qwmVar.h = pnlVar;
                if (tstVar3.g()) {
                    qwmVar.g = (rfe) tstVar3.c();
                }
                if (tstVar4.g()) {
                    qwmVar.d = (rfg) tstVar4.c();
                }
                if (tstVar5.g()) {
                    qwmVar.j = tst.i((rjj) tstVar5.c());
                }
                return qwmVar.a();
        }
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, byte[] bArr) {
        this.j = i;
        this.f = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.h = xcqVar4;
        this.e = xcqVar5;
        this.c = xcqVar6;
        this.b = xcqVar7;
        this.i = xcqVar8;
        this.g = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, char[] cArr) {
        this.j = i;
        this.h = xcqVar;
        this.c = xcqVar2;
        this.g = xcqVar3;
        this.e = xcqVar4;
        this.d = xcqVar5;
        this.b = xcqVar6;
        this.a = xcqVar7;
        this.i = xcqVar8;
        this.f = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, float[] fArr) {
        this.j = i;
        this.d = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
        this.b = xcqVar4;
        this.g = xcqVar5;
        this.h = xcqVar6;
        this.i = xcqVar7;
        this.f = xcqVar8;
        this.e = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, int[] iArr) {
        this.j = i;
        this.g = xcqVar;
        this.h = xcqVar2;
        this.i = xcqVar3;
        this.c = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.a = xcqVar7;
        this.d = xcqVar8;
        this.b = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, short[] sArr) {
        this.j = i;
        this.h = xcqVar;
        this.g = xcqVar2;
        this.i = xcqVar3;
        this.c = xcqVar4;
        this.e = xcqVar5;
        this.a = xcqVar6;
        this.b = xcqVar7;
        this.d = xcqVar8;
        this.f = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, boolean[] zArr) {
        this.j = i;
        this.a = xcqVar;
        this.g = xcqVar2;
        this.h = xcqVar3;
        this.b = xcqVar4;
        this.i = xcqVar5;
        this.c = xcqVar6;
        this.e = xcqVar7;
        this.d = xcqVar8;
        this.f = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, byte[][] bArr) {
        this.j = i;
        this.d = xcqVar;
        this.c = xcqVar2;
        this.g = xcqVar3;
        this.a = xcqVar4;
        this.b = xcqVar5;
        this.h = xcqVar6;
        this.f = xcqVar7;
        this.e = xcqVar8;
        this.i = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, char[][] cArr) {
        this.j = i;
        this.b = xcqVar;
        this.h = xcqVar2;
        this.d = xcqVar3;
        this.i = xcqVar4;
        this.f = xcqVar5;
        this.g = xcqVar6;
        this.a = xcqVar7;
        this.e = xcqVar8;
        this.c = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, int[][] iArr) {
        this.j = i;
        this.d = xcqVar;
        this.g = xcqVar2;
        this.c = xcqVar3;
        this.b = xcqVar4;
        this.e = xcqVar5;
        this.h = xcqVar6;
        this.i = xcqVar7;
        this.a = xcqVar8;
        this.f = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, short[][] sArr) {
        this.j = i;
        this.f = xcqVar;
        this.h = xcqVar2;
        this.g = xcqVar3;
        this.i = xcqVar4;
        this.e = xcqVar5;
        this.a = xcqVar6;
        this.b = xcqVar7;
        this.c = xcqVar8;
        this.d = xcqVar9;
    }

    public ldn(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, boolean[][] zArr) {
        this.j = i;
        this.h = xcqVar;
        this.e = xcqVar2;
        this.g = xcqVar3;
        this.a = xcqVar4;
        this.f = xcqVar5;
        this.c = xcqVar6;
        this.b = xcqVar7;
        this.d = xcqVar8;
        this.i = xcqVar9;
    }
}
