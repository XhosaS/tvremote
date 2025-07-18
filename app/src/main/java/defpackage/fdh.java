package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdh extends agtu implements agvb {
    final /* synthetic */ fdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdh(fdn fdnVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fdnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        fdn fdnVar = this.a;
        String strJ = fdnVar.j();
        if (strJ == null) {
            strJ = "";
        }
        if (strJ.length() != 0) {
            return strJ;
        }
        fdnVar.d.e();
        return "";
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fdh(this.a, agswVar);
    }
}
