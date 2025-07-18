package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avk extends Transition.EpicenterCallback {
    final /* synthetic */ avi a;

    public avk(avi aviVar) {
        this.a = aviVar;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        axx axxVar = (axx) this.a;
        float height = axxVar.b.h * r0.c.getHeight();
        Rect rect = axxVar.a;
        int i = (int) (height / 100.0f);
        rect.set(0, i, 0, i);
        return rect;
    }
}
