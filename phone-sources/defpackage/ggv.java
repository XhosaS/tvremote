package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggv {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public ggv(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggv)) {
            return false;
        }
        ggv ggvVar = (ggv) obj;
        if (this.b != ggvVar.b || !yks.e(this.c, ggvVar.c) || !yks.e(this.d, ggvVar.d)) {
            return false;
        }
        String str = this.a;
        return ylh.ac(str, "index_") ? ylh.ac(ggvVar.a, "index_") : yks.e(str, ggvVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((ylh.ac(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        gez.D(this.c);
        ygi ygiVar = ygi.a;
        sb.append(ygiVar);
        sb.append("\n            |   orders = {");
        gez.C(this.d);
        sb.append(ygiVar);
        sb.append("\n            |}\n        ");
        return ylh.q(ylh.t(sb.toString()), "    ");
    }
}
