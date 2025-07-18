package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iya implements sbn {
    public final String a;

    public iya(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iya) && yks.e(this.a, ((iya) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SortSelectionChangedEvent(sortId=" + this.a + ")";
    }
}
