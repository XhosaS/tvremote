package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatv implements aauv {
    private final aasi a;

    public aatv(aasi aasiVar) {
        this.a = aasiVar;
    }

    @Override // defpackage.aauv
    public final aawa a(aaut aautVar) {
        afem afemVar = aautVar.b;
        afel afelVar = aasj.a;
        yqw.M(afemVar.h(afelVar) == null, "ChannelConfig provided twice");
        return new aawa(1, null, null, afemVar.f(afelVar, this.a));
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa b() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa c() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa e() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void d(aaus aausVar) {
    }
}
