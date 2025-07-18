package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lti implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public lti(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new hfx((ksz) this.a.b(), (byte[]) null);
            case 1:
                return new kdh((ksz) this.a.b());
            case 2:
                return new hfx((ksz) this.a.b(), (byte[]) null);
            case 3:
                return new hfx(((rgq) this.a).a(), (byte[]) null);
            case 4:
                return new lxe(((xcj) this.a).a);
            case 5:
                idf idfVar = (idf) this.a.b();
                idh idhVarD = idh.d();
                idhVarD.e(idfVar);
                return idhVarD.b(new jxt(new ltu(11), 8));
            case 6:
                idf idfVar2 = (idf) this.a.b();
                idh idhVarD2 = idh.d();
                idhVarD2.e(new lxq(14));
                idhVarD2.e(idfVar2);
                return idhVarD2.b(new jxt(new lbj(new ltu(12), 18), 8));
            case 7:
                lxl lxlVarY = ktw.y(((rgq) this.a).a());
                return new ksz(lxlVarY.a, lxlVarY.b, lxlVarY.c, lxlVarY.d, lxlVarY.e, lxlVarY.f, lxlVarY.g, lxlVarY.h);
            case 8:
                lxl lxlVarY2 = ktw.y(((rgq) this.a).a());
                return new kta(lxlVarY2.a, lxlVarY2.b, lxlVarY2.c, lxlVarY2.d, lxlVarY2.e, lxlVarY2.f, lxlVarY2.h);
            case 9:
                lys lysVar = (lys) this.a.b();
                lysVar.getClass();
                return new lxt(lysVar, 10);
            case 10:
                return new kuw((lys) this.a.b());
            case 11:
                return new lzc((lyz) this.a.b());
            case 12:
                return new lzj((lfn) this.a.b());
            case 13:
                return new lhw(((lzr) this.a).b(), 2);
            case 14:
                return new lzh(new leq(), new lxt(((rgq) this.a).a(), 13));
            case 15:
                return new lzh(new lfc((vvq) lck.a.a(7, null), lck.class), new lxt(((rgq) this.a).a(), 11));
            case 16:
                return new hx((isy) this.a.b(), 5);
            case 17:
                return new lhw(((mbu) this.a).b(), 3);
            case 18:
                return new mcv((lyz) this.a.b());
            case 19:
                return new mdc((kuw) this.a.b());
            default:
                return new hfx((lor) this.a.b(), null, null);
        }
    }
}
