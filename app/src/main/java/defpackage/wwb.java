package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwb extends wwc implements wwa {
    public static final wwc a;
    static final wwc b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        wwc wwcVarE = new wwb(null, new wx(0)).e();
        a = wwcVarE;
        wwa wwaVarB = wwcVarE.b();
        wwaVarB.a(wwc.c, true);
        b = ((wwc) wwaVarB).e();
    }

    public wwb(wwc wwcVar, wx wxVar) {
        super(wwcVar, wxVar);
    }

    @Override // defpackage.wwa
    public final void a(wvz wvzVar, Object obj) {
        yqw.M(!this.e, "Can't mutate after handing to trace");
        obj.getClass();
        yqw.M(!g(wvzVar), "Key already present");
        this.d.put(wvzVar, obj);
    }
}
