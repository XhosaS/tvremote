package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqe {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public bqe(String str, boolean z, List list, List list2) {
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
        if (!(obj instanceof bqe)) {
            return false;
        }
        bqe bqeVar = (bqe) obj;
        if (this.b != bqeVar.b || !agvy.c(this.c, bqeVar.c) || !agvy.c(this.d, bqeVar.d)) {
            return false;
        }
        String str = this.a;
        return str.startsWith("index_") ? bqeVar.a.startsWith("index_") : agvy.c(str, bqeVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        bqi.d(this.c);
        agpu agpuVar = agpu.a;
        sb.append(agpuVar);
        sb.append("\n            |   orders = {");
        bqi.c(this.d);
        sb.append(agpuVar);
        sb.append("\n            |}\n        ");
        return agyv.c(agyv.d(sb.toString()));
    }
}
