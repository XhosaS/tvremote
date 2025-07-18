package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekk extends dxv {

    @eau(a = eav.STRING)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public CharSequence A;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    final ColorStateList B;

    @eau(a = eav.DIMEN_TEXT)
    @eat(a = 3)
    public int C;

    @eau(a = eav.NONE)
    @eat(a = 3)
    final int D;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean E;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Typeface F;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int G;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    final int H;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public mxq I;

    @eau(a = eav.BOOL)
    @eat(a = 3)
    public boolean a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean c;

    @eau(a = eav.STRING)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public CharSequence d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public TextUtils.TruncateAt e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean f;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float r;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int s;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int t;

    @eau(a = eav.INT)
    @eat(a = 3)
    public int u;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int v;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float w;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float x;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float y;

    @eau(a = eav.BOOL)
    @eat(a = 3)
    public boolean z;

    public ekk() {
        super("Text");
        this.b = 0;
        this.c = true;
        this.t = -16776961;
        this.u = Integer.MAX_VALUE;
        this.v = -7829368;
        this.z = true;
        this.B = ekz.a;
        this.C = -1;
        this.D = ekz.b;
        this.F = ekz.c;
        this.H = ekz.g;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        Path path = ekz.d;
        return new eko();
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        ekj ekjVar = (ekj) duvVar;
        ekj ekjVar2 = (ekj) duvVar2;
        ekjVar.a = ekjVar2.a;
        ekjVar.b = ekjVar2.b;
        ekjVar.c = ekjVar2.c;
        ekjVar.d = ekjVar2.d;
        ekjVar.e = ekjVar2.e;
        ekjVar.f = ekjVar2.f;
        ekjVar.g = ekjVar2.g;
        ekjVar.h = ekjVar2.h;
        ekjVar.i = ekjVar2.i;
        ekjVar.j = ekjVar2.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0426  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void I(defpackage.dru r46, defpackage.dse r47, defpackage.duv r48) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekk.I(dru, dse, duv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void K(defpackage.dru r36, defpackage.dse r37, int r38, int r39, defpackage.dxt r40, defpackage.duv r41) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekk.K(dru, dse, int, int, dxt, duv):void");
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        eko ekoVar = (eko) obj;
        int i = this.s;
        boolean z = this.c;
        ekj ekjVar = (ekj) duvVar;
        CharSequence charSequence = ekjVar.h;
        mxq mxqVar = this.I;
        Layout layout = ekjVar.i;
        Float f = ekjVar.j;
        ClickableSpan[] clickableSpanArr = ekjVar.a;
        ImageSpan[] imageSpanArr = ekjVar.c;
        Path path = ekz.d;
        float fFloatValue = f == null ? 0.0f : f.floatValue();
        String strJ = druVar.j();
        ekoVar.a = layout;
        ekoVar.c = fFloatValue;
        ekoVar.d = z;
        ekoVar.f = charSequence;
        if (ekoVar.m == null && clickableSpanArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpanArr[i2] instanceof ehg) {
                    ekoVar.m = new Handler();
                    break;
                }
                i2++;
            }
        }
        ekoVar.k = null;
        boolean z2 = clickableSpanArr != null && clickableSpanArr.length > 0;
        ColorStateList colorStateList = this.B;
        ekoVar.e = z2;
        ekoVar.i = i;
        ekoVar.o = mxqVar;
        if (colorStateList == null) {
            colorStateList = ekz.a;
        }
        ekoVar.g = colorStateList;
        ekoVar.h = ekoVar.g.getDefaultColor();
        Layout layout2 = ekoVar.a;
        if (layout2 != null) {
            layout2.getPaint().setColor(ekoVar.g.getColorForState(ekoVar.getState(), ekoVar.h));
        }
        ekoVar.a(0, 0);
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(ekoVar);
                drawable.setVisible(true, false);
            }
        }
        ekoVar.j = imageSpanArr;
        ekoVar.n = strJ;
        mxq mxqVar2 = ekoVar.o;
        if (mxqVar2 != null) {
            mxqVar2.b(ekoVar.a, ekoVar.f);
        }
        ekoVar.invalidateSelf();
        if (charSequence instanceof ehh) {
            ((ehh) charSequence).a();
        }
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean V() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean W() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 2;
    }

    @Override // defpackage.drq
    public final int ak(int i, int i2, duv duvVar) {
        CharSequence charSequence = this.A;
        ekj ekjVar = (ekj) duvVar;
        Layout layout = ekjVar.i;
        ClickableSpan[] clickableSpanArr = ekjVar.a;
        Path path = ekz.d;
        if (!(charSequence instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) charSequence;
        for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
            ClickableSpan clickableSpan = clickableSpanArr[i3];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            Path path2 = ekz.d;
            layout.getSelectionPath(spanStart, spanEnd, path2);
            RectF rectF = ekz.f;
            path2.computeBounds(rectF, true);
            if (rectF.contains(i, i2)) {
                return i3;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.drq
    public final int al(duv duvVar) {
        boolean z = this.a;
        ClickableSpan[] clickableSpanArr = ((ekj) duvVar).a;
        Path path = ekz.d;
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    @Override // defpackage.drq
    protected final void ap(View view, ajr ajrVar) {
        CharSequence charSequence = this.A;
        Path path = ekz.d;
        int[] iArr = ahj.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        AccessibilityNodeInfo accessibilityNodeInfo = ajrVar.a;
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (charSequence instanceof Spanned) {
            ent[] entVarArr = (ent[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ent.class);
            if (entVarArr.length != 0) {
                new SpannableStringBuilder(charSequence);
                ent entVar = entVarArr[0];
                throw null;
            }
        }
        if (contentDescription != null) {
            charSequence = contentDescription;
        }
        accessibilityNodeInfo.setText(charSequence);
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.addAction(256);
        accessibilityNodeInfo.addAction(512);
        accessibilityNodeInfo.setMovementGranularities(11);
        accessibilityNodeInfo.setMultiLine(true);
    }

    @Override // defpackage.drq
    protected final void aq(ajr ajrVar, int i, int i2, int i3, duv duvVar) {
        CharSequence charSequence = this.A;
        ekj ekjVar = (ekj) duvVar;
        Layout layout = ekjVar.i;
        ClickableSpan[] clickableSpanArr = ekjVar.a;
        Path path = ekz.d;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineVisibleEnd = lineForOffset == layout.getLineForOffset(spanEnd) ? spanEnd : layout.getLineVisibleEnd(lineForOffset);
            Path path2 = ekz.d;
            layout.getSelectionPath(spanStart, lineVisibleEnd, path2);
            RectF rectF = ekz.f;
            path2.computeBounds(rectF, true);
            Rect rect = ekz.e;
            rect.set(((int) rectF.left) + i2, ((int) rectF.top) + i3, i2 + ((int) rectF.right), i3 + ((int) rectF.bottom));
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
                AccessibilityNodeInfo accessibilityNodeInfo = ajrVar.a;
                accessibilityNodeInfo.setBoundsInParent(rect);
                accessibilityNodeInfo.setContentDescription("");
                return;
            }
            AccessibilityNodeInfo accessibilityNodeInfo2 = ajrVar.a;
            accessibilityNodeInfo2.setBoundsInParent(rect);
            ajrVar.f();
            ajrVar.h();
            ajrVar.g();
            ajrVar.k();
            accessibilityNodeInfo2.setText(spanned.subSequence(spanStart, spanEnd));
            if (clickableSpan instanceof ens) {
                throw null;
            }
            accessibilityNodeInfo2.setClassName("android.widget.Button");
        }
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        CharSequence charSequence = this.A;
        Path path = ekz.d;
        ((eko) obj).b();
        if (charSequence instanceof ehh) {
            ((ehh) charSequence).b();
        }
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        ekk ekkVar = (ekk) drqVar;
        if (this.a != ekkVar.a) {
            return false;
        }
        int i = this.G;
        if (i == 0 ? ekkVar.G != 0 : i != ekkVar.G) {
            return false;
        }
        if (this.b != ekkVar.b || Float.compare(0.0f, 0.0f) != 0 || this.c != ekkVar.c) {
            return false;
        }
        CharSequence charSequence = this.d;
        if (charSequence == null ? ekkVar.d != null : !charSequence.equals(ekkVar.d)) {
            return false;
        }
        TextUtils.TruncateAt truncateAt = this.e;
        if (truncateAt == null ? ekkVar.e != null : !truncateAt.equals(ekkVar.e)) {
            return false;
        }
        if (this.f != ekkVar.f || Float.compare(this.r, ekkVar.r) != 0 || this.s != ekkVar.s || Float.compare(0.0f, 0.0f) != 0 || Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) != 0 || this.t != ekkVar.t || this.u != ekkVar.u || this.v != ekkVar.v || Float.compare(this.w, ekkVar.w) != 0 || Float.compare(this.x, ekkVar.x) != 0 || Float.compare(this.y, ekkVar.y) != 0 || this.z != ekkVar.z || Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        CharSequence charSequence2 = this.A;
        if (charSequence2 == null ? ekkVar.A != null : !charSequence2.equals(ekkVar.A)) {
            return false;
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList == null ? ekkVar.B != null : !colorStateList.equals(ekkVar.B)) {
            return false;
        }
        mxq mxqVar = this.I;
        if (mxqVar == null ? ekkVar.I != null : !mxqVar.equals(ekkVar.I)) {
            return false;
        }
        if (this.C != ekkVar.C || this.D != ekkVar.D || this.E != ekkVar.E) {
            return false;
        }
        Typeface typeface = this.F;
        if (typeface == null ? ekkVar.F != null : !typeface.equals(ekkVar.F)) {
            return false;
        }
        int i2 = this.H;
        int i3 = ekkVar.H;
        return i2 == 0 ? i3 == 0 : i3 == 1;
    }

    @Override // defpackage.drq
    protected final int h() {
        return 30;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (ekk) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new ekj();
    }
}
