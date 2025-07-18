package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxi extends hyq {
    public static final hxi a = new hxi(0);
    public final int b;

    public hxi(int i) {
        this.b = i;
    }

    public final String toString() {
        return String.format("#%06x", Integer.valueOf(this.b));
    }
}
