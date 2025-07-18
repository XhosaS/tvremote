package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxt extends kxv {
    private final kaf a;

    public kxt(kaf kafVar) {
        this.a = kafVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 6 && this.a.equals(kxjVar.j())) {
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
        return 6;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kaf j() {
        return this.a;
    }

    public final String toString() {
        return "Action{openWatchlistPageAction=" + this.a.toString() + "}";
    }
}
