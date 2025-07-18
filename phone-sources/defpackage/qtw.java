package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtw implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ qtx c;

    public qtw(qtx qtxVar, Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        this.c = qtxVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        sjl.c();
        qtx qtxVar = this.c;
        ImageView imageView = (ImageView) ((WeakReference) qtxVar.c).get();
        if (!qtxVar.b && imageView != null) {
            imageView.setImageDrawable(this.a);
        }
        if (this.b) {
            qtxVar.c();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
