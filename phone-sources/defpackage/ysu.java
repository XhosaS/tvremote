package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ysu extends yvl {
    private final yjz d;

    public ysu(yjz yjzVar, yil yilVar, int i, int i2) {
        super(yilVar, i, i2);
        this.d = yjzVar;
    }

    static /* synthetic */ Object g(ysu ysuVar, ysk yskVar, yih yihVar) {
        Object objA = ysuVar.d.a(yskVar, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.yvl
    public Object b(ysk yskVar, yih yihVar) {
        return g(this, yskVar, yihVar);
    }

    @Override // defpackage.yvl
    protected yvl c(yil yilVar, int i, int i2) {
        return new ysu(this.d, yilVar, i, i2);
    }

    @Override // defpackage.yvl
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public /* synthetic */ ysu(yjz yjzVar) {
        this(yjzVar, yim.a, -2, 1);
    }
}
