package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxx extends kxz {
    private final kyf a;

    public kxx(kyf kyfVar) {
        this.a = kyfVar;
    }

    @Override // defpackage.kyi
    public final int b() {
        return 3;
    }

    @Override // defpackage.kxz, defpackage.kyi
    public final kyf c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyi) {
            kyi kyiVar = (kyi) obj;
            if (kyiVar.b() == 3 && this.a.equals(kyiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDetailsPageAction{movieBundle=" + this.a.toString() + "}";
    }
}
