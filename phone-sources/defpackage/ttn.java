package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttn<T> implements Serializable, ttm {
    private static final long serialVersionUID = 0;
    final ttm a;
    volatile transient boolean b;
    transient Object c;
    private transient kww d = new kww();

    public ttn(ttm ttmVar) {
        this.a = ttmVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new kww();
    }

    @Override // defpackage.ttm
    public final T get() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    T t = (T) this.a.get();
                    this.c = t;
                    this.b = true;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.ch(obj, "Suppliers.memoize(", ")");
    }
}
