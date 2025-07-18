package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwl implements Key, PrivateKey {
    private static final long serialVersionUID = 1;
    private transient zse a;
    private transient zjo b;

    public zwl(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        this.b = zlqVar.b;
        this.a = (zse) vxr.bJ(zlqVar);
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
        if (obj instanceof zwl) {
            return Arrays.equals(this.a.a(), ((zwl) obj).a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
        short[] sArrA = this.a.a();
        if (sArrA == null) {
            return 0;
        }
        int length = sArrA.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArrA[length] & 255);
        }
    }
}
