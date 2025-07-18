package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kv implements jv {
    final /* synthetic */ kw a;

    public kv(kw kwVar) {
        this.a = kwVar;
    }

    @Override // defpackage.jv
    public final void a(jj jjVar, boolean z) {
        if (jjVar instanceof ke) {
            jjVar.a().g(false);
        }
        jv jvVar = this.a.e;
        if (jvVar != null) {
            jvVar.a(jjVar, z);
        }
    }

    @Override // defpackage.jv
    public final boolean b(jj jjVar) {
        kw kwVar = this.a;
        if (jjVar == kwVar.c) {
            return false;
        }
        jm jmVar = ((ke) jjVar).n;
        jv jvVar = kwVar.e;
        if (jvVar != null) {
            return jvVar.b(jjVar);
        }
        return false;
    }
}
