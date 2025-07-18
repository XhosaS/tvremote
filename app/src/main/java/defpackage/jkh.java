package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkh extends agtu implements agux {
    int a;
    final /* synthetic */ jkx b;
    final /* synthetic */ gez c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkh(jkx jkxVar, gez gezVar, agsw agswVar) {
        super(1, agswVar);
        this.b = jkxVar;
        this.c = gezVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jkh(this.b, this.c, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        jkx jkxVar = this.b;
        gez gezVar = this.c;
        final grh grhVar = (grh) jkxVar.i;
        zyd zydVarA = grhVar.a(gezVar, new Runnable() { // from class: grb
            @Override // java.lang.Runnable
            public final void run() {
                grh grhVar2 = grhVar;
                grhVar2.b(true);
                grhVar2.c.e();
            }
        });
        this.a = 1;
        Object objB = ahkr.b(zydVarA, this);
        return objB == agtgVar ? agtgVar : objB;
    }
}
