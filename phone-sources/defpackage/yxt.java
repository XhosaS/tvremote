package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxt implements yik {
    private final ThreadLocal a;

    public yxt(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxt) && yks.e(this.a, ((yxt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ")";
    }
}
