package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eqq {
    public static eqw a(eqs eqsVar, eqw eqwVar, epp eppVar, List list) {
        String str = ((era) eqwVar).a;
        if (eqsVar.s(str)) {
            eqw eqwVarF = eqsVar.f(str);
            if (eqwVarF instanceof eqp) {
                return ((eqp) eqwVarF).a(eppVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", str));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(String.format("Object has no function %s", str));
        }
        epq.g("hasOwnProperty", 1, list);
        return eqsVar.s(eppVar.b.a(eppVar, (eqw) list.get(0)).i()) ? eqw.k : eqw.l;
    }

    public static Iterator b(Map map) {
        return new eqr(map.keySet().iterator());
    }
}
