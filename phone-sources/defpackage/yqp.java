package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yqp extends yot {
    protected final String e() {
        yqp yqpVarI;
        yot yotVar = ypk.a;
        yqp yqpVar = yxi.a;
        if (this == yqpVar) {
            return "Dispatchers.Main";
        }
        try {
            yqpVarI = yqpVar.i();
        } catch (UnsupportedOperationException unused) {
            yqpVarI = null;
        }
        if (this == yqpVarI) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // defpackage.yot
    public final yot g(int i) {
        wae.S(1);
        return this;
    }

    public abstract yqp i();

    @Override // defpackage.yot
    public String toString() {
        String strE = e();
        if (strE != null) {
            return strE;
        }
        return yoz.a(this) + "@" + yoz.b(this);
    }
}
