package defpackage;

import java.io.IOException;
import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfv extends dfs {
    private final Object f;
    private dft g;
    private volatile boolean h;
    private volatile int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public dfv(asv asvVar, ddd dddVar) throws CRLException {
        Exception exc;
        try {
            String strA = dga.a(dddVar.b);
            try {
                czb czbVar = dddVar.b.b;
                byte[] bArr = null;
                byte[] bArrU = czbVar == null ? null : czbVar.p().u();
                try {
                    czx czxVarA = dfs.a(dddVar, ddh.h.b());
                    if (czxVarA != null) {
                        try {
                            bArr = czxVarA.b;
                        } catch (Exception e) {
                            exc = e;
                            throw new dfm(exc);
                        }
                    }
                    super(asvVar, dddVar, strA, bArrU, bArr == null ? false : ddl.a(bArr).a);
                    this.f = new Object();
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                throw new CRLException("CRL contents invalid: ".concat(e3.toString()));
            }
        } catch (Exception e4) {
            throw new dfu("CRL contents invalid: ".concat(String.valueOf(e4.getMessage())), e4);
        }
    }

    private final dft b() {
        byte[] bArrU;
        dfu dfuVar;
        dft dftVar;
        synchronized (this.f) {
            dft dftVar2 = this.g;
            if (dftVar2 != null) {
                return dftVar2;
            }
            try {
                bArrU = this.a.u();
                dfuVar = null;
            } catch (IOException e) {
                bArrU = null;
                dfuVar = new dfu(e);
            }
            dft dftVar3 = new dft(this.e, this.a, this.b, this.c, this.d, bArrU, dfuVar);
            synchronized (this.f) {
                if (this.g == null) {
                    this.g = dftVar3;
                }
                dftVar = this.g;
            }
            return dftVar;
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        cyw cywVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfv)) {
            return b().equals(obj);
        }
        dfv dfvVar = (dfv) obj;
        if (this.h && dfvVar.h) {
            if (this.i != dfvVar.i) {
                return false;
            }
        } else if ((this.g == null || dfvVar.g == null) && (cywVar = this.a.c) != null && !cywVar.w(dfvVar.a.c)) {
            return false;
        }
        return b().equals(dfvVar.b());
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() {
        return dos.p(b().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        if (!this.h) {
            this.i = b().hashCode();
            this.h = true;
        }
        return this.i;
    }
}
