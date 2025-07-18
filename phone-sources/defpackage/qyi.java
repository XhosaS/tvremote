package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyi {
    public final qtg a;
    public final qtg b;
    public final qxx c = null;

    public qyi(qtg qtgVar, qtg qtgVar2) {
        this.a = qtgVar;
        this.b = qtgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyi)) {
            return false;
        }
        qyi qyiVar = (qyi) obj;
        if (!yks.e(this.a, qyiVar.a) || !yks.e(this.b, qyiVar.b)) {
            return false;
        }
        qxx qxxVar = qyiVar.c;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "PolicyFooterData(privacyPolicyClickListener=" + this.a + ", termsOfServiceClickListener=" + this.b + ", customItem=null)";
    }
}
