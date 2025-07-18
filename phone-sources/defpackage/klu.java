package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klu implements kly {
    public final wli a;

    public klu(wli wliVar) {
        this.a = wliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klu) && yks.e(this.a, ((klu) obj).a);
    }

    public final int hashCode() {
        wli wliVar = this.a;
        if (wliVar.A()) {
            return wliVar.j();
        }
        int i = wliVar.M;
        if (i != 0) {
            return i;
        }
        int iJ = wliVar.j();
        wliVar.M = iJ;
        return iJ;
    }

    public final String toString() {
        return "Empty(emptyWidgetResult=" + this.a + ")";
    }
}
