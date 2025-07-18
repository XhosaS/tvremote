package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbi implements yka {
    final /* synthetic */ bcb a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public kbi(kbc kbcVar, bkp bkpVar, ixm ixmVar, gag gagVar, bcb bcbVar, int i) {
        this.f = i;
        this.d = kbcVar;
        this.b = bkpVar;
        this.c = ixmVar;
        this.e = gagVar;
        this.a = bcbVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjk] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.f == 0) {
            bao baoVar = (bao) obj2;
            ((Number) obj3).intValue();
            ((irc) obj).getClass();
            baoVar.x(-1633490746);
            Object obj4 = this.d;
            boolean zF = baoVar.F(obj4);
            Object objG = baoVar.g();
            if (zF || objG == ban.a) {
                objG = new jzu(obj4, this.a, 2);
                baoVar.A(objG);
            }
            ?? r2 = this.c;
            Object obj5 = this.b;
            Object obj6 = this.e;
            baoVar.p();
            jxl.j((ovq) obj6, (kca) obj5, r2, null, 0L, false, (yjv) objG, baoVar, 0);
            return ygi.a;
        }
        bao baoVar2 = (bao) obj2;
        ((Number) obj3).intValue();
        ((irc) obj).getClass();
        baoVar2.x(5004770);
        bcb bcbVar = this.a;
        boolean zF2 = baoVar2.F(bcbVar);
        Object objG2 = baoVar2.g();
        if (zF2 || objG2 == ban.a) {
            objG2 = new kah(bcbVar, 3);
            baoVar2.A(objG2);
        }
        Object obj7 = this.e;
        Object obj8 = this.c;
        ?? r1 = this.b;
        Object obj9 = this.d;
        baoVar2.p();
        kaz.c((kbc) obj9, r1, (ixm) obj8, (gag) obj7, (yjv) objG2, baoVar2, 4608);
        return ygi.a;
    }

    public kbi(ovq ovqVar, kca kcaVar, yjk yjkVar, yjv yjvVar, bcb bcbVar, int i) {
        this.f = i;
        this.e = ovqVar;
        this.b = kcaVar;
        this.c = yjkVar;
        this.d = yjvVar;
        this.a = bcbVar;
    }
}
