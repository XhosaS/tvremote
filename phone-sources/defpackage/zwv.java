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
/* loaded from: classes3.dex */
public abstract class zwv extends KeyFactorySpi implements zpm {
    private final Set a;

    protected zwv(Set set) {
        this.a = set;
    }

    private final void c(zjb zjbVar) throws InvalidKeySpecException {
        if (!this.a.contains(zjbVar)) {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: ".concat(String.valueOf(String.valueOf(zjbVar))));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
        }
        try {
            zlq zlqVarB = zlq.b(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            c(zlqVarB.a.a);
            return a(zlqVarB);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
        }
        try {
            zmw zmwVarB = zmw.b(((X509EncodedKeySpec) keySpec).getEncoded());
            c(zmwVarB.a.a);
            return b(zmwVarB);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }
}
