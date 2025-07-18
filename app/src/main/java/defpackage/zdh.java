package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zdh implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b = this;

    public zdh(Object obj) {
        this.a = obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = ((yxl) this.a).a.toString();
        }
        return string;
    }
}
