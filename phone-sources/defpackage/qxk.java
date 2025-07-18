package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxk implements qyf {
    public final qxj a;
    public final List b;

    public qxk(qxj qxjVar, List list) {
        this.a = qxjVar;
        this.b = list;
    }

    @Override // defpackage.qyf
    public final /* synthetic */ pjt a() {
        return rdd.i(this);
    }

    @Override // defpackage.qyf
    public final qxj b() {
        return this.a;
    }

    @Override // defpackage.qyf
    public final List c() {
        return this.b;
    }

    @Override // defpackage.qyf
    public final /* synthetic */ boolean d() {
        return rdd.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxk)) {
            return false;
        }
        qxk qxkVar = (qxk) obj;
        return yks.e(this.a, qxkVar.a) && yks.e(this.b, qxkVar.b);
    }

    public final int hashCode() {
        qxj qxjVar = this.a;
        return ((qxjVar == null ? 0 : qxjVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountsModelData(selectedAccount=" + this.a + ", nonSelectedAccounts=" + this.b + ")";
    }
}
