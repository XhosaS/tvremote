package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axp {
    public final gnh a;
    private final axo b;

    public axp(gnh gnhVar, axo axoVar) {
        this.a = gnhVar;
        this.b = axoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axp)) {
            return false;
        }
        axp axpVar = (axp) obj;
        return yks.e(this.a, axpVar.a) && yks.e(this.b, axpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
