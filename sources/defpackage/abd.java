package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abd implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ abd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ctj, java.lang.Object] */
    public final void onBackInvoked() {
        if (this.b != 0) {
            ((cj) this.a).H();
        } else {
            this.a.a();
        }
    }
}
