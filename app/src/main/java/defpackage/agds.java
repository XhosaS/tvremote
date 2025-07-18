package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agds {
    public final agds[] a;
    public final int b;
    public final int c;

    public agds() {
        this.a = new agds[256];
        this.b = 0;
        this.c = 0;
    }

    public agds(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }
}
