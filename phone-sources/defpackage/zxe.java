package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxe extends zod {
    public int b;
    public byte[] c;

    public zxe(int i, byte[] bArr) {
        int i2;
        super(false);
        if (i == 5) {
            i2 = 14880;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.cf(i, "unknown security category: "));
            }
            i2 = 38432;
        }
        if (bArr.length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.b = i;
        this.c = vxr.bd(bArr);
    }
}
