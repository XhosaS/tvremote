package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhx implements yik {
    private final yyk a;

    public qhx(yyk yykVar) {
        this.a = yykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhx) && yks.e(this.a, ((qhx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ")";
    }
}
