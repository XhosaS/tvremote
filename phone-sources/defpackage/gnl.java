package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnl {
    public static final gnl a = new gnl("FLAT");
    public static final gnl b = new gnl("HALF_OPENED");
    private final String c;

    private gnl(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
