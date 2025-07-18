package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvc {
    static final Logger a = Logger.getLogger(xqa.class.getName());
    public final Object b = new Object();
    public final xre c;

    public xvc(xre xreVar, long j, String str) {
        xreVar.getClass();
        this.c = xreVar;
        zxk zxkVar = new zxk((byte[]) null);
        zxkVar.d = str.concat(" created");
        zxkVar.a = xqz.CT_INFO;
        zxkVar.g(j);
        b(zxkVar.f());
    }

    static void a(xre xreVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + xreVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(xra xraVar) {
        int iOrdinal = xraVar.b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.b) {
        }
        a(this.c, level, xraVar.a);
    }
}
