package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bk implements bcj {
    final /* synthetic */ bq a;

    public bk(bq bqVar) {
        this.a = bqVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        View view;
        if (bceVar != bce.ON_STOP || (view = this.a.R) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
