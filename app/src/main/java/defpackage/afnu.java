package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnu {
    static final Logger a = Logger.getLogger(afeo.class.getName());
    public final Object b = new Object();
    public final afgr c;

    public afnu(afgr afgrVar, long j, String str) {
        afgrVar.getClass();
        this.c = afgrVar;
        b(afgi.a(str.concat(" created"), afgj.CT_INFO, Long.valueOf(j), null));
    }

    static void a(afgr afgrVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + afgrVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(afgk afgkVar) {
        int iOrdinal = afgkVar.b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.b) {
        }
        a(this.c, level, afgkVar.a);
    }
}
