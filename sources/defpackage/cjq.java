package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjq extends ciy {
    final /* synthetic */ cjs a;
    private final chs b;

    public cjq(cjs cjsVar, chs chsVar) {
        this.a = cjsVar;
        this.b = chsVar;
    }

    @Override // defpackage.ciy
    public final /* bridge */ /* synthetic */ Object a() {
        cja cjaVarA = this.b.a();
        cjaVarA.getClass();
        return cjaVarA;
    }

    @Override // defpackage.ciy
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.ciy
    public final void d(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.ciy
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.e((cja) obj);
    }

    @Override // defpackage.ciy
    public final boolean g() {
        return this.a.isDone();
    }
}
