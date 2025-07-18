package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class orz extends FrameLayout implements orr {
    private final ors a;

    public orz(Context context) {
        this(context, null);
    }

    @Override // defpackage.orr
    public final void a() {
        this.a.c();
    }

    public orz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public orz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ors(context, attributeSet, this);
    }
}
