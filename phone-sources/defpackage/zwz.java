package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwz implements PublicKey {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient zvr a;
    private transient zjb b;

    public zwz(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        zvr zvrVar = (zvr) zum.a(zmwVar);
        this.a = zvrVar;
        this.b = vxr.bq(zvrVar.b);
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
        if (obj instanceof zwz) {
            zwz zwzVar = (zwz) obj;
            try {
                if (this.b.w(zwzVar.b)) {
                    if (Arrays.equals(this.a.a(), zwzVar.a.a())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
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
            return this.b.hashCode() + (vxr.ba(this.a.a()) * 37);
        } catch (IOException unused) {
            return this.b.hashCode();
        }
    }
}
