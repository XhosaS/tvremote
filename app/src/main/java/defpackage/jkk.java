package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkk extends agtu implements agux {
    int a;
    final /* synthetic */ jkx b;
    final /* synthetic */ xjj c;
    final /* synthetic */ gez d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkk(jkx jkxVar, xjj xjjVar, gez gezVar, agsw agswVar) {
        super(1, agswVar);
        this.b = jkxVar;
        this.c = xjjVar;
        this.d = gezVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jkk(this.b, this.c, this.d, (agsw) obj).b(agpu.a);
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
        final xjj xjjVar = this.c;
        gez gezVar = this.d;
        final grh grhVar = (grh) jkxVar.i;
        zyd zydVarA = grhVar.a(gezVar, new Runnable() { // from class: gra
            @Override // java.lang.Runnable
            public final void run() {
                Duration durationOfMillis = Duration.ofMillis(xjjVar.b);
                durationOfMillis.getClass();
                grhVar.c.c(durationOfMillis, true);
            }
        });
        this.a = 1;
        Object objB = ahkr.b(zydVarA, this);
        return objB == agtgVar ? agtgVar : objB;
    }
}
