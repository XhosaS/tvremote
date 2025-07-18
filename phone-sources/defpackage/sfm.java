package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfm extends LinearLayout implements sft, sfu {
    public int a;
    private final LinearLayout b;
    private final NestedScrollView c;
    private final LinearLayout d;
    private final LinearLayout e;
    private final View f;
    private final int g;

    public sfm(Context context) {
        super(context);
        this.a = Integer.MIN_VALUE;
        inflate(getContext(), R.layout.replay_bottom_sheet_dialog_layout, this);
        this.b = (LinearLayout) findViewById(R.id.header_layout);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.body_layout_scroll_view);
        this.c = nestedScrollView;
        this.d = (LinearLayout) findViewById(R.id.body_layout);
        this.e = (LinearLayout) findViewById(R.id.footer_layout);
        this.f = findViewById(R.id.footer_divider);
        this.g = getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_footer_divider_dim_threshold);
        setId(R.id.parent_layout);
        setOrientation(1);
        nestedScrollView.e = new czy() { // from class: sfl
            @Override // defpackage.czy
            public final void onScrollChange(NestedScrollView nestedScrollView2, int i, int i2, int i3, int i4) {
                this.a.h();
            }
        };
        f(false);
        g(true);
    }

    @Override // defpackage.sft
    public final void a(View view) {
        LinearLayout linearLayout = this.d;
        linearLayout.setVisibility(0);
        linearLayout.addView(view);
    }

    @Override // defpackage.sft
    public final void b(sfj sfjVar) {
        a(sfjVar.d(getContext(), this.d));
    }

    @Override // defpackage.sft
    public final void c(sfj sfjVar) {
        Context context = getContext();
        LinearLayout linearLayout = this.e;
        View viewD = sfjVar.d(context, linearLayout);
        linearLayout.setVisibility(0);
        this.f.setVisibility(0);
        linearLayout.addView(viewD);
    }

    @Override // defpackage.sft
    public final void d(sfj sfjVar) {
        Context context = getContext();
        LinearLayout linearLayout = this.b;
        View viewD = sfjVar.d(context, linearLayout);
        linearLayout.setVisibility(0);
        linearLayout.addView(viewD);
    }

    @Override // defpackage.sfu
    public final void e() {
        this.c.o(130);
    }

    @Override // defpackage.sfu
    public final void f(boolean z) {
        NestedScrollView nestedScrollView = this.c;
        nestedScrollView.setHorizontalScrollBarEnabled(z);
        nestedScrollView.setVerticalScrollBarEnabled(z);
    }

    @Override // defpackage.sfu
    public final void g(boolean z) {
        this.c.setScrollBarFadeDuration(z ? ViewConfiguration.getScrollBarFadeDuration() : 0);
    }

    public final void h() {
        int height = getHeight() - this.a;
        NestedScrollView nestedScrollView = this.c;
        int iAbs = Math.abs(height + ((this.d.getHeight() - nestedScrollView.getHeight()) - nestedScrollView.getScrollY()));
        int i = this.g;
        this.f.setAlpha(iAbs >= i ? 1.0f : Math.abs(r0) / i);
    }

    @Override // defpackage.sfu
    public final boolean i() {
        NestedScrollView nestedScrollView = this.c;
        return (this.d.getBottom() - nestedScrollView.getHeight()) - nestedScrollView.getScrollY() <= 5;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a == Integer.MIN_VALUE) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
        super.onLayout(z, i, i2, i3, i2 + this.a);
        measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        h();
    }
}
