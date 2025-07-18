package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egu extends BufferedOutputStream {
    private boolean a;

    public egu(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        a.ab(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        String str = edt.a;
        throw th;
    }

    public egu(OutputStream outputStream, byte[] bArr) {
        super(outputStream, 20480);
    }
}
