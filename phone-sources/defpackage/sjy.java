package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjy implements Closeable {
    private final /* synthetic */ int a;
    private Object b;

    public sjy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.a != 0) {
            Object obj = this.b;
            if (obj != null) {
                ((FileLock) obj).release();
                this.b = null;
                return;
            }
            return;
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            ((Semaphore) obj2).release();
            this.b = null;
        }
    }
}
