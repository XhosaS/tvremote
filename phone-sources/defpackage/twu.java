package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class twu {
    private static String a = "txd";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "txq";
    private static final String[] d = {"txd", "com.google.common.flogger.backend.google.GooglePlatform", "txq"};

    public static int a() {
        return tyo.a().a;
    }

    public static long b() {
        return tws.a.c();
    }

    public static tvw d(String str) {
        return tws.a.e(str);
    }

    public static twa f() {
        return i().ez();
    }

    public static twt g() {
        return tws.a.h();
    }

    public static txu i() {
        return tws.a.j();
    }

    public static tyb k() {
        return i().b();
    }

    public static String l() {
        return tws.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract tvw e(String str);

    protected abstract twt h();

    protected txu j() {
        return txw.a;
    }

    protected abstract String m();
}
