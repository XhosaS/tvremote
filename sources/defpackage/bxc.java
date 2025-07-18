package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxc {
    private static final bxc c = new bxc(3, null);
    private static final bxc d = new bxc(2, null);
    public final Object a;
    public final int b;

    public bxc(int i, Object obj) {
        this.b = i;
        this.a = obj;
    }

    public static bxc a(int i) {
        return i + (-1) != 1 ? c : d;
    }
}
