package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mue extends muf {
    public mue(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        tef.b(this, i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        tef.c(this, i);
    }

    public mue(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mue(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        teh.a.a(this, context, attributeSet, i);
    }
}
