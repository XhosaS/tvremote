package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dy extends FrameLayout {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public dy(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }
}
