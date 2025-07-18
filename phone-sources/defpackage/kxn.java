package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxn extends kxv {
    private final kye a;

    public kxn(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kye c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 2 && this.a.equals(kxjVar.c())) {
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
        return 2;
    }

    public final String toString() {
        return "Action{openClusterPageAction=" + this.a.toString() + "}";
    }
}
