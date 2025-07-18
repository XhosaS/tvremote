package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lbu implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ lcl e;

    public lbu(lcl lclVar, String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null) {
            lcl lclVar = this.e;
            lclVar.a.R(this.b, null);
        } else {
            lez lezVar = new lez(this.c, str, this.d);
            lcl lclVar2 = this.e;
            lclVar2.a.R(this.b, lezVar);
        }
    }
}
