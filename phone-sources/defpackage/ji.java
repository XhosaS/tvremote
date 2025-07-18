package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ji {
    public long[] a;
    public int b;

    public ji() {
        this((byte[]) null);
    }

    public final void a(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (length * 3) / 2));
            jArrCopyOf.getClass();
            this.a = jArrCopyOf;
        }
    }

    public final void b(long j) {
        a(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ji) {
            ji jiVar = (ji) obj;
            int i = jiVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = jiVar.a;
                ymd ymdVarR = ykn.r(0, i2);
                int i3 = ymdVarR.a;
                int i4 = ymdVarR.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iK = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iK += a.k(jArr[i2]) * 31;
        }
        return iK;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public ji(int i) {
        this.a = i == 0 ? jm.a : new long[i];
    }

    public /* synthetic */ ji(byte[] bArr) {
        this(16);
    }
}
