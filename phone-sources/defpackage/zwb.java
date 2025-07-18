package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwb implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient zri a;
    private transient String b;
    private transient byte[] c;
    private transient zjo d;

    public zwb(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        zri zriVar = (zri) vxr.bJ(zlqVar);
        this.d = zlqVar.b;
        this.a = zriVar;
        this.b = zxr.c(zriVar.b.c);
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
        if (obj instanceof zwb) {
            return Arrays.equals(getEncoded(), ((zwb) obj).getEncoded());
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
            this.c = vxr.br(this.a, this.d);
        }
        return vxr.bd(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return vxr.ba(getEncoded());
    }
}
