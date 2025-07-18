package defpackage;

import java.io.Closeable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyb implements Closeable {
    private final long a;

    public wyb(long j) {
        this.a = j;
    }

    public final void a() {
        HashMap map = wyo.c;
        synchronized (map) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uea.a().postDelayed(new Runnable() { // from class: wya
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, 5000L);
    }
}
