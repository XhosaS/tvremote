package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bis implements biq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bis(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.biq
    public final void a() {
        if (this.b != 0) {
            Object obj = this.a;
            synchronized (bjb.b) {
                bjb.f = yfm.ae(bjb.f, obj);
            }
            return;
        }
        Object obj2 = this.a;
        synchronized (bjb.b) {
            bjb.g = yfm.ae(bjb.g, obj2);
        }
        bjb.r();
    }
}
