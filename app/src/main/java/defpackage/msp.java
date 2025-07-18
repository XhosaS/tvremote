package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msp implements eep {
    static final eef a = new eee().a();
    public int b = 1;
    public int c = Integer.MIN_VALUE;
    private eef f = a;
    public float d = 0.0f;
    public float e = 0.0f;

    @Override // defpackage.eep
    public final /* bridge */ /* synthetic */ eeq a() {
        msq msqVar = new msq(this.b, this.c, this.e, this.d, this.f);
        msqVar.c = Integer.MAX_VALUE;
        msqVar.d = 1;
        int i = msqVar.b;
        if (msqVar.a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return msqVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    @Override // defpackage.eep
    public final /* synthetic */ void b(eef eefVar) {
        this.f = eefVar;
    }
}
