package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwk implements PublicKey, Key {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient zrx a;

    public zwk(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        this.a = (zrx) zum.a(zmwVar);
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
        if (obj instanceof zwk) {
            try {
                return Arrays.equals(this.a.s(), ((zwk) obj).a.s());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
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
        try {
            return vxr.ba(this.a.s());
        } catch (IOException unused) {
            return -1;
        }
    }
}
