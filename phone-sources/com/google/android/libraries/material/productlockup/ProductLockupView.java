package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cww;
import defpackage.prd;
import defpackage.pre;
import defpackage.prf;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProductLockupView extends ViewGroup {
    private static final Pattern d = Pattern.compile(String.format(" %1$s|%1$s ", "Google"));
    private static final int[] e = {1};
    private static final int[] f = {2};
    private static final int[] g = {1, 2};
    private static Typeface h;
    final ImageView a;
    final TextView b;
    pre c;
    private final pre i;
    private final pre j;
    private int k;
    private Drawable l;
    private int m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;

    public ProductLockupView(Context context) {
        this(context, null);
    }

    private final int a() {
        if (this.n.isEmpty()) {
            return 0;
        }
        TextView textView = this.b;
        return Math.max(textView.getPaint().getFontMetricsInt().top + textView.getBaseline(), 0);
    }

    private final int b(pre preVar) {
        return Math.round(preVar.e * (true != this.p ? 0.15f : 1.0f));
    }

    private final void c(View view, int i, int i2, int i3, int i4) {
        int[] iArr = cww.a;
        boolean z = false;
        if (getLayoutDirection() == 1 && !this.o) {
            z = true;
        }
        int measuredWidth = z ? getMeasuredWidth() - i3 : i;
        if (z) {
            i3 = getMeasuredWidth() - i;
        }
        view.layout(measuredWidth, i2, i3, i4);
    }

    private final void d() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.d, 1073741824));
    }

    private final void e() {
        float f2 = this.c.a;
        TextView textView = this.b;
        textView.setTextSize(0, f2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    private final void f(int i) {
        pre preVar;
        if (i == -1) {
            preVar = null;
        } else if (i == 0 || i == 1) {
            preVar = this.i;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.cf(i, "Unrecognized sizingMode: "));
            }
            preVar = this.j;
        }
        this.c = preVar;
    }

    private final boolean g(int i, boolean z) {
        int iB;
        if (z) {
            pre preVar = this.c;
            iB = preVar.c + b(preVar);
        } else {
            iB = 0;
        }
        e();
        return iB + this.b.getMeasuredWidth() <= i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView = this.a;
        int measuredWidth = 0;
        if (imageView.getVisibility() != 8) {
            TextView textView = this.b;
            int measuredWidth2 = (textView.getVisibility() == 8 || this.q) ? 0 : textView.getMeasuredWidth() + b(this.c);
            int iA = a() + this.c.b;
            c(imageView, measuredWidth2, iA, imageView.getMeasuredWidth() + measuredWidth2, imageView.getMeasuredHeight() + iA);
        }
        TextView textView2 = this.b;
        if (textView2.getVisibility() != 8) {
            if (imageView.getVisibility() != 8 && this.q) {
                measuredWidth = imageView.getMeasuredWidth() + b(this.c);
            }
            int i5 = measuredWidth;
            c(textView2, i5, 0, i5 + textView2.getMeasuredWidth(), textView2.getMeasuredHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            android.widget.ImageView r10 = r8.a
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            r0 = 0
            r10.setVisibility(r0)
            android.widget.TextView r1 = r8.b
            r1.setVisibility(r0)
            java.lang.String r2 = r8.n
            java.lang.String r3 = "Google"
            boolean r2 = r2.startsWith(r3)
            r8.q = r2
            java.lang.String r2 = r8.n
            boolean r2 = r2.endsWith(r3)
            int r3 = r8.m
            r4 = -1
            r5 = 1
            if (r3 == r4) goto L41
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L3b
            r4 = 2
            if (r3 != r4) goto L2f
            int[] r3 = com.google.android.libraries.material.productlockup.ProductLockupView.f
            goto L42
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Unrecognized sizingMode: "
            java.lang.String r10 = defpackage.a.cf(r3, r10)
            r9.<init>(r10)
            throw r9
        L3b:
            int[] r3 = com.google.android.libraries.material.productlockup.ProductLockupView.e
            goto L42
        L3e:
            int[] r3 = com.google.android.libraries.material.productlockup.ProductLockupView.g
            goto L42
        L41:
            r3 = 0
        L42:
            boolean r4 = r8.q
            if (r4 != 0) goto L48
            if (r2 == 0) goto L61
        L48:
            int r2 = r3.length
            r4 = r0
        L4a:
            if (r4 >= r2) goto L61
            r6 = r3[r4]
            r8.f(r6)
            boolean r6 = r8.g(r9, r5)
            if (r6 == 0) goto L5e
            r8.d()
            r8.e()
            goto L87
        L5e:
            int r4 = r4 + 1
            goto L4a
        L61:
            int r2 = r3.length
            r4 = r0
        L63:
            r6 = 8
            if (r4 >= r2) goto L7c
            r7 = r3[r4]
            r8.f(r7)
            boolean r7 = r8.g(r9, r0)
            if (r7 == 0) goto L79
            r8.e()
            r10.setVisibility(r6)
            goto L87
        L79:
            int r4 = r4 + 1
            goto L63
        L7c:
            r8.f(r5)
            r8.q = r5
            r8.d()
            r1.setVisibility(r6)
        L87:
            int r9 = r10.getVisibility()
            if (r9 != 0) goto L8f
            r9 = r5
            goto L90
        L8f:
            r9 = r0
        L90:
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L97
            goto L98
        L97:
            r5 = r0
        L98:
            if (r9 == 0) goto L9e
            int r0 = r10.getMeasuredWidth()
        L9e:
            if (r5 == 0) goto La5
            int r2 = r1.getMeasuredWidth()
            int r0 = r0 + r2
        La5:
            if (r9 == 0) goto Lb0
            if (r5 == 0) goto Lb0
            pre r9 = r8.c
            int r9 = r8.b(r9)
            int r0 = r0 + r9
        Lb0:
            r9 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            int r10 = r10.getMeasuredHeight()
            pre r2 = r8.c
            int r2 = r2.b
            int r10 = r10 + r2
            int r2 = r8.a()
            int r10 = r10 + r2
            int r1 = r1.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r1)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
            r8.setMeasuredDimension(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.productlockup.ProductLockupView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        prd prdVar = (prd) parcelable;
        super.onRestoreInstanceState(prdVar.getSuperState());
        this.n = prdVar.a;
        this.p = prdVar.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        prd prdVar = new prd(super.onSaveInstanceState());
        prdVar.a = this.n;
        prdVar.b = this.p;
        return prdVar;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    public ProductLockupView(Context context, AttributeSet attributeSet, int i) {
        String strTrim;
        int i2;
        super(context, attributeSet, i);
        if (h == null) {
            h = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.i = new pre(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.j = new pre(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.getClass();
        this.a = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        textView.getClass();
        this.b = textView;
        textView.setTypeface(h);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, prf.a, i, R.style.Widget_GoogleMaterial_ProductLockupView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.l = typedArrayObtainStyledAttributes.getDrawable(2);
        } else {
            this.l = AppCompatResources.getDrawable(context, 2131231276);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.m = i3;
        f(i3);
        textView.setTextColor(typedArrayObtainStyledAttributes.getColor(4, 0));
        String string = typedArrayObtainStyledAttributes.getString(0);
        String strTrim2 = (string == null ? "" : string).trim();
        this.n = strTrim2;
        this.p = d.matcher(strTrim2).find();
        this.o = TextUtils.isEmpty(string) || Charset.forName("ISO-8859-1").newEncoder().canEncode(string);
        if (this.n.startsWith("Google")) {
            strTrim = this.n.substring(6).trim();
        } else if (this.n.endsWith("Google")) {
            strTrim = this.n.substring(0, r3.length() - 6).trim();
        } else {
            strTrim = this.n;
        }
        textView.setText(strTrim);
        setContentDescription(this.n.isEmpty() ? "Google" : this.n);
        requestLayout();
        this.k = typedArrayObtainStyledAttributes.getInt(3, 0);
        Drawable drawableMutate = this.l.mutate();
        int i4 = this.k;
        if (i4 == 0) {
            drawableMutate.setTintList(null);
        } else {
            if (i4 == 1) {
                i2 = R.color.google_black;
            } else if (i4 == 2) {
                i2 = R.color.google_white;
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException(a.cf(i4, "Unrecognized logoColor: "));
                }
                i2 = R.color.google_grey700;
            }
            drawableMutate.setTint(getContext().getColor(i2));
        }
        imageView.setImageDrawable(drawableMutate);
        typedArrayObtainStyledAttributes.recycle();
    }
}
