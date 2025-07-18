package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugx {
    private final ueg a;
    private final Uri b;

    public ugx(ueg uegVar, Uri uri) {
        this.a = uegVar;
        this.b = uri;
    }

    public final long a() {
        return this.a.a(this.b);
    }

    public final void b(InputStream inputStream, long j) throws IOException {
        ueg uegVar = this.a;
        Uri uri = this.b;
        long jA = uegVar.a(uri);
        if (j > jA) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(jA)));
        }
        OutputStream outputStream = (OutputStream) uegVar.c(uri, j > 0 ? new uhb() : new uhn());
        try {
            zkn.a(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
