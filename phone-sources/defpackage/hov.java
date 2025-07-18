package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hov extends hwl implements how {
    public moz a;

    public hov(long j) {
        super(j);
    }

    @Override // defpackage.hwl
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        hnv hnvVar = (hnv) obj;
        if (hnvVar == null) {
            return 1;
        }
        return hnvVar.a();
    }

    @Override // defpackage.how
    public final /* bridge */ /* synthetic */ hnv b(hlg hlgVar) {
        return (hnv) super.i(hlgVar);
    }

    @Override // defpackage.hwl
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        hnv hnvVar = (hnv) obj2;
        moz mozVar = this.a;
        if (mozVar == null || hnvVar == null) {
            return;
        }
        ((rin) mozVar.g).h(hnvVar, true);
    }

    @Override // defpackage.how
    public final /* bridge */ /* synthetic */ void d(hlg hlgVar, hnv hnvVar) {
    }
}
