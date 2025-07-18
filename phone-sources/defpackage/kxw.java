package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxw extends kxz {
    private final kyg a;

    public kxw(kyg kygVar) {
        this.a = kygVar;
    }

    @Override // defpackage.kxz, defpackage.kyi
    public final kyg a() {
        return this.a;
    }

    @Override // defpackage.kyi
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyi) {
            kyi kyiVar = (kyi) obj;
            if (kyiVar.b() == 1 && this.a.equals(kyiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDetailsPageAction{movie=" + this.a.toString() + "}";
    }
}
