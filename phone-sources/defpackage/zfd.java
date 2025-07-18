package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfd {
    public final int a;
    public final int b;
    public final Object c;

    public zfd() {
        this.c = new zfd[256];
        this.a = 0;
        this.b = 0;
    }

    public zfd(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public zfd(int i, int i2, String str) {
        this.b = i;
        this.a = i2;
        this.c = str;
    }
}
