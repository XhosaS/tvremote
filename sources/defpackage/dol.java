package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dol implements don {
    public final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public byte b = 61;
    public final byte[] c = new byte[128];

    public dol() {
        for (int i = 0; i < 128; i++) {
            this.c[i] = -1;
        }
        for (int i2 = 0; i2 < 64; i2++) {
            this.c[this.a[i2]] = (byte) i2;
        }
    }

    public static final boolean a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public static final int b(String str, int i, int i2) {
        while (i < i2 && a(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
