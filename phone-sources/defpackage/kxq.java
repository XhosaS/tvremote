package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxq extends kxv {
    private final kyj a;

    public kxq(kyj kyjVar) {
        this.a = kyjVar;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kyj e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 7 && this.a.equals(kxjVar.e())) {
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
        return 7;
    }

    public final String toString() {
        return "Action{openLibraryPageAction=" + this.a.toString() + "}";
    }
}
