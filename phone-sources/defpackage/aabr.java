package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aabr implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    private transient String a;

    public aabr(String str) {
        this.a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }

    private Object readResolve() {
        return aabs.l(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.a);
    }
}
