package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sqg extends AppCompatDialog {
    private FrameLayout a;
    public BottomSheetBehavior b;
    public FrameLayout c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public sqf h;
    public spz i;
    private CoordinatorLayout j;
    private boolean k;
    private aafi l;

    public sqg(Context context) {
        this(context, 0);
        c();
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.k) {
            FrameLayout frameLayout = this.a;
            czn cznVar = new czn(this, 15, null);
            int[] iArr = cww.a;
            cwm.l(frameLayout, cznVar);
        }
        this.c.removeAllViews();
        if (layoutParams == null) {
            this.c.addView(view);
        } else {
            this.c.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new phn(this, 16, null));
        cww.p(this.c, new sqc(this));
        this.c.setOnTouchListener(new sqd(0));
        return this.a;
    }

    private final void c() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.k = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void d() {
        aafi aafiVar = this.l;
        if (aafiVar == null) {
            return;
        }
        if (this.e) {
            aafiVar.p();
        } else {
            aafiVar.q();
        }
    }

    private final void e() {
        if (this.a == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.a = frameLayout;
            this.j = (CoordinatorLayout) this.a.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.a.findViewById(R.id.design_bottom_sheet);
            this.c = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorG = BottomSheetBehavior.G(frameLayout2);
            this.b = bottomSheetBehaviorG;
            bottomSheetBehaviorG.H(this.i);
            this.b.N(this.e);
            this.l = new aafi(this.b, this.c);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.b == null) {
            e();
        }
        return this.b;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorA = a();
        if (!this.d || bottomSheetBehaviorA.y == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorA.P(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.k && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            cwn.c(window, z2);
            sqf sqfVar = this.h;
            if (sqfVar != null) {
                sqfVar.d(window);
            }
        }
        d();
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        sqf sqfVar = this.h;
        if (sqfVar != null) {
            sqfVar.d(null);
        }
        aafi aafiVar = this.l;
        if (aafiVar != null) {
            aafiVar.q();
        }
    }

    @Override // defpackage.fm, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior == null || bottomSheetBehavior.y != 5) {
            return;
        }
        bottomSheetBehavior.P(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.e != z) {
            this.e = z;
            BottomSheetBehavior bottomSheetBehavior = this.b;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.N(z);
            }
            if (getWindow() != null) {
                d();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.e) {
            this.e = true;
        }
        this.f = z;
        this.g = true;
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    public sqg(Context context, int i) {
        super(context, qtl.aK(context, i));
        this.e = true;
        this.f = true;
        this.i = new sqe(this);
        supportRequestWindowFeature(1);
        c();
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
