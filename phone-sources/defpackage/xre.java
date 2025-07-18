package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xre {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    private final String d;

    public xre(String str, String str2, long j) {
        str.getClass();
        sij.o(!str.isEmpty(), "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public static xre a(Class cls, String str) {
        cls.getClass();
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static xre b(String str, String str2) {
        return new xre(str, str2, b.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c + "<" + this.a + ">");
        String str = this.d;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
