package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqm extends jrb {
    public jqm() {
        super("MOLECULE");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.f(jrjVar);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        if (!jrb.m(jrjVar) || j2 - j >= 100) {
            jrb.l(jrjVar);
            return false;
        }
        jrjVar.q().g.c(12.0f);
        jrjVar.s().g.c(9.0f);
        jrjVar.v().g.c(14.0f);
        jrjVar.r().g.c(8.0f);
        return true;
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
    }
}
