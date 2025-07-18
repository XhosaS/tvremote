package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhy implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public yhy(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collectionO;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(a.cd(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(a.cd(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            yia yiaVar = new yia(new yhu(i2));
            while (i3 < i2) {
                yiaVar.add(objectInput.readObject());
                i3++;
            }
            collectionO = wcq.ai(yiaVar);
        } else {
            yhp yhpVar = new yhp(i2);
            while (i3 < i2) {
                yhpVar.add(objectInput.readObject());
                i3++;
            }
            collectionO = yfm.o(yhpVar);
        }
        this.a = collectionO;
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

    public yhy() {
        this(yhb.a, 0);
    }
}
