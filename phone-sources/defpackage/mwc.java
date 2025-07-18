package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mwc implements View.OnClickListener {
    final View.OnClickListener a;
    final /* synthetic */ mwd b;

    public mwc(mwd mwdVar, View.OnClickListener onClickListener) {
        this.b = mwdVar;
        this.a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.b.a.e();
    }
}
