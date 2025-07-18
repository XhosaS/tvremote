package defpackage;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dnm extends KeyFactorySpi implements dgd {
    private final Set a;

    protected dnm(Set set) {
        this.a = set;
    }

    private final void c(czv czvVar) throws InvalidKeySpecException {
        if (!this.a.contains(czvVar)) {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: ".concat(String.valueOf(String.valueOf(czvVar))));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
        }
        try {
            dcj dcjVarB = dcj.b(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            c(dcjVarB.a.a);
            return a(dcjVarB);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
        }
        try {
            ddp ddpVarB = ddp.b(((X509EncodedKeySpec) keySpec).getEncoded());
            c(ddpVarB.a.a);
            return b(ddpVarB);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }
}
