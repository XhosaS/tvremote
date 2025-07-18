package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ims extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ims(ind indVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ims) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ind indVar;
        owx owxVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0 && (owxVar = (indVar = this.b).w) != null) {
            String str = this.c;
            fze fzeVar = indVar.g;
            this.a = 1;
            if (fzw.h((fzw) fzeVar, owxVar, str, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ims(this.b, this.c, agswVar);
    }
}
