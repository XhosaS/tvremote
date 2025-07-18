package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfz extends dfw {
    private final Object g;
    private dfx h;
    private X500Principal i;
    private PublicKey j;
    private X500Principal k;
    private long[] l;
    private volatile boolean m;
    private volatile int n;

    /* JADX WARN: Illegal instructions before constructor call */
    public dfz(asv asvVar, ddc ddcVar) throws CertificateParsingException {
        Exception exc;
        boolean[] zArr;
        try {
            byte[] bArrB = b(ddcVar, "2.5.29.19");
            dcy dcyVarA = bArrB == null ? null : dcy.a(dab.v(bArrB));
            try {
                byte[] bArrB2 = b(ddcVar, "2.5.29.15");
                if (bArrB2 == null) {
                    zArr = null;
                } else {
                    cyw cywVarI = cyw.i(dab.v(bArrB2));
                    byte[] bArrM = cywVarI.m();
                    int length = (bArrM.length * 8) - cywVarI.f();
                    int i = 9;
                    if (length >= 9) {
                        i = length;
                    }
                    boolean[] zArr2 = new boolean[i];
                    for (int i2 = 0; i2 != length; i2++) {
                        try {
                            zArr2[i2] = (bArrM[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                        } catch (Exception e) {
                            exc = e;
                            throw new CertificateParsingException("cannot construct KeyUsage: ".concat(exc.toString()));
                        }
                    }
                    zArr = zArr2;
                }
                try {
                    String strA = dga.a(ddcVar.c);
                    try {
                        czb czbVar = ddcVar.c.b;
                        super(asvVar, ddcVar, dcyVarA, zArr, strA, czbVar != null ? czbVar.p().u() : null);
                        this.g = new Object();
                        new Hashtable();
                        new Vector();
                    } catch (Exception e2) {
                        throw new CertificateParsingException("cannot construct SigAlgParams: ".concat(e2.toString()));
                    }
                } catch (Exception e3) {
                    throw new CertificateParsingException("cannot construct SigAlgName: ".concat(e3.toString()));
                }
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (Exception e5) {
            throw new CertificateParsingException("cannot construct BasicConstraints: ".concat(e5.toString()));
        }
    }

    private final dfx c() {
        byte[] bArrU;
        dfy dfyVar;
        dfx dfxVar;
        synchronized (this.g) {
            dfx dfxVar2 = this.h;
            if (dfxVar2 != null) {
                return dfxVar2;
            }
            try {
                bArrU = this.a.u();
                dfyVar = null;
            } catch (IOException e) {
                bArrU = null;
                dfyVar = new dfy(e);
            }
            dfx dfxVar3 = new dfx(this.f, this.a, this.b, this.c, this.d, this.e, bArrU, dfyVar);
            synchronized (this.g) {
                if (this.h == null) {
                    this.h = dfxVar3;
                }
                dfxVar = this.h;
            }
            return dfxVar;
        }
    }

    @Override // defpackage.dfw, java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        long[] jArr;
        Object obj = this.g;
        long time = date.getTime();
        synchronized (obj) {
            jArr = this.l;
            if (jArr == null) {
                long[] jArr2 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.g) {
                    if (this.l == null) {
                        this.l = jArr2;
                    }
                    jArr = this.l;
                }
            }
        }
        if (time > jArr[1]) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (time < jArr[0]) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        cyw cywVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfz)) {
            return c().equals(obj);
        }
        dfz dfzVar = (dfz) obj;
        if (this.m && dfzVar.m) {
            if (this.n != dfzVar.n) {
                return false;
            }
        } else if ((this.h == null || dfzVar.h == null) && (cywVar = this.a.d) != null && !cywVar.w(dfzVar.a.d)) {
            return false;
        }
        return c().equals(dfzVar.c());
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return dos.p(c().getEncoded());
    }

    @Override // defpackage.dfw, java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.i;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (this.g) {
                if (this.i == null) {
                    this.i = issuerX500Principal;
                }
                x500Principal = this.i;
            }
            return x500Principal;
        }
    }

    @Override // defpackage.dfw, java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.g) {
            PublicKey publicKey2 = this.j;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (this.g) {
                if (this.j == null) {
                    this.j = publicKey3;
                }
                publicKey = this.j;
            }
            return publicKey;
        }
    }

    @Override // defpackage.dfw, java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.k;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal subjectX500Principal = super.getSubjectX500Principal();
            synchronized (this.g) {
                if (this.k == null) {
                    this.k = subjectX500Principal;
                }
                x500Principal = this.k;
            }
            return x500Principal;
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (!this.m) {
            this.n = c().hashCode();
            this.m = true;
        }
        return this.n;
    }
}
