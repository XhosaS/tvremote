package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxs extends kxv {
    private final kaf a;

    public kxs(kaf kafVar) {
        this.a = kafVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 5 && this.a.equals(kxjVar.k())) {
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
        return 5;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kaf k() {
        return this.a;
    }

    public final String toString() {
        return "Action{openShopPageAction=" + this.a.toString() + "}";
    }
}
