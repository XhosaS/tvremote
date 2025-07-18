package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kis implements View.OnClickListener {
    final /* synthetic */ kit a;
    private final View.OnClickListener b;

    public kis(kit kitVar, View.OnClickListener onClickListener) {
        this.a = kitVar;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.a.a.e();
    }
}
