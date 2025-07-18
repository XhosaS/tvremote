package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.TintTypedArray;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.videos.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcn extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final tcm n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final zft t;

    public tcn(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new tcl(this);
        zft zftVar = new zft(this, null);
        this.t = zftVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonT = t(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.b = checkableImageButtonT;
        CheckableImageButton checkableImageButtonT2 = t(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.d = checkableImageButtonT2;
        this.n = new tcm(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = tcv.a;
        if (tintTypedArray.hasValue(38)) {
            this.c = sin.i(getContext(), tintTypedArray, 38);
        }
        if (tintTypedArray.hasValue(39)) {
            this.m = a.ae(tintTypedArray.getInt(39, -1), null);
        }
        if (tintTypedArray.hasValue(37)) {
            m(tintTypedArray.getDrawable(37));
        }
        checkableImageButtonT.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonT.setImportantForAccessibility(2);
        checkableImageButtonT.setClickable(false);
        checkableImageButtonT.c = false;
        checkableImageButtonT.a(false);
        checkableImageButtonT.setFocusable(false);
        if (!tintTypedArray.hasValue(54)) {
            if (tintTypedArray.hasValue(32)) {
                this.f = sin.i(getContext(), tintTypedArray, 32);
            }
            if (tintTypedArray.hasValue(33)) {
                this.g = a.ae(tintTypedArray.getInt(33, -1), null);
            }
        }
        if (tintTypedArray.hasValue(30)) {
            k(tintTypedArray.getInt(30, 0));
            if (tintTypedArray.hasValue(27)) {
                j(tintTypedArray.getText(27));
            }
            i(tintTypedArray.getBoolean(26, true));
        } else if (tintTypedArray.hasValue(54)) {
            if (tintTypedArray.hasValue(55)) {
                this.f = sin.i(getContext(), tintTypedArray, 55);
            }
            if (tintTypedArray.hasValue(56)) {
                this.g = a.ae(tintTypedArray.getInt(56, -1), null);
            }
            k(tintTypedArray.getBoolean(54, false) ? 1 : 0);
            j(tintTypedArray.getText(52));
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.p) {
            this.p = dimensionPixelSize;
            ssr.v(checkableImageButtonT2, dimensionPixelSize);
            ssr.v(checkableImageButtonT, dimensionPixelSize);
        }
        if (tintTypedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeS = ssr.s(tintTypedArray.getInt(31, -1));
            checkableImageButtonT2.setScaleType(scaleTypeS);
            checkableImageButtonT.setScaleType(scaleTypeS);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(tintTypedArray.getResourceId(73, 0));
        if (tintTypedArray.hasValue(74)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(74));
        }
        CharSequence text = tintTypedArray.getText(72);
        this.h = true != TextUtils.isEmpty(text) ? text : null;
        appCompatTextView.setText(text);
        v();
        frameLayout.addView(checkableImageButtonT2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonT);
        textInputLayout.n.add(zftVar);
        if (textInputLayout.c != null) {
            zftVar.j(textInputLayout);
        }
        addOnAttachStateChangeListener(new bne(this, 12));
    }

    private final CheckableImageButton t(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (sin.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void u() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || s()) ? 8 : 0);
        boolean z = (this.h == null || this.q) ? 8 : false;
        if (!r() && !s() && z) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void v() {
        TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        u();
        textView.setVisibility(i);
        this.a.A();
    }

    public final int a() {
        int marginStart;
        if (r() || s()) {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final tco c() {
        int i = this.e;
        tcm tcmVar = this.n;
        SparseArray sparseArray = tcmVar.a;
        tco tcbVar = (tco) sparseArray.get(i);
        if (tcbVar == null) {
            if (i == -1) {
                tcbVar = new tcb(tcmVar.b);
            } else if (i == 0) {
                tcbVar = new tco(tcmVar.b);
            } else if (i == 1) {
                tcbVar = new tcu(tcmVar.b, tcmVar.d);
            } else if (i == 2) {
                tcbVar = new tca(tcmVar.b);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(a.cf(i, "Invalid end icon mode: "));
                }
                tcbVar = new tck(tcmVar.b);
            }
            sparseArray.append(i, tcbVar);
        }
        return tcbVar;
    }

    public final void d() {
        AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void e(boolean z) {
        this.q = z;
        v();
    }

    public final void f() {
        ssr.u(this.a, this.d, this.f);
    }

    final void g(boolean z) {
        CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        CheckableImageButton checkableImageButton2;
        boolean z2;
        tco tcoVarC = c();
        boolean z3 = false;
        boolean z4 = true;
        if (tcoVarC.s() && (z2 = (checkableImageButton2 = this.d).a) != tcoVarC.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!tcoVarC.q() || (zIsActivated = (checkableImageButton = this.d).isActivated()) == tcoVarC.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            f();
        }
    }

    public final void h() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void i(boolean z) {
        this.d.a(z);
    }

    final void j(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    final void k(int i) {
        if (this.e == i) {
            return;
        }
        tco tcoVarC = c();
        h();
        this.s = null;
        tcoVarC.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tda) it.next()).a();
        }
        l(i != 0);
        tco tcoVarC2 = c();
        int iB = this.n.c;
        if (iB == 0) {
            iB = tcoVarC2.b();
        }
        Drawable drawable = iB != 0 ? AppCompatResources.getDrawable(getContext(), iB) : null;
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ssr.t(this.a, checkableImageButton, this.f, this.g);
            f();
        }
        int iA = tcoVarC2.a();
        j(iA != 0 ? getResources().getText(iA) : null);
        i(tcoVarC2.s());
        TextInputLayout textInputLayout = this.a;
        int i2 = textInputLayout.m;
        if (!tcoVarC2.o(i2)) {
            throw new IllegalStateException(a.ce(i, i2, "The current box background mode ", " is not supported by the end icon mode "));
        }
        tcoVarC2.i();
        this.s = tcoVarC2.A();
        d();
        ssr.w(checkableImageButton, tcoVarC2.c());
        EditText editText = this.j;
        if (editText != null) {
            tcoVarC2.g(editText);
            n(tcoVarC2);
        }
        ssr.t(textInputLayout, checkableImageButton, this.f, this.g);
        g(true);
    }

    public final void l(boolean z) {
        if (r() != z) {
            this.d.setVisibility(true != z ? 8 : 0);
            u();
            p();
            this.a.A();
        }
    }

    final void m(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        o();
        ssr.t(this.a, checkableImageButton, this.c, this.m);
    }

    public final void n(tco tcoVar) {
        EditText editText = this.j;
        if (editText == null) {
            return;
        }
        if (tcoVar.d() != null) {
            editText.setOnFocusChangeListener(tcoVar.d());
        }
        if (tcoVar.e() != null) {
            this.d.setOnFocusChangeListener(tcoVar.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.b
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L18
            com.google.android.material.textfield.TextInputLayout r1 = r3.a
            tcr r2 = r1.d
            boolean r2 = r2.g
            if (r2 == 0) goto L18
            boolean r1 = r1.z()
            if (r1 == 0) goto L18
            r1 = 0
            goto L1a
        L18:
            r1 = 8
        L1a:
            r0.setVisibility(r1)
            r3.u()
            r3.p()
            boolean r0 = r3.q()
            if (r0 != 0) goto L2e
            com.google.android.material.textfield.TextInputLayout r0 = r3.a
            r0.A()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcn.o():void");
    }

    public final void p() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c == null) {
            return;
        }
        int paddingEnd = 0;
        if (!r() && !s()) {
            paddingEnd = textInputLayout.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c.getPaddingTop(), paddingEnd, textInputLayout.c.getPaddingBottom());
    }

    public final boolean q() {
        return this.e != 0;
    }

    public final boolean r() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean s() {
        return this.b.getVisibility() == 0;
    }
}
