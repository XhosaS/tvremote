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
/* loaded from: classes.dex */
public final class dmo extends KeyFactorySpi implements dgd {
    private final /* synthetic */ int a;

    public dmo(int i, byte[] bArr) {
        this.a = i;
    }

    @Override // defpackage.dgd
    public final PrivateKey a(dcj dcjVar) {
        throw null;
    }

    @Override // defpackage.dgd
    public final PublicKey b(ddp ddpVar) {
        switch (this.a) {
            case 0:
                return new dmn(ddpVar);
            case 1:
                return new dml(ddpVar);
            case 2:
                return new dmw(ddpVar);
            case 3:
                return new dnb(ddpVar);
            case 4:
                return new dnd(ddpVar);
            case 5:
                return new dnf(ddpVar);
            case 6:
                return new dnh(ddpVar);
            case 7:
                return new dnj(ddpVar);
            case 8:
                return new dnl(ddpVar);
            case 9:
                return new dnq(ddpVar);
            default:
                return new dno(ddpVar);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.a) {
            case 0:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dmm(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e.toString());
                }
            case 1:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dmk(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e2) {
                    throw new InvalidKeySpecException(e2.toString());
                }
            case 2:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dmv(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e3) {
                    throw new InvalidKeySpecException(e3.toString());
                }
            case 3:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "unsupported key specification: "));
                }
                try {
                    return new dna(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e4) {
                    throw new InvalidKeySpecException(e4.toString(), e4);
                }
            case 4:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dnc(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e5) {
                    throw new InvalidKeySpecException(e5.toString());
                }
            case 5:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dne(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e6) {
                    throw new InvalidKeySpecException(e6.toString());
                }
            case 6:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dng(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            case 7:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dni(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e8) {
                    throw new InvalidKeySpecException(e8.toString());
                }
            case 8:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "Unsupported key specification: "));
                }
                try {
                    return new dnk(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e9) {
                    throw new InvalidKeySpecException(e9.toString());
                }
            case 9:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "unsupported key specification: "));
                }
                try {
                    return new dnp(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                } catch (Exception e10) {
                    throw new InvalidKeySpecException(e10.toString());
                }
            default:
                if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.k(keySpec, "unsupported key specification: "));
                }
                try {
                    return new dnn(dcj.b(dab.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
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
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dmn(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e.toString());
                }
            case 1:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dml(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e2) {
                    throw new InvalidKeySpecException(e2.toString());
                }
            case 2:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dmw(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e3) {
                    throw new InvalidKeySpecException(e3.toString());
                }
            case 3:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "unknown key specification: ", "."));
                }
                try {
                    return new dnb(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e4) {
                    throw new InvalidKeySpecException(e4.toString(), e4);
                }
            case 4:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dnd(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e5) {
                    throw new InvalidKeySpecException(e5.toString());
                }
            case 5:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dnf(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e6) {
                    throw new InvalidKeySpecException(e6.toString());
                }
            case 6:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dnh(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            case 7:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dnj(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e8) {
                    throw new InvalidKeySpecException(e8.toString());
                }
            case 8:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "Unknown key specification: ", "."));
                }
                try {
                    return new dnl(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e9) {
                    throw new InvalidKeySpecException(e9.toString());
                }
            case 9:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "unknown key specification: ", "."));
                }
                try {
                    return new dnq(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e10) {
                    throw new InvalidKeySpecException(e10.toString());
                }
            default:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    throw new InvalidKeySpecException(b.j(keySpec, "unknown key specification: ", "."));
                }
                try {
                    return new dno(ddp.b(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e11) {
                    throw new InvalidKeySpecException(e11.toString());
                }
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        switch (this.a) {
            case 0:
                if (key instanceof dmm) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dmn)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 1:
                if (key instanceof dmk) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dml)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 2:
                if (key instanceof dmv) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dmw)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 3:
                if (key instanceof dna) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnb)) {
                        throw new InvalidKeySpecException(b.l(key, "unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "unknown key specification: ", "."));
            case 4:
                if (key instanceof dnc) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnd)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 5:
                if (key instanceof dne) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnf)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 6:
                if (key instanceof dng) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnh)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 7:
                if (key instanceof dni) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnj)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 8:
                if (key instanceof dnk) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnl)) {
                        throw new InvalidKeySpecException(b.l(key, "Unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "Unknown key specification: ", "."));
            case 9:
                if (key instanceof dnp) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dnq)) {
                        throw new InvalidKeySpecException(b.l(key, "unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "unknown key specification: ", "."));
            default:
                if (key instanceof dnn) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(key.getEncoded());
                    }
                } else {
                    if (!(key instanceof dno)) {
                        throw new InvalidKeySpecException(b.l(key, "unsupported key type: "));
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(key.getEncoded());
                    }
                }
                throw new InvalidKeySpecException(b.j(cls, "unknown key specification: ", "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        switch (this.a) {
            case 0:
                if (!(key instanceof dmm) && !(key instanceof dmn)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 1:
                if (!(key instanceof dmk) && !(key instanceof dml)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 2:
                if (!(key instanceof dmv) && !(key instanceof dmw)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 3:
                if (!(key instanceof dna) && !(key instanceof dnb)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            case 4:
                if (!(key instanceof dnc) && !(key instanceof dnd)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 5:
                if (!(key instanceof dne) && !(key instanceof dnf)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 6:
                if (!(key instanceof dng) && !(key instanceof dnh)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 7:
                if (!(key instanceof dni) && !(key instanceof dnj)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 8:
                if (!(key instanceof dnk) && !(key instanceof dnl)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
                return key;
            case 9:
                if (!(key instanceof dnp) && !(key instanceof dnq)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
            default:
                if (!(key instanceof dnn) && !(key instanceof dno)) {
                    throw new InvalidKeyException("unsupported key type");
                }
                return key;
        }
    }

    public dmo(int i) {
        this.a = i;
    }

    public dmo(int i, char[] cArr) {
        this.a = i;
    }

    public dmo(int i, short[] sArr) {
        this.a = i;
    }

    public dmo(int i, int[] iArr) {
        this.a = i;
    }

    public dmo(int i, boolean[] zArr) {
        this.a = i;
    }

    public dmo(int i, float[] fArr) {
        this.a = i;
    }

    public dmo(int i, byte[][] bArr) {
        this.a = i;
    }

    public dmo(int i, char[][] cArr) {
        this.a = i;
    }

    public dmo(int i, short[][] sArr) {
        this.a = i;
    }

    public dmo(int i, int[][] iArr) {
        this.a = i;
    }
}
