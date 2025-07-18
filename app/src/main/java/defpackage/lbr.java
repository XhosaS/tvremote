package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class lbr implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ lcl b;

    public lbr(lcl lclVar, String str) {
        this.a = str;
        this.b = lclVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        lih lihVar = this.b.a;
        lihVar.t();
        kug kugVar = lihVar.c;
        lihVar.ai(kugVar);
        return kugVar.v(this.a);
    }
}
