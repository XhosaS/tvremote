package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzg extends ykt implements yjv {
    private final /* synthetic */ int v;
    public static final bzg u = new bzg(20);
    public static final bzg t = new bzg(19);
    public static final bzg s = new bzg(18);
    public static final bzg r = new bzg(17);
    public static final bzg q = new bzg(16);
    public static final bzg p = new bzg(15);
    public static final bzg o = new bzg(14);
    public static final bzg n = new bzg(13);
    public static final bzg m = new bzg(12);
    public static final bzg l = new bzg(11);
    public static final bzg k = new bzg(10);
    public static final bzg j = new bzg(9);
    public static final bzg i = new bzg(8);
    public static final bzg h = new bzg(7);
    public static final bzg g = new bzg(6);
    public static final bzg f = new bzg(5);
    public static final bzg e = new bzg(4);
    public static final bzg d = new bzg(3);
    public static final bzg c = new bzg(2);
    public static final bzg b = new bzg(1);
    public static final bzg a = new bzg(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzg(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        switch (this.v) {
            case 0:
                ((bxm) obj).h().d = false;
                return ygi.a;
            case 1:
                ((bxm) obj).h().c = false;
                return ygi.a;
            case 2:
                bxm bxmVar = (bxm) obj;
                bxmVar.h().e = bxmVar.h().d;
                return ygi.a;
            case 3:
                ((bxm) obj).h().c = false;
                return ygi.a;
            case 4:
                bzx bzxVar = ((bzq) obj).C;
                if (bzxVar != null) {
                    bzxVar.invalidate();
                }
                return ygi.a;
            case 5:
                bzq bzqVar = (bzq) obj;
                if (bzqVar.v() && bzq.ax(bzqVar)) {
                    bys bysVar = bzqVar.s;
                    byw bywVar = bysVar.u;
                    if (bywVar.k > 0) {
                        if (bywVar.j || bywVar.i) {
                            bysVar.S(false);
                        }
                        bywVar.o.B();
                    }
                    bzz bzzVarA = byv.a(bysVar);
                    ((cbc) bzzVarA).m.d(bysVar);
                    bzzVarA.y(bysVar);
                }
                return ygi.a;
            case 6:
                bzu bzuVar = (bzu) obj;
                if (bzuVar.v()) {
                    bzuVar.b.l();
                }
                return ygi.a;
            case 7:
                obj.getClass();
                return Boolean.valueOf(!((caa) obj).v());
            case 8:
                bys bysVar2 = (bys) obj;
                if (bysVar2.af()) {
                    bysVar2.S(false);
                }
                return ygi.a;
            case 9:
                bys bysVar3 = (bys) obj;
                if (bysVar3.af()) {
                    bysVar3.S(false);
                }
                return ygi.a;
            case 10:
                bys bysVar4 = (bys) obj;
                if (bysVar4.af()) {
                    bysVar4.R(false);
                }
                return ygi.a;
            case 11:
                bys bysVar5 = (bys) obj;
                if (bysVar5.af()) {
                    bysVar5.R(false);
                }
                return ygi.a;
            case 12:
                bys bysVar6 = (bys) obj;
                if (bysVar6.af()) {
                    bys.ao(bysVar6, false, 7);
                }
                return ygi.a;
            case 13:
                bys bysVar7 = (bys) obj;
                if (bysVar7.af()) {
                    bys.aq(bysVar7, false, 7);
                }
                return ygi.a;
            case 14:
                bys bysVar8 = (bys) obj;
                if (bysVar8.af()) {
                    bysVar8.H();
                }
                return ygi.a;
            case 15:
                return ygi.a;
            case 16:
                return true;
            case 17:
                return false;
            case 18:
                cfc cfcVarP = ((bys) obj).p();
                return Boolean.valueOf(cfcVarP != null && cfcVarP.a);
            case 19:
                return Boolean.valueOf(((bys) obj).t.j(8));
            default:
                cfc cfcVarP2 = ((bys) obj).p();
                return Boolean.valueOf(cfcVarP2 != null && cfcVarP2.a && cfcVarP2.f(cfi.E));
        }
    }
}
