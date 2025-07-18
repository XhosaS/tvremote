package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edw implements eep {
    static final eef a = new eee().a();
    static final edx f = new edx();
    public static final /* synthetic */ int g = 0;
    public int b = 1;
    public int c = 2;
    private eef h = a;
    private final edx i = f;
    public int d = 1;
    public int e = Integer.MIN_VALUE;

    @Override // defpackage.eep
    public final /* bridge */ /* synthetic */ eeq a() {
        edy edyVar = new edy(this.b, this.c, this.h, this.i, this.e);
        edyVar.c = Integer.MAX_VALUE;
        edyVar.d = this.d;
        int i = edyVar.b;
        if (edyVar.a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return edyVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    @Override // defpackage.eep
    public final /* synthetic */ void b(eef eefVar) {
        this.h = eefVar;
    }
}
