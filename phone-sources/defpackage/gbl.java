package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbl extends gez {
    public final Throwable a;

    public gbl(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbl) && yks.e(this.a, ((gbl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ylh.t("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
    }
}
