package defpackage;

import java.io.IOException;
import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpe extends zpb {
    private final Object f;
    private zpc g;
    private volatile boolean h;
    private volatile int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public zpe(zyt zytVar, zmk zmkVar) throws CRLException {
        Exception exc;
        try {
            String strA = zpj.a(zmkVar.b);
            try {
                zih zihVar = zmkVar.b.b;
                byte[] bArr = null;
                byte[] bArrU = zihVar == null ? null : zihVar.p().u();
                try {
                    zjd zjdVarA = zpb.a(zmkVar, zmo.h.b());
                    if (zjdVarA != null) {
                        try {
                            bArr = zjdVarA.b;
                        } catch (Exception e) {
                            exc = e;
                            throw new zov(exc);
                        }
                    }
                    super(zytVar, zmkVar, strA, bArrU, bArr == null ? false : zms.a(bArr).a);
                    this.f = new Object();
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                throw new CRLException("CRL contents invalid: ".concat(e3.toString()));
            }
        } catch (Exception e4) {
            throw new zpd("CRL contents invalid: ".concat(String.valueOf(e4.getMessage())), e4);
        }
    }

    private final zpc b() {
        byte[] bArrU;
        zpd zpdVar;
        zpc zpcVar;
        synchronized (this.f) {
            zpc zpcVar2 = this.g;
            if (zpcVar2 != null) {
                return zpcVar2;
            }
            try {
                bArrU = this.a.u();
                zpdVar = null;
            } catch (IOException e) {
                bArrU = null;
                zpdVar = new zpd(e);
            }
            zpc zpcVar3 = new zpc(this.e, this.a, this.b, this.c, this.d, bArrU, zpdVar);
            synchronized (this.f) {
                if (this.g == null) {
                    this.g = zpcVar3;
                }
                zpcVar = this.g;
            }
            return zpcVar;
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        zic zicVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpe)) {
            return b().equals(obj);
        }
        zpe zpeVar = (zpe) obj;
        if (this.h && zpeVar.h) {
            if (this.i != zpeVar.i) {
                return false;
            }
        } else if ((this.g == null || zpeVar.g == null) && (zicVar = this.a.c) != null && !zicVar.w(zpeVar.a.c)) {
            return false;
        }
        return b().equals(zpeVar.b());
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() {
        return vxr.bd(b().getEncoded());
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
