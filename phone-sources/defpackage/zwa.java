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
/* loaded from: classes3.dex */
public final class zwa extends zwv {
    private static final Set a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(zlk.aC);
        hashSet.add(zlk.aD);
        hashSet.add(zlk.aE);
        hashSet.add(zlk.aF);
        hashSet.add(zlk.aG);
        hashSet.add(zlk.aH);
    }

    public zwa() {
        super(a);
    }

    @Override // defpackage.zpm
    public final PrivateKey a(zlq zlqVar) {
        return new zvy(zlqVar);
    }

    @Override // defpackage.zpm
    public final PublicKey b(zmw zmwVar) {
        return new zvz(zmwVar);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof zvy) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof zvz)) {
                throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof zvy) || (key instanceof zvz)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
