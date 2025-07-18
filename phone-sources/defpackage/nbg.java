package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbg implements lhf {
    public final lws a;
    public final rzy b;

    public nbg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbg) {
            nbg nbgVar = (nbg) obj;
            if (this.a.equals(nbgVar.a) && this.b.equals(nbgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        rzy rzyVar = this.b;
        return "ActorInfoCardClickEvent{person=" + this.a.toString() + ", uiNode=" + rzyVar.toString() + "}";
    }

    public nbg(lws lwsVar, rzy rzyVar) {
        if (lwsVar == null) {
            throw new NullPointerException("Null person");
        }
        this.a = lwsVar;
        this.b = rzyVar;
    }
}
