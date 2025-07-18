package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epp {
    public final epp a;
    public final ere b;
    final Map c = new HashMap();
    final Map d = new HashMap();

    public epp(epp eppVar, ere ereVar) {
        this.a = eppVar;
        this.b = ereVar;
    }

    public final epp a() {
        return new epp(this, this.b);
    }

    public final eqw b(eql eqlVar) {
        eqw eqwVarA = eqw.f;
        Iterator itK = eqlVar.k();
        while (itK.hasNext()) {
            eqwVarA = this.b.a(this, eqlVar.e(((Integer) itK.next()).intValue()));
            if (eqwVarA instanceof eqn) {
                break;
            }
        }
        return eqwVarA;
    }

    public final eqw c(String str) {
        Map map = this.c;
        if (map.containsKey(str)) {
            return (eqw) map.get(str);
        }
        epp eppVar = this.a;
        if (eppVar != null) {
            return eppVar.c(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void d(String str, eqw eqwVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (eqwVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, eqwVar);
        }
    }

    public final void e(String str, eqw eqwVar) {
        d(str, eqwVar);
        this.d.put(str, true);
    }

    public final void f(String str, eqw eqwVar) {
        epp eppVar;
        Map map = this.c;
        if (!map.containsKey(str) && (eppVar = this.a) != null && eppVar.g(str)) {
            eppVar.f(str, eqwVar);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (eqwVar == null) {
                map.remove(str);
            } else {
                map.put(str, eqwVar);
            }
        }
    }

    public final boolean g(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        epp eppVar = this.a;
        if (eppVar != null) {
            return eppVar.g(str);
        }
        return false;
    }
}
