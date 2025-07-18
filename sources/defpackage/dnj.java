package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnj implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient czv a;
    private transient djz b;

    public dnj(ddp ddpVar) {
        a(ddpVar);
    }

    private final void a(ddp ddpVar) {
        this.a = dgs.a(ddpVar.a.b).a.a;
        this.b = (djz) dld.a(ddpVar);
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
        if (obj instanceof dnj) {
            dnj dnjVar = (dnj) obj;
            if (this.a.w(dnjVar.a) && Arrays.equals(this.b.a(), dnjVar.b.a())) {
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
            djz djzVar = this.b;
            String str = djzVar.b;
            return dnx.s(djzVar).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (dos.m(this.b.a()) * 37);
    }
}
