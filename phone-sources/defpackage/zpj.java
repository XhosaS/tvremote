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
/* loaded from: classes3.dex */
final class zpj {
    private static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(zoi.b, "Ed25519");
        map.put(zoi.c, "Ed448");
        map.put(zoq.b, "SHA1withDSA");
        map.put(zni.o, "SHA1withDSA");
    }

    static String a(zmd zmdVar) {
        String strG;
        String strG2;
        zjb zjbVar = zmdVar.a;
        zih zihVar = zmdVar.b;
        if (!h(zihVar)) {
            if (zlp.f.w(zjbVar)) {
                boolean z = zihVar instanceof zlr;
                zmd zmdVar2 = zlr.a;
                return String.valueOf(f((z ? (zlr) zihVar : zihVar != null ? new zlr(zjm.j(zihVar)) : null).e.a)).concat("withRSAandMGF1");
            }
            if (zni.g.w(zjbVar)) {
                return String.valueOf(f((zjb) zjm.j(zihVar).h(0))).concat("withECDSA");
            }
        }
        String str = (String) a.get(zjbVar);
        if (str != null) {
            return str;
        }
        Provider provider = Security.getProvider("BC");
        if (provider != null && (strG2 = g(provider, zjbVar)) != null) {
            return strG2;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2 && (strG = g(provider2, zjbVar)) != null) {
                return strG;
            }
        }
        return zjbVar.b();
    }

    static void b(byte[] bArr, StringBuffer stringBuffer, String str) {
        if (bArr.length <= 20) {
            stringBuffer.append("            Signature: ");
            stringBuffer.append(zxx.a(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append("            Signature: ");
        stringBuffer.append(zxx.b(bArr, 0, 20));
        stringBuffer.append(str);
        int i = 20;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return;
            }
            if (i < length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(zxx.b(bArr, i, 20));
                stringBuffer.append(str);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(zxx.b(bArr, i, length - i));
                stringBuffer.append(str);
            }
            i += 20;
        }
    }

    static void c(Signature signature, zih zihVar) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidAlgorithmParameterException {
        if (h(zihVar)) {
            return;
        }
        String algorithm = signature.getAlgorithm();
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithm, signature.getProvider());
        try {
            algorithmParameters.init(zihVar.p().s());
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

    static boolean d(zmd zmdVar, zmd zmdVar2) {
        if (!zmdVar.a.w(zmdVar2.a)) {
            return false;
        }
        if (zxp.b("org.bouncycastle.x509.allow_absent_equiv_NULL") && h(zmdVar.b) && h(zmdVar2.b)) {
            return true;
        }
        return vxr.aZ(zmdVar.b, zmdVar2.b);
    }

    static boolean e(zmd zmdVar) {
        return zom.m.w(zmdVar.a);
    }

    private static String f(zjb zjbVar) {
        String strB = (String) zpn.a.get(zjbVar);
        if (strB == null) {
            strB = zjbVar.b();
        }
        int iIndexOf = strB.indexOf(45);
        if (iIndexOf <= 0 || strB.startsWith("SHA3")) {
            return strB;
        }
        return String.valueOf(strB.substring(0, iIndexOf)).concat(String.valueOf(strB.substring(iIndexOf + 1)));
    }

    private static String g(Provider provider, zjb zjbVar) {
        String property = provider.getProperty("Alg.Alias.Signature.".concat(String.valueOf(String.valueOf(zjbVar))));
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID.".concat(String.valueOf(String.valueOf(zjbVar))));
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    private static boolean h(zih zihVar) {
        zkm zkmVar;
        return zihVar == null || (zkmVar = zkm.a) == zihVar || zkmVar.d(zihVar.p());
    }
}
