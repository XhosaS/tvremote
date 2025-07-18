package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zer {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public zer(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!ziu.c(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!ziu.c(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.e = j;
    }

    public void a(Iterator it, zeq zeqVar) {
        while (it.hasNext()) {
            b(it.next(), zeqVar);
        }
    }

    public void b(Object obj, zeq zeqVar) {
        zeqVar.a(this.a, obj);
    }

    public final String toString() {
        Class cls = this.b;
        return getClass().getName() + "/" + this.a + "[" + cls.getName() + "]";
    }
}
