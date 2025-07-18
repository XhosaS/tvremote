package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface afoj extends Closeable {
    afot a(SocketAddress socketAddress, afoi afoiVar, afeo afeoVar);

    Collection b();

    ScheduledExecutorService c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
