package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxd extends zod {
    public int b;
    public byte[] c;

    public zxd(int i, byte[] bArr) {
        int i2;
        super(true);
        int length = bArr.length;
        if (i == 5) {
            i2 = 5224;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.cf(i, "unknown security category: "));
            }
            i2 = 12392;
        }
        if (length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.b = i;
        this.c = vxr.bd(bArr);
    }
}
