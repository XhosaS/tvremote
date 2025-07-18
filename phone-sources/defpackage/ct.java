package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ct extends dwt {
    public static final dwx a = new dxu(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public ct(boolean z) {
        this.e = z;
    }

    public final void a(bv bvVar) {
        if (this.g) {
            return;
        }
        HashMap map = this.b;
        if (map.containsKey(bvVar.mWho)) {
            return;
        }
        map.put(bvVar.mWho, bvVar);
        if (cr.Y(2)) {
            Objects.toString(bvVar);
        }
    }

    public final void b(bv bvVar, boolean z) {
        if (cr.Y(3)) {
            Objects.toString(bvVar);
        }
        c(bvVar.mWho, z);
    }

    public final void c(String str, boolean z) {
        HashMap map = this.c;
        ct ctVar = (ct) map.get(str);
        if (ctVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ctVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ctVar.c((String) arrayList.get(i), true);
                }
            }
            ctVar.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        dxc dxcVar = (dxc) map2.get(str);
        if (dxcVar != null) {
            dxcVar.c();
            map2.remove(str);
        }
    }

    @Override // defpackage.dwt
    protected final void d() {
        if (cr.Y(3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(bv bvVar) {
        if (this.g || this.b.remove(bvVar.mWho) == null || !cr.Y(2)) {
            return;
        }
        Objects.toString(bvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ct ctVar = (ct) obj;
            if (this.b.equals(ctVar.b) && this.c.equals(ctVar.c) && this.d.equals(ctVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(bv bvVar) {
        if (this.b.containsKey(bvVar.mWho) && this.e) {
            return this.f;
        }
        return true;
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
