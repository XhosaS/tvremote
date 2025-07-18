package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ceb {
    private static String a = "cek";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"cek", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return cfm.a().a;
    }

    public static long b() {
        return cdz.a.c();
    }

    public static cdd d(String str) {
        return cdz.a.e(str);
    }

    public static cdh f() {
        return i().a();
    }

    public static cea g() {
        return cdz.a.h();
    }

    public static ces i() {
        return cdz.a.j();
    }

    public static cez k() {
        return i().b();
    }

    public static String l() {
        return cdz.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract cdd e(String str);

    protected abstract cea h();

    protected ces j() {
        return ceu.a;
    }

    protected abstract String m();
}
