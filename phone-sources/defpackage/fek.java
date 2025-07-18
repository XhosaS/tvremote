package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fek {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public fek(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fek fekVar = (fek) obj;
            if (this.a == fekVar.a && this.c == fekVar.c && this.d == fekVar.d && Arrays.equals(this.b, fekVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
