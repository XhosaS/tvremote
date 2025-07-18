package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zgr {
    private static String a = "zhb";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "zhq";
    private static final String[] d = {"zhb", "com.google.common.flogger.backend.google.GooglePlatform", "zhq"};

    public static int a() {
        return ziw.a().a;
    }

    public static long b() {
        return zgp.a.c();
    }

    public static zft d(String str) {
        return zgp.a.e(str);
    }

    public static zfx f() {
        return i().a();
    }

    public static zgq g() {
        return zgp.a.h();
    }

    public static zhw i() {
        return zgp.a.j();
    }

    public static zih k() {
        return i().b();
    }

    public static String l() {
        return zgp.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract zft e(String str);

    protected abstract zgq h();

    protected zhw j() {
        return zhy.a;
    }

    protected abstract String m();
}
