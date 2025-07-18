package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnl implements ahap, ahet {
    public final ahar a;
    final /* synthetic */ ahnm b;

    public ahnl(ahnm ahnmVar, ahar aharVar) {
        this.b = ahnmVar;
        this.a = aharVar;
    }

    @Override // defpackage.ahet
    public final void A(ahmd ahmdVar, int i) {
        throw null;
    }

    @Override // defpackage.ahap
    public final void a(agux aguxVar) {
        throw null;
    }

    @Override // defpackage.ahap
    public final /* synthetic */ void b(ahbm ahbmVar, Object obj) {
        throw null;
    }

    @Override // defpackage.ahap
    public final boolean c() {
        throw null;
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return this.a.b;
    }

    @Override // defpackage.ahap
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.ahap
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        boolean z = ahbx.a;
        final ahnm ahnmVar = this.b;
        ahnmVar.a.c(null);
        final agux aguxVar = new agux() { // from class: ahnk
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                ahnmVar.d();
                return agpu.a;
            }
        };
        ahar aharVar = this.a;
        aharVar.D(obj, aharVar.e, new agvc() { // from class: ahaq
            @Override // defpackage.agvc
            public final Object a(Object obj2, Object obj3, Object obj4) {
                aguxVar.a(obj2);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ahap
    public final /* bridge */ /* synthetic */ Object j(Object obj, agvc agvcVar) {
        boolean z = ahbx.a;
        final ahnm ahnmVar = this.b;
        agvc agvcVar2 = new agvc() { // from class: ahnj
            @Override // defpackage.agvc
            public final Object a(Object obj2, Object obj3, Object obj4) {
                boolean z2 = ahbx.a;
                ahnm ahnmVar2 = ahnmVar;
                ahnmVar2.a.c(null);
                ahnmVar2.d();
                return agpu.a;
            }
        };
        ahmg ahmgVarG = this.a.G((agpu) obj, agvcVar2);
        if (ahmgVarG != null) {
            ahnmVar.a.c(null);
        }
        return ahmgVarG;
    }

    @Override // defpackage.ahap
    public final void k(Throwable th) {
        throw null;
    }

    @Override // defpackage.ahap
    public final void l() {
        boolean z = ahbx.a;
        ahar aharVar = this.a;
        aharVar.y(aharVar.e);
    }
}
