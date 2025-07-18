package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class she {
    public String a;
    public aagg b;
    public final Context c;
    final Map d = new HashMap();
    public final Map e = new HashMap();
    public final shc f;
    public int g;
    public int h;
    private final shd i;
    private final unx j;

    public she(unx unxVar, Context context, shc shcVar, shd shdVar) {
        this.j = unxVar;
        this.c = context;
        this.f = shcVar;
        this.i = shdVar;
    }

    private final void d(sgi sgiVar) {
        Integer num;
        unx unxVar = this.j;
        if (unxVar == null || TextUtils.isEmpty(this.a)) {
            return;
        }
        shd shdVar = this.i;
        if (shdVar == null || shdVar.a()) {
            Set<shc> setF = unxVar.f();
            SystemClock.elapsedRealtimeNanos();
            new Bundle();
            for (shc shcVar : setF) {
            }
            for (shc shcVar2 : setF) {
                if (sgiVar instanceof shg) {
                    shg shgVar = (shg) sgiVar;
                    sgk sgkVar = shgVar.a;
                    vtw vtwVarM = ual.a.m();
                    List<sgm> list = sgkVar.b.a;
                    for (sgm sgmVar : list) {
                        vuc vucVar = vtwVarM.b;
                        if ((((ual) vucVar).b & 1) != 0) {
                            int i = sgmVar.a.a;
                            if (!vucVar.A()) {
                                vtwVarM.u();
                            }
                            ual ualVar = (ual) vtwVarM.b;
                            vuj vujVar = ualVar.e;
                            if (!vujVar.c()) {
                                ualVar.e = vuc.q(vujVar);
                            }
                            ualVar.e.g(i);
                        } else {
                            int i2 = sgmVar.a.a;
                            if (!vucVar.A()) {
                                vtwVarM.u();
                            }
                            ual ualVar2 = (ual) vtwVarM.b;
                            ualVar2.b |= 1;
                            ualVar2.c = i2;
                        }
                        if ((((ual) vtwVarM.b).b & 2) == 0 && (sgmVar instanceof siu) && (num = ((siu) sgmVar).b) != null) {
                            int iIntValue = num.intValue();
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            ual ualVar3 = (ual) vtwVarM.b;
                            ualVar3.b |= 2;
                            ualVar3.d = iIntValue;
                        }
                    }
                    int i3 = sgkVar.a;
                    if (i3 != -1) {
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ual ualVar4 = (ual) vtwVarM.b;
                        int iAz = sfy.az(i3);
                        int i4 = iAz - 1;
                        if (iAz == 0) {
                            throw null;
                        }
                        ualVar4.f = i4;
                        ualVar4.b |= 4;
                    }
                    vtw vtwVarM2 = aagn.a.m();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    aagn aagnVar = (aagn) vtwVarM2.b;
                    ual ualVar5 = (ual) vtwVarM.r();
                    ualVar5.getClass();
                    aagnVar.c = ualVar5;
                    aagnVar.b |= 1;
                    sgm sgmVar2 = (sgm) list.get(0);
                    if (sgmVar2 instanceof siu) {
                        if (!TextUtils.isEmpty(null)) {
                            if (!vtwVarM2.b.A()) {
                                vtwVarM2.u();
                            }
                            throw null;
                        }
                    }
                    boolean z = shgVar.c;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    aagn aagnVar2 = (aagn) vtwVarM2.b;
                    aagnVar2.b |= 4;
                    aagnVar2.d = z;
                    vtw vtwVarM3 = aagh.a.m();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    aagh aaghVar = (aagh) vtwVarM3.b;
                    aagn aagnVar3 = (aagn) vtwVarM2.r();
                    aagnVar3.getClass();
                    aaghVar.c = aagnVar3;
                    aaghVar.b |= 1;
                    aagg aaggVar = shgVar.b;
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    aagh aaghVar2 = (aagh) vtwVarM3.b;
                    aaggVar.getClass();
                    aaghVar2.e = aaggVar;
                    aaghVar2.b |= 4;
                    shcVar2.a((aagh) vtwVarM3.r());
                } else if (sgiVar instanceof shf) {
                    shf shfVar = (shf) sgiVar;
                    vtw vtwVarM4 = aagh.a.m();
                    aagj aagjVar = shfVar.a;
                    if (!vtwVarM4.b.A()) {
                        vtwVarM4.u();
                    }
                    vuc vucVar2 = vtwVarM4.b;
                    aagh aaghVar3 = (aagh) vucVar2;
                    aagjVar.getClass();
                    aaghVar3.d = aagjVar;
                    aaghVar3.b |= 2;
                    aagg aaggVar2 = shfVar.b;
                    if (!vucVar2.A()) {
                        vtwVarM4.u();
                    }
                    aagh aaghVar4 = (aagh) vtwVarM4.b;
                    aaggVar2.getClass();
                    aaghVar4.e = aaggVar2;
                    aaghVar4.b |= 4;
                    shcVar2.a((aagh) vtwVarM4.r());
                }
            }
            SystemClock.elapsedRealtimeNanos();
        }
    }

    public final void a(aagj aagjVar) {
        d(new shf(this.a, aagjVar, this.b));
    }

    public final void b(int i, shh shhVar) {
        sgn sgnVar = shhVar.a;
        sgk sgkVar = new sgk(i, sgnVar);
        sgkVar.c = this.a;
        boolean z = false;
        sgp sgpVar = ((sgm) sgnVar.a.get(0)).a;
        Map map = this.e;
        if (map.containsKey(sgpVar)) {
            Set set = (Set) map.get(sgpVar);
            Integer numValueOf = Integer.valueOf(i);
            if (!set.contains(numValueOf)) {
                ((Set) map.get(sgpVar)).add(numValueOf);
            }
            sgi shgVar = new shg(this.a, sgkVar, this.b, z);
            d(sgkVar);
            d(shgVar);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        map.put(sgpVar, hashSet);
        z = true;
        sgi shgVar2 = new shg(this.a, sgkVar, this.b, z);
        d(sgkVar);
        d(shgVar2);
    }

    public final shi c(String str) {
        Map map = this.d;
        shi shiVar = (shi) map.get(str);
        if (shiVar != null) {
            return shiVar;
        }
        shi shiVar2 = new shi();
        map.put(str, shiVar2);
        return shiVar2;
    }
}
