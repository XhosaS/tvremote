package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kev implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public kev(awu awuVar, boolean z, bol bolVar, bdy bdyVar, int i) {
        this.e = i;
        this.c = awuVar;
        this.a = z;
        this.d = bolVar;
        this.b = bdyVar;
    }

    public static final String b(bdy bdyVar) {
        return (String) bdyVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        int i = this.e;
        if (i == 0) {
            bao baoVar = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                baoVar.t();
            } else {
                Object obj3 = this.b;
                kew kewVar = kew.a;
                baoVar.x(5004770);
                Object obj4 = this.c;
                boolean zF = baoVar.F(obj4);
                Object objG = baoVar.g();
                if (zF || objG == ban.a) {
                    objG = new keu(obj4, 0);
                    baoVar.A(objG);
                }
                baoVar.p();
                kewVar.a((String) obj3, (yjk) objG, this.a, this.d, baoVar, 24576);
            }
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (baoVar2.L((iIntValue & 3) != 2, iIntValue & 1)) {
                Object obj5 = this.c;
                boolean z = this.a;
                boolean zBooleanValue = ((Boolean) this.b.a()).booleanValue();
                if (z) {
                    awu awuVar = (awu) obj5;
                    j = zBooleanValue ? awuVar.d : awuVar.e;
                } else {
                    j = ((awu) obj5).f;
                }
                final bdy bdyVarK = fh.k(j, wv.F(5, baoVar2), baoVar2);
                xo.b(bga.t(bkp.g, new afk(this.d, new aum(new ykx(bdyVarK) { // from class: aua
                    @Override // defpackage.ykx
                    public final Object b() {
                        return ((bdy) this.e).a();
                    }
                }), 20, null)), baoVar2, 0);
            } else {
                baoVar2.t();
            }
            return ygi.a;
        }
        if (i == 2) {
            bao baoVar3 = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
                baoVar3.t();
            } else {
                Object obj6 = this.d;
                kfh kfhVar = (kfh) obj6;
                bdy bdyVarI = dad.i(kfhVar.b, baoVar3);
                bdy bdyVarI2 = dad.i(kfhVar.c, baoVar3);
                Object obj7 = this.b;
                bhq bhqVarK = bga.k(1911204326, new awe(obj6, obj7, this.c, (Object) bdyVarI, 3), baoVar3);
                baoVar3.x(5004770);
                boolean zH = baoVar3.H(obj7);
                Object objG2 = baoVar3.g();
                if (zH || objG2 == ban.a) {
                    objG2 = new keu(obj7, 7);
                    baoVar3.A(objG2);
                }
                baoVar3.p();
                boolean z2 = this.a;
                kff.e(bhqVarK, (yjk) objG2, null, z2, bga.k(1876629226, new kfg(kfhVar, (SearchQueryPageActivity) obj7, z2, bdyVarI, bdyVarI2), baoVar3), baoVar3, 24582);
            }
            return ygi.a;
        }
        if (i != 3) {
            bao baoVar4 = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar4.K()) {
                baoVar4.t();
            } else {
                ?? r1 = this.c;
                Object obj8 = this.b;
                boolean z3 = this.a;
                Object obj9 = this.d;
                kik kikVar = kik.a;
                boolean zBooleanValue2 = ((Boolean) r1.a()).booleanValue();
                baoVar4.x(5004770);
                boolean zF2 = baoVar4.F(r1);
                Object objG3 = baoVar4.g();
                if (zF2 || objG3 == ban.a) {
                    objG3 = new kih(r1, 3);
                    baoVar4.A(objG3);
                }
                baoVar4.p();
                kikVar.i((kgv) obj8, z3, (kiq) obj9, zBooleanValue2, (yjk) objG3, null, baoVar4, 1573376);
            }
            return ygi.a;
        }
        bao baoVar5 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar5.K()) {
            baoVar5.t();
        } else {
            ?? r12 = this.c;
            Object obj10 = this.b;
            boolean z4 = this.a;
            Object obj11 = this.d;
            kik kikVar2 = kik.a;
            boolean zBooleanValue3 = ((Boolean) r12.a()).booleanValue();
            baoVar5.x(5004770);
            boolean zF3 = baoVar5.F(r12);
            Object objG4 = baoVar5.g();
            if (zF3 || objG4 == ban.a) {
                objG4 = new kih(r12, 2);
                baoVar5.A(objG4);
            }
            baoVar5.p();
            kikVar2.i((kgv) obj10, z4, (kiq) obj11, zBooleanValue3, (yjk) objG4, null, baoVar5, 1573376);
        }
        return ygi.a;
    }

    public kev(String str, aid aidVar, boolean z, yjk yjkVar, int i) {
        this.e = i;
        this.b = str;
        this.c = aidVar;
        this.a = z;
        this.d = yjkVar;
    }

    public kev(kfh kfhVar, SearchQueryPageActivity searchQueryPageActivity, boolean z, kej kejVar, int i) {
        this.e = i;
        this.d = kfhVar;
        this.b = searchQueryPageActivity;
        this.a = z;
        this.c = kejVar;
    }

    public kev(kgv kgvVar, boolean z, kiq kiqVar, bcb bcbVar, int i) {
        this.e = i;
        this.b = kgvVar;
        this.a = z;
        this.d = kiqVar;
        this.c = bcbVar;
    }
}
