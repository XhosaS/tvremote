package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class lca implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ lcl d;

    public lca(lcl lclVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lclVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        lih lihVar = this.d.a;
        lihVar.t();
        kug kugVar = lihVar.c;
        lihVar.ai(kugVar);
        return kugVar.s(this.a, this.b, this.c);
    }
}
