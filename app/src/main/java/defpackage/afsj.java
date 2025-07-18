package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsj implements Runnable {
    final /* synthetic */ afsv a;

    public afsj(afsv afsvVar) {
        this.a = afsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afsv afsvVar = this.a;
        afsvVar.d.a(2, "Terminated");
        afun afunVar = ((afuj) afsvVar.a).b.j;
        afunVar.x.remove(afsvVar);
        afgm.c(afunVar.K.e, afsvVar);
        afunVar.i();
    }
}
