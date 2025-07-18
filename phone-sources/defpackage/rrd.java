package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrd implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;
    private final xcq h;
    private final xcq i;
    private final xcq j;
    private final xcq k;
    private final xcq l;
    private final xcq m;
    private final xcq n;
    private final xcq o;
    private final xcq p;
    private final /* synthetic */ int q;

    public rrd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11, xcq xcqVar12, xcq xcqVar13, xcq xcqVar14, xcq xcqVar15, xcq xcqVar16, int i) {
        this.q = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.g = xcqVar7;
        this.h = xcqVar8;
        this.i = xcqVar9;
        this.j = xcqVar10;
        this.k = xcqVar11;
        this.l = xcqVar12;
        this.m = xcqVar13;
        this.n = xcqVar14;
        this.o = xcqVar15;
        this.p = xcqVar16;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        if (this.q != 0) {
            qjw qjwVar = (qjw) this.k.b();
            xcq xcqVar = this.a;
            xcq xcqVar2 = this.p;
            qnr qnrVarA = ((qoe) this.j).a();
            yil yilVarA = ((mdx) xcqVar2).a();
            rbi rbiVar = (rbi) xcqVar.b();
            xcq xcqVar3 = this.e;
            xcq xcqVar4 = this.n;
            xcq xcqVar5 = this.d;
            cb cbVarB = ((qle) this.o).b();
            qli qliVarB = ((qlj) xcqVar5).b();
            tst tstVarA = ((rmk) xcqVar4).a();
            qoj qojVar = (qoj) xcqVar3.b();
            xcq xcqVar6 = this.h;
            xcq xcqVar7 = this.m;
            return new qlc(qjwVar, qnrVarA, yilVarA, rbiVar, cbVarB, qliVarB, tstVarA, qojVar, ((rgq) this.c).a(), ((qln) xcqVar7).b(), (qjq) xcqVar6.b(), (qjv) this.l.b(), (qjm) this.b.b(), ((qkk) this.g).b(), (qei) this.i.b(), ((qld) this.f).b());
        }
        xcq xcqVar8 = this.b;
        yyh yyhVarB = ((rqe) this.a).b();
        Executor executor = (Executor) xcqVar8.b();
        Object obj = ((xcn) this.d).a;
        xcq xcqVar9 = this.c;
        xcq xcqVar10 = this.e;
        xbw xbwVarA = xcl.a(xcqVar9);
        tst tstVar = (tst) obj;
        cb cbVar = (cb) xcqVar10.b();
        rou rouVar = (rou) this.f.b();
        Object obj2 = ((xcn) this.m).a;
        xcq xcqVar11 = this.l;
        xcq xcqVar12 = this.k;
        ulp ulpVarB = ((rvj) this.g).b();
        lhr lhrVarB = ((rqw) xcqVar12).b();
        rvg rvgVarB = ((rqy) xcqVar11).b();
        tst tstVar2 = (tst) obj2;
        ulp ulpVarB2 = ((rrp) this.p).b();
        xcq xcqVar13 = this.o;
        xcq xcqVar14 = this.n;
        xcq xcqVar15 = this.j;
        return new rrc(yyhVarB, executor, xbwVarA, tstVar, cbVar, rouVar, ulpVarB, this.h, this.i, xcqVar15, lhrVarB, rvgVarB, tstVar2, xcqVar14, xcqVar13, ulpVarB2);
    }

    public rrd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11, xcq xcqVar12, xcq xcqVar13, xcq xcqVar14, xcq xcqVar15, xcq xcqVar16, int i, byte[] bArr) {
        this.q = i;
        this.k = xcqVar;
        this.j = xcqVar2;
        this.p = xcqVar3;
        this.a = xcqVar4;
        this.o = xcqVar5;
        this.d = xcqVar6;
        this.n = xcqVar7;
        this.e = xcqVar8;
        this.c = xcqVar9;
        this.m = xcqVar10;
        this.h = xcqVar11;
        this.l = xcqVar12;
        this.b = xcqVar13;
        this.g = xcqVar14;
        this.i = xcqVar15;
        this.f = xcqVar16;
    }
}
