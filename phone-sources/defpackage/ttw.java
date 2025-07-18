package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttw extends txu {
    public final char[][] a;
    public final int b;
    public final char c;

    protected ttw() {
        super(null);
    }

    public static char[] a(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public ttw(ttv ttvVar) {
        this();
        char[][] cArr = ttvVar.b;
        this.a = cArr;
        this.b = cArr.length;
        this.c = (char) 65535;
    }
}
