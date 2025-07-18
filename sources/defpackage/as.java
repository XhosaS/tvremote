package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class as {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ao d;

    final Bundle a(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }

    final q b(String str) {
        ar arVar = (ar) this.b.get(str);
        if (arVar != null) {
            return arVar.a;
        }
        return null;
    }

    final q c(String str) {
        for (ar arVar : this.b.values()) {
            if (arVar != null) {
                q qVarC = arVar.a;
                if (!str.equals(qVarC.g)) {
                    qVarC = qVarC.y.b.c(str);
                }
                if (qVarC != null) {
                    return qVarC;
                }
            }
        }
        return null;
    }

    final ar d(String str) {
        return (ar) this.b.get(str);
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (ar arVar : this.b.values()) {
            if (arVar != null) {
                arrayList.add(arVar);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList = new ArrayList();
        for (ar arVar : this.b.values()) {
            if (arVar != null) {
                arrayList.add(arVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List g() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void h(q qVar) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(qVar)) {
            Objects.toString(qVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(qVar)));
        }
        synchronized (arrayList) {
            arrayList.add(qVar);
        }
        qVar.m = true;
    }

    final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void j(ar arVar) {
        q qVar = arVar.a;
        if (m(qVar.g)) {
            return;
        }
        this.b.put(qVar.g, arVar);
        boolean z = qVar.G;
        if (am.S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(qVar)));
        }
    }

    final void k(ar arVar) {
        q qVar = arVar.a;
        if (qVar.F) {
            this.d.d(qVar);
        }
        HashMap map = this.b;
        if (map.get(qVar.g) == arVar && ((ar) map.put(qVar.g, null)) != null && am.S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(qVar)));
        }
    }

    final void l(q qVar) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(qVar);
        }
        qVar.m = false;
    }

    final boolean m(String str) {
        return this.b.get(str) != null;
    }
}
