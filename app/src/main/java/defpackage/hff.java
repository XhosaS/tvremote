package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hff {
    public final FrameLayout a;
    public final MotionResultsFrame b;
    public final float c;
    public final int d;
    public final int e;
    public final hfo f;
    public final View g;
    public final hmu h;
    public final hgp i;
    public final iaj j;

    public hff(hfo hfoVar, View view, MotionResultsFrame motionResultsFrame, hmu hmuVar, FrameLayout frameLayout, iaj iajVar, hgp hgpVar) {
        this.f = hfoVar;
        this.g = view;
        this.b = motionResultsFrame;
        this.h = hmuVar;
        this.a = frameLayout;
        this.j = iajVar;
        this.i = hgpVar;
        this.e = hgpVar.a() == null ? 0 : hgpVar.a().getHeight();
        View viewA = hfg.a(motionResultsFrame);
        this.d = viewA != null ? viewA.getPaddingTop() : -1;
        this.c = ((View) motionResultsFrame.getParent()).getY() + motionResultsFrame.getY();
    }
}
