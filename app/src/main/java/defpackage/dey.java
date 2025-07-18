package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dey extends dqh {
    public dez a;

    public dey(long j) {
        super(j);
    }

    @Override // defpackage.dqh
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        ddp ddpVar = (ddp) obj;
        if (ddpVar == null) {
            return 1;
        }
        return ddpVar.a();
    }

    public final /* bridge */ /* synthetic */ ddp b(daj dajVar) {
        return (ddp) super.h(dajVar);
    }

    @Override // defpackage.dqh
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ddp ddpVar = (ddp) obj2;
        dez dezVar = this.a;
        if (dezVar == null || ddpVar == null) {
            return;
        }
        dezVar.e(ddpVar);
    }

    public final /* bridge */ /* synthetic */ void d(daj dajVar, ddp ddpVar) {
    }
}
