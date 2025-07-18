package defpackage;

import java.security.PrivilegedAction;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpp implements PrivilegedAction {
    final /* synthetic */ zpr a;

    public zpp(zpr zprVar) {
        this.a = zprVar;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        zpr.f("org.bouncycastle.jcajce.provider.digest.", zpr.i);
        zpr.f("org.bouncycastle.jcajce.provider.symmetric.", zpr.d);
        zpr.f("org.bouncycastle.jcajce.provider.symmetric.", zpr.e);
        znk[] znkVarArr = zpr.f;
        int i = 0;
        while (true) {
            int length = znkVarArr.length;
            if (i == 38) {
                break;
            }
            znk znkVar = znkVarArr[i];
            try {
                znn.a();
                zpr.e("org.bouncycastle.jcajce.provider.symmetric.", znkVar.a());
            } catch (znj unused) {
                Logger logger = zpr.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.logp(Level.FINE, "org.bouncycastle.jce.provider.BouncyCastleProvider", "loadAlgorithms", "service for " + znkVar.a() + " ignored due to constraints");
                }
            }
            i++;
        }
        zpr.f("org.bouncycastle.jcajce.provider.asymmetric.", zpr.g);
        zpr.f("org.bouncycastle.jcajce.provider.asymmetric.", zpr.h);
        zpr.f("org.bouncycastle.jcajce.provider.keystore.", zpr.j);
        zpr.f("org.bouncycastle.jcajce.provider.drbg.", zpr.k);
        zpr.d(zlk.n, new zvx(8, (char[][]) null));
        zpr.d(zlk.o, new zvx(8, (char[][]) null));
        zpr.d(zlk.p, new zvx(8, (char[][]) null));
        zpr.d(zlk.q, new zvx(8, (char[][]) null));
        zpr.d(zlk.r, new zvx(8, (char[][]) null));
        zpr.d(zlk.s, new zvx(8, (char[][]) null));
        zpr.d(zlk.t, new zvx(8, (char[][]) null));
        zpr.d(zlk.u, new zvx(8, (char[][]) null));
        zpr.d(zlk.v, new zvx(8, (char[][]) null));
        zpr.d(zlk.w, new zvx(8, (char[][]) null));
        zpr.d(zlk.x, new zvx(8, (char[][]) null));
        zpr.d(zlk.y, new zvx(8, (char[][]) null));
        zpr.d(zlk.z, new zvx(8, (char[][]) null));
        zpr.d(zlk.A, new zvx(8, (char[][]) null));
        zpr.d(zlk.B, new zvx(8, (char[][]) null));
        zpr.d(zlk.C, new zvx(8, (char[][]) null));
        zpr.d(zlk.D, new zvx(8, (char[][]) null));
        zpr.d(zlk.E, new zvx(8, (char[][]) null));
        zpr.d(zlk.F, new zvx(8, (char[][]) null));
        zpr.d(zlk.G, new zvx(8, (char[][]) null));
        zpr.d(zlk.H, new zvx(8, (char[][]) null));
        zpr.d(zlk.I, new zvx(8, (char[][]) null));
        zpr.d(zlk.J, new zvx(8, (char[][]) null));
        zpr.d(zlk.K, new zvx(8, (char[][]) null));
        zpr.d(zlk.L, new zvx(8, (char[][]) null));
        zpr.d(zlk.M, new zvx(8, (char[][]) null));
        zpr.d(zlk.N, new zvx(8, (char[][]) null));
        zpr.d(zlk.O, new zvx(8, (char[][]) null));
        zpr.d(zlk.P, new zvx(8, (char[][]) null));
        zpr.d(zlk.Q, new zvx(8, (char[][]) null));
        zpr.d(zlk.R, new zvx(8, (char[][]) null));
        zpr.d(zlk.S, new zvx(8, (char[][]) null));
        zpr.d(zlk.T, new zvx(8, (char[][]) null));
        zpr.d(zlk.U, new zvx(8, (char[][]) null));
        zpr.d(zlk.V, new zvx(8, (char[][]) null));
        zpr.d(zlk.W, new zvx(8, (char[][]) null));
        zpr.d(zlk.X, new zvx(8, (char[][]) null));
        zpr.d(zlk.aa, new zvx(8, (char[][]) null));
        zpr.d(zlk.ac, new zvx(8, (char[][]) null));
        zpr.d(zlk.ae, new zvx(8, (char[][]) null));
        zpr.d(new zjb("1.3.9999.6.4.10"), new zvx(8, (char[][]) null));
        zpr.d(zlk.af, new zvx(8, (char[][]) null));
        zpr.d(zlk.ah, new zvx(8, (char[][]) null));
        zpr.d(zlk.aj, new zvx(8, (char[][]) null));
        zpr.d(zqa.d, new zvx(7, (byte[][]) null));
        zpr.d(zqa.e, new zvx(4, (int[]) null));
        zpr.d(zqa.f, new zvx(9, (short[][]) null));
        zpr.d(zok.a, new zvx(9, (short[][]) null));
        zpr.d(zqa.g, new zvx(10, (int[][]) null));
        zpr.d(zok.b, new zvx(10, (int[][]) null));
        zpr.d(zlp.C, new zvx(3, (short[]) null));
        zpr.d(zlk.am, new zvx(6, (float[]) null));
        zpr.d(zlk.aA, new zwd());
        zpr.d(zlk.aB, new zwd());
        zpr.d(zlk.aC, new zwa());
        zpr.d(zlk.aD, new zwa());
        zpr.d(zlk.aE, new zwa());
        zpr.d(zlk.aF, new zwa());
        zpr.d(zlk.aG, new zwa());
        zpr.d(zlk.aH, new zwa());
        zpr.d(zlk.bN, new zwi());
        zpr.d(zlk.bO, new zwi());
        zjb zjbVar = zlk.bP;
        zpr.d(zjbVar, new zwi());
        zpr.d(zlk.aU, new zvx(0));
        zpr.d(zlk.aW, new zvx(0));
        zpr.d(zlk.aY, new zvx(0));
        zpr.d(zlk.ba, new zvx(0));
        zpr.d(zlk.bc, new zvx(0));
        zpr.d(zlk.cj, new zvx(1, (byte[]) null));
        zpr.d(zlk.ck, new zvx(1, (byte[]) null));
        zpr.d(zlk.cl, new zvx(1, (byte[]) null));
        zpr zprVar = this.a;
        zpr.d(zlk.cn, new zvx(2, (char[]) null));
        zpr.d(zlk.co, new zvx(2, (char[]) null));
        zpr.d(zlk.cp, new zvx(2, (char[]) null));
        zpr.d(zjbVar, new zwi());
        zpr.d(zlk.bQ, new zwi());
        zpr.d(zlk.bR, new zwi());
        zpr.d(zlk.bS, new zwi());
        zpr.d(zlk.bG, new zvx(5, (boolean[]) null));
        zpr.d(zlk.bH, new zvx(5, (boolean[]) null));
        zpr.d(zlk.bI, new zvx(5, (boolean[]) null));
        zpr.d(zlk.bJ, new zvx(5, (boolean[]) null));
        zprVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        zprVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        zprVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        zprVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        zprVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        zprVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        zprVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        zprVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        zprVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        zprVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        zprVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        zprVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        zprVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        zprVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        zprVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (zpr.c != null) {
            zprVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            zprVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            zprVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            zprVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            zprVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            zprVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
        } else {
            zprVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            zprVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            zprVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            zprVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            zprVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            zprVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        zprVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        zprVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        zprVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        zprVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        return null;
    }
}
