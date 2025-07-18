package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dga {
    private static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(dez.b, "Ed25519");
        map.put(dez.c, "Ed448");
        map.put(dfh.b, "SHA1withDSA");
        map.put(deb.o, "SHA1withDSA");
    }

    static String a(dcw dcwVar) {
        String strG;
        String strG2;
        czv czvVar = dcwVar.a;
        czb czbVar = dcwVar.b;
        if (!h(czbVar)) {
            if (dci.f.w(czvVar)) {
                boolean z = czbVar instanceof dck;
                dcw dcwVar2 = dck.a;
                return String.valueOf(f((z ? (dck) czbVar : czbVar != null ? new dck(dag.j(czbVar)) : null).e.a)).concat("withRSAandMGF1");
            }
            if (deb.g.w(czvVar)) {
                return String.valueOf(f((czv) dag.j(czbVar).h(0))).concat("withECDSA");
            }
        }
        String str = (String) a.get(czvVar);
        if (str != null) {
            return str;
        }
        Provider provider = Security.getProvider("BC");
        if (provider != null && (strG2 = g(provider, czvVar)) != null) {
            return strG2;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2 && (strG = g(provider2, czvVar)) != null) {
                return strG;
            }
        }
        return czvVar.b();
    }

    static void b(byte[] bArr, StringBuffer stringBuffer, String str) {
        if (bArr.length <= 20) {
            stringBuffer.append("            Signature: ");
            stringBuffer.append(dop.a(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append("            Signature: ");
        stringBuffer.append(dop.b(bArr, 0, 20));
        stringBuffer.append(str);
        int i = 20;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return;
            }
            if (i < length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(dop.b(bArr, i, 20));
                stringBuffer.append(str);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(dop.b(bArr, i, length - i));
                stringBuffer.append(str);
            }
            i += 20;
        }
    }

    static void c(Signature signature, czb czbVar) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidAlgorithmParameterException {
        if (h(czbVar)) {
            return;
        }
        String algorithm = signature.getAlgorithm();
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithm, signature.getProvider());
        try {
            algorithmParameters.init(czbVar.p().s());
            if (algorithm.endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e) {
                    throw new SignatureException("Exception extracting parameters: ".concat(String.valueOf(e.getMessage())));
                }
            }
        } catch (IOException e2) {
            throw new SignatureException("IOException decoding parameters: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    static boolean d(dcw dcwVar, dcw dcwVar2) {
        if (!dcwVar.a.w(dcwVar2.a)) {
            return false;
        }
        if (doh.b("org.bouncycastle.x509.allow_absent_equiv_NULL") && h(dcwVar.b) && h(dcwVar2.b)) {
            return true;
        }
        return dos.l(dcwVar.b, dcwVar2.b);
    }

    static boolean e(dcw dcwVar) {
        return dfd.m.w(dcwVar.a);
    }

    private static String f(czv czvVar) {
        String strB = (String) dge.a.get(czvVar);
        if (strB == null) {
            strB = czvVar.b();
        }
        int iIndexOf = strB.indexOf(45);
        if (iIndexOf <= 0 || strB.startsWith("SHA3")) {
            return strB;
        }
        return String.valueOf(strB.substring(0, iIndexOf)).concat(String.valueOf(strB.substring(iIndexOf + 1)));
    }

    private static String g(Provider provider, czv czvVar) {
        String property = provider.getProperty("Alg.Alias.Signature.".concat(String.valueOf(String.valueOf(czvVar))));
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID.".concat(String.valueOf(String.valueOf(czvVar))));
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    private static boolean h(czb czbVar) {
        dbg dbgVar;
        return czbVar == null || (dbgVar = dbg.a) == czbVar || dbgVar.d(czbVar.p());
    }
}
