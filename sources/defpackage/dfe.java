package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfe extends dbd {
    public dfe(cyw cywVar) {
        super(cywVar.m(), cywVar.f());
    }

    @Override // defpackage.cyw
    public final String toString() {
        byte[] bArr = this.a;
        int iMin = Math.min(5, bArr.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < iMin; i2++) {
            i |= (255 & bArr[i2]) << ((i2 - 1) * 8);
        }
        if (iMin > 0 && iMin < 5) {
            i |= (((byte) (bArr[iMin] & (255 << (bArr[0] & 255)))) & 255) << ((iMin - 1) * 8);
        }
        return "NetscapeCertType: 0x".concat(String.valueOf(Integer.toHexString(i)));
    }
}
