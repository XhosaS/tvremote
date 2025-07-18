package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zwx implements PublicKey {
    private static final long serialVersionUID = 3230324130542413475L;
    private transient zjb a;
    private transient zvk b;

    public zwx(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        zvk zvkVar = (zvk) zum.a(zmwVar);
        this.b = zvkVar;
        this.a = vxr.bq(zvkVar.b);
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
        if (obj instanceof zwx) {
            zwx zwxVar = (zwx) obj;
            if (this.a.w(zwxVar.a) && Arrays.equals(this.b.c(), zwxVar.b.c())) {
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
            return vxr.bH(this.b).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (vxr.ba(this.b.c()) * 37);
    }
}
