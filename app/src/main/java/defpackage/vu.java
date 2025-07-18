package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vu {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public vu(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        CardView cardView = this.b;
        cardView.b.set(i, i2, i3, i4);
        Rect rect = cardView.a;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}
