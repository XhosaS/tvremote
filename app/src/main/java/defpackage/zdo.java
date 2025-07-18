package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zdo {
    public final zft a;

    protected zdo(zft zftVar) {
        zftVar.getClass();
        this.a = zftVar;
    }

    public static void e(String str, zfp zfpVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(zfpVar.a()))));
        sb.append(": logging error [");
        zfs.DEFAULT.a(zfpVar.b(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract zeo a(Level level);

    public final zeo b() {
        return a(Level.INFO);
    }

    public final zeo c() {
        return a(Level.SEVERE);
    }

    public final zeo d() {
        return a(Level.WARNING);
    }

    protected final boolean f(Level level) {
        return this.a.c(level);
    }
}
