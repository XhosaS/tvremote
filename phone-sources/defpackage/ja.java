package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ja {
    public int[] a;
    public int b;

    public ja() {
        this((byte[]) null);
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            kv.c("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            kv.d("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
    }

    public final void d(int i) {
        c(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.b) {
            kv.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i != i3 - 1) {
            yfm.bh(iArr, iArr, i, i + 1, i3);
        }
        this.b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ja) {
            ja jaVar = (ja) obj;
            int i = jaVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = jaVar.a;
                ymd ymdVarR = ykn.r(0, i2);
                int i3 = ymdVarR.a;
                int i4 = ymdVarR.b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            kv.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public ja(int i) {
        this.a = i == 0 ? jf.a : new int[i];
    }

    public /* synthetic */ ja(byte[] bArr) {
        this(16);
    }
}
