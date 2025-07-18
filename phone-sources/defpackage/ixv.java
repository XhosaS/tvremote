package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixv implements sbn {
    public final wod a;

    public ixv(wod wodVar) {
        this.a = wodVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixv) && yks.e(this.a, ((ixv) obj).a);
    }

    public final int hashCode() {
        wod wodVar = this.a;
        if (wodVar.A()) {
            return wodVar.j();
        }
        int i = wodVar.M;
        if (i != 0) {
            return i;
        }
        int iJ = wodVar.j();
        wodVar.M = iJ;
        return iJ;
    }

    public final String toString() {
        return "FilterTagsChangedEvent(selectedTags=" + this.a + ")";
    }
}
