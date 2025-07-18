package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rha implements rhu {
    final /* synthetic */ rme a;

    public rha(rme rmeVar) {
        this.a = rmeVar;
    }

    @Override // defpackage.rhu
    public final Runnable a() {
        return new qxp(this.a, 10);
    }

    @Override // defpackage.rhu
    public final Runnable b() {
        return new qxp(this.a, 9);
    }
}
