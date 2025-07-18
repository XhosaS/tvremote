package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfn extends LinearLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener, sft, sfu {
    private final LinearLayout a;
    private final NestedScrollView b;
    private final LinearLayout c;
    private final LinearLayout d;
    private final View e;
    private final int f;

    public sfn(Context context) {
        super(context);
        inflate(getContext(), R.layout.replay_centered_dialog_layout, this);
        setOrientation(1);
        this.a = (LinearLayout) findViewById(R.id.header_layout);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.body_layout_scroll_view);
        this.b = nestedScrollView;
        this.c = (LinearLayout) findViewById(R.id.body_layout);
        this.d = (LinearLayout) findViewById(R.id.footer_layout);
        this.e = findViewById(R.id.footer_divider);
        this.f = getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_footer_divider_dim_threshold);
        nestedScrollView.getViewTreeObserver().addOnScrollChangedListener(this);
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        f(false);
        g(true);
    }

    @Override // defpackage.sft
    public final void a(View view) {
        this.b.setVisibility(0);
        this.c.addView(view);
    }

    @Override // defpackage.sft
    public final void b(sfj sfjVar) {
        a(sfjVar.d(getContext(), this.c));
    }

    @Override // defpackage.sft
    public final void c(sfj sfjVar) {
        Context context = getContext();
        LinearLayout linearLayout = this.d;
        View viewD = sfjVar.d(context, linearLayout);
        linearLayout.setVisibility(0);
        this.e.setVisibility(0);
        linearLayout.addView(viewD);
    }

    @Override // defpackage.sft
    public final void d(sfj sfjVar) {
        Context context = getContext();
        LinearLayout linearLayout = this.a;
        View viewD = sfjVar.d(context, linearLayout);
        linearLayout.setVisibility(0);
        linearLayout.addView(viewD);
    }

    @Override // defpackage.sfu
    public final void e() {
        this.b.o(130);
    }

    @Override // defpackage.sfu
    public final void f(boolean z) {
        NestedScrollView nestedScrollView = this.b;
        nestedScrollView.setHorizontalScrollBarEnabled(z);
        nestedScrollView.setVerticalScrollBarEnabled(z);
    }

    @Override // defpackage.sfu
    public final void g(boolean z) {
        this.b.setScrollBarFadeDuration(z ? ViewConfiguration.getScrollBarFadeDuration() : 0);
    }

    @Override // defpackage.sfu
    public final boolean i() {
        NestedScrollView nestedScrollView = this.b;
        return (this.c.getBottom() - nestedScrollView.getHeight()) - nestedScrollView.getScrollY() <= 5;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.d.getVisibility() == 8) {
            return;
        }
        if (this.c.getMeasuredHeight() == this.b.getMeasuredHeight()) {
            this.e.setAlpha(0.0f);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (this.d.getVisibility() == 8) {
            return;
        }
        LinearLayout linearLayout = this.c;
        NestedScrollView nestedScrollView = this.b;
        int bottom = (linearLayout.getBottom() - nestedScrollView.getHeight()) - nestedScrollView.getScrollY();
        View view = this.e;
        int i = this.f;
        view.setAlpha(Math.abs(bottom) >= i ? 1.0f : Math.abs(bottom) / i);
    }
}
