package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yyj implements yoe, yri {
    public final yof a;
    final /* synthetic */ yyk b;

    public yyj(yyk yykVar, yof yofVar) {
        this.b = yykVar;
        this.a = yofVar;
    }

    @Override // defpackage.yri
    public final void A(ywp ywpVar, int i) {
        this.a.A(ywpVar, i);
    }

    @Override // defpackage.yoe
    public final void a(Object obj) {
        this.a.a(obj);
    }

    @Override // defpackage.yoe
    public final void b(yjv yjvVar) {
        throw null;
    }

    @Override // defpackage.yoe
    public final /* bridge */ /* synthetic */ void c(Object obj, yka ykaVar) {
        boolean z = yoy.a;
        yyk yykVar = this.b;
        yykVar.a.c(null);
        ynk ynkVar = new ynk(yykVar, 8);
        yof yofVar = this.a;
        yofVar.y(obj, yofVar.e, new age(ynkVar, 4));
    }

    @Override // defpackage.yoe
    public final /* bridge */ /* synthetic */ void d(yot yotVar, Object obj) {
        throw null;
    }

    @Override // defpackage.yoe
    public final boolean e(Throwable th) {
        return this.a.e(th);
    }

    @Override // defpackage.yoe
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.yoe
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.a.b;
    }

    @Override // defpackage.yoe
    public final /* synthetic */ Object h(Object obj, yka ykaVar) {
        boolean z = yoy.a;
        yyk yykVar = this.b;
        age ageVar = new age(yykVar, 5);
        yxo yxoVarD = this.a.D((ygi) obj, ageVar);
        if (yxoVarD != null) {
            yykVar.a.c(null);
        }
        return yxoVarD;
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
