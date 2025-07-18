package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmq implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient dhr a;
    private transient String b;
    private transient byte[] c;

    public dmq(ddp ddpVar) {
        a(ddpVar);
    }

    private final void a(ddp ddpVar) {
        dhr dhrVar = (dhr) dld.a(ddpVar);
        this.a = dhrVar;
        this.b = doj.c(dhrVar.b.e);
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
        if (obj instanceof dmq) {
            return Arrays.equals(getEncoded(), ((dmq) obj).getEncoded());
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
            this.c = dnx.e(this.a);
        }
        return dos.p(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return dos.m(getEncoded());
    }
}
