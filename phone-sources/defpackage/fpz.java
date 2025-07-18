package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpz implements ecq {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ fpz(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.ecq
    public final void a(Object obj) {
        if (this.b != 0) {
            ((fqt) obj).aB(this.a);
            return;
        }
        fqt fqtVar = (fqt) obj;
        fqtVar.aC();
        fqtVar.a.aj(this.a);
    }
}
