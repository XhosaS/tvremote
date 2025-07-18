package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwr implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient zjb a;
    private transient zth b;
    private transient zjo c;

    public zwr(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        this.c = zlqVar.b;
        this.a = zqb.a(zlqVar.a.b).a.a;
        this.b = (zth) vxr.bJ(zlqVar);
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
        if (obj instanceof zwr) {
            zwr zwrVar = (zwr) obj;
            if (this.a.w(zwrVar.a) && Arrays.equals(this.b.a(), zwrVar.b.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            zth zthVar = this.b;
            String str = zthVar.b;
            return vxr.bI(zthVar, this.c).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.a.hashCode() + (vxr.ba(this.b.a()) * 37);
    }
}
