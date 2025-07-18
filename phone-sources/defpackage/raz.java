package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raz extends FrameLayout {
    public MaterialButton a;
    public ImmutableList b;
    public int c;
    public xrk d;

    public raz(Context context) {
        super(context);
        this.c = 1;
        ImmutableList immutableListOf = ImmutableList.of();
        immutableListOf.getClass();
        this.b = immutableListOf;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        xrk xrkVar = this.d;
        if (xrkVar != null) {
            xrkVar.k(size);
        }
        super.onMeasure(i, i2);
    }
}
