package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyd extends fxc {
    private final fyc d;
    private final ykb e;

    public fyd(fyc fycVar, String str, ykb ykbVar) {
        super(fycVar, str);
        this.d = fycVar;
        this.e = ykbVar;
    }

    @Override // defpackage.fxc
    public final /* bridge */ /* synthetic */ fxb a() {
        return (fyb) super.a();
    }

    @Override // defpackage.fxc
    public final /* bridge */ /* synthetic */ fxb b() {
        return new fyb(this.d, this.e);
    }
}
