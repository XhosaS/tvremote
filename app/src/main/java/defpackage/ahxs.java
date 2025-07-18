package defpackage;

import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahxs {
    static {
        int i = ahxr.a;
    }

    public void b() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
