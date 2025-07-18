package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skc implements Closeable {
    public Closeable a;

    public skc(Closeable closeable) {
        this.a = closeable;
    }

    public final Closeable a() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
