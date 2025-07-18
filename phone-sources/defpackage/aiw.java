package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiw {
    public int a;
    public char[] b;
    public int c;
    public int d;

    public aiw(char[] cArr, int i, int i2) {
        this.a = cArr.length;
        this.b = cArr;
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        return this.d - this.c;
    }

    public final int b() {
        return this.a - a();
    }

    public final String toString() {
        return "";
    }
}
