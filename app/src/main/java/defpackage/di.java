package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class di extends beb {
    public static final beg a = new dh();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public di(boolean z) {
        this.e = z;
    }

    private final void g(String str, boolean z) {
        HashMap map = this.c;
        di diVar = (di) map.get(str);
        if (diVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(diVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    diVar.b((String) arrayList.get(i), true);
                }
            }
            diVar.c();
            map.remove(str);
        }
        HashMap map2 = this.d;
        bel belVar = (bel) map2.get(str);
        if (belVar != null) {
            belVar.c();
            map2.remove(str);
        }
    }

    final void a(bq bqVar, boolean z) {
        if (de.S(3)) {
            Objects.toString(bqVar);
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(bqVar)));
        }
        g(bqVar.m, z);
    }

    final void b(String str, boolean z) {
        if (de.S(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(String.valueOf(str)));
        }
        g(str, z);
    }

    @Override // defpackage.beb
    protected final void c() {
        if (de.S(3)) {
            toString();
            Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f = true;
    }

    final void d(bq bqVar) {
        if (this.g) {
            if (de.S(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(bqVar.m) == null || !de.S(2)) {
                return;
            }
            Objects.toString(bqVar);
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(bqVar)));
        }
    }

    final boolean e(bq bqVar) {
        if (this.b.containsKey(bqVar.m) && this.e) {
            return this.f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            di diVar = (di) obj;
            if (this.b.equals(diVar.b) && this.c.equals(diVar.c) && this.d.equals(diVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
