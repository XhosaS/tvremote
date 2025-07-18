package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpq implements voy {
    public final boolean a;
    private final vrr b = vrr.b;

    public vpq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.voy
    public final vrr a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpq) && this.a == ((vpq) obj).a;
    }

    public final int hashCode() {
        return a.q(this.a);
    }

    public final String toString() {
        return "ExpandOrCollapseAccountManagement(isExpanded=" + this.a + ")";
    }
}
