package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkl extends ykt implements yjz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkl(Object obj, int i) {
        super(2);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bao, java.lang.Object] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                bkp bkpVar = (bkp) obj;
                bkp bkpVarB = (bkn) obj2;
                if (bkpVarB instanceof bkk) {
                    yka ykaVar = ((bkk) bkpVarB).a;
                    ylh.d(ykaVar, 3);
                    ?? r0 = this.a;
                    bkpVarB = bdi.B(r0, (bkp) ykaVar.a(bkp.g, r0, 0));
                }
                return bkpVar.a(bkpVarB);
            case 1:
                lx lxVar = (lx) obj;
                lx lxVar2 = (lx) obj2;
                lx lxVar3 = lx.c;
                return Boolean.valueOf(lxVar == lxVar3 && lxVar2 == lxVar3 && !((mg) this.a).b.e);
            case 2:
                ((blj) this.a).h(((Number) obj).intValue(), (cff) obj2);
                return ygi.a;
            case 3:
                return Float.valueOf(fh.R((bwi) obj, true, (bwp[]) this.a, ((Number) obj2).floatValue()));
            case 4:
                return Float.valueOf(fh.R((bwi) obj, false, (bwp[]) this.a, ((Number) obj2).floatValue()));
            case 5:
                ((bww) this.a).a().b = (baw) obj2;
                return ygi.a;
            case 6:
                bvp bvpVarA = ((bww) this.a).a();
                ((bys) obj).W(new bvl(bvpVarA, (yjz) obj2, bvpVarA.k));
                return ygi.a;
            case 7:
                bys bysVar = (bys) obj;
                bvp bvpVar = bysVar.v;
                Object obj3 = this.a;
                if (bvpVar == null) {
                    bvp bvpVar2 = new bvp(bysVar, ((bww) obj3).a);
                    bysVar.v = bvpVar2;
                    bvpVar = bvpVar2;
                }
                bww bwwVar = (bww) obj3;
                bwwVar.b = bvpVar;
                bwwVar.a().i();
                bvp bvpVarA2 = bwwVar.a();
                bwz bwzVar = bwwVar.a;
                if (bvpVarA2.c != bwzVar) {
                    bvpVarA2.c = bwzVar;
                    bvpVarA2.j(false);
                    bys.aq(bvpVarA2.a, false, 7);
                }
                return ygi.a;
            case 8:
                return Float.valueOf(fh.R((bwi) obj, true, (bwp[]) this.a, ((Number) obj2).floatValue()));
            case 9:
                return Float.valueOf(fh.R((bwi) obj, false, (bwp[]) this.a, ((Number) obj2).floatValue()));
            case 10:
                bao baoVar = (bao) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (baoVar.L((iIntValue & 3) != 2, iIntValue & 1)) {
                    ((can) this.a).a(baoVar, 0);
                } else {
                    baoVar.t();
                }
                return ygi.a;
            default:
                bao baoVar2 = (bao) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                int i = iIntValue2 & 3;
                if (baoVar2.L(i != 2, iIntValue2 & 1)) {
                    bkm bkmVar = bkp.g;
                    Object objG = baoVar2.g();
                    if (objG == ban.a) {
                        objG = ccu.k;
                        baoVar2.A(objG);
                    }
                    cqv.z(cfd.b(bkmVar, false, (yjv) objG), (yjz) this.a.a(), baoVar2, 0);
                } else {
                    baoVar2.t();
                }
                return ygi.a;
        }
    }
}
