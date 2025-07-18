package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvm extends cvi implements Closeable, AutoCloseable {
    public static final /* synthetic */ int c = 0;
    private final String d;
    private cwa e;

    static {
        new csr(cvi.b, new kw(3));
    }

    public cvm() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public cvm(int i, int i2, long j, String str) {
        this.d = str;
        this.e = new cwa(i, i2, j, str);
    }
}
