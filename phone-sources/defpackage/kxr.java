package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxr extends kxv {
    private final kyk a;

    public kxr(kyk kykVar) {
        this.a = kykVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (kxjVar.i() == 9 && this.a.equals(kxjVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kxv, defpackage.kxj
    public final kyk f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kxj
    public final int i() {
        return 9;
    }

    public final String toString() {
        return "Action{openSettingsPageAction=" + this.a.toString() + "}";
    }
}
