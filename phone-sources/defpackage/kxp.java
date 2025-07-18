package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxp extends kxv {
    private final kaf a;

    public kxp(kaf kafVar) {
        this.a = kafVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 4 && this.a.equals(kxjVar.l())) {
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
        return 4;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kaf l() {
        return this.a;
    }

    public final String toString() {
        return "Action{openHomePageAction=" + this.a.toString() + "}";
    }
}
