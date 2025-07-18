package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byp implements Serializable, byo {
    private static final long serialVersionUID = 0;
    final byo a;
    volatile transient boolean b;
    transient Object c;
    private transient cav d = new cav(null);

    public byp(byo byoVar) {
        this.a = byoVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new cav(null);
    }

    @Override // defpackage.byo
    public final Object aL() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object objAL = this.a.aL();
                    this.c = objAL;
                    this.b = true;
                    return objAL;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return b.i(obj, "Suppliers.memoize(", ")");
    }
}
