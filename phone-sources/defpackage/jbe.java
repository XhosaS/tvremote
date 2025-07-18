package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbe implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;
    private final /* synthetic */ int h;
    private final Object i;

    public jbe(ljv ljvVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i) {
        this.h = i;
        this.i = ljvVar;
        this.a = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
        this.d = xcqVar4;
        this.g = xcqVar5;
        this.f = xcqVar6;
        this.e = xcqVar7;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws IOException {
        switch (this.h) {
            case 0:
                lfz lfzVar = (lfz) this.a.b();
                lys lysVar = (lys) this.b.b();
                xcq xcqVar = this.d;
                return new mdw(lfzVar, lysVar, ((kqg) this.i).b(), ((rgq) this.c).a(), (isi) xcqVar.b(), (ino) this.e.b(), ((jbi) this.f).b(), (yow) this.g.b());
            case 1:
                xcq xcqVar2 = this.c;
                iea ieaVarB = ((kqg) this.i).b();
                iea ieaVar = (iea) xcqVar2.b();
                mta mtaVar = (mta) this.d.b();
                lie lieVar = (lie) this.g.b();
                xcq xcqVar3 = this.b;
                xcq xcqVar4 = this.f;
                xkf xkfVarB = ((xkg) this.e).b();
                jdr jdrVarB = ((jds) xcqVar4).b();
                yow yowVar = (yow) xcqVar3.b();
                iwz iwzVarB = ((ixa) this.a).b();
                ieaVar.getClass();
                mtaVar.getClass();
                lieVar.getClass();
                yowVar.getClass();
                return xkfVarB.b() ? new ixe(jdrVarB, yowVar, iwzVarB, lieVar) : new ixc(ieaVarB, ieaVar, mtaVar, lieVar);
            case 2:
                ttm ttmVarB = ((leb) this.b).b();
                uir uirVarB = ((lda) this.g).b();
                sav savVar = new sav(((rgq) this.c).a(), ((ldb) this.i).a(), (String) this.f.b(), tdu.ULEX_MOVIES, ((lfo) this.a).b().longValue(), ((lxc) this.d.b()).a, ((ldb) this.e).a());
                savVar.i = ttmVarB;
                savVar.j = new eij(uirVarB, 13);
                tdt tdtVar = savVar.h;
                tdtVar.a = "movies_ulex_logs";
                tdtVar.q = true;
                return new saw(savVar.i, savVar.j, savVar.a, tdtVar, savVar.b, savVar.d, savVar.c, savVar.e, savVar.f, savVar.g);
            case 3:
                xcq xcqVar5 = this.c;
                Context contextA = ((rgq) this.a).a();
                lfn lfnVar = (lfn) xcqVar5.b();
                xcq xcqVar6 = this.g;
                xcq xcqVar7 = this.d;
                return ((ljv) this.i).a(contextA, lfnVar, ((kqg) this.b).b(), ((kqq) xcqVar7).b(), (lyz) xcqVar6.b(), (ExecutorService) this.f.b(), xcl.a(this.e));
            case 4:
                ?? r11 = this.i;
                xcq xcqVar8 = this.a;
                xcq xcqVar9 = this.d;
                xcq xcqVar10 = this.c;
                xcq xcqVar11 = this.e;
                return new moz(this.g, this.b, this.f, xcqVar11, xcqVar10, xcqVar9, xcqVar8, (yfo) r11, (char[]) null);
            case 5:
                vbo vboVar = (vbo) this.a.b();
                xcq xcqVar12 = this.e;
                return new moz((yfo) this.i, vboVar, ((kqi) this.g).a(), (SharedPreferences) xcqVar12.b(), (lfn) this.b.b(), (lfx) this.c.b(), this.d, ((xlv) this.f).b());
            case 6:
                return new mbv((mab) this.c.b(), (mcw) this.d.b(), (lys) this.b.b(), (mcj) this.f.b(), (jzs) this.g.b(), (lzq) this.e.b(), (lht) this.i.b(), (ExecutorService) this.a.b());
            case 7:
                xcq xcqVar13 = this.g;
                iea ieaVarB2 = ((kqg) this.i).b();
                ExecutorService executorService = (ExecutorService) xcqVar13.b();
                lfn lfnVar2 = (lfn) this.a.b();
                jzs jzsVar = (jzs) this.c.b();
                xcq xcqVar14 = this.b;
                mru mruVarB = ((mcg) this.f).b();
                ((kpw) xcqVar14).b();
                return new mce(ieaVarB2, executorService, lfnVar2, jzsVar, mruVarB, (iea) this.d.b(), (iea) this.e.b());
            case 8:
                hfx hfxVar = (hfx) this.f.b();
                hfx hfxVar2 = (hfx) this.d.b();
                hfx hfxVar3 = (hfx) this.e.b();
                xcq xcqVar15 = this.b;
                xcq xcqVar16 = this.g;
                return new mdw(hfxVar, hfxVar2, hfxVar3, ((qib) this.i).a(), ((mdx) this.a).a(), ((mdx) this.c).a(), ((mdx) xcqVar16).a(), ((mdx) xcqVar15).a());
            case 9:
                xcq xcqVar17 = this.b;
                xbw xbwVarA = xcl.a(this.a);
                pva pvaVar = (pva) xcqVar17.b();
                nsf nsfVar = (nsf) this.c.b();
                ((qom) this.e).b();
                pvg pvgVar = (pvg) this.f.b();
                osk oskVar = (osk) this.g.b();
                Random random = (Random) this.d.b();
                ((mdx) this.i).a();
                return new ocv(xbwVarA, pvaVar, nsfVar, pvgVar, oskVar, random);
            case 10:
                ((qoe) this.g).a();
                return new pvd((qai) this.b.b(), (ntp) this.a.b(), (qbr) this.d.b(), (pvg) this.c.b(), (Set) ((xcn) this.f).a, ((pwe) this.e).b(), ((qib) this.i).a());
            case 11:
                return new qbh((pxf) this.i.b(), ((qoe) this.e).a(), (ntp) this.b.b(), (pwp) this.d.b(), (pvg) this.a.b(), (Set) ((xcn) this.f).a, (osk) this.c.b(), this.g);
            default:
                qbr qbrVar = (qbr) this.f.b();
                nsf nsfVar2 = (nsf) this.c.b();
                xcq xcqVar18 = this.a;
                qnr qnrVarA = ((qoe) this.e).a();
                pxf pxfVar = (pxf) xcqVar18.b();
                pvg pvgVar2 = (pvg) this.g.b();
                ((qdg) this.d).b();
                return new qtf(qbrVar, nsfVar2, qnrVarA, pxfVar, pvgVar2, ((mdx) this.i).a(), ((qbw) this.b).b());
        }
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i) {
        this.h = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.i = xcqVar3;
        this.c = xcqVar4;
        this.d = xcqVar5;
        this.e = xcqVar6;
        this.f = xcqVar7;
        this.g = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, byte[] bArr) {
        this.h = i;
        this.i = xcqVar;
        this.c = xcqVar2;
        this.d = xcqVar3;
        this.g = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.b = xcqVar7;
        this.a = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, char[] cArr) {
        this.h = i;
        this.b = xcqVar;
        this.g = xcqVar2;
        this.c = xcqVar3;
        this.i = xcqVar4;
        this.f = xcqVar5;
        this.a = xcqVar6;
        this.d = xcqVar7;
        this.e = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, float[] fArr) {
        this.h = i;
        this.i = xcqVar;
        this.g = xcqVar2;
        this.a = xcqVar3;
        this.c = xcqVar4;
        this.f = xcqVar5;
        this.b = xcqVar6;
        this.d = xcqVar7;
        this.e = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, int[] iArr) {
        this.h = i;
        this.i = xcqVar;
        this.a = xcqVar2;
        this.g = xcqVar3;
        this.e = xcqVar4;
        this.b = xcqVar5;
        this.c = xcqVar6;
        this.d = xcqVar7;
        this.f = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, short[] sArr) {
        this.h = i;
        this.g = xcqVar;
        this.b = xcqVar2;
        this.f = xcqVar3;
        this.e = xcqVar4;
        this.c = xcqVar5;
        this.d = xcqVar6;
        this.a = xcqVar7;
        this.i = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, boolean[] zArr) {
        this.h = i;
        this.c = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.f = xcqVar4;
        this.g = xcqVar5;
        this.e = xcqVar6;
        this.i = xcqVar7;
        this.a = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, byte[][] bArr) {
        this.h = i;
        this.f = xcqVar;
        this.d = xcqVar2;
        this.e = xcqVar3;
        this.i = xcqVar4;
        this.a = xcqVar5;
        this.c = xcqVar6;
        this.g = xcqVar7;
        this.b = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, char[][] cArr) {
        this.h = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.e = xcqVar4;
        this.f = xcqVar5;
        this.g = xcqVar6;
        this.d = xcqVar7;
        this.i = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, int[][] iArr) {
        this.h = i;
        this.i = xcqVar;
        this.e = xcqVar2;
        this.b = xcqVar3;
        this.d = xcqVar4;
        this.a = xcqVar5;
        this.f = xcqVar6;
        this.c = xcqVar7;
        this.g = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, short[][] sArr) {
        this.h = i;
        this.g = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
        this.d = xcqVar4;
        this.c = xcqVar5;
        this.f = xcqVar6;
        this.e = xcqVar7;
        this.i = xcqVar8;
    }

    public jbe(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, int i, boolean[][] zArr) {
        this.h = i;
        this.f = xcqVar;
        this.c = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.g = xcqVar5;
        this.d = xcqVar6;
        this.i = xcqVar7;
        this.b = xcqVar8;
    }
}
