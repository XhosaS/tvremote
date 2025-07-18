package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srk {
    public final byte a;
    public final byte b;
    public final short c;
    public final String d;
    public final int e;

    public srk(int i, String str, int i2) {
        this.d = str;
        this.e = i2;
        this.c = (short) ((char) i);
        this.b = (byte) ((i >> 16) & 255);
        this.a = (byte) ((i >> 24) & 255);
    }
}
