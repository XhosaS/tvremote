package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tko {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public tko() {
        throw null;
    }

    public final void a(tkm tkmVar) {
        ((Handler) ((ulo) this.a).a).post(new rmz(this.b, tkmVar, 20));
    }

    public final void b() {
        ((sss) this.a).b((FloatingActionButton) this.b);
    }

    public final void c() {
        ((sss) this.a).a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pnl] */
    public final void d(View view, int i, riw riwVar) {
        Object obj = this.a;
        pke pkeVarB = this.b.b();
        pjr pjrVarG = ((rjh) obj).g(i, tst.i(riwVar));
        pjrVarG.e(riz.a);
        pkeVarB.e(view, pjrVarG);
    }

    public final void e() {
        rhd rhdVar = (rhd) this.a;
        ((qwn) this.b).b.c(rhdVar.b);
        rhdVar.a();
    }

    public final void f() {
        ((qwn) this.b).b.d(((rhd) this.a).b);
    }

    public tko(View view, Object obj) {
        this.a = obj;
        this.b = view;
    }

    public /* synthetic */ tko(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public tko(Object obj, Object obj2, byte[] bArr) {
        this.b = obj2;
        this.a = obj;
    }
}
