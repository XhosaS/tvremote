package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tef {
    public static final void b(View view, int i) {
        Drawable background = view.getBackground();
        if (!(background instanceof tee)) {
            Log.w("CardViewGroupDelegates", "Unable to set background color. CardView is not using a CardViewBackgroundDrawable");
            return;
        }
        tee teeVar = (tee) background;
        teeVar.a = null;
        teeVar.b.setColor(i);
        teeVar.invalidateSelf();
    }

    public static final void c(View view, int i) {
        if (i == 0) {
            return;
        }
        Resources resources = view.getResources();
        Drawable background = view.getBackground();
        if (!(background instanceof tee)) {
            Log.w("CardViewGroupDelegates", "Unable to set background. CardView is not using a CardViewBackgroundDrawable.");
            return;
        }
        try {
            tee teeVar = (tee) background;
            teeVar.a = resources.getColorStateList(i);
            teeVar.b.setColor(teeVar.a.getColorForState(teeVar.getState(), teeVar.a.getDefaultColor()));
            teeVar.invalidateSelf();
        } catch (Resources.NotFoundException e) {
            Log.w("CardViewGroupDelegates", "Unable to set background - ColorStateList not found.", e);
        }
    }

    public void a(View view, Context context, AttributeSet attributeSet, int i) {
        throw null;
    }
}
