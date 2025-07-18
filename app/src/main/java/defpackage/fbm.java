package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbm extends agtu implements agvb {
    int a;
    final /* synthetic */ fbn b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbm(fbn fbnVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = fbnVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fbm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fbn fbnVar = this.b;
            final String str = this.c;
            this.a = 1;
            Object objB = fbnVar.a.a.b(new agux() { // from class: ftm
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fxg fxgVar = (fxg) obj2;
                    fxgVar.getClass();
                    String str2 = fxgVar.e;
                    String str3 = str;
                    if (agvy.c(str2, str3)) {
                        return fxgVar;
                    }
                    fxc fxcVar = new fxc();
                    fxcVar.B(fxgVar);
                    if ((fxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fxcVar.y();
                    }
                    ((fxg) fxcVar.b).e = str3;
                    return fxh.a(fxcVar);
                }
            }, this);
            if (objB != agtgVar) {
                objB = agpu.a;
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fbm(this.b, this.c, agswVar);
    }
}
