package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhd extends afhk {
    private final afhg a;

    public afhd(afhg afhgVar) {
        afhgVar.getClass();
        this.a = afhgVar;
    }

    @Override // defpackage.afhk
    public final afhg a(afhh afhhVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afhd) {
            return this.a.equals(((afhd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
