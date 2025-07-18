package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smz {
    static final Object[] a;
    static final smz b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new smz(objArr);
    }

    public smz(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof smz)) {
            return false;
        }
        smz smzVar = (smz) obj;
        return this.d == smzVar.d && Arrays.equals(this.c, smzVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
