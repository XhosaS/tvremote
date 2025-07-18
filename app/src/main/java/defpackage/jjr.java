package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjr extends agtu implements agvb {
    int a;
    final /* synthetic */ jkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjr(jkx jkxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jkxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jkx jkxVar = this.b;
            jkxVar.j.v();
            this.a = 1;
            ahar aharVar = new ahar(agth.c(this), 1);
            aharVar.z();
            jjf jjfVar = new jjf(jkxVar, aharVar);
            eyw eywVar = jkxVar.f;
            eywVar.a(jjfVar);
            aharVar.a(new jje(jkxVar, jjfVar));
            if (!eywVar.k) {
                eywVar.b(jjfVar);
                aharVar.e(agpu.a);
            }
            Object objM = aharVar.m();
            if (objM != agtgVar) {
                objM = agpu.a;
            }
            if (objM == agtgVar) {
                return agtgVar;
            }
        }
        zdy zdyVar = jkx.a;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jjr(this.b, agswVar);
    }
}
