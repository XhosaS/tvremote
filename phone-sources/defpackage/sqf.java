package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqf extends spz {
    private final Boolean a;
    private final cyh b;
    private Window c;
    private boolean d;

    public sqf(View view, cyh cyhVar) {
        this.b = cyhVar;
        szk szkVar = BottomSheetBehavior.G(view).f;
        ColorStateList colorStateListC = szkVar != null ? szkVar.C() : view.getBackgroundTintList();
        if (colorStateListC != null) {
            this.a = Boolean.valueOf(sip.i(colorStateListC.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListB = ssr.b(view.getBackground());
        Integer numValueOf = colorStateListB != null ? Integer.valueOf(colorStateListB.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(sip.i(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(View view) {
        cyh cyhVar = this.b;
        if (view.getTop() < cyhVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                sss.e(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), cyhVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                sss.e(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.spz
    public final void a(View view, float f) {
        e(view);
    }

    @Override // defpackage.spz
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.spz
    public final void c(View view) {
        e(view);
    }

    public final void d(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = ((cwp) new cxe(window, window.getDecorView()).a).e();
        }
    }
}
