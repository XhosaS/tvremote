package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lkh implements iej {
    final /* synthetic */ lkm a;

    public lkh(lkm lkmVar) {
        this.a = lkmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.iej
    public final void dM() {
        lvi lviVarE;
        lvh lvhVar;
        List list;
        lkm lkmVar = this.a;
        Object obj = lkmVar.E.c;
        if (obj != null) {
            lkmVar.g(new lik(lkmVar, obj, 4));
            return;
        }
        if (lkmVar.F == null && (list = lkmVar.q) != null) {
            List list2 = lkmVar.r;
            List list3 = lkmVar.s;
            int size = list.size() / 2;
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                ArrayList arrayList2 = new ArrayList(2);
                int i2 = i + i;
                arrayList2.add((lvd) list.get(i2));
                arrayList2.add((lvd) list.get(i2 + 1));
                if (i == 0) {
                    lvg lvgVarA = lvh.a();
                    lvgVarA.e(arrayList2);
                    lvgVarA.b(list3);
                    lvgVarA.f(list2);
                    lvgVarA.d(2);
                    arrayList.add(lvgVarA.a());
                } else {
                    lvg lvgVarA2 = lvh.a();
                    lvgVarA2.e(arrayList2);
                    int iAS = a.aS(((lvd) arrayList2.get(0)).b.r);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i3 = iAS - 1;
                    lvgVarA2.d(i3 != 0 ? i3 != 1 ? i3 != 2 ? 3 : 2 : 1 : 0);
                    arrayList.add(lvgVarA2.a());
                }
            }
            lkmVar.F = new zuw((List) arrayList, 0);
        }
        zuw zuwVar = lkmVar.F;
        if (zuwVar != null) {
            lkmVar.F = zuwVar.l();
        }
        zuw zuwVar2 = lkmVar.F;
        if (zuwVar2 == null) {
            rek rekVarB = lvi.b();
            rekVarB.h(lkmVar.m);
            rekVarB.f(lkmVar.m);
            lviVarE = rekVarB.e();
            lvhVar = null;
        } else if (zuwVar2.b.size() == 1) {
            lvh lvhVarI = lkmVar.F.i();
            int i4 = ((lvd) lvhVarI.a.get(0)).b.m;
            if (i4 > 0) {
                lkmVar.m = i4;
            }
            rek rekVarB2 = lvi.b();
            rekVarB2.h(lkmVar.m);
            rekVarB2.f(lkmVar.m);
            lvhVar = lvhVarI;
            lviVarE = rekVarB2.e();
        } else {
            llw llwVar = lkmVar.g;
            int iE = lkmVar.F.e(llwVar.j() ? llwVar.k() : llx.a(lkmVar.o, lkmVar.p));
            lvh lvhVar2 = (lvh) lkmVar.F.b.get(iE);
            rek rekVarB3 = lvi.b();
            zuw zuwVar3 = lkmVar.F;
            rekVarB3.h(zuwVar3.f(zuwVar3.b.size()));
            rekVarB3.g(lkmVar.F.f(iE));
            rekVarB3.f(lkmVar.F.f(iE + 1));
            lvi lviVarE2 = rekVarB3.e();
            int i5 = lkmVar.n;
            zuw zuwVar4 = lkmVar.F;
            lkmVar.n = i5 + (zuwVar4.f(zuwVar4.a) / 1000);
            lviVarE = lviVarE2;
            lvhVar = lvhVar2;
        }
        lkmVar.z = new llr(lkmVar.j, lkmVar.k, lkmVar.l, lviVarE, lkmVar.o, lkmVar.p, lkmVar.n, lvhVar, lkmVar.t, lkmVar.u, lkmVar.v, lkmVar.w, lkmVar.x, lkmVar.y, lkmVar.A, false, ImmutableMap.of());
        lkmVar.g(new ljl(lkmVar, 2, null));
    }
}
