package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class huw extends azx {
    @Override // defpackage.azx
    protected void z(azw azwVar) {
        super.z(azwVar);
        if (azwVar instanceof hux) {
            hux huxVar = (hux) azwVar;
            View view = huxVar.g;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            Rect rect = huxVar.O;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
