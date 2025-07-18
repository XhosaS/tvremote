package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krc {
    private static final DateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
    private final StackTraceElement b;
    private final Date c;
    private final String d;
    private final Throwable e;

    public krc(StackTraceElement stackTraceElement, Date date, String str, Throwable th) {
        this.b = stackTraceElement;
        this.c = date;
        this.d = str;
        this.e = th;
    }

    public final String a(boolean z) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (z) {
            DateFormat dateFormat = a;
            synchronized (dateFormat) {
                dateFormat.setTimeZone(TimeZone.getDefault());
                printWriter.print(dateFormat.format(this.c));
            }
            printWriter.print(' ');
        }
        StackTraceElement stackTraceElement = this.b;
        if (stackTraceElement != null) {
            String className = stackTraceElement.getClassName();
            printWriter.append((CharSequence) className, className.lastIndexOf(46) + 1, className.length());
            printWriter.printf(".%s:%d", stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        } else {
            printWriter.append((CharSequence) "(unknown)");
        }
        printWriter.print(' ');
        printWriter.println(this.d);
        Throwable th = this.e;
        if (th != null) {
            printWriter.println("THROWABLE:");
            printWriter.println(th);
            printWriter.println();
        }
        return stringWriter.toString();
    }

    public final String toString() {
        return a(true);
    }
}
