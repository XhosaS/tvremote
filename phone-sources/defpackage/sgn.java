package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgn implements Serializable {
    private static final long serialVersionUID = 1;
    public final List a = new ArrayList();

    public final void a(sgm sgmVar) {
        sgmVar.getClass();
        this.a.add(sgmVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sgn) {
            return a.au(((sgn) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                sb.append(" (leaf->root)");
                return sb.toString();
            }
            if (i > 0) {
                sb.append("->");
            }
            sb.append(((sgm) list.get(i)).a.a);
            i++;
        }
    }
}
