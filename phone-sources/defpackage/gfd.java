package defpackage;

import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfd implements ghq, ghp {
    public static final TreeMap a = new TreeMap();
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public int g;
    private volatile String h;

    public gfd(int i) {
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    @Override // defpackage.ghp
    public final void a(int i, byte[] bArr) {
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // defpackage.ghp
    public final void b(int i, double d) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    @Override // defpackage.ghp
    public final void c(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    @Override // defpackage.ghp
    public final void d(int i) {
        this.f[i] = 1;
    }

    @Override // defpackage.ghp
    public final void e(int i, String str) {
        this.f[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.ghq
    public final String f() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ghq
    public final void g(ghp ghpVar) {
        int i = this.g;
        if (i <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f[i2];
            if (i3 == 1) {
                ghpVar.d(i2);
            } else if (i3 == 2) {
                ghpVar.c(i2, this.b[i2]);
            } else if (i3 == 3) {
                ghpVar.b(i2, this.c[i2]);
            } else if (i3 == 4) {
                String str = this.d[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ghpVar.e(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.e[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ghpVar.a(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void h(String str, int i) {
        this.h = str;
        this.g = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
