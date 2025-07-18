package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsj implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public agsj(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collectionA;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(a.a(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(a.a(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            agsl agslVar = new agsl(new agsf(i2));
            while (i3 < i2) {
                agslVar.add(objectInput.readObject());
                i3++;
            }
            collectionA = agrp.a(agslVar);
        } else {
            agrx agrxVar = new agrx(i2);
            while (i3 < i2) {
                agrxVar.add(objectInput.readObject());
                i3++;
            }
            collectionA = agqq.a(agrxVar);
        }
        this.a = collectionA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public agsj() {
        this(agrd.a, 0);
    }
}
