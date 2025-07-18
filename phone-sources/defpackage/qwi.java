package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwi {
    public final qwh a;
    public final qwh b;
    public final qwh c;

    public qwi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qwi) {
            qwi qwiVar = (qwi) obj;
            if (this.a.equals(qwiVar.a) && this.b.equals(qwiVar.b) && this.c.equals(qwiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        qwh qwhVar = this.c;
        qwh qwhVar2 = this.b;
        return "AccountMenuClickListeners{myAccountClickListener=" + String.valueOf(this.a) + ", useAnotherAccountClickListener=" + String.valueOf(qwhVar2) + ", manageAccountsClickListener=" + String.valueOf(qwhVar) + "}";
    }

    public qwi(qwh qwhVar, qwh qwhVar2, qwh qwhVar3) {
        this.a = qwhVar;
        this.b = qwhVar2;
        this.c = qwhVar3;
    }
}
