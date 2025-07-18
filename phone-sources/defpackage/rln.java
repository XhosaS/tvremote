package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rln implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rln(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.b;
        if (i == 0) {
            ((rlp) this.a).a();
        } else if (i != 1) {
            ((tam) this.a).l();
        } else {
            ((cbc) this.a).J();
        }
    }
}
