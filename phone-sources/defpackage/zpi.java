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
/* loaded from: classes3.dex */
final class zpi extends zpf {
    private final Object g;
    private zpg h;
    private X500Principal i;
    private PublicKey j;
    private X500Principal k;
    private long[] l;
    private volatile boolean m;
    private volatile int n;

    /* JADX WARN: Illegal instructions before constructor call */
    public zpi(zyt zytVar, zmj zmjVar) throws CertificateParsingException {
        Exception exc;
        boolean[] zArr;
        try {
            byte[] bArrB = b(zmjVar, "2.5.29.19");
            zmf zmfVarA = bArrB == null ? null : zmf.a(zjh.v(bArrB));
            try {
                byte[] bArrB2 = b(zmjVar, "2.5.29.15");
                if (bArrB2 == null) {
                    zArr = null;
                } else {
                    zic zicVarI = zic.i(zjh.v(bArrB2));
                    byte[] bArrM = zicVarI.m();
                    int length = (bArrM.length * 8) - zicVarI.f();
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
                    String strA = zpj.a(zmjVar.c);
                    try {
                        zih zihVar = zmjVar.c.b;
                        super(zytVar, zmjVar, zmfVarA, zArr, strA, zihVar != null ? zihVar.p().u() : null);
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

    private final zpg c() {
        byte[] bArrU;
        zph zphVar;
        zpg zpgVar;
        synchronized (this.g) {
            zpg zpgVar2 = this.h;
            if (zpgVar2 != null) {
                return zpgVar2;
            }
            try {
                bArrU = this.a.u();
                zphVar = null;
            } catch (IOException e) {
                bArrU = null;
                zphVar = new zph(e);
            }
            zpg zpgVar3 = new zpg(this.f, this.a, this.b, this.c, this.d, this.e, bArrU, zphVar);
            synchronized (this.g) {
                if (this.h == null) {
                    this.h = zpgVar3;
                }
                zpgVar = this.h;
            }
            return zpgVar;
        }
    }

    @Override // defpackage.zpf, java.security.cert.X509Certificate
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
        zic zicVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zpi)) {
            return c().equals(obj);
        }
        zpi zpiVar = (zpi) obj;
        if (this.m && zpiVar.m) {
            if (this.n != zpiVar.n) {
                return false;
            }
        } else if ((this.h == null || zpiVar.h == null) && (zicVar = this.a.d) != null && !zicVar.w(zpiVar.a.d)) {
            return false;
        }
        return c().equals(zpiVar.c());
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return vxr.bd(c().getEncoded());
    }

    @Override // defpackage.zpf, java.security.cert.X509Certificate
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

    @Override // defpackage.zpf, java.security.cert.Certificate
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

    @Override // defpackage.zpf, java.security.cert.X509Certificate
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
