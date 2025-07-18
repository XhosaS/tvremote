package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqm extends zqk {
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;

    public zqm(zql zqlVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, zqlVar);
        this.c = vxr.bd(bArr);
        this.d = vxr.bd(bArr2);
        this.e = vxr.bd(bArr3);
    }

    public final byte[] a() {
        byte[] bArr = this.c;
        byte[] bArr2 = this.d;
        byte[] bArr3 = this.e;
        if (bArr == null) {
            return vxr.bf(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return vxr.bf(bArr, bArr3);
        }
        if (bArr3 == null) {
            return vxr.bf(bArr, bArr2);
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        int length3 = bArr3.length;
        int i = length + length2;
        byte[] bArr4 = new byte[i + length3];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr2, 0, bArr4, length, length2);
        System.arraycopy(bArr3, 0, bArr4, i, length3);
        return bArr4;
    }
}
