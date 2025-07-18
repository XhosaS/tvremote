package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hed {
    public static final hed a = new hed("COMPOSITION");
    public hee b;
    private final List c;

    private hed(hed hedVar) {
        this.c = new ArrayList(hedVar.c);
        this.b = hedVar.b;
    }

    private final boolean g() {
        return ((String) this.c.get(r0.size() - 1)).equals("**");
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i) {
        if (h(str)) {
            return 0;
        }
        List list = this.c;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() + (-1) && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final hed b(String str) {
        hed hedVar = new hed(this);
        hedVar.c.add(str);
        return hedVar;
    }

    public final hed c(hee heeVar) {
        hed hedVar = new hed(this);
        hedVar.b = heeVar;
        return hedVar;
    }

    public final boolean d(String str, int i) {
        List list = this.c;
        if (i >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        String str2 = (String) list.get(i);
        if (!str2.equals("**")) {
            return (i == size || (i == list.size() + (-2) && g())) && (str2.equals(str) || str2.equals("*"));
        }
        if (i == size) {
            return true;
        }
        int i2 = i + 1;
        if (((String) list.get(i2)).equals(str)) {
            if (i != list.size() - 2) {
                return i == list.size() + (-3) && g();
            }
            return true;
        }
        if (i2 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i2)).equals(str);
    }

    public final boolean e(String str, int i) {
        if (h(str)) {
            return true;
        }
        List list = this.c;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hed hedVar = (hed) obj;
        if (!this.c.equals(hedVar.c)) {
            return false;
        }
        hee heeVar = this.b;
        return heeVar != null ? heeVar.equals(hedVar.b) : hedVar.b == null;
    }

    public final boolean f(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.c;
        return i < list.size() + (-1) || ((String) list.get(i)).equals("**");
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        hee heeVar = this.b;
        return iHashCode + (heeVar != null ? heeVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        hee heeVar = this.b;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(heeVar != null);
        sb.append("}");
        return sb.toString();
    }

    public hed(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
