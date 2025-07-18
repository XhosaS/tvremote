package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvx extends KeyFactorySpi implements zpm {
    private final /* synthetic */ int a;

    public zvx(int i, byte[] bArr) {
        this.a = i;
    }

    @Override // defpackage.zpm
    public final PrivateKey a(zlq zlqVar) {
        throw null;
    }

    @Override // defpackage.zpm
    public final PublicKey b(zmw zmwVar) {
        switch (this.a) {
            case 0:
                return new zvw(zmwVar);
            case 1:
                return new zvu(zmwVar);
            case 2:
                return new zwf(zmwVar);
            case 3:
                return new zwk(zmwVar);
            case 4:
                return new zwm(zmwVar);
            case 5:
                return new zwo(zmwVar);
            case 6:
                return new zwq(zmwVar);
            case 7:
                return new zws(zmwVar);
            case 8:
                return new zwu(zmwVar);
            case 9:
                return new zwz(zmwVar);
            default:
                return new zwx(zmwVar);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.a) {
            case 0:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zvv(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e.toString());
                }
            case 1:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zvt(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e2) {
                    throw new InvalidKeySpecException(e2.toString());
                }
            case 2:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zwe(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e3) {
                    throw new InvalidKeySpecException(e3.toString());
                }
            case 3:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "unsupported key specification: "));
                }
                try {
                    return new zwj(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e4) {
                    throw new InvalidKeySpecException(e4.toString(), e4);
                }
            case 4:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zwl(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e5) {
                    throw new InvalidKeySpecException(e5.toString());
                }
            case 5:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zwn(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e6) {
                    throw new InvalidKeySpecException(e6.toString());
                }
            case 6:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zwp(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            case 7:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zwr(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e8) {
                    throw new InvalidKeySpecException(e8.toString());
                }
            case 8:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new zwt(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e9) {
                    throw new InvalidKeySpecException(e9.toString());
                }
            case 9:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "unsupported key specification: "));
                }
                try {
                    return new zwy(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e10) {
                    throw new InvalidKeySpecException(e10.toString());
                }
            default:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(hhh.e(keySpec, "unsupported key specification: "));
                }
                try {
                    return new zww(zlq.b(zjh.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e11) {
                    throw new InvalidKeySpecException(e11.toString());
                }
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.a) {
            case 0:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zvw(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e.toString());
                }
            case 1:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zvu(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e2) {
                    throw new InvalidKeySpecException(e2.toString());
                }
            case 2:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zwf(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e3) {
                    throw new InvalidKeySpecException(e3.toString());
                }
            case 3:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "unknown key specification: ", "."));
                }
                try {
                    return new zwk(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e4) {
                    throw new InvalidKeySpecException(e4.toString(), e4);
                }
            case 4:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zwm(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e5) {
                    throw new InvalidKeySpecException(e5.toString());
                }
            case 5:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zwo(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e6) {
                    throw new InvalidKeySpecException(e6.toString());
                }
            case 6:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zwq(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            case 7:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zws(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e8) {
                    throw new InvalidKeySpecException(e8.toString());
                }
            case 8:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new zwu(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e9) {
                    throw new InvalidKeySpecException(e9.toString());
                }
            case 9:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "unknown key specification: ", "."));
                }
                try {
                    return new zwz(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e10) {
                    throw new InvalidKeySpecException(e10.toString());
                }
            default:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(a.cw(keySpec, "unknown key specification: ", "."));
                }
                try {
                    return new zwx(zmw.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e11) {
                    throw new InvalidKeySpecException(e11.toString());
                }
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        switch (this.a) {
            case 0:
                if (key instanceof zvv) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zvw)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 1:
                if (key instanceof zvt) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zvu)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 2:
                if (key instanceof zwe) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwf)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 3:
                if (key instanceof zwj) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwk)) {
                        throw new InvalidKeySpecException(hhh.f(key, "unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "unknown key specification: ", "."));
            case 4:
                if (key instanceof zwl) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwm)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 5:
                if (key instanceof zwn) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwo)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 6:
                if (key instanceof zwp) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwq)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 7:
                if (key instanceof zwr) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zws)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 8:
                if (key instanceof zwt) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwu)) {
                        throw new InvalidKeySpecException(hhh.f(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "Unknown key specification: ", "."));
            case 9:
                if (key instanceof zwy) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwz)) {
                        throw new InvalidKeySpecException(hhh.f(key, "unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "unknown key specification: ", "."));
            default:
                if (key instanceof zww) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof zwx)) {
                        throw new InvalidKeySpecException(hhh.f(key, "unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(a.cw(cls, "unknown key specification: ", "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        switch (this.a) {
            case 0:
                if (!(key instanceof zvv) && !(key instanceof zvw)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 1:
                if (!(key instanceof zvt) && !(key instanceof zvu)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 2:
                if (!(key instanceof zwe) && !(key instanceof zwf)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 3:
                if (!(key instanceof zwj) && !(key instanceof zwk)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            case 4:
                if (!(key instanceof zwl) && !(key instanceof zwm)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 5:
                if (!(key instanceof zwn) && !(key instanceof zwo)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 6:
                if (!(key instanceof zwp) && !(key instanceof zwq)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 7:
                if (!(key instanceof zwr) && !(key instanceof zws)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 8:
                if (!(key instanceof zwt) && !(key instanceof zwu)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 9:
                if (!(key instanceof zwy) && !(key instanceof zwz)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            default:
                if (!(key instanceof zww) && !(key instanceof zwx)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
        }
    }

    public zvx(int i) {
        this.a = i;
    }

    public zvx(int i, char[] cArr) {
        this.a = i;
    }

    public zvx(int i, short[] sArr) {
        this.a = i;
    }

    public zvx(int i, int[] iArr) {
        this.a = i;
    }

    public zvx(int i, boolean[] zArr) {
        this.a = i;
    }

    public zvx(int i, float[] fArr) {
        this.a = i;
    }

    public zvx(int i, byte[][] bArr) {
        this.a = i;
    }

    public zvx(int i, char[][] cArr) {
        this.a = i;
    }

    public zvx(int i, short[][] sArr) {
        this.a = i;
    }

    public zvx(int i, int[][] iArr) {
        this.a = i;
    }
}
