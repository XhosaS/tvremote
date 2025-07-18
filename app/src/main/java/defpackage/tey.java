package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tey implements zxe {
    final /* synthetic */ tfa a;
    final /* synthetic */ String b;

    public tey(tfa tfaVar, String str) {
        this.a = tfaVar;
        this.b = str;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        tfa tfaVar = this.a;
        tfaVar.a.b(rpv.a(), this.b, tfaVar.e(th));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a.c(rpv.a(), this.b);
    }
}
