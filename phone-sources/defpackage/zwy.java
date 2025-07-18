package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwy implements PrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    private transient zvp a;
    private transient zjb b;
    private transient zjo c;

    public zwy(zlq zlqVar) {
        a(zlqVar);
    }

    private final void a(zlq zlqVar) {
        this.c = zlqVar.b;
        this.b = zqe.a(zlqVar.a.b).b.a;
        this.a = (zvp) vxr.bJ(zlqVar);
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
        if (obj instanceof zwy) {
            zwy zwyVar = (zwy) obj;
            if (this.b.w(zwyVar.b) && Arrays.equals(this.a.a(), zwyVar.a.a())) {
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
            return vxr.bI(this.a, this.c).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.b.hashCode() + (vxr.ba(this.a.a()) * 37);
    }
}
