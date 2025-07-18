package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uic extends ulo {
    private final uln a;

    public uic(uln ulnVar) {
        this.a = ulnVar;
    }

    @Override // defpackage.ulo
    public final uln a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulo) {
            return this.a.equals(((ulo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SignallingConfig{service=" + this.a.toString() + "}";
    }
}
