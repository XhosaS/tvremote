package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvw implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient zqs a;

    public zvw(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        this.a = (zqs) zum.a(zmwVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(zmw.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zvw) {
            return Arrays.equals(this.a.a(), ((zvw) obj).a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return zxr.c(this.a.b.k);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return vxr.bH(this.a).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return vxr.ba(this.a.a());
    }
}
