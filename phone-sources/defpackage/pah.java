package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pah implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final /* synthetic */ int d;

    public pah(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i) {
        this.d = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.d) {
            case 0:
                return new pag(((rgq) this.a).a(), (pfs) this.b.b(), (oyi) this.c.b());
            case 1:
                xcq xcqVar = this.c;
                return new ozy(((rgq) this.a).a(), ((owy) this.b).b(), (oyi) xcqVar.b());
            case 2:
                return new paq((Map) ((xcn) this.a).a, this.c, (uhs) this.b.b(), new osk());
            case 3:
                return new piw((owz) this.a.b(), (tst) ((xcn) this.c).a, ((mdx) this.b).a());
            case 4:
                xcq xcqVar2 = this.c;
                return new pjo(((rgq) this.a).a(), this.b, (uhs) xcqVar2.b());
            case 5:
                return new pnb((lia) this.c.b(), ((pmn) this.b).b(), (uhs) this.a.b());
            case 6:
                xcq xcqVar3 = this.a;
                return new pnm(this.b, this.c, xcqVar3);
            case 7:
                qbd qbdVar = (qbd) this.c.b();
                ((qoe) this.b).a();
                ((mdx) this.a).a();
                return new ocv(qbdVar);
            case 8:
                this.b.getClass();
                xcq xcqVar4 = this.c;
                xcqVar4.getClass();
                this.a.getClass();
                return ((ptq) xcqVar4).b();
            case 9:
                this.b.getClass();
                xcq xcqVar5 = this.c;
                xcqVar5.getClass();
                this.a.getClass();
                return ((puc) xcqVar5).b();
            case 10:
                return new aafi((qei) this.a.b(), (pyg) this.c.b(), (qmt) ((qnj) this.b).b(), (byte[]) null);
            case 11:
                qei qeiVar = (qei) this.a.b();
                pyg pygVar = (pyg) this.c.b();
                ((qnj) this.b).b();
                return new ocv(qeiVar, pygVar);
            case 12:
                return new aafi((qei) this.a.b(), (pyg) this.c.b(), (qmt) ((qnj) this.b).b());
            case 13:
                return new aafi((qei) this.a.b(), (qjq) this.c.b(), (qmt) ((qnj) this.b).b());
            case 14:
                pzz pzzVar = new pzz((pyd) this.c.b());
                pzzVar.a = ((qoe) this.b).a();
                pzzVar.b = ((xco) this.a).b();
                return pzzVar;
            case 15:
                qab qabVar = new qab((pyd) this.c.b());
                qabVar.a = ((qoe) this.b).a();
                qabVar.b = ((xco) this.a).b();
                return qabVar;
            case 16:
                qag qagVar = new qag((pyd) this.c.b());
                qagVar.a = ((qoe) this.b).a();
                qagVar.b = ((xco) this.a).b();
                return qagVar;
            case 17:
                xcq xcqVar6 = this.c;
                xcq xcqVar7 = this.a;
                Context contextA = ((rgq) this.b).a();
                xbw xbwVarA = xcl.a(xcqVar7);
                return new qas(contextA, xbwVarA);
            case 18:
                xcq xcqVar8 = this.a;
                return new qbx(((rgq) this.c).a(), ((pxa) this.b).b(), (pvg) xcqVar8.b());
            case 19:
                return new qcg(((rgq) this.a).a(), (qei) this.c.b(), ((pxa) this.b).b());
            default:
                return new qci((qbr) this.b.b(), ((pxa) this.c).b(), (pvg) this.a.b());
        }
    }

    public pah(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, char[] cArr) {
        this.d = i;
        this.a = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
    }

    public pah(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, float[] fArr) {
        this.d = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
    }

    public pah(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
    }

    public pah(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
    }
}
