package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmr extends dnm {
    private static final Set a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(dcd.aC);
        hashSet.add(dcd.aD);
        hashSet.add(dcd.aE);
        hashSet.add(dcd.aF);
        hashSet.add(dcd.aG);
        hashSet.add(dcd.aH);
    }

    public dmr() {
        super(a);
    }

    @Override // defpackage.dgd
    public final PrivateKey a(dcj dcjVar) {
        return new dmp(dcjVar);
    }

    @Override // defpackage.dgd
    public final PublicKey b(ddp ddpVar) {
        return new dmq(ddpVar);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof dmp) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof dmq)) {
                throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof dmp) || (key instanceof dmq)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
