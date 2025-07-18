package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxy extends kxz {
    private final kyh a;

    public kxy(kyh kyhVar) {
        this.a = kyhVar;
    }

    @Override // defpackage.kyi
    public final int b() {
        return 2;
    }

    @Override // defpackage.kxz, defpackage.kyi
    public final kyh d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyi) {
            kyi kyiVar = (kyi) obj;
            if (kyiVar.b() == 2 && this.a.equals(kyiVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDetailsPageAction{show=" + this.a.toString() + "}";
    }
}
