package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtf extends vtr {
    public final String a;
    public final int b;

    public vtf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.vtr
    public final String a() {
        return this.a;
    }

    @Override // defpackage.vtr
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vtr) {
            vtr vtrVar = (vtr) obj;
            if (this.a.equals(vtrVar.a()) && this.b == vtrVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + (i != 1 ? i != 2 ? i != 3 ? "CANCEL_AND_REENQUEUE" : "UPDATE" : "KEEP" : "REPLACE") + "}";
    }
}
