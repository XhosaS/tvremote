package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bfn implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ bfo b;

    public bfn(bfo bfoVar, Object obj) {
        this.b = bfoVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bfo bfoVar = this.b;
        if (bfoVar.d.get()) {
            bfoVar.c();
        } else {
            bfoVar.b(this.a);
        }
        bfoVar.f = 3;
    }
}
