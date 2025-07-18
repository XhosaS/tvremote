package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tir extends tiu {
    public final Set a;
    public final Set b;
    public int c;

    public tir() {
        super(4);
        this.c = 1;
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
    }

    public final Set a() {
        return new LinkedHashSet(this.a);
    }

    public final Set b() {
        return new LinkedHashSet(this.b);
    }

    public final void c(tiq tiqVar) {
        this.a.add(tiqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tir)) {
            return false;
        }
        tir tirVar = (tir) obj;
        return this.c == tirVar.c && this.a.equals(tirVar.a) && this.b.equals(tirVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.a, this.b);
    }

    @Override // defpackage.tiu
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((Object) sip.k(this.d));
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
        sb.append((Object) sip.l(this.c));
        sb.append("]");
        return sb.toString();
    }
}
