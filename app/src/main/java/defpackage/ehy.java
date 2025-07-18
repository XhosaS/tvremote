package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ehy implements Runnable {
    final /* synthetic */ eiz a;

    public ehy(eiz eizVar) {
        this.a = eizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dtu dtuVar = this.a.z;
        if (dtuVar != null) {
            dtuVar.cC(new ehm());
        }
    }
}
