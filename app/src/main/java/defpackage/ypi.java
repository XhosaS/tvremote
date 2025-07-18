package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ypi extends zum implements Runnable {
    public final zye a;

    public ypi(zye zyeVar, ypj ypjVar) {
        this.a = zyeVar;
        zwk zwkVar = zwk.a;
        zyeVar.a.a(ypjVar, zwkVar);
        zxn.p(zyeVar, new yph(this), zwkVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
