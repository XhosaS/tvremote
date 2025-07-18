package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uux extends dow {
    final czb a;
    Drawable b;
    long d;
    final long e;
    final /* synthetic */ uuy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uux(uuy uuyVar, uvo uvoVar) {
        czb czbVarB;
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f = uuyVar;
        View view = (View) uuyVar.getCallback();
        dnl dnlVarC = cyg.c(view.getContext());
        if (dqm.h()) {
            czbVarB = dnlVarC.b(view.getContext().getApplicationContext());
        } else {
            dqk.d(view, "Argument must not be null");
            dqk.d(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity activityA = dnl.a(view.getContext());
            if (activityA != null && (activityA instanceof bw)) {
                bw bwVar = (bw) activityA;
                dnlVarC.a.clear();
                dnl.e(bwVar.a.a.e.b.i(), dnlVarC.a);
                View viewFindViewById = bwVar.findViewById(R.id.content);
                bq bqVar = null;
                while (!view.equals(viewFindViewById) && (bqVar = (bq) dnlVarC.a.get(view)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                dnlVarC.a.clear();
                czbVarB = bqVar != null ? dnlVarC.c(bqVar) : dnlVarC.d(bwVar);
            } else {
                czbVarB = dnlVarC.b(view.getContext().getApplicationContext());
            }
        }
        this.a = czbVarB;
        this.e = Math.max(0L, 1L);
        Rect bounds = uuyVar.getBounds();
        int iMin = Math.min(bounds.width(), 1920);
        cyx cyxVar = (cyx) ((cyx) ((cyx) czbVarB.d(uvp.a).s(dcr.b)).N()).E(uvoVar.h(iMin, ((bounds.height() * iMin) + (iMin / 2)) / bounds.width(), uvp.b));
        cyxVar.p(this, cyxVar, dqc.a);
    }

    @Override // defpackage.dow, defpackage.dpf
    public final void a(Drawable drawable) {
        ((zdv) ((zdv) uuy.a.c()).q("com/google/android/libraries/tv/widgets/scrim/GlideScrimDrawable$Layer", "onLoadFailed", 202, "GlideScrimDrawable.java")).u("Unable to load glide resource");
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        this.b = (Drawable) obj;
        this.d = SystemClock.elapsedRealtime();
        this.f.invalidateSelf();
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
        this.b = null;
        this.f.invalidateSelf();
    }

    final boolean i(long j) {
        return this.f.b.get(0) != this && j < this.d + this.e;
    }

    final boolean j() {
        return this.b != null;
    }
}
