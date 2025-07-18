package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blu extends blx {
    public final Set a;
    public final Set b;
    public int c;

    public blu() {
        super(4);
        this.c = 1;
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
    }

    public final void a(blt bltVar) {
        this.b.add(bltVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blu)) {
            return false;
        }
        blu bluVar = (blu) obj;
        return this.c == bluVar.c && this.a.equals(bluVar.a) && this.b.equals(bluVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.a, this.b);
    }

    @Override // defpackage.blx
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((Object) aju.g(this.d));
        sb.append(" inputs=");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append(" outputs=");
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(",");
            }
        }
        sb.append(" pref=");
        sb.append((Object) aju.h(this.c));
        sb.append("]");
        return sb.toString();
    }
}
