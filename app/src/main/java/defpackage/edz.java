package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edz implements eep {
    static final eef a = new eee().a();
    static final eea d = new eea();
    public int b = 1;
    public int c = Integer.MIN_VALUE;
    private eef f = a;
    public final eea e = d;

    @Override // defpackage.eep
    public final /* bridge */ /* synthetic */ eeq a() {
        eeb eebVar = new eeb(this.b, this.c, this.f, this.e);
        eebVar.c = Integer.MAX_VALUE;
        eebVar.d = 1;
        int i = eebVar.b;
        if (eebVar.a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return eebVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    @Override // defpackage.eep
    public final /* synthetic */ void b(eef eefVar) {
        this.f = eefVar;
    }
}
