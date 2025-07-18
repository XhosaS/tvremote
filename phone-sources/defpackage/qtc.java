package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtc implements uha {
    final /* synthetic */ qen a;
    final /* synthetic */ int b;
    final /* synthetic */ qtd c;

    public qtc(qtd qtdVar, qen qenVar, int i) {
        this.a = qenVar;
        this.b = i;
        this.c = qtdVar;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        tvk tvkVar = (tvk) ((tvk) qtd.a.g()).j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeTaskSchedulerApiImpl$1", "onFailure", 149, "ChimeTaskSchedulerApiImpl.java");
        qtd qtdVar = this.c;
        String packageName = qtdVar.b.getApplicationContext().getPackageName();
        qen qenVar = this.a;
        Long lValueOf = qenVar == null ? null : Long.valueOf(qenVar.a);
        int i = this.b;
        tvkVar.E("Failed to schedule a job for package [%s] with ID: %s, type: %s", packageName, qtdVar.e(lValueOf, i), Integer.valueOf(i));
    }

    @Override // defpackage.uha
    public final void b(Object obj) {
        tvk tvkVar = (tvk) qtd.a.l().j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeTaskSchedulerApiImpl$1", "onSuccess", 140, "ChimeTaskSchedulerApiImpl.java");
        qtd qtdVar = this.c;
        String packageName = qtdVar.b.getApplicationContext().getPackageName();
        qen qenVar = this.a;
        Long lValueOf = qenVar == null ? null : Long.valueOf(qenVar.a);
        int i = this.b;
        tvkVar.E("Successfully scheduled a job for package [%s], with ID: %s, type: %s", packageName, qtdVar.e(lValueOf, i), Integer.valueOf(i));
    }
}
