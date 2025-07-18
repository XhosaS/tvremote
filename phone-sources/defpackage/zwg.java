package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwg implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient zre a;
    private transient String b;
    private transient zjo c;

    public zwg(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        this.c = zlqVar.b;
        zre zreVar = (zre) vxr.bJ(zlqVar);
        this.a = zreVar;
        this.b = zxr.c(zreVar.b.d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(zlq.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwg) {
            return Arrays.equals(getEncoded(), ((zwg) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return vxr.bI(this.a, this.c).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return vxr.ba(getEncoded());
    }
}
