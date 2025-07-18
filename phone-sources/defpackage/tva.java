package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tva extends tvd {
    final /* synthetic */ tvd a;
    final /* synthetic */ tvd b;

    public tva(tvd tvdVar, tvd tvdVar2) {
        this.a = tvdVar;
        this.b = tvdVar2;
    }

    @Override // defpackage.tvd
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
