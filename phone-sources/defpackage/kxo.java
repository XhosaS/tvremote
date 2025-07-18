package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxo extends kxv {
    private final kyi a;

    public kxo(kyi kyiVar) {
        this.a = kyiVar;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kyi d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 3 && this.a.equals(kxjVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kxj
    public final int i() {
        return 3;
    }

    public final String toString() {
        return "Action{openDetailsPageAction=" + this.a.toString() + "}";
    }
}
