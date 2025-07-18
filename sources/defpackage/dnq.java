package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnq implements PublicKey {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient dmi a;
    private transient czv b;

    public dnq(ddp ddpVar) {
        a(ddpVar);
    }

    private final void a(ddp ddpVar) {
        dmi dmiVar = (dmi) dld.a(ddpVar);
        this.a = dmiVar;
        this.b = dnx.c(dmiVar.b);
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
        if (obj instanceof dnq) {
            dnq dnqVar = (dnq) obj;
            try {
                if (this.b.w(dnqVar.b)) {
                    if (Arrays.equals(this.a.a(), dnqVar.a.a())) {
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
        try {
            return this.b.hashCode() + (dos.m(this.a.a()) * 37);
        } catch (IOException unused) {
            return this.b.hashCode();
        }
    }
}
