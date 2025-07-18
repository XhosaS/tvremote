package defpackage;

import io.grpc.Status;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afrw {
    public static final /* synthetic */ int f = 0;
    private static final Logger g = Logger.getLogger(afrw.class.getName());
    public final long a;
    public final yrn b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Status e;

    public afrw(long j, yrn yrnVar) {
        this.a = j;
        this.b = yrnVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            g.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }
}
