package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toq implements nzy {
    public final nzy a;
    public final String b;
    final /* synthetic */ tor c;

    public toq(tor torVar, nzy nzyVar, String str) {
        this.c = torVar;
        this.a = nzyVar;
        this.b = str;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return this.a.a();
    }

    @Override // defpackage.nzy
    public final agff b(final Object obj, final nzx nzxVar) {
        return (agff) this.c.a.a(new yrp() { // from class: tom
            @Override // defpackage.yrp
            public final Object eV() {
                final toq toqVar = this.a;
                return toqVar.a.b(obj, nzxVar).b(new agfj() { // from class: ton
                    @Override // defpackage.agfj
                    public final agfi b(agff agffVar) {
                        return new top(toqVar, agffVar);
                    }
                });
            }
        }, this.b, "onCommand()");
    }
}
