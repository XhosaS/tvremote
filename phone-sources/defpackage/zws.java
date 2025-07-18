package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zws implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient zjb a;
    private transient zti b;

    public zws(zmw zmwVar) {
        a(zmwVar);
    }

    private final void a(zmw zmwVar) {
        this.a = zqb.a(zmwVar.a.b).a.a;
        this.b = (zti) zum.a(zmwVar);
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
        if (obj instanceof zws) {
            zws zwsVar = (zws) obj;
            if (this.a.w(zwsVar.a) && Arrays.equals(this.b.a(), zwsVar.b.a())) {
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
            zti ztiVar = this.b;
            String str = ztiVar.b;
            return vxr.bH(ztiVar).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (vxr.ba(this.b.a()) * 37);
    }
}
