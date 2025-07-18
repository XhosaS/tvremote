package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class peo implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public peo(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new pen(((pet) this.a).b());
            case 1:
                return new pel((pea) this.a.b());
            case 2:
                return new peb(new pei((pea) this.a.b(), new pep(2)));
            case 3:
                return new rbi(new peq((pea) this.a.b(), 3));
            case 4:
                return new rbi(new peq((pea) this.a.b(), 2));
            case 5:
                return new rbi(new peq((pea) this.a.b(), 4));
            case 6:
                return new rbi(new peq((pea) this.a.b(), 0));
            case 7:
                return new kwy((smc) this.a.b());
            case 8:
                return ((pez) this.a).b();
            case 9:
                return ((pfb) this.a).b();
            case 10:
                return Long.valueOf(((qit) this.a).a().booleanValue() ? xgp.a.get().b() : xgp.a.get().c());
            case 11:
                return new mht((mif) ((mhj) this.a).b().a, 2);
            case 12:
                return new mht((mif) ((mhk) this.a).b().a, 1);
            case 13:
                return new mht((mif) ((mhl) this.a).b().a, 3);
            case 14:
                return new mht((mif) ((mhm) this.a).b().a, 0);
            case 15:
                pjd pjdVar = (pjd) ((tst) ((xcn) this.a).a).e(new pjd(4, null));
                int i = pjdVar.b;
                a.H(i == 4 || i == 3);
                return new pkh(pjdVar);
            case 16:
                Object obj = ((pkg) this.a.b()).b;
                obj.getClass();
                return obj;
            case 17:
                return new pkg((pkg) this.a.b());
            case 18:
                return new plw();
            case 19:
                return new pnh(new png(1), ((xco) this.a).b());
            default:
                tvn tvnVar = pne.a;
                return new jzs(((xcj) this.a).a, new pno(1));
        }
    }
}
