package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.sfc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sfd<ImageDataT, ImageViewT extends View & sfc, BodyDataT, BodyViewT extends View & sfc, ActionDataT, ActionViewT extends View & sfc, OverflowDataT, OverflowViewT extends View & sfc> extends LinearLayout {
    private final int a;
    private final Rect b;
    private final int c;
    private final int d;
    private View e;
    private View f;
    private View g;
    private View h;

    public sfd(Context context) {
        this(context, null);
    }

    private static boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    private static final void b(View view, int i, int i2) {
        if (i < i2) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMarginStart(Math.max(0, i2 - i));
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.replay__listitem__image);
        this.f = findViewById(R.id.replay__listitem__body);
        this.g = findViewById(R.id.replay__listitem__action);
        this.h = findViewById(R.id.replay__listitem__overflow);
        View view = this.e;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.h;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iA;
        boolean zA = a(this.e);
        int i3 = this.c;
        if (zA) {
            View view = this.e;
            b(view, ((sfc) view).c(), i3);
            iA = this.d - ((sfc) this.e).a();
        } else {
            iA = i3;
        }
        if (!a(this.f)) {
            throw new IllegalStateException("body is expected!");
        }
        View view2 = this.f;
        b(view2, ((sfc) view2).c(), iA);
        int i4 = this.d;
        int iA2 = i4 - ((sfc) this.f).a();
        int iB = ((sfc) this.f).b();
        int iA3 = ((sfc) this.f).a();
        View view3 = this.f;
        if (a(this.g)) {
            View view4 = this.g;
            b(view4, ((sfc) view4).c(), iA2);
            iA2 = i4 - ((sfc) this.g).a();
            iB = ((sfc) this.g).b();
            iA3 = ((sfc) this.g).a();
            view3 = this.g;
        }
        if (a(this.h)) {
            View view5 = this.h;
            b(view5, ((sfc) view5).c(), iA2);
            iB = ((sfc) this.h).b();
            iA3 = ((sfc) this.h).a();
            view3 = this.h;
        }
        setGravity(iB);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view3.getLayoutParams();
        layoutParams.setMarginEnd(Math.max(0, i3 - iA3));
        view3.setLayoutParams(layoutParams);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        Rect rect = this.b;
        rect.set(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setBackgroundResource(onClickListener == null ? 0 : this.a);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        if (onClickListener == null) {
            setClickable(false);
        }
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        if (onLongClickListener == null) {
            setLongClickable(false);
        }
    }

    public sfd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        Resources resources = context.getResources();
        setOrientation(0);
        setFocusable(true);
        setMinimumHeight(resources.getDimensionPixelSize(R.dimen.abc_action_button_min_height_material));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sfe.a);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.replay__listitem__horizontal_padding));
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.replay__listitem__internal_spacing));
        typedArrayObtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        this.a = context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? typedValue.resourceId : 0;
    }
}
