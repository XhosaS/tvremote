package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lka extends lkb {
    private final int a;
    private final int b;

    public lka(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.lkb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lkb
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lkb) {
            lkb lkbVar = (lkb) obj;
            if (this.a == lkbVar.a() && this.b == lkbVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
