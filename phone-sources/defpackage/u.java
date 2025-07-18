package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class u implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    public final void a(t tVar) {
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = tVar.a;
            if (str.equals(((t) it.next()).a)) {
                throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(str)));
            }
        }
        list.add(tVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (t tVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(tVar);
        }
        return sb.toString();
    }
}
