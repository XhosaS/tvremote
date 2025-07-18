package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwj implements PrivateKey, Key {
    private static final long serialVersionUID = 8568701712864512338L;
    private transient zrx a;
    private transient zjo b;

    public zwj(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        this.b = zlqVar.b;
        this.a = (zrx) vxr.bJ(zlqVar);
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
        if (!(obj instanceof zwj)) {
            return false;
        }
        try {
            return Arrays.equals(this.a.s(), ((zwj) obj).a.s());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
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
        try {
            return vxr.ba(this.a.s());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
