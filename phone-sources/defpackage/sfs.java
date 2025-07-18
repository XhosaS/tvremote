package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.ActivityChooserView;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.play.widget.replaydialog.internal.ReplayBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfs extends AppCompatDialog {
    private sfm A;
    public final Activity a;
    public ReplayBottomSheetBehavior b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    private boolean n;
    private final boolean o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private View w;
    private View x;
    private View y;
    private final spz z;

    public sfs(Activity activity, int i, boolean z, boolean z2, boolean z3) {
        super(activity, qtl.aK(activity, i));
        this.c = true;
        this.d = true;
        this.z = new sfr(this);
        this.a = activity;
        this.h = z;
        this.i = z2;
        this.o = z3;
        supportRequestWindowFeature(1);
        Resources resources = getContext().getResources();
        Context context = getContext();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.backgroundDimAmount, typedValue, true) || typedValue.type != 4) {
            throw new Resources.NotFoundException("Error in resolving \"?attr/backgroundDimAmount\" from current theme.");
        }
        this.p = typedValue.getFloat();
        this.q = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.replay__replaydialog_bottom_sheet_dialog_corner_radius);
        this.r = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.replay__replaydialog_bottom_sheet_dialog_top_padding);
        this.s = resources.getDimensionPixelOffset(com.google.android.videos.R.dimen.replay__replaydialog_bottom_sheet_dialog_handle_width);
        this.t = resources.getDimensionPixelOffset(com.google.android.videos.R.dimen.replay__replaydialog_bottom_sheet_dialog_handle_height);
        this.u = resources.getDimensionPixelOffset(com.google.android.videos.R.dimen.replay__replaydialog_bottom_sheet_dialog_handle_top_padding);
        this.v = resources.getDimensionPixelOffset(com.google.android.videos.R.dimen.replay__replaydialog_bottom_sheet_dialog_close_button_size);
    }

    private final View f(int i, View view, ViewGroup.LayoutParams layoutParams) {
        final FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), com.google.android.videos.R.layout.replay_bottom_sheet_dialog, null);
        this.w = frameLayout.findViewById(com.google.android.videos.R.id.replay_bottom_sheet_top_padding);
        this.x = frameLayout.findViewById(com.google.android.videos.R.id.replay_bottom_sheet_handle);
        View viewFindViewById = frameLayout.findViewById(com.google.android.videos.R.id.replay_bottom_sheet_close);
        this.y = viewFindViewById;
        viewFindViewById.setOnClickListener(new phn(this, 14));
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(com.google.android.videos.R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (view instanceof sfm) {
            this.A = (sfm) view;
        }
        final FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(com.google.android.videos.R.id.replay_bottom_sheet);
        ReplayBottomSheetBehavior replayBottomSheetBehavior = (ReplayBottomSheetBehavior) BottomSheetBehavior.G(frameLayout2);
        this.b = replayBottomSheetBehavior;
        spz spzVar = this.z;
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList = replayBottomSheetBehavior.E;
        arrayList.clear();
        if (spzVar != null) {
            arrayList.add(spzVar);
        }
        this.b.O(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.b.a = new tko(this, coordinatorLayout);
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sfp
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FrameLayout frameLayout3 = frameLayout2;
                int width = frameLayout.getWidth() - frameLayout3.getWidth();
                sfs sfsVar = this.a;
                sfsVar.l = -(width / 2);
                if (sfsVar.k == frameLayout3.getHeight()) {
                    return;
                }
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                int height = frameLayout3.getHeight();
                sfsVar.k = height;
                sfsVar.f = height >= coordinatorLayout2.getHeight();
                sfsVar.e();
            }
        });
        coordinatorLayout.findViewById(com.google.android.videos.R.id.touch_outside).setOnClickListener(new phn(this, 15));
        cww.p(frameLayout2, new sfq(this));
        frameLayout2.setOnTouchListener(new sqd(1));
        return frameLayout;
    }

    public final int a(float f) {
        return this.k > this.b.E() ? f > 0.0f ? this.b.E() + Math.round(f * (this.k - this.b.E())) : Math.round((f + 1.0f) * this.b.E()) : Math.round((Math.min(0.0f, f) + 1.0f) * this.k);
    }

    public final void b(int i) {
        sfm sfmVar = this.A;
        if (sfmVar == null || sfmVar.a == i) {
            return;
        }
        sfmVar.a = i;
        sfmVar.requestLayout();
    }

    public final void c(float f, int i) {
        boolean zH = sfy.h(getContext());
        int i2 = 8;
        if (!zH || this.k <= this.b.E()) {
            if ((zH || !this.f) && !(zH && this.k == this.b.E())) {
                this.w.setVisibility(8);
                this.x.setVisibility(8);
                this.y.setVisibility(8);
                return;
            } else {
                if (!this.o) {
                    this.y.setVisibility(8);
                    return;
                }
                this.y.setTranslationX(this.l);
                this.y.setTranslationY((-i) + this.v);
                this.y.setAlpha(f + 1.0f);
                this.y.setVisibility(0);
                return;
            }
        }
        float fMin = Math.min(Math.max(f, 0.0f), 1.0f);
        this.w.setVisibility(0);
        this.w.setTranslationY(-i);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        float f2 = 1.0f - fMin;
        layoutParams.height = (int) (this.r * f2);
        this.w.setLayoutParams(layoutParams);
        float f3 = this.q * f2;
        ((GradientDrawable) this.w.getBackground()).setCornerRadii(new float[]{f3, f3, f3, f3, 0.0f, 0.0f, 0.0f, 0.0f});
        this.x.setVisibility(0);
        this.x.setTranslationY(((this.u + r11) + this.t) - r5);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams2.width = (int) (this.s * f2);
        layoutParams2.setMargins(0, (int) (this.r * fMin), 0, 0);
        this.x.setLayoutParams(layoutParams2);
        if (this.f) {
            View view = this.y;
            if (fMin != 0.0f && this.o) {
                i2 = 0;
            }
            view.setVisibility(i2);
            this.y.setTranslationY((r11 + this.v) - r5);
            this.y.setAlpha(fMin);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        ReplayBottomSheetBehavior replayBottomSheetBehavior = this.b;
        if (replayBottomSheetBehavior == null) {
            super.cancel();
            return;
        }
        if (replayBottomSheetBehavior.y != 5) {
            replayBottomSheetBehavior.N(true);
            this.b.P(5);
        } else if (this.m || !this.c) {
            dismiss();
        } else {
            super.cancel();
        }
    }

    public final void d(float f) {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        float f2 = 1.0f;
        float f3 = (f + 1.0f) / ((this.g || !this.f) ? 1.0f : 0.5f);
        if (f3 < 0.0f) {
            f2 = 0.0f;
        } else if (f3 <= 1.0f) {
            f2 = f3;
        }
        window.setDimAmount(this.p * ((float) Math.pow(f2, 3.0d)));
    }

    public final void e() {
        float f = this.b.y == 3 ? 1.0f : 0.0f;
        int iA = a(f);
        b(iA);
        c(f, iA);
        if (!this.i) {
            d(f);
        }
        if (this.n) {
            return;
        }
        ReplayBottomSheetBehavior replayBottomSheetBehavior = this.b;
        if (replayBottomSheetBehavior.y == 5) {
            this.n = true;
            replayBottomSheetBehavior.N(this.c);
            this.b.P(4);
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // defpackage.fm, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        ReplayBottomSheetBehavior replayBottomSheetBehavior = this.b;
        if (replayBottomSheetBehavior == null || replayBottomSheetBehavior.y != 5) {
            return;
        }
        replayBottomSheetBehavior.P(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.c != z) {
            this.c = z;
            ReplayBottomSheetBehavior replayBottomSheetBehavior = this.b;
            if (replayBottomSheetBehavior != null) {
                replayBottomSheetBehavior.N(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.c) {
            this.c = true;
        }
        this.d = z;
        this.e = true;
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(f(i, null, null));
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(0, view, null));
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(0, view, layoutParams));
    }
}
