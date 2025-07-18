package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaog {
    private static aaog a;

    private aaog() {
    }

    public static aaog a() {
        if (a == null) {
            a = new aaog();
        }
        return a;
    }
}
