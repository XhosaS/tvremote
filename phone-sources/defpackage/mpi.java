package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpi implements sbn {
    public final String a;

    public mpi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpi) && yks.e(this.a, ((mpi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SortOptionChangedEvent(newSortOption=" + this.a + ")";
    }
}
