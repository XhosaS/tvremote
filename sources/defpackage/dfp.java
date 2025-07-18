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
/* loaded from: classes.dex */
final class dfp extends X509CRLEntry {
    private ddq a;
    private dcp b;
    private volatile boolean c;
    private volatile int d;

    protected dfp(ddq ddqVar, boolean z, dcp dcpVar) {
        this.a = ddqVar;
        if (z) {
            ddh ddhVarB = b(ddh.i);
            if (ddhVarB != null) {
                try {
                    for (ddj ddjVar : ddk.a(ddh.a(ddhVarB)).b()) {
                        if (ddjVar.b == 4) {
                            dcpVar = dcp.b(ddjVar.a);
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                dcpVar = null;
            }
        } else {
            dcpVar = null;
        }
        this.b = dcpVar;
    }

    private final Set a(boolean z) {
        ddi ddiVarB = this.a.b();
        if (ddiVarB == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = ddiVarB.a();
        while (enumerationA.hasMoreElements()) {
            czv czvVar = (czv) enumerationA.nextElement();
            if (z == ddiVarB.b(czvVar).s) {
                hashSet.add(czvVar.b());
            }
        }
        return hashSet;
    }

    private final ddh b(czv czvVar) {
        ddi ddiVarB = this.a.b();
        if (ddiVarB != null) {
            return ddiVarB.b(czvVar);
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfp)) {
            return super.equals(this);
        }
        dfp dfpVar = (dfp) obj;
        if (this.c && dfpVar.c && this.d != dfpVar.d) {
            return false;
        }
        return this.a.equals(dfpVar.a);
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        dcp dcpVar = this.b;
        if (dcpVar == null) {
            return null;
        }
        try {
            return new X500Principal(dcpVar.s());
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
        ddh ddhVarB = b(new czv(str));
        if (ddhVarB == null) {
            return null;
        }
        try {
            return ddhVarB.t.s();
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
        return ddv.c(this.a.a.h(1)).b();
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
        ddb ddbVar;
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String str = doj.a;
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(str);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(str);
        ddi ddiVarB = this.a.b();
        if (ddiVarB != null) {
            Enumeration enumerationA = ddiVarB.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:");
                stringBuffer.append(str);
                while (enumerationA.hasMoreElements()) {
                    czv czvVar = (czv) enumerationA.nextElement();
                    ddh ddhVarB = ddiVarB.b(czvVar);
                    czx czxVar = ddhVarB.t;
                    if (czxVar != null) {
                        czm czmVar = new czm(czxVar.b);
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(ddhVarB.s);
                        stringBuffer.append(") ");
                        try {
                            if (czvVar.w(ddh.f)) {
                                cze czeVarG = cze.g(czmVar.f());
                                Hashtable hashtable = ddb.a;
                                if (czeVarG != null) {
                                    cze czeVarG2 = cze.g(czeVarG);
                                    byte[] bArr = czeVarG2.a;
                                    int length = bArr.length;
                                    int i = czeVarG2.b;
                                    if (length - i > 4) {
                                        throw new ArithmeticException("ASN.1 Enumerated out of int range");
                                    }
                                    int iB = czo.b(bArr, i, -1);
                                    Integer numValueOf = Integer.valueOf(iB);
                                    Hashtable hashtable2 = ddb.a;
                                    if (!hashtable2.containsKey(numValueOf)) {
                                        hashtable2.put(numValueOf, new ddb(iB));
                                    }
                                    ddbVar = (ddb) hashtable2.get(numValueOf);
                                } else {
                                    ddbVar = null;
                                }
                                stringBuffer.append(ddbVar);
                                stringBuffer.append(str);
                            } else if (czvVar.w(ddh.i)) {
                                stringBuffer.append("Certificate issuer: ");
                                stringBuffer.append(ddk.a(czmVar.f()));
                                stringBuffer.append(str);
                            } else {
                                stringBuffer.append(czvVar.b());
                                stringBuffer.append(" value = ");
                                stringBuffer.append(dnx.ai(czmVar.f()));
                                stringBuffer.append(str);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(czvVar.b());
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
