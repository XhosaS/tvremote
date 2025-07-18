package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eqp implements eqw, eqs {
    public final String d;
    protected final Map e = new HashMap();

    public eqp(String str) {
        this.d = str;
    }

    public abstract eqw a(epp eppVar, List list);

    @Override // defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        return "toString".equals(str) ? new era(this.d) : eqq.a(this, new era(str), eppVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqp)) {
            return false;
        }
        eqp eqpVar = (eqp) obj;
        String str = this.d;
        if (str != null) {
            return str.equals(eqpVar.d);
        }
        return false;
    }

    @Override // defpackage.eqs
    public final eqw f(String str) {
        Map map = this.e;
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
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.eqw
    public final String i() {
        return this.d;
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return eqq.b(this.e);
    }

    @Override // defpackage.eqs
    public final void q(String str, eqw eqwVar) {
        if (eqwVar == null) {
            this.e.remove(str);
        } else {
            this.e.put(str, eqwVar);
        }
    }

    @Override // defpackage.eqs
    public final boolean s(String str) {
        return this.e.containsKey(str);
    }

    @Override // defpackage.eqw
    public eqw d() {
        return this;
    }
}
