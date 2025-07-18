package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnp implements PrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    private transient dmg a;
    private transient czv b;
    private transient dai c;

    public dnp(dcj dcjVar) {
        a(dcjVar);
    }

    private final void a(dcj dcjVar) {
        this.c = dcjVar.b;
        this.b = dgv.a(dcjVar.a.b).b.a;
        this.a = (dmg) dnx.u(dcjVar);
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
        if (obj instanceof dnp) {
            dnp dnpVar = (dnp) obj;
            if (this.b.w(dnpVar.b) && Arrays.equals(this.a.a(), dnpVar.a.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return dnx.t(this.a, this.c).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.b.hashCode() + (dos.m(this.a.a()) * 37);
    }
}
