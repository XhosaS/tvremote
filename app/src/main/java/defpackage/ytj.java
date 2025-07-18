package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ytj implements Serializable, ysb {
    private static final long serialVersionUID = 1;
    public final yug a;

    public ytj(yug yugVar) {
        this.a = yugVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    Object writeReplace() {
        return new ytk(this.a);
    }

    public ytj(ysh yshVar) {
        this.a = new yug(yshVar, null);
    }
}
