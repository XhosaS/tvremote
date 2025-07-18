package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkq implements Closeable {
    public static final zkp b = new Object() { // from class: zkp
    };
    public Throwable a;
    private final Deque c = new ArrayDeque(4);

    public final void a(Closeable closeable) {
        if (closeable != null) {
            this.c.addFirst(closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.a;
        while (true) {
            Deque deque = this.c;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        zko.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.a != null || th == null) {
            return;
        }
        yrv.a(th, IOException.class);
        yrv.b(th);
        throw new AssertionError(th);
    }
}
