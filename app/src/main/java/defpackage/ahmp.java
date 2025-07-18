package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmp implements agtd {
    private final ThreadLocal a;

    public ahmp(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahmp) && agvy.c(this.a, ((ahmp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ")";
    }
}
