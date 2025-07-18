package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfx implements Serializable {
    public final Throwable a;

    public yfx(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yfx) && yks.e(this.a, ((yfx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ")";
    }
}
