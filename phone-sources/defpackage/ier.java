package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ier {
    final String[] a;
    final String b;

    public ier(String[] strArr, String str) {
        str.getClass();
        this.b = str;
        strArr.getClass();
        this.a = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ier)) {
            return false;
        }
        ier ierVar = (ier) obj;
        return Arrays.equals(this.a, ierVar.a) && this.b.equals(ierVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SqlRequest{arguments=" + Arrays.toString(this.a) + ", sql='" + this.b + "'}";
    }
}
