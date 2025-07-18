package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uql {
    static final Object[] a;
    static final uql b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new uql(objArr);
    }

    public uql(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uql)) {
            return false;
        }
        uql uqlVar = (uql) obj;
        return this.d == uqlVar.d && Arrays.equals(this.c, uqlVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
