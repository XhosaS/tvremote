package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btf implements bkn {
    public yjv a;
    public btj b;
    public boolean c;
    public final btc d = new btc(this);

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return bdi.y(this, obj, yjzVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return bdi.z(this, yjvVar);
    }

    public final yjv d() {
        yjv yjvVar = this.a;
        if (yjvVar != null) {
            return yjvVar;
        }
        yks.c("onTouchEvent");
        return null;
    }
}
