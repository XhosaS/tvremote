package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqa implements ecq {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ fqa(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ecq
    public final void a(Object obj) {
        if (this.b == 0) {
            ((fqt) obj).ae(this.a);
            return;
        }
        fqt fqtVar = (fqt) obj;
        fqtVar.aC();
        fqtVar.a.ab(this.a);
    }
}
