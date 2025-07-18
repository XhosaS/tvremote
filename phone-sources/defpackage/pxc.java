package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxc extends pxe {
    private final qen a;

    public pxc(qen qenVar) {
        this.a = qenVar;
    }

    @Override // defpackage.pxe, defpackage.pxg
    public final qen a() {
        return this.a;
    }

    @Override // defpackage.pxg
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxg) {
            pxg pxgVar = (pxg) obj;
            if (pxgVar.b() == 1 && this.a.equals(pxgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationTarget{account=" + this.a.toString() + "}";
    }
}
