package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class voz implements voy {
    public final boolean a;
    private final vrr b = vrr.b;

    public voz(boolean z) {
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
        return (obj instanceof voz) && this.a == ((voz) obj).a;
    }

    public final int hashCode() {
        return a.q(this.a);
    }

    public final String toString() {
        return "AccountMenuScroll(isScrolled=" + this.a + ")";
    }
}
