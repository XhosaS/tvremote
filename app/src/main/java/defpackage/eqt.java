package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqt implements eqw, eqs {
    public final Map a = new HashMap();

    @Override // defpackage.eqw
    public eqw cK(String str, epp eppVar, List list) {
        return "toString".equals(str) ? new era(toString()) : eqq.a(this, new era(str), eppVar, list);
    }

    @Override // defpackage.eqw
    public final eqw d() {
        eqt eqtVar = new eqt();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof eqs) {
                eqtVar.a.put((String) entry.getKey(), (eqw) entry.getValue());
            } else {
                eqtVar.a.put((String) entry.getKey(), ((eqw) entry.getValue()).d());
            }
        }
        return eqtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eqt) {
            return this.a.equals(((eqt) obj).a);
        }
        return false;
    }

    @Override // defpackage.eqs
    public final eqw f(String str) {
        Map map = this.a;
        return map.containsKey(str) ? (eqw) map.get(str) : f;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        return true;
    }

    @Override // defpackage.eqw
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.eqw
    public final String i() {
        return "[object Object]";
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return eqq.b(this.a);
    }

    @Override // defpackage.eqs
    public final void q(String str, eqw eqwVar) {
        if (eqwVar == null) {
            this.a.remove(str);
        } else {
            this.a.put(str, eqwVar);
        }
    }

    @Override // defpackage.eqs
    public final boolean s(String str) {
        return this.a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        Map map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
