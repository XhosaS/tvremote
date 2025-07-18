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
public class dn {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public di d;

    final Bundle a(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }

    final bq b(String str) {
        dm dmVar = (dm) this.b.get(str);
        if (dmVar != null) {
            return dmVar.b;
        }
        return null;
    }

    public final bq c(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (dm dmVar : this.b.values()) {
                    if (dmVar != null) {
                        bq bqVar = dmVar.b;
                        if (bqVar.G == i) {
                            return bqVar;
                        }
                    }
                }
                return null;
            }
            bq bqVar2 = (bq) arrayList.get(size);
            if (bqVar2 != null && bqVar2.G == i) {
                return bqVar2;
            }
        }
    }

    public final bq d(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (dm dmVar : this.b.values()) {
                    if (dmVar != null) {
                        bq bqVar = dmVar.b;
                        if (str.equals(bqVar.I)) {
                            return bqVar;
                        }
                    }
                }
                return null;
            }
            bq bqVar2 = (bq) arrayList.get(size);
            if (bqVar2 != null && str.equals(bqVar2.I)) {
                return bqVar2;
            }
        }
    }

    final bq e(String str) {
        for (dm dmVar : this.b.values()) {
            if (dmVar != null) {
                bq bqVarE = dmVar.b;
                if (!str.equals(bqVarE.m)) {
                    bqVarE = bqVarE.E.b.e(str);
                }
                if (bqVarE != null) {
                    return bqVarE;
                }
            }
        }
        return null;
    }

    final dm f(String str) {
        return (dm) this.b.get(str);
    }

    final List g() {
        ArrayList arrayList = new ArrayList();
        for (dm dmVar : this.b.values()) {
            if (dmVar != null) {
                arrayList.add(dmVar);
            }
        }
        return arrayList;
    }

    final List h() {
        ArrayList arrayList = new ArrayList();
        for (dm dmVar : this.b.values()) {
            if (dmVar != null) {
                arrayList.add(dmVar.b);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List i() {
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

    final void j(bq bqVar) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(bqVar)) {
            Objects.toString(bqVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(bqVar)));
        }
        synchronized (arrayList) {
            arrayList.add(bqVar);
        }
        bqVar.s = true;
    }

    final void k() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void l(dm dmVar) {
        bq bqVar = dmVar.b;
        if (o(bqVar.m)) {
            return;
        }
        this.b.put(bqVar.m, dmVar);
        boolean z = bqVar.M;
        if (de.S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(bqVar)));
        }
    }

    final void m(dm dmVar) {
        bq bqVar = dmVar.b;
        if (bqVar.L) {
            this.d.d(bqVar);
        }
        HashMap map = this.b;
        if (map.get(bqVar.m) == dmVar && ((dm) map.put(bqVar.m, null)) != null && de.S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(bqVar)));
        }
    }

    final void n(bq bqVar) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(bqVar);
        }
        bqVar.s = false;
    }

    final boolean o(String str) {
        return this.b.get(str) != null;
    }
}
