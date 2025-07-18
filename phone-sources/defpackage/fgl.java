package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgl extends fgi {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public fgl(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgl fglVar = (fgl) obj;
            if (this.a == fglVar.a && this.b == fglVar.b && this.c == fglVar.c && Arrays.equals(this.d, fglVar.d) && Arrays.equals(this.e, fglVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}
