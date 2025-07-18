package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class css {
    public static final css a = new css("COMPOSITION");
    public cst b;
    private final List c;

    private css(css cssVar) {
        this.c = new ArrayList(cssVar.c);
        this.b = cssVar.b;
    }

    private final boolean g() {
        return ((String) this.c.get(r0.size() - 1)).equals("**");
    }

    public final int a(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.c;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() + (-1) && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final css b(String str) {
        css cssVar = new css(this);
        cssVar.c.add(str);
        return cssVar;
    }

    public final css c(cst cstVar) {
        css cssVar = new css(this);
        cssVar.b = cstVar;
        return cssVar;
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
        if ("__container".equals(str)) {
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
        css cssVar = (css) obj;
        if (!this.c.equals(cssVar.c)) {
            return false;
        }
        cst cstVar = this.b;
        return cstVar != null ? cstVar.equals(cssVar.b) : cssVar.b == null;
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
        cst cstVar = this.b;
        return iHashCode + (cstVar != null ? cstVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        cst cstVar = this.b;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(cstVar != null);
        sb.append("}");
        return sb.toString();
    }

    public css(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
