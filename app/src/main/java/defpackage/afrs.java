package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afrs implements afgs {
    @Override // defpackage.afig
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, afgt.a)));
        }
        return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    @Override // defpackage.afig
    public final /* synthetic */ byte[] b(Object obj) {
        throw new UnsupportedOperationException();
    }
}
