package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xro extends xrv {
    private final xrr a;

    public xro(xrr xrrVar) {
        xrrVar.getClass();
        this.a = xrrVar;
    }

    @Override // defpackage.xrv
    public final xrr a(xrs xrsVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xro) {
            return this.a.equals(((xro) obj).a);
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
