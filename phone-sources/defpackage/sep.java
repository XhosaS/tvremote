package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sep extends RecyclerView.ViewHolder {
    Object a;
    sfa b;

    public sep(View view) {
        super(view);
    }

    final void a() {
        this.a = null;
        this.b = null;
        KeyEvent.Callback callback = this.itemView;
        if (callback instanceof seo) {
            ((seo) callback).b();
        }
    }
}
