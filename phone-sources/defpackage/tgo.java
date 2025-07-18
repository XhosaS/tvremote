package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.play.layout.PlayCardLabelView;
import com.google.android.play.layout.PlayCardSnippet;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.StarRatingBar;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tgo extends ForegroundRelativeLayout {
    protected PlayCardThumbnail a;
    protected TextView b;
    protected TextView c;
    protected PlayTextView d;
    protected StarRatingBar e;
    protected ImageView f;
    protected PlayCardLabelView k;
    protected PlayTextView l;
    protected PlayCardSnippet m;
    protected View n;
    private final int o;
    private final Rect p;
    private final Rect q;

    public tgo(Context context) {
        this(context, null, 0);
    }

    protected final void a(int i) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        if (this.a.getVisibility() != 8) {
            marginLayoutParams.height = (int) (((((size - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) * 0.0f);
        } else {
            marginLayoutParams.height = 0;
        }
    }

    protected final void b() {
        ImageView imageView = this.f;
        if (imageView == null || imageView.getVisibility() == 8) {
            return;
        }
        ImageView imageView2 = this.f;
        Rect rect = this.p;
        imageView2.getHitRect(rect);
        int i = this.o;
        rect.top -= i;
        rect.bottom += i;
        rect.left -= i;
        rect.right += i;
        Rect rect2 = this.q;
        if (rect.top == rect2.top && rect.bottom == rect2.bottom && rect.left == rect2.left && rect.right == rect2.right) {
            return;
        }
        setTouchDelegate(new thp(rect, this.f));
        rect2.set(rect);
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tgq.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tgq.a.b();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (PlayCardThumbnail) findViewById(R.id.li_thumbnail_frame);
        this.b = (TextView) findViewById(R.id.li_title);
        this.d = (PlayTextView) findViewById(R.id.li_subtitle);
        this.e = (StarRatingBar) findViewById(R.id.li_rating);
        this.l = (PlayTextView) findViewById(R.id.li_description);
        this.f = (ImageView) findViewById(R.id.li_overflow);
        this.k = (PlayCardLabelView) findViewById(R.id.li_label);
        this.m = (PlayCardSnippet) findViewById(R.id.li_snippet_2);
        this.n = findViewById(R.id.loading_progress_bar);
        this.c = (TextView) findViewById(R.id.li_ad_label);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        PlayTextView playTextView = this.l;
        if (playTextView == null || playTextView.getVisibility() != 0 || TextUtils.isEmpty(this.l.getText())) {
            return;
        }
        int measuredHeight = this.l.getMeasuredHeight();
        Layout layout = this.l.getLayout();
        if (layout != null) {
            int i3 = 0;
            while (i3 < layout.getLineCount()) {
                if (layout.getLineBottom(i3) > measuredHeight) {
                    this.l.setVisibility(i3 < 2 ? 4 : 0);
                    return;
                }
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        tef.b(this, i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        tef.c(this, i);
    }

    public tgo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tgo(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.play_card_overflow_touch_extend);
        this.p = new Rect();
        this.q = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.e);
        typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.getBoolean(3, false);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(4, context.getResources().getDimensionPixelSize(R.dimen.play_card_snippet_text_extra_margin_left));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getInt(1, 1);
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.play_card_default_inset);
        this.g = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.j = dimensionPixelSize;
        requestLayout();
        invalidate();
        teh.a.a(this, context, attributeSet, i);
    }
}
