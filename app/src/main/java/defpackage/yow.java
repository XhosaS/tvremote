package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yow {
    public static final zdy a = zdy.h("com/google/audio/hearing/common/CircularByteBuffer");
    public final byte[] b;
    public final int c;
    private int f = 0;
    public long d = 0;
    public final ArrayList e = new ArrayList();

    public yow(int i) {
        this.b = new byte[i];
        this.c = i;
    }

    public final synchronized long a() {
        return this.d;
    }

    public final synchronized boolean b(byte[] bArr, int i) {
        int i2 = this.c;
        if (i > i2) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i3 = this.f;
        if (i3 + i <= i2) {
            System.arraycopy(bArr, 0, this.b, i3, i);
        } else {
            int i4 = i2 - i3;
            byte[] bArr2 = this.b;
            System.arraycopy(bArr, 0, bArr2, i3, i4);
            System.arraycopy(bArr, i4, bArr2, 0, i - i4);
        }
        this.f = (this.f + i) % i2;
        this.d += i;
        return true;
    }
}
