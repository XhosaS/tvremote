package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axa extends qe {
    public int a;
    public int b;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public ayj l;

    public axa() {
        super(-2, -2);
    }

    final int a(View view) {
        return (view.getWidth() - this.a) - this.g;
    }

    public axa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public axa(qe qeVar) {
        super(qeVar);
    }

    public axa(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public axa(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public axa(axa axaVar) {
        super((qe) axaVar);
    }
}
