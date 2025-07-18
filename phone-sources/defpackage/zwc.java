package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwc implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient zrj a;
    private transient String b;
    private transient byte[] c;

    public zwc(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        zrj zrjVar = (zrj) zum.a(zmwVar);
        this.a = zrjVar;
        this.b = zxr.c(zrjVar.b.c);
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
        if (obj instanceof zwc) {
            return Arrays.equals(getEncoded(), ((zwc) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.c == null) {
            this.c = vxr.bs(this.a);
        }
        return vxr.bd(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return vxr.ba(getEncoded());
    }
}
