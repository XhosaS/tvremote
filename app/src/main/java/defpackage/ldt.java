package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldt implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ leo e;

    public ldt(leo leoVar, String str, String str2, Object obj, long j) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
        this.e = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.I(this.a, this.b, this.c, this.d);
    }
}
