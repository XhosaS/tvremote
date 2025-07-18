package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwh implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient zrf a;
    private transient String b;
    private transient byte[] c;

    public zwh(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        zrf zrfVar = (zrf) zum.a(zmwVar);
        this.a = zrfVar;
        this.b = zxr.c(zrfVar.b.d);
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
        if (obj instanceof zwh) {
            return Arrays.equals(getEncoded(), ((zwh) obj).getEncoded());
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
