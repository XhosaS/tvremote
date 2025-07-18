package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyb {
    public final qyk a;
    public final qyj b;
    public final rbo c;
    public final rbi d;
    public final xzg e;

    public qyb(qyk qykVar, qyj qyjVar, rbo rboVar, xzg xzgVar, rbi rbiVar) {
        this.a = qykVar;
        this.b = qyjVar;
        this.c = rboVar;
        this.e = xzgVar;
        this.d = rbiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyb)) {
            return false;
        }
        qyb qybVar = (qyb) obj;
        return yks.e(this.a, qybVar.a) && yks.e(this.b, qybVar.b) && yks.e(this.c, qybVar.c) && yks.e(this.e, qybVar.e) && yks.e(this.d, qybVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "FragmentInjectables(viewModelData=" + this.a + ", renderingObjects=" + this.b + ", logAndDismissOnBackPressedCallback=" + this.c + ", bentoIntentLauncherBinder=" + this.e + ", onResultEventHandler=" + this.d + ")";
    }
}
