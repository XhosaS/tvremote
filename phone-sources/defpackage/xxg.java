package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxg {
    private static final Logger f = Logger.getLogger(xxg.class.getName());
    public final long a;
    public final ttl b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public xtk e;

    public xxg(long j, ttl ttlVar) {
        this.a = j;
        this.b = ttlVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(zft zftVar, Executor executor) {
        a(executor, new xwf(zftVar, 9));
    }
}
