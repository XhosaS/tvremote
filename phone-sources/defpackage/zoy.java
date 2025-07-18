package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zoy extends X509CRLEntry {
    private zmx a;
    private zlw b;
    private volatile boolean c;
    private volatile int d;

    protected zoy(zmx zmxVar, boolean z, zlw zlwVar) {
        this.a = zmxVar;
        if (z) {
            zmo zmoVarB = b(zmo.i);
            if (zmoVarB != null) {
                try {
                    for (zmq zmqVar : zmr.a(zmo.a(zmoVarB)).b()) {
                        if (zmqVar.b == 4) {
                            zlwVar = zlw.b(zmqVar.a);
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                zlwVar = null;
            }
        } else {
            zlwVar = null;
        }
        this.b = zlwVar;
    }

    private final Set a(boolean z) {
        zmp zmpVarB = this.a.b();
        if (zmpVarB == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = zmpVarB.a();
        while (enumerationA.hasMoreElements()) {
            zjb zjbVar = (zjb) enumerationA.nextElement();
            if (z == zmpVarB.b(zjbVar).s) {
                hashSet.add(zjbVar.b());
            }
        }
        return hashSet;
    }

    private final zmo b(zjb zjbVar) {
        zmp zmpVarB = this.a.b();
        if (zmpVarB != null) {
            return zmpVarB.b(zjbVar);
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zoy)) {
            return super.equals(this);
        }
        zoy zoyVar = (zoy) obj;
        if (this.c && zoyVar.c && this.d != zoyVar.d) {
            return false;
        }
        return this.a.equals(zoyVar.a);
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        zlw zlwVar = this.b;
        if (zlwVar == null) {
            return null;
        }
        try {
            return new X500Principal(zlwVar.s());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public final byte[] getEncoded() throws CRLException {
        try {
            return this.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        zmo zmoVarB = b(new zjb(str));
        if (zmoVarB == null) {
            return null;
        }
        try {
            return zmoVarB.t.s();
        } catch (Exception e) {
            throw new IllegalStateException("Exception encoding: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public final Date getRevocationDate() {
        return znc.c(this.a.a.h(1)).b();
    }

    @Override // java.security.cert.X509CRLEntry
    public final BigInteger getSerialNumber() {
        return this.a.a().j();
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean hasExtensions() {
        return this.a.b() != null;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public final int hashCode() {
        if (!this.c) {
            this.d = super.hashCode();
            this.c = true;
        }
        return this.d;
    }

    @Override // java.security.cert.X509CRLEntry
    public final String toString() {
        zmi zmiVar;
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String str = zxr.a;
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(str);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(str);
        zmp zmpVarB = this.a.b();
        if (zmpVarB != null) {
            Enumeration enumerationA = zmpVarB.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:");
                stringBuffer.append(str);
                while (enumerationA.hasMoreElements()) {
                    zjb zjbVar = (zjb) enumerationA.nextElement();
                    zmo zmoVarB = zmpVarB.b(zjbVar);
                    zjd zjdVar = zmoVarB.t;
                    if (zjdVar != null) {
                        zis zisVar = new zis(zjdVar.b);
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(zmoVarB.s);
                        stringBuffer.append(") ");
                        try {
                            if (zjbVar.w(zmo.f)) {
                                zik zikVarG = zik.g(zisVar.f());
                                Hashtable hashtable = zmi.a;
                                if (zikVarG != null) {
                                    zik zikVarG2 = zik.g(zikVarG);
                                    byte[] bArr = zikVarG2.a;
                                    int length = bArr.length;
                                    int i = zikVarG2.b;
                                    if (length - i > 4) {
                                        throw new ArithmeticException("ASN.1 Enumerated out of int range");
                                    }
                                    int iB = ziu.b(bArr, i, -1);
                                    Integer numValueOf = Integer.valueOf(iB);
                                    Hashtable hashtable2 = zmi.a;
                                    if (!hashtable2.containsKey(numValueOf)) {
                                        hashtable2.put(numValueOf, new zmi(iB));
                                    }
                                    zmiVar = (zmi) hashtable2.get(numValueOf);
                                } else {
                                    zmiVar = null;
                                }
                                stringBuffer.append(zmiVar);
                                stringBuffer.append(str);
                            } else if (zjbVar.w(zmo.i)) {
                                stringBuffer.append("Certificate issuer: ");
                                stringBuffer.append(zmr.a(zisVar.f()));
                                stringBuffer.append(str);
                            } else {
                                stringBuffer.append(zjbVar.b());
                                stringBuffer.append(" value = ");
                                stringBuffer.append(wcq.am(zisVar.f()));
                                stringBuffer.append(str);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(zjbVar.b());
                            stringBuffer.append(" value = *****");
                            stringBuffer.append(str);
                        }
                    } else {
                        stringBuffer.append(str);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
