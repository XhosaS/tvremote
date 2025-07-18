package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayx extends azw {
    public final HorizontalGridView a;
    public ayq b;
    final int c;
    final int d;
    final int e;
    final int f;

    public ayx(View view, HorizontalGridView horizontalGridView) {
        super(view);
        new Rect();
        this.a = horizontalGridView;
        this.c = horizontalGridView.getPaddingTop();
        this.d = horizontalGridView.getPaddingBottom();
        this.e = horizontalGridView.getPaddingLeft();
        this.f = horizontalGridView.getPaddingRight();
    }
}
