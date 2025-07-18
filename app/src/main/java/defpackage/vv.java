package defpackage;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vv {
    public final void a(vu vuVar, float f) {
        CardView cardView = vuVar.b;
        Drawable drawable = vuVar.a;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        vw vwVar = (vw) drawable;
        if (f != vwVar.b || vwVar.c != useCompatPadding || vwVar.d != preventCornerOverlap) {
            vwVar.b = f;
            vwVar.c = useCompatPadding;
            vwVar.d = preventCornerOverlap;
            vwVar.b(null);
            vwVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            vuVar.a(0, 0, 0, 0);
            return;
        }
        vw vwVar2 = (vw) vuVar.a;
        float f2 = vwVar2.b;
        float f3 = vwVar2.a;
        int iCeil = (int) Math.ceil(vx.a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(vx.b(f2, f3, cardView.getPreventCornerOverlap()));
        vuVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
