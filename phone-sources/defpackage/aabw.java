package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aabw implements Serializable {
    public static final aabw a = new aabv("eras", (byte) 1);
    public static final aabw b = new aabv("centuries", (byte) 2);
    public static final aabw c = new aabv("weekyears", (byte) 3);
    public static final aabw d = new aabv("years", (byte) 4);
    public static final aabw e = new aabv("months", (byte) 5);
    public static final aabw f = new aabv("weeks", (byte) 6);
    public static final aabw g = new aabv("days", (byte) 7);
    public static final aabw h = new aabv("halfdays", (byte) 8);
    public static final aabw i = new aabv("hours", (byte) 9);
    public static final aabw j = new aabv("minutes", (byte) 10);
    public static final aabw k = new aabv("seconds", (byte) 11);
    public static final aabw l = new aabv("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    protected aabw(String str) {
        this.m = str;
    }

    public abstract aabu a(aabk aabkVar);

    public final String toString() {
        return this.m;
    }
}
