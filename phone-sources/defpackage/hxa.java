package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxa {
    public List a = null;
    public int b = 0;

    public final int a() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final hxb b(int i) {
        return (hxb) this.a.get(i);
    }

    public final void c() {
        this.b += 100;
    }

    public final boolean d() {
        List list = this.a;
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((hxb) it.next());
            sb.append(' ');
        }
        sb.append('(');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
