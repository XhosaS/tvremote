package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class da extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public da(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
