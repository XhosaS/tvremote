package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0002a extends j$.nio.file.attribute.a implements Serializable {
    public static final C0002a b;
    private static final long serialVersionUID = 6740630888130243051L;
    public final w a;

    static {
        System.currentTimeMillis();
        b = new C0002a(y.e);
    }

    public C0002a(w wVar) {
        this.a = wVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0002a)) {
            return false;
        }
        return this.a.equals(((C0002a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + String.valueOf(this.a) + "]";
    }
}
