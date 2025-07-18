package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dni implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient czv a;
    private transient djy b;
    private transient dai c;

    public dni(dcj dcjVar) {
        a(dcjVar);
    }

    private final void a(dcj dcjVar) {
        this.c = dcjVar.b;
        this.a = dgs.a(dcjVar.a.b).a.a;
        this.b = (djy) dnx.u(dcjVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(dcj.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dni) {
            dni dniVar = (dni) obj;
            if (this.a.w(dniVar.a) && Arrays.equals(this.b.a(), dniVar.b.a())) {
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
            djy djyVar = this.b;
            String str = djyVar.b;
            return dnx.t(djyVar, this.c).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.a.hashCode() + (dos.m(this.b.a()) * 37);
    }
}
