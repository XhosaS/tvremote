package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwz {
    public List a = null;

    public final void a(hwz hwzVar) {
        List list = hwzVar.a;
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList(list.size());
        }
        Iterator it = hwzVar.a.iterator();
        while (it.hasNext()) {
            this.a.add((hwy) it.next());
        }
    }

    public final String toString() {
        if (this.a == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(((hwy) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
