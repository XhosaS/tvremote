package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface xvp extends Closeable {
    xvv a(SocketAddress socketAddress, xvo xvoVar, xqa xqaVar);

    Collection b();

    ScheduledExecutorService c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
