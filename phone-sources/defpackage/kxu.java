package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxu extends kxv {
    private final kyp a;

    public kxu(kyp kypVar) {
        this.a = kypVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 8 && this.a.equals(kxjVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kyp h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kxj
    public final int i() {
        return 8;
    }

    public final String toString() {
        return "Action{playbackAction=" + this.a.toString() + "}";
    }
}
