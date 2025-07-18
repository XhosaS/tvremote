package defpackage;

import android.os.HandlerThread;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkt {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public hkt() {
        this.b = new byte[256];
        this.a = 0;
    }

    public final int a() {
        try {
            return ((ByteBuffer) this.c).get() & 255;
        } catch (Exception unused) {
            ((hks) this.d).b = 1;
            return 0;
        }
    }

    public final int b() {
        return ((ByteBuffer) this.c).getShort();
    }

    public final void c() {
        int iA = a();
        this.a = iA;
        if (iA <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.a;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                ((ByteBuffer) this.c).get((byte[]) this.b, i, i3);
                i += i3;
            } catch (Exception unused) {
                ((hks) this.d).b = 1;
                return;
            }
        }
    }

    public final void d() {
        int iA;
        do {
            iA = a();
            ((ByteBuffer) this.c).position(Math.min(((ByteBuffer) this.c).position() + iA, ((ByteBuffer) this.c).limit()));
        } while (iA > 0);
    }

    public final boolean e() {
        return ((hks) this.d).b != 0;
    }

    public final int[] f(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            ((ByteBuffer) this.c).get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = bArr[i3] & 255;
                    int i6 = i3 + 2;
                    i3 += 3;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i4] & 255) << 8) | (i5 << 16) | (-16777216) | (bArr[i6] & 255);
                    i2 = i7;
                } catch (BufferUnderflowException unused) {
                    ((hks) this.d).b = 1;
                    return iArr;
                }
            }
            return iArr;
        } catch (BufferUnderflowException unused2) {
            iArr = null;
        }
    }

    public final void g() {
        Object obj;
        synchronized (this.b) {
            a.ab(this.a > 0);
            int i = this.a - 1;
            this.a = i;
            if (i == 0 && (obj = this.d) != null) {
                ((HandlerThread) obj).quit();
                this.d = null;
                this.c = null;
            }
        }
    }

    public hkt(byte[] bArr) {
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.a = 0;
    }
}
