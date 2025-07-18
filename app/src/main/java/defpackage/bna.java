package defpackage;

import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bna implements brt, brs {
    public static final TreeMap a = new TreeMap();
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;

    public bna(int i) {
        int i2 = i + 1;
        this.g = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.e = new String[i2];
        this.f = new byte[i2][];
    }

    @Override // defpackage.brs
    public final void a(int i, byte[] bArr) {
        this.g[i] = 5;
        this.f[i] = bArr;
    }

    @Override // defpackage.brs
    public final void b(int i, double d) {
        this.g[i] = 3;
        this.d[i] = d;
    }

    @Override // defpackage.brs
    public final void c(int i, long j) {
        this.g[i] = 2;
        this.c[i] = j;
    }

    @Override // defpackage.brs
    public final void d(int i) {
        this.g[i] = 1;
    }

    @Override // defpackage.brs
    public final void e(int i, String str) {
        this.g[i] = 4;
        this.e[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
