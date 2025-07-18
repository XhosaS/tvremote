package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aace implements Serializable {
    private static aace a = null;
    private static final long serialVersionUID = 2274324892792009998L;
    private final String b = "Years";
    private final aabw[] c;

    static {
        new HashMap(32);
    }

    protected aace(aabw[] aabwVarArr) {
        this.c = aabwVarArr;
    }

    public static aace a() {
        aace aaceVar = a;
        if (aaceVar != null) {
            return aaceVar;
        }
        aace aaceVar2 = new aace(new aabw[]{aabw.d});
        a = aaceVar2;
        return aaceVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aace) {
            return Arrays.equals(this.c, ((aace) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (int i = 0; i <= 0; i++) {
            iHashCode += this.c[i].hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return "PeriodType[" + this.b + "]";
    }
}
