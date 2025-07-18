package defpackage;

import java.security.PrivilegedAction;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgg implements PrivilegedAction {
    final /* synthetic */ dgi a;

    public dgg(dgi dgiVar) {
        this.a = dgiVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        dgi.f("org.bouncycastle.jcajce.provider.digest.", dgi.h);
        dgi.f("org.bouncycastle.jcajce.provider.symmetric.", dgi.d);
        dgi.f("org.bouncycastle.jcajce.provider.symmetric.", dgi.e);
        asv[] asvVarArr = dgi.l;
        int i = 0;
        while (true) {
            int length = asvVarArr.length;
            if (i == 38) {
                break;
            }
            asv asvVar = asvVarArr[i];
            try {
                def.a();
                dgi.e("org.bouncycastle.jcajce.provider.symmetric.", asvVar.g());
            } catch (dec unused) {
                Logger logger = dgi.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.logp(Level.FINE, "org.bouncycastle.jce.provider.BouncyCastleProvider", "loadAlgorithms", "service for " + asvVar.g() + " ignored due to constraints");
                }
            }
            i++;
        }
        dgi.f("org.bouncycastle.jcajce.provider.asymmetric.", dgi.f);
        dgi.f("org.bouncycastle.jcajce.provider.asymmetric.", dgi.g);
        dgi.f("org.bouncycastle.jcajce.provider.keystore.", dgi.i);
        dgi.f("org.bouncycastle.jcajce.provider.drbg.", dgi.j);
        dgi.d(dcd.n, new dmo(8, (char[][]) null));
        dgi.d(dcd.o, new dmo(8, (char[][]) null));
        dgi.d(dcd.p, new dmo(8, (char[][]) null));
        dgi.d(dcd.q, new dmo(8, (char[][]) null));
        dgi.d(dcd.r, new dmo(8, (char[][]) null));
        dgi.d(dcd.s, new dmo(8, (char[][]) null));
        dgi.d(dcd.t, new dmo(8, (char[][]) null));
        dgi.d(dcd.u, new dmo(8, (char[][]) null));
        dgi.d(dcd.v, new dmo(8, (char[][]) null));
        dgi.d(dcd.w, new dmo(8, (char[][]) null));
        dgi.d(dcd.x, new dmo(8, (char[][]) null));
        dgi.d(dcd.y, new dmo(8, (char[][]) null));
        dgi.d(dcd.z, new dmo(8, (char[][]) null));
        dgi.d(dcd.A, new dmo(8, (char[][]) null));
        dgi.d(dcd.B, new dmo(8, (char[][]) null));
        dgi.d(dcd.C, new dmo(8, (char[][]) null));
        dgi.d(dcd.D, new dmo(8, (char[][]) null));
        dgi.d(dcd.E, new dmo(8, (char[][]) null));
        dgi.d(dcd.F, new dmo(8, (char[][]) null));
        dgi.d(dcd.G, new dmo(8, (char[][]) null));
        dgi.d(dcd.H, new dmo(8, (char[][]) null));
        dgi.d(dcd.I, new dmo(8, (char[][]) null));
        dgi.d(dcd.J, new dmo(8, (char[][]) null));
        dgi.d(dcd.K, new dmo(8, (char[][]) null));
        dgi.d(dcd.L, new dmo(8, (char[][]) null));
        dgi.d(dcd.M, new dmo(8, (char[][]) null));
        dgi.d(dcd.N, new dmo(8, (char[][]) null));
        dgi.d(dcd.O, new dmo(8, (char[][]) null));
        dgi.d(dcd.P, new dmo(8, (char[][]) null));
        dgi.d(dcd.Q, new dmo(8, (char[][]) null));
        dgi.d(dcd.R, new dmo(8, (char[][]) null));
        dgi.d(dcd.S, new dmo(8, (char[][]) null));
        dgi.d(dcd.T, new dmo(8, (char[][]) null));
        dgi.d(dcd.U, new dmo(8, (char[][]) null));
        dgi.d(dcd.V, new dmo(8, (char[][]) null));
        dgi.d(dcd.W, new dmo(8, (char[][]) null));
        dgi.d(dcd.X, new dmo(8, (char[][]) null));
        dgi.d(dcd.aa, new dmo(8, (char[][]) null));
        dgi.d(dcd.ac, new dmo(8, (char[][]) null));
        dgi.d(dcd.ae, new dmo(8, (char[][]) null));
        dgi.d(new czv("1.3.9999.6.4.10"), new dmo(8, (char[][]) null));
        dgi.d(dcd.af, new dmo(8, (char[][]) null));
        dgi.d(dcd.ah, new dmo(8, (char[][]) null));
        dgi.d(dcd.aj, new dmo(8, (char[][]) null));
        dgi.d(dgr.d, new dmo(7, (byte[][]) null));
        dgi.d(dgr.e, new dmo(4, (int[]) null));
        dgi.d(dgr.f, new dmo(9, (short[][]) null));
        dgi.d(dfb.a, new dmo(9, (short[][]) null));
        dgi.d(dgr.g, new dmo(10, (int[][]) null));
        dgi.d(dfb.b, new dmo(10, (int[][]) null));
        dgi.d(dci.C, new dmo(3, (short[]) null));
        dgi.d(dcd.am, new dmo(6, (float[]) null));
        dgi.d(dcd.aA, new dmu());
        dgi.d(dcd.aB, new dmu());
        dgi.d(dcd.aC, new dmr());
        dgi.d(dcd.aD, new dmr());
        dgi.d(dcd.aE, new dmr());
        dgi.d(dcd.aF, new dmr());
        dgi.d(dcd.aG, new dmr());
        dgi.d(dcd.aH, new dmr());
        dgi.d(dcd.bN, new dmz());
        dgi.d(dcd.bO, new dmz());
        czv czvVar = dcd.bP;
        dgi.d(czvVar, new dmz());
        dgi.d(dcd.aU, new dmo(0));
        dgi.d(dcd.aW, new dmo(0));
        dgi.d(dcd.aY, new dmo(0));
        dgi.d(dcd.ba, new dmo(0));
        dgi.d(dcd.bc, new dmo(0));
        dgi.d(dcd.cj, new dmo(1, (byte[]) null));
        dgi.d(dcd.ck, new dmo(1, (byte[]) null));
        dgi.d(dcd.cl, new dmo(1, (byte[]) null));
        dgi dgiVar = this.a;
        dgi.d(dcd.cn, new dmo(2, (char[]) null));
        dgi.d(dcd.co, new dmo(2, (char[]) null));
        dgi.d(dcd.cp, new dmo(2, (char[]) null));
        dgi.d(czvVar, new dmz());
        dgi.d(dcd.bQ, new dmz());
        dgi.d(dcd.bR, new dmz());
        dgi.d(dcd.bS, new dmz());
        dgi.d(dcd.bG, new dmo(5, (boolean[]) null));
        dgi.d(dcd.bH, new dmo(5, (boolean[]) null));
        dgi.d(dcd.bI, new dmo(5, (boolean[]) null));
        dgi.d(dcd.bJ, new dmo(5, (boolean[]) null));
        dgiVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        dgiVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        dgiVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        dgiVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        dgiVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        dgiVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        dgiVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        dgiVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        dgiVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        dgiVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        dgiVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        dgiVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        dgiVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        dgiVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        dgiVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (dgi.c != null) {
            dgiVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            dgiVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            dgiVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            dgiVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            dgiVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            dgiVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
        } else {
            dgiVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            dgiVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            dgiVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            dgiVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            dgiVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            dgiVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        dgiVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        dgiVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        dgiVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        dgiVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        return null;
    }
}
