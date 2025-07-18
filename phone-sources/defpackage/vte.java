package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vte {
    private static volatile int a = 100;
    public static final /* synthetic */ int g = 0;
    int b;
    int c;
    final int d = a;
    public int e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    vtf f;

    public static int I(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int J(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new vuq("CodedInputStream encountered a malformed varint.");
    }

    public static long K(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static vte L(InputStream inputStream) {
        return N(inputStream, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    public static vte M(byte[] bArr) {
        int length = bArr.length;
        return S(bArr, 0);
    }

    public static vte N(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? M(vuo.b) : new vtc(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static vte O(byte[] bArr, int i, int i2, boolean z) {
        vta vtaVar = new vta(bArr, i, i2, z);
        try {
            vtaVar.e(i2);
            return vtaVar;
        } catch (vuq e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static vte S(byte[] bArr, int i) {
        return O(bArr, 0, i, false);
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public abstract void H();

    public final void P() throws vuq {
        if (this.b + this.c >= this.d) {
            throw new vuq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void Q() {
        if (this.c == 0) {
            z(0);
        }
    }

    public final void R() throws vuq {
        int iM;
        do {
            iM = m();
            if (iM == 0) {
                return;
            }
            P();
            this.c++;
            this.c--;
        } while (E(iM));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract vsz w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
