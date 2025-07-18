package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbu implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public kbu(kbm kbmVar, String str, yjk yjkVar, boolean z, bdy bdyVar, bcb bcbVar, int i) {
        this.g = i;
        this.b = kbmVar;
        this.c = str;
        this.d = yjkVar;
        this.a = z;
        this.e = bdyVar;
        this.f = bcbVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g == 0) {
            bao baoVar = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                baoVar.t();
            } else {
                Object obj3 = this.b;
                long j = kaf.b(this.e).a;
                Object obj4 = this.c;
                ?? r5 = this.d;
                boolean z = this.a;
                baoVar.x(5004770);
                Object obj5 = this.f;
                Object objG = baoVar.g();
                if (objG == ban.a) {
                    objG = new kah(obj5, 4);
                    baoVar.A(objG);
                }
                kbm kbmVar = (kbm) obj3;
                Object obj6 = objG;
                ovq ovqVar = kbmVar.n;
                baoVar.p();
                jyv.b(kbmVar.j, ovqVar, j, (String) obj4, r5, null, z, (yjv) obj6, baoVar, 12582912);
            }
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (baoVar2.L((iIntValue & 3) != 2, iIntValue & 1)) {
            Object obj7 = this.b;
            if (obj7 != null) {
                baoVar2.x(-864613220);
                Object obj8 = this.e;
                bcm.i(arr.a.c(new bnq(this.a ? ((aso) obj8).b : ((aso) obj8).e)), bga.k(1241781204, new aoq(obj7, 12), baoVar2), baoVar2, 56);
                baoVar2.p();
            } else {
                baoVar2.x(-864293207);
                baoVar2.p();
            }
            Object obj9 = this.e;
            boolean z2 = this.a;
            bcp bcpVar = arr.a;
            bcq bcqVarC = bcpVar.c(new bnq(z2 ? ((aso) obj9).a : ((aso) obj9).d));
            Object obj10 = this.d;
            bcm.i(bcqVarC, bga.k(-893579015, new ano(obj7, obj10, this.c, 3, (byte[]) null), baoVar2), baoVar2, 56);
            if (obj10 != null) {
                baoVar2.x(-863394951);
                aso asoVar = (aso) obj9;
                bcm.i(bcpVar.c(new bnq(z2 ? asoVar.c : asoVar.f)), bga.k(-782441013, new aoq(obj10, 13), baoVar2), baoVar2, 56);
                baoVar2.p();
            } else {
                baoVar2.x(-863072055);
                baoVar2.p();
            }
        } else {
            baoVar2.t();
        }
        return ygi.a;
    }

    public kbu(yjz yjzVar, aso asoVar, boolean z, yjz yjzVar2, zh zhVar, yjz yjzVar3, int i) {
        this.g = i;
        this.b = yjzVar;
        this.e = asoVar;
        this.a = z;
        this.d = yjzVar2;
        this.f = zhVar;
        this.c = yjzVar3;
    }
}
