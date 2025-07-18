package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpi implements Runnable {
    final /* synthetic */ afih a;
    final /* synthetic */ afpm b;

    public afpi(afpm afpmVar, afih afihVar) {
        this.a = afihVar;
        this.b = afpmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
    }
}
