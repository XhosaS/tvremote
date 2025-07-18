package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dms implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient dhz a;
    private transient String b;
    private transient byte[] c;
    private transient dai d;

    public dms(dcj dcjVar) {
        a(dcjVar);
    }

    private final void a(dcj dcjVar) {
        dhz dhzVar = (dhz) dnx.u(dcjVar);
        this.d = dcjVar.b;
        this.a = dhzVar;
        this.b = doj.c(dhzVar.b.c);
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
        if (obj instanceof dms) {
            return Arrays.equals(getEncoded(), ((dms) obj).getEncoded());
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
