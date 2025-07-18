package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpc extends zpb {
    private final byte[] f;
    private final CRLException g;

    public zpc(zyt zytVar, zmk zmkVar, String str, byte[] bArr, boolean z, byte[] bArr2, CRLException cRLException) {
        super(zytVar, zmkVar, str, bArr, z);
        this.f = bArr2;
        this.g = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() throws CRLException {
        CRLException cRLException = this.g;
        if (cRLException != null) {
            throw cRLException;
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
