package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yrq implements Serializable, yrp {
    private static final long serialVersionUID = 0;
    final yrp a;
    volatile transient boolean b;
    transient Object c;
    private transient ysa d = new ysa();

    public yrq(yrp yrpVar) {
        yrpVar.getClass();
        this.a = yrpVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new ysa();
    }

    @Override // defpackage.yrp
    public final Object eV() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object objEV = this.a.eV();
                    this.c = objEV;
                    this.b = true;
                    return objEV;
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
        return a.t(obj, "Suppliers.memoize(", ")");
    }
}
