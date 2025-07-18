package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xyy extends WeakReference {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException b;
    private final ReferenceQueue c;
    private final ConcurrentMap d;
    private final String e;
    private final Reference f;
    private final AtomicBoolean g;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        b = runtimeException;
    }

    public xyy(xyz xyzVar, xsa xsaVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(xyzVar, referenceQueue);
        this.g = new AtomicBoolean();
        this.f = new SoftReference(a ? new RuntimeException("ManagedChannel allocation site") : b);
        this.e = xsaVar.toString();
        this.c = referenceQueue;
        this.d = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            xyy xyyVar = (xyy) referenceQueue.poll();
            if (xyyVar == null) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) xyyVar.f.get();
            xyyVar.b();
            if (!xyyVar.g.get()) {
                Level level = Level.SEVERE;
                Logger logger = xyz.a;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{xyyVar.e});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    private final void b() {
        super.clear();
        this.d.remove(this);
        this.f.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.c);
    }
}
