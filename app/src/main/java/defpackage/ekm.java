package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekm implements Runnable {
    public final ehg a;
    final /* synthetic */ eko b;
    private final View c;

    public ekm(eko ekoVar, ehg ehgVar, View view) {
        this.b = ekoVar;
        this.a = ehgVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehg ehgVar = this.a;
        this.b.l = ehgVar.a(this.c);
    }
}
