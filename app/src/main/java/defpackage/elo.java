package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class elo {
    public static volatile elp a;

    private elo() {
    }

    public static elp a() {
        if (a == null) {
            synchronized (elo.class) {
                if (a == null) {
                    a = new eln();
                }
            }
        }
        return a;
    }
}
