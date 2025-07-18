package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cff {
    public final bko a;
    public final bys b;
    public final cfc c;
    public boolean d;
    public final int e;
    private final boolean f;
    private cff g;

    public cff(bko bkoVar, boolean z, bys bysVar, cfc cfcVar) {
        this.a = bkoVar;
        this.f = z;
        this.b = bysVar;
        this.c = cfcVar;
        this.e = bysVar.c;
    }

    public static /* synthetic */ List m(cff cffVar, boolean z, int i) {
        return cffVar.l((i & 1) != 0 ? !cffVar.f : false, z & ((i & 2) == 0));
    }

    private final cff p(cez cezVar, yjv yjvVar) {
        int i;
        int i2;
        cfc cfcVar = new cfc();
        cfcVar.a = false;
        cfcVar.b = false;
        yjvVar.a(cfcVar);
        cfe cfeVar = new cfe(yjvVar);
        if (cezVar != null) {
            i = this.e;
            i2 = 1000000000;
        } else {
            i = this.e;
            i2 = 2000000000;
        }
        cff cffVar = new cff(cfeVar, false, new bys(true, i + i2), cfcVar);
        cffVar.d = true;
        cffVar.g = this;
        return cffVar;
    }

    private final void q(List list, cfc cfcVar) {
        if (this.c.b) {
            return;
        }
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            cff cffVar = (cff) list.get(size2);
            if (!cffVar.r()) {
                cfcVar.d(cffVar.c);
                cffVar.q(list, cfcVar);
            }
        }
    }

    private final boolean r() {
        return this.f && this.c.a;
    }

    private final void s(bys bysVar, List list) {
        bfz bfzVarH = bysVar.h();
        Object[] objArr = bfzVarH.a;
        int i = bfzVarH.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            if (bysVar2.af() && !bysVar2.z) {
                if (bysVar2.t.j(8)) {
                    list.add(ccf.s(bysVar2, this.f));
                } else {
                    s(bysVar2, list);
                }
            }
        }
    }

    private final void t(List list, List list2) {
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            cff cffVar = (cff) list.get(size2);
            if (cffVar.r()) {
                list2.add(cffVar);
            } else if (!cffVar.c.b) {
                cffVar.t(list, list2);
            }
        }
    }

    public final long a() {
        bzq bzqVarE = e();
        if (bzqVarE == null) {
            return 0L;
        }
        if (true != bzqVarE.s()) {
            bzqVarE = null;
        }
        if (bzqVarE != null) {
            return bty.q(bzqVarE);
        }
        return 0L;
    }

    public final long b() {
        bzq bzqVarE = e();
        if (bzqVarE != null) {
            return bzqVarE.c;
        }
        return 0L;
    }

    public final bmy c() {
        bzq bzqVarE = e();
        if (bzqVarE != null) {
            if (true != bzqVarE.s()) {
                bzqVarE = null;
            }
            if (bzqVarE != null) {
                return bty.u(bzqVarE);
            }
        }
        return bmy.a;
    }

    public final bmy d() {
        bzq bzqVarE = e();
        if (bzqVarE != null) {
            if (true != bzqVarE.s()) {
                bzqVarE = null;
            }
            if (bzqVarE != null) {
                return bty.v(bzqVarE);
            }
        }
        return bmy.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final bzq e() {
        cae caeVar = null;
        if (this.d) {
            cff cffVarH = h();
            if (cffVarH != null) {
                return cffVarH.e();
            }
            return null;
        }
        bys bysVar = this.b;
        bzm bzmVar = bysVar.t;
        if ((bzmVar.a() & 8) != 0) {
            cae caeVar2 = null;
            loop0: for (bko bkoVar = bzmVar.f; bkoVar != null; bkoVar = bkoVar.u) {
                if ((bkoVar.r & 8) != 0) {
                    ?? bfzVar = 0;
                    bxw bxwVarF = bkoVar;
                    while (bxwVarF != 0) {
                        if (bxwVarF instanceof cae) {
                            cae caeVar3 = (cae) bxwVarF;
                            caeVar3.z();
                            if (caeVar3.q()) {
                                caeVar = caeVar3;
                                break loop0;
                            }
                            if (caeVar2 == null) {
                                caeVar2 = caeVar3;
                            }
                        } else if ((bxwVarF.r & 8) != 0 && (bxwVarF instanceof bxw)) {
                            bko bkoVar2 = bxwVarF.C;
                            int i = 0;
                            bxwVarF = bxwVarF;
                            bfzVar = bfzVar;
                            while (bkoVar2 != null) {
                                if ((bkoVar2.r & 8) != 0) {
                                    i++;
                                    bfzVar = bfzVar;
                                    if (i == 1) {
                                        bxwVarF = bkoVar2;
                                    } else {
                                        if (bfzVar == 0) {
                                            bfzVar = new bfz(new bko[16], 0);
                                        }
                                        if (bxwVarF != 0) {
                                            bfzVar.o(bxwVarF);
                                        }
                                        bfzVar.o(bkoVar2);
                                        bxwVarF = 0;
                                    }
                                }
                                bkoVar2 = bkoVar2.u;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bxwVarF = fh.F(bfzVar);
                    }
                }
                if ((bkoVar.s & 8) == 0) {
                    break;
                }
            }
            caeVar = caeVar2;
        }
        return caeVar != null ? fh.J(caeVar, 8) : bysVar.n();
    }

    public final cfc f() {
        if (!r()) {
            return this.c;
        }
        cfc cfcVarA = this.c.a();
        q(new ArrayList(), cfcVarA);
        return cfcVarA;
    }

    public final cff g() {
        return new cff(this.a, true, this.b, this.c);
    }

    public final cff h() {
        bys bysVarJ;
        cff cffVar = this.g;
        if (cffVar != null) {
            return cffVar;
        }
        boolean z = this.f;
        if (z) {
            bysVarJ = this.b.j();
            while (bysVarJ != null) {
                cfc cfcVarP = bysVarJ.p();
                if (cfcVarP != null && cfcVarP.a) {
                    break;
                }
                bysVarJ = bysVarJ.j();
            }
            bysVarJ = null;
        } else {
            bysVarJ = null;
        }
        if (bysVarJ == null) {
            bysVarJ = this.b.j();
            while (true) {
                if (bysVarJ == null) {
                    bysVarJ = null;
                    break;
                }
                if (bysVarJ.t.j(8)) {
                    break;
                }
                bysVarJ = bysVarJ.j();
            }
        }
        if (bysVarJ == null) {
            return null;
        }
        return ccf.s(bysVarJ, z);
    }

    public final List i() {
        return m(this, false, 7);
    }

    public final List j() {
        return m(this, true, 4);
    }

    public final boolean k() {
        if (this.d || !j().isEmpty()) {
            return false;
        }
        bys bysVarJ = this.b.j();
        while (true) {
            if (bysVarJ == null) {
                bysVarJ = null;
                break;
            }
            cfc cfcVarP = bysVarJ.p();
            if (cfcVarP != null && cfcVarP.a) {
                break;
            }
            bysVarJ = bysVarJ.j();
        }
        return bysVarJ == null;
    }

    public final List l(boolean z, boolean z2) {
        if (!z && this.c.b) {
            return yhb.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!r()) {
            return n(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        t(arrayList, arrayList2);
        return arrayList2;
    }

    public final List n(List list, boolean z) {
        if (this.d) {
            return yhb.a;
        }
        s(this.b, list);
        if (z) {
            cfc cfcVar = this.c;
            cez cezVar = (cez) ccf.t(cfcVar, cfi.x);
            if (cezVar != null && cfcVar.a && !list.isEmpty()) {
                list.add(p(cezVar, new cbq(cezVar, 7)));
            }
            cfm cfmVar = cfi.a;
            if (cfcVar.f(cfmVar) && !list.isEmpty() && cfcVar.a) {
                List list2 = (List) ccf.t(cfcVar, cfmVar);
                String str = list2 != null ? (String) yfm.U(list2) : null;
                if (str != null) {
                    list.add(0, p(null, new cbq(str, 8)));
                }
            }
        }
        return list;
    }
}
