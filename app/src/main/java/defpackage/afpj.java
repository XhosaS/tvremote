package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpj implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ afpm b;

    public afpj(afpm afpmVar, Object obj) {
        this.a = obj;
        this.b = afpmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
