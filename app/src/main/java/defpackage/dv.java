package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
class dv extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public dv(Rect rect) {
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
