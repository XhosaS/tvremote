package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnv extends deu {
    public int b;
    public byte[] c;

    public dnv(int i, byte[] bArr) {
        int i2;
        super(false);
        if (i == 5) {
            i2 = 14880;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(b.e(i, "unknown security category: "));
            }
            i2 = 38432;
        }
        if (bArr.length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.b = i;
        this.c = dos.p(bArr);
    }
}
