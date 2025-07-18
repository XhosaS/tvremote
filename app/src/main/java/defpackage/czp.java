package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czp {
    public ByteBuffer b;
    public czo c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final int a() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void b() {
        int iA = a();
        this.d = iA;
        if (iA <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d, e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    public final void c() {
        int iA;
        do {
            iA = a();
            this.b.position(Math.min(this.b.position() + iA, this.b.limit()));
        } while (iA > 0);
    }

    public final boolean d() {
        return this.c.b != 0;
    }

    public final int[] e(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.b.get(bArr);
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
                } catch (BufferUnderflowException e) {
                    e = e;
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
                    }
                    this.c.b = 1;
                    return iArr;
                }
            }
            return iArr;
        } catch (BufferUnderflowException e2) {
            e = e2;
            iArr = null;
        }
    }
}
