package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tuy<T> {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    private final Class e;

    protected tuy(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public void a(Iterator it, tux tuxVar) {
        while (it.hasNext()) {
            b(it.next(), tuxVar);
        }
    }

    public void b(Object obj, tux tuxVar) {
        tuxVar.a(this.a, obj);
    }

    public final Object c(Object obj) {
        return this.e.cast(obj);
    }

    public final String toString() {
        Class cls = this.e;
        return getClass().getName() + "/" + this.a + "[" + cls.getName() + "]";
    }

    public tuy(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!tyq.b(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!tyq.b(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.a = str;
        this.e = cls;
        this.b = z;
        this.c = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.d = j;
    }
}
