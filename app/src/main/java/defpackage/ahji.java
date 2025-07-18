package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahji extends agtu implements agvb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahji(ahjj ahjjVar, agsw agswVar) {
        super(2, agswVar);
        this.c = ahjjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahji) c((ahge) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahge ahgeVar = (ahge) this.b;
            ahjj ahjjVar = this.c;
            this.a = 1;
            if (ahjjVar.b(ahgeVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahji ahjiVar = new ahji(this.c, agswVar);
        ahjiVar.b = obj;
        return ahjiVar;
    }
}
