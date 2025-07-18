package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvr implements hvv {
    @Override // defpackage.hvv
    public final /* bridge */ /* synthetic */ boolean a(Object obj, hvu hvuVar) {
        Drawable drawable = (Drawable) obj;
        Drawable drawableJ = hvuVar.j();
        if (drawableJ == null) {
            drawableJ = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableJ, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(kwx.JSON3);
        hvuVar.n(transitionDrawable);
        return true;
    }
}
