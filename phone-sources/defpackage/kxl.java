package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxl extends kxv {
    private final kxk a;

    public kxl(kxk kxkVar) {
        this.a = kxkVar;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kxk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 11 && this.a.equals(kxjVar.b())) {
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
        return 11;
    }

    public final String toString() {
        return "Action{androidAppAction=" + this.a.toString() + "}";
    }
}
