package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fyz implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fyz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, svi] */
    public final void onBackInvoked() {
        int i = this.b;
        if (i == 0) {
            ((fzb) this.a).a.c();
            return;
        }
        if (i != 1) {
            this.a.K();
            return;
        }
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.a();
        }
    }
}
