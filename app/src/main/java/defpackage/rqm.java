package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqm extends rql {
    public final int a;
    public final yzq b;
    public final rqo c;

    public rqm(int i, yzq yzqVar, rqo rqoVar) {
        this.a = i;
        if (yzqVar == null) {
            throw new NullPointerException("Null loggerId");
        }
        this.b = yzqVar;
        this.c = rqoVar;
    }

    @Override // defpackage.rql
    public final int a() {
        return this.a;
    }

    @Override // defpackage.rql
    public final rqo b() {
        return this.c;
    }

    public final String toString() {
        rqo rqoVar = this.c;
        return "AppFlowEventIdentifier{eventId=" + this.a + ", loggerId=" + this.b.toString() + ", clientId=" + rqoVar.toString() + "}";
    }
}
