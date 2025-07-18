package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class top implements agfi {
    final /* synthetic */ agff a;
    final /* synthetic */ toq b;

    public top(toq toqVar, agff agffVar) {
        this.a = agffVar;
        this.b = toqVar;
    }

    @Override // defpackage.agfi
    public final void a(final agfg agfgVar) {
        final agff agffVar = this.a;
        toq toqVar = this.b;
        toqVar.c.a.b(new Runnable() { // from class: too
            @Override // java.lang.Runnable
            public final void run() {
                agffVar.a(agfgVar);
            }
        }, toqVar.b, "subscribe()");
    }
}
