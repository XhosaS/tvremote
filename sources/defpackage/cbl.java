package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbl {
    public final cdd a;

    protected cbl(cdd cddVar) {
        cddVar.getClass();
        this.a = cddVar;
    }

    public static void h(String str, cdb cdbVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(cdbVar.e()))));
        sb.append(": logging error [");
        ces.g(1, cdbVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract cch a(Level level);

    public final cch b() {
        return a(Level.FINE);
    }

    public final cch c() {
        return a(Level.FINER);
    }

    public final cch d() {
        return a(Level.FINEST);
    }

    public final cch e() {
        return a(Level.INFO);
    }

    public final cch f() {
        return a(Level.SEVERE);
    }

    public final cch g() {
        return a(Level.WARNING);
    }

    protected final boolean i(Level level) {
        return this.a.c(level);
    }
}
