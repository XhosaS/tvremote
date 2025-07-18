package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvt implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient zqm a;
    private transient zjo b;

    public zvt(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        this.b = zlqVar.b;
        this.a = (zqm) vxr.bJ(zlqVar);
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
        if (obj instanceof zvt) {
            return Arrays.equals(this.a.a(), ((zvt) obj).a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return zxr.c(this.a.b.d);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return vxr.bI(this.a, this.b).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return vxr.ba(this.a.a());
    }
}
