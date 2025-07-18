package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdg extends agtu implements agvb {
    final /* synthetic */ fdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdg(fdn fdnVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fdnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        fdn fdnVar = this.a;
        String strI = fdnVar.i();
        if (strI == null) {
            strI = "";
        }
        if (strI.length() != 0) {
            return strI;
        }
        fdnVar.d.d();
        return "";
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fdg(this.a, agswVar);
    }
}
