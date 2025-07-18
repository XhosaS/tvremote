package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardFrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcx extends LinearLayout {
    public View a;
    public CardFrameLayout b;
    public CardFrameLayout c;

    public rcx(Context context) {
        super(context, null);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private final void b(int i) {
        if (getOrientation() == i) {
            return;
        }
        setOrientation(i);
        View view = this.a;
        CardFrameLayout cardFrameLayout = null;
        if (view == null) {
            yks.c("divider");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i2 = layoutParams2.width;
        layoutParams2.width = layoutParams2.height;
        layoutParams2.height = i2;
        view.setLayoutParams(layoutParams2);
        CardFrameLayout cardFrameLayout2 = this.b;
        if (cardFrameLayout2 == null) {
            yks.c("firstRowChild");
            cardFrameLayout2 = null;
        }
        c(i, cardFrameLayout2);
        CardFrameLayout cardFrameLayout3 = this.c;
        if (cardFrameLayout3 == null) {
            yks.c("secondRowChild");
        } else {
            cardFrameLayout = cardFrameLayout3;
        }
        c(i, cardFrameLayout);
    }

    private static final void c(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i != 0) {
            layoutParams2.width = -1;
        } else {
            layoutParams2.width = 0;
        }
        view.setLayoutParams(layoutParams2);
    }

    private final void d(int i, int i2) {
        CardFrameLayout cardFrameLayout = this.b;
        CardFrameLayout cardFrameLayout2 = null;
        if (cardFrameLayout == null) {
            yks.c("firstRowChild");
            cardFrameLayout = null;
        }
        cardFrameLayout.a(i, i2);
        CardFrameLayout cardFrameLayout3 = this.c;
        if (cardFrameLayout3 == null) {
            yks.c("secondRowChild");
        } else {
            cardFrameLayout2 = cardFrameLayout3;
        }
        cardFrameLayout2.a(i, i2);
    }

    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException("Unexpected call to addView, only setupRowLayout should add views to this layout");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        CardFrameLayout cardFrameLayout = this.b;
        View view = null;
        if (cardFrameLayout == null) {
            yks.c("firstRowChild");
            cardFrameLayout = null;
        }
        int i3 = 1;
        if (cardFrameLayout.getVisibility() != 8) {
            CardFrameLayout cardFrameLayout2 = this.c;
            if (cardFrameLayout2 == null) {
                yks.c("secondRowChild");
                cardFrameLayout2 = null;
            }
            if (cardFrameLayout2.getVisibility() != 8) {
                View view2 = this.a;
                if (view2 == null) {
                    yks.c("divider");
                    view2 = null;
                }
                view2.setVisibility(0);
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode == 0) {
                    b(0);
                } else {
                    d(1, 0);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 0);
                    CardFrameLayout cardFrameLayout3 = this.b;
                    if (cardFrameLayout3 == null) {
                        yks.c("firstRowChild");
                        cardFrameLayout3 = null;
                    }
                    cardFrameLayout3.measure(iMakeMeasureSpec, i2);
                    CardFrameLayout cardFrameLayout4 = this.c;
                    if (cardFrameLayout4 == null) {
                        yks.c("secondRowChild");
                        cardFrameLayout4 = null;
                    }
                    cardFrameLayout4.measure(iMakeMeasureSpec, i2);
                    View view3 = this.a;
                    if (view3 == null) {
                        yks.c("divider");
                        view3 = null;
                    }
                    view3.measure(iMakeMeasureSpec, i2);
                    View view4 = this.a;
                    if (view4 == null) {
                        yks.c("divider");
                        view4 = null;
                    }
                    int measuredWidth = (size - view4.getMeasuredWidth()) / 2;
                    CardFrameLayout cardFrameLayout5 = this.b;
                    if (cardFrameLayout5 == null) {
                        yks.c("firstRowChild");
                        cardFrameLayout5 = null;
                    }
                    if (cardFrameLayout5.getMeasuredWidth() <= measuredWidth) {
                        CardFrameLayout cardFrameLayout6 = this.c;
                        if (cardFrameLayout6 == null) {
                            yks.c("secondRowChild");
                        } else {
                            view = cardFrameLayout6;
                        }
                        if (view.getMeasuredWidth() <= measuredWidth) {
                            i3 = 0;
                        }
                    }
                    b(i3);
                }
                d(2, getOrientation());
                super.onMeasure(i, i2);
                return;
            }
        }
        d(2, 1);
        b(1);
        View view5 = this.a;
        if (view5 == null) {
            yks.c("divider");
        } else {
            view = view5;
        }
        view.setVisibility(8);
        super.onMeasure(i, i2);
    }
}
