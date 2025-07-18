package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmw implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient dii a;

    public dmw(ddp ddpVar) {
        a(ddpVar);
    }

    private final void a(ddp ddpVar) {
        this.a = (dii) dld.a(ddpVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(ddp.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmw) {
            return Arrays.equals(this.a.a(), ((dmw) obj).a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return doj.c(this.a.b.d);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return dnx.s(this.a).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return dos.m(this.a.a());
    }
}
