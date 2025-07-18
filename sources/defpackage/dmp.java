package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmp implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient dhq a;
    private transient String b;
    private transient byte[] c;
    private transient dai d;

    public dmp(dcj dcjVar) {
        a(dcjVar);
    }

    private final void a(dcj dcjVar) {
        dhq dhqVar = (dhq) dnx.u(dcjVar);
        this.d = dcjVar.b;
        this.a = dhqVar;
        this.b = doj.c(dhqVar.b.e);
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
        if (obj instanceof dmp) {
            return Arrays.equals(getEncoded(), ((dmp) obj).getEncoded());
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
            this.c = dnx.d(this.a, this.d);
        }
        return dos.p(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return dos.m(getEncoded());
    }
}
