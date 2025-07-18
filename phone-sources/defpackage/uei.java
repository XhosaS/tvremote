package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uei implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final uei b = new uei(new int[0]);
    private final int[] c;
    private final int d;

    public uei(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.d = length;
    }

    public final int a(int i) {
        sij.B(i, this.d);
        return this.c[i];
    }

    public final boolean b() {
        return this.d == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uei)) {
            return false;
        }
        uei ueiVar = (uei) obj;
        int i = this.d;
        if (i != ueiVar.d) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (a(i2) != ueiVar.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return b() ? b : this;
    }

    public final String toString() {
        if (b()) {
            return "[]";
        }
        int i = this.d;
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.c;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int[] iArr = this.c;
        int i = this.d;
        return i < iArr.length ? new uei(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
