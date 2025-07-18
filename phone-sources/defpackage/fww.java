package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fww extends dwt {
    public final Map a = new LinkedHashMap();

    public final void a(String str) {
        dxc dxcVar = (dxc) this.a.remove(str);
        if (dxcVar != null) {
            dxcVar.c();
        }
    }

    @Override // defpackage.dwt
    protected final void d() {
        Map map = this.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((dxc) it.next()).c();
        }
        map.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        String string = Long.toString(System.identityHashCode(this) & 4294967295L, 16);
        string.getClass();
        sb.append(string);
        sb.append("} ViewModelStores (");
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
