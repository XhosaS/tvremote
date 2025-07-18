package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thd extends agtu implements agvb {
    int a;
    final /* synthetic */ the b;
    final /* synthetic */ zmw c;
    final /* synthetic */ rru d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thd(the theVar, zmw zmwVar, rru rruVar, agsw agswVar) {
        super(2, agswVar);
        this.b = theVar;
        this.c = zmwVar;
        this.d = rruVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((thd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return null;
        }
        the theVar = this.b;
        zmw zmwVar = this.c;
        rru rruVar = this.d;
        zpf zpfVar = zpf.GENERIC_APP_FLOW;
        final yzq yzqVarD = rruVar.d();
        final tho[] thoVarArr = {new tho() { // from class: tgw
            @Override // defpackage.tho
            public final void a(jyv jyvVar) {
                zdl it = yzqVarD.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.getClass();
                    jyvVar.m(num.intValue());
                }
            }
        }, new tho() { // from class: tgx
            @Override // defpackage.tho
            public final void a(jyv jyvVar) {
            }
        }};
        tho thoVar = new tho() { // from class: tgy
            @Override // defpackage.tho
            public final void a(jyv jyvVar) {
                for (int i2 = 0; i2 < 2; i2++) {
                    thoVarArr[i2].a(jyvVar);
                }
            }
        };
        this.a = 1;
        if (ahbu.a(new thc(theVar, zmwVar, zpfVar, thoVar, null), this) == agtgVar) {
            return agtgVar;
        }
        return null;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new thd(this.b, this.c, this.d, agswVar);
    }
}
