package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbx implements Runnable {
    final /* synthetic */ agca a;

    public agbx(agca agcaVar) {
        this.a = agcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agca agcaVar = this.a;
        agcaVar.n.execute(agcaVar.p);
        synchronized (agcaVar.l) {
            agcaVar.x = Integer.MAX_VALUE;
            agcaVar.r();
        }
    }
}
