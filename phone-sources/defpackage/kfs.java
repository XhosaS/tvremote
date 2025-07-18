package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfs extends sbx {
    private final kdh a;

    public kfs(kdh kdhVar) {
        this.a = kdhVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new kfu();
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        kfr kfrVar = (kfr) obj;
        kfu kfuVar = (kfu) obj2;
        jub jubVar = new jub(kfrVar, 8);
        sco scoVar = new sco(kfrVar.a);
        if (!yks.e(kfuVar.a, scoVar)) {
            kfuVar.a = scoVar;
            kfuVar.G(0);
        }
        kfuVar.b = new scc("R.id.season", kfuVar, jubVar);
        kfuVar.G(1);
    }
}
