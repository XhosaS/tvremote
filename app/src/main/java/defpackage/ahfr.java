package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfr extends ahfs {
    public final Throwable a;

    public ahfr(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ahfr) && agvy.c(this.a, ((ahfr) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ahfs
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
