package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class de extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public de(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.a;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
