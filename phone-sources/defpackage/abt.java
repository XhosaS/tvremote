package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abt implements bwn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public abt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        int i = this.b;
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return this.b != 0 ? bdi.y(this, obj, yjzVar) : bdi.y(this, obj, yjzVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return this.b != 0 ? bdi.z(this, yjvVar) : bdi.z(this, yjvVar);
    }

    @Override // defpackage.bwn
    public final void d(bys bysVar) {
        if (this.b != 0) {
            ((aan) this.a).p = bysVar;
        } else {
            ((abw) this.a).o = bysVar;
        }
    }
}
