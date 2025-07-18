package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lud {
    public final ksn a;
    public final luc b;

    public lud() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lud) {
            lud ludVar = (lud) obj;
            if (this.a.equals(ludVar.a) && this.b.equals(ludVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        luc lucVar = this.b;
        return "UpdateNotificationSettingsRequest{account=" + this.a.toString() + ", setting=" + lucVar.toString() + "}";
    }

    public lud(ksn ksnVar, luc lucVar) {
        this.a = ksnVar;
        this.b = lucVar;
    }
}
