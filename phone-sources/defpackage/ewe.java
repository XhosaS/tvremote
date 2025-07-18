package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewe implements ecq {
    public final /* synthetic */ evq a;
    public final /* synthetic */ evv b;
    public final /* synthetic */ eph c;
    private final /* synthetic */ int d;

    public /* synthetic */ ewe(eph ephVar, evq evqVar, evv evvVar, int i) {
        this.d = i;
        this.c = ephVar;
        this.a = evqVar;
        this.b = evvVar;
    }

    @Override // defpackage.ecq
    public final void a(Object obj) {
        if (this.d != 0) {
            evv evvVar = this.b;
            ((ewg) obj).i(0, (evz) this.c.c, this.a, evvVar);
        } else {
            evv evvVar2 = this.b;
            ((ewg) obj).h(0, (evz) this.c.c, this.a, evvVar2);
        }
    }
}
