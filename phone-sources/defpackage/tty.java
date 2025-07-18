package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tty {
    private static final ThreadLocal a = new ttx();

    public static char[] a() {
        char[] cArr = (char[]) a.get();
        cArr.getClass();
        return cArr;
    }
}
