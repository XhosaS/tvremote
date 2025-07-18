package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ii {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public ii(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        CardView cardView = this.b;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean c() {
        return this.b.a;
    }
}
