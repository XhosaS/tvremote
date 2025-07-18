package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvy implements idf {
    private final lzh a;
    private final long b;
    private final idf c;

    public lvy(lzh lzhVar, long j, idf idfVar) {
        this.a = lzhVar;
        this.b = j;
        this.c = idfVar;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) throws vuq {
        boolean z;
        HashMap map;
        sro sroVar = (sro) obj;
        Object obj2 = sroVar.e;
        Object obj3 = sroVar.d;
        String str = ((String) obj2) + ".1." + ((String) obj3) + "." + String.valueOf(sroVar.c) + ".res";
        cui cuiVar = new cui(str, Integer.valueOf(sroVar.a));
        ieg iegVarA = this.a.a(cuiVar);
        boolean z2 = false;
        HashMap map2 = null;
        if (iegVarA.m()) {
            try {
                xag xagVar = (xag) iegVarA.g();
                HashMap map3 = new HashMap();
                for (xax xaxVar : xagVar.c) {
                    xaz xazVar = xaxVar.c;
                    if (xazVar == null) {
                        xazVar = xaz.a;
                    }
                    if (xazVar.d.isEmpty()) {
                        throw new vuq("Stored AssetResource has no MID");
                    }
                    xaz xazVar2 = xaxVar.c;
                    if (xazVar2 == null) {
                        xazVar2 = xaz.a;
                    }
                    map3.put(xazVar2.d, xaxVar);
                }
                z2 = true;
                map2 = map3;
            } catch (IOException e) {
                krd.d("Error reconstructing stored knowledge component ".concat(str), e);
                int i = sroVar.a;
                ieg iegVarE = this.a.e(cuiVar);
                if (iegVarE.k()) {
                    krd.d(a.cy(i, str, "Error deleting file ", " from storage "), iegVarE.i());
                }
            }
        }
        if (z2) {
            ieg iegVarB = this.a.b(cuiVar);
            if (iegVarB.m()) {
                z = z2;
                map = map2;
                if (System.currentTimeMillis() < ((Long) iegVarB.g()).longValue() + this.b) {
                    return ieg.a(map);
                }
            } else {
                z = z2;
                map = map2;
                krd.d("Error getting last modified timestamp of file " + str + " from storage " + sroVar.a, iegVarB.i());
            }
        } else {
            z = z2;
            map = map2;
        }
        Object obj4 = iegVarA.m() ? ((xag) iegVarA.g()).c : Collections.EMPTY_LIST;
        ieg iegVar = (ieg) this.c.b(new kuw(sroVar.d, sroVar.b));
        if (!iegVar.m()) {
            Throwable thI = iegVar.i();
            if (!(thI instanceof mfr) || ((mfr) thI).a / 100 != 4) {
                return z ? ieg.a(map) : ieg.b(thI);
            }
            int i2 = sroVar.a;
            ieg iegVarE2 = this.a.e(cuiVar);
            if (iegVarE2.k()) {
                krd.d(a.cy(i2, str, "Error deleting file ", " from storage "), iegVarE2.i());
            }
            return ieg.b(thI);
        }
        List<xax> list = (List) iegVar.g();
        HashMap map4 = new HashMap();
        try {
            for (xax xaxVar2 : list) {
                xaz xazVar3 = xaxVar2.c;
                if (xazVar3 == null) {
                    xazVar3 = xaz.a;
                }
                if (xazVar3.d.isEmpty()) {
                    throw new vuq("Stored AssetResource has no MID");
                }
                xaz xazVar4 = xaxVar2.c;
                if (xazVar4 == null) {
                    xazVar4 = xaz.a;
                }
                map4.put(xazVar4.d, xaxVar2);
            }
            if (z && list.equals(obj4)) {
                ieg iegVarF = this.a.f(cuiVar);
                if (iegVarF.k()) {
                    krd.d("Error saving response for " + str + " on storage " + sroVar.a, iegVarF.i());
                    iegVarF.p();
                    return iegVarF;
                }
            } else {
                lzh lzhVar = this.a;
                ieg iegVarE3 = lzhVar.e(cuiVar);
                if (iegVarE3.k()) {
                    krd.d("Error saving response for " + str + " on storage " + sroVar.a, iegVarE3.i());
                    iegVarE3.p();
                    return iegVarE3;
                }
                vtw vtwVarM = xag.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                xag xagVar2 = (xag) vtwVarM.b;
                vun vunVar = xagVar2.c;
                if (!vunVar.c()) {
                    xagVar2.c = vuc.s(vunVar);
                }
                vsf.h(list, xagVar2.c);
                ieg iegVarC = lzhVar.c(cuiVar, (xag) vtwVarM.r());
                if (iegVarC.k()) {
                    krd.d("Error saving response for " + str + " on storage " + sroVar.a, iegVarC.i());
                    iegVarC.p();
                    return iegVarC;
                }
            }
            return ieg.a(map4);
        } catch (IOException e2) {
            return z ? ieg.a(map) : ieg.b(e2);
        }
    }
}
