package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dno implements PublicKey {
    private static final long serialVersionUID = 3230324130542413475L;
    private transient czv a;
    private transient dmb b;

    public dno(ddp ddpVar) {
        a(ddpVar);
    }

    private final void a(ddp ddpVar) {
        dmb dmbVar = (dmb) dld.a(ddpVar);
        this.b = dmbVar;
        this.a = dnx.c(dmbVar.b);
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
        if (obj instanceof dno) {
            dno dnoVar = (dno) obj;
            if (this.a.w(dnoVar.a) && Arrays.equals(this.b.c(), dnoVar.b.c())) {
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
            return dnx.s(this.b).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (dos.m(this.b.c()) * 37);
    }
}
