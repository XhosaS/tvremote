package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadk implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient aabs a;

    public aadk(aabs aabsVar) {
        this.a = aabsVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (aabs) objectInputStream.readObject();
    }

    private Object readResolve() {
        return aadl.Q(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
    }
}
