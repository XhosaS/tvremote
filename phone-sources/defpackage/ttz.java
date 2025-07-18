package defpackage;

import defpackage.tuv;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ttz<API extends tuv<API>> {
    public final tvw a;

    protected ttz(tvw tvwVar) {
        this.a = tvwVar;
    }

    public static void i(String str, tvu tvuVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(tvuVar.e()))));
        sb.append(": logging error [");
        txu.i(1, tvuVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract tuv a(Level level);

    public final tuv b() {
        return a(Level.FINE);
    }

    public final tuv c() {
        return a(Level.FINER);
    }

    public final tuv d() {
        return a(Level.FINEST);
    }

    public final tuv e() {
        return a(Level.INFO);
    }

    public final tuv f() {
        return a(Level.SEVERE);
    }

    public final tuv g() {
        return a(Level.WARNING);
    }

    protected final String h() {
        return this.a.a();
    }

    protected final boolean j(Level level) {
        return this.a.d(level);
    }
}
