package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfs extends Handler {
    public static final zfs a = new zfs();

    private zfs() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = zfr.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String strAe = (String) zfr.b.get(loggerName);
        if (strAe == null) {
            strAe = ylh.ae(loggerName, 23);
        }
        if (!Log.isLoggable(strAe, i)) {
            return;
        }
        if (thrown != null) {
            message = message + "\n" + Log.getStackTraceString(thrown);
        }
        int i2 = 0;
        while (true) {
            int length = message.length();
            if (i2 >= length) {
                return;
            }
            int iT = ylh.T(message, '\n', i2, 4);
            if (iT != -1) {
                length = iT;
            }
            while (true) {
                iMin = Math.min(length, i2 + 4000);
                String strSubstring = message.substring(i2, iMin);
                strSubstring.getClass();
                Log.println(i, strAe, strSubstring);
                if (iMin >= length) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
