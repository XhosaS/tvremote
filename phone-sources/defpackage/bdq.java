package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdq extends bjm {
    public Object a;

    public bdq(long j, Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.bjm
    public final /* bridge */ /* synthetic */ bjm a() {
        return new bdq(bjb.b().v(), this.a);
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        bjmVar.getClass();
        this.a = ((bdq) bjmVar).a;
    }

    @Override // defpackage.bjm
    public final /* bridge */ /* synthetic */ bjm c(long j) {
        return new bdq(bjb.b().v(), this.a);
    }
}
