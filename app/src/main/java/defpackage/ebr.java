package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ebr {
    public float c;
    public Map a = null;
    public ArrayList b = null;
    public long d = 0;

    protected abstract float a(long j);

    public final int d() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    protected final ebr e() {
        if (d() <= 1) {
            return f("default_input");
        }
        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
    }

    protected final ebr f(String str) {
        String strE;
        ebr ebrVarG = g(str);
        if (ebrVarG != null) {
            return ebrVarG;
        }
        Map map = this.a;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            String strConcat = "";
            while (it.hasNext()) {
                strConcat = strConcat + "'" + ((String) it.next()) + "'";
                if (!it.hasNext()) {
                    strConcat = strConcat.concat(", ");
                }
            }
            strE = a.e(strConcat, "[", "]");
        } else {
            strE = "[]";
        }
        throw new RuntimeException(a.s(strE, str, "Tried to get non-existent input '", "'. Node only has these inputs: "));
    }

    public final ebr g(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return (ebr) map.get(str);
    }

    final Collection h() {
        Map map = this.a;
        return map == null ? Collections.EMPTY_SET : map.values();
    }

    public final void i(String str) {
        Map map = this.a;
        if (map == null || map.remove(str) == null) {
            throw new RuntimeException("Tried to remove non-existent input with name: ".concat(String.valueOf(str)));
        }
    }

    public final void j(ebr ebrVar) {
        if (!this.b.remove(ebrVar)) {
            throw new RuntimeException("Tried to remove non-existent input!");
        }
    }
}
