package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnn implements PrivateKey {
    private static final long serialVersionUID = 7682140473044521395L;
    private transient czv a;
    private transient dma b;
    private transient dai c;

    public dnn(dcj dcjVar) {
        a(dcjVar);
    }

    private final void a(dcj dcjVar) {
        this.c = dcjVar.b;
        this.a = dgw.a(dcjVar.a.b).c.a;
        this.b = (dma) dnx.u(dcjVar);
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
        if (obj instanceof dnn) {
            dnn dnnVar = (dnn) obj;
            if (this.a.w(dnnVar.a) && Arrays.equals(this.b.a(), dnnVar.b.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return dnx.t(this.b, this.c).s();
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
