package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkr extends tks {
    public final adcp a;

    public tkr(adcp adcpVar, acxn acxnVar) {
        super(acxnVar);
        this.a = adcpVar;
    }

    @Override // defpackage.tks
    public final Integer a(int i) {
        if (i != 2) {
            return null;
        }
        adcp adcpVar = this.a;
        if ((adcpVar.b & 256) != 0) {
            return Integer.valueOf(adcpVar.e);
        }
        return null;
    }

    @Override // defpackage.tks
    public final boolean b(int i) {
        if (i - 1 != 1) {
            return true;
        }
        return this.a.d;
    }
}
