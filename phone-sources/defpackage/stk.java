package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class stk extends MaterialButton implements cqu {
    public static final /* synthetic */ int H = 0;
    static final Property v = new stc(Float.class);
    static final Property w = new std(Float.class);
    static final Property x = new ste(Float.class);
    static final Property y = new stf(Float.class);
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    protected ColorStateList E;
    public int F;
    public int G;
    private final stt I;
    private final int J;
    private final cqv K;
    private final int L;
    private final xzg M;
    private boolean a;
    private final stt b;
    private final stt c;
    private final stt d;
    public int z;

    public stk(Context context) {
        this(context, null);
    }

    private final void b() {
        this.E = getTextColors();
    }

    public final boolean A() {
        return getVisibility() != 0 ? this.z == 2 : this.z != 1;
    }

    public final void B(int i) {
        stt sttVar = i != 0 ? i != 1 ? i != 2 ? this.c : this.b : this.I : this.d;
        if (sttVar.j()) {
            return;
        }
        if (this.a) {
            if (!isLaidOut()) {
                A();
            } else if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.F = layoutParams.width;
                        this.G = layoutParams.height;
                    } else {
                        this.F = getWidth();
                        this.G = getHeight();
                    }
                }
                measure(0, 0);
                AnimatorSet animatorSetA = sttVar.a();
                animatorSetA.addListener(new stb(sttVar));
                Iterator it = sttVar.d().iterator();
                while (it.hasNext()) {
                    animatorSetA.addListener((Animator.AnimatorListener) it.next());
                }
                animatorSetA.start();
                return;
            }
        }
        sttVar.i();
        sttVar.k();
    }

    @Override // defpackage.cqu
    public final cqv a() {
        return this.K;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C && TextUtils.isEmpty(getText()) && this.f != null) {
            this.C = false;
            this.b.i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.C || this.D) {
            return;
        }
        this.A = getPaddingStart();
        this.B = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.C || this.D) {
            return;
        }
        this.A = i;
        this.B = i3;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        b();
    }

    final int w() {
        return (x() - this.h) / 2;
    }

    final int x() {
        int i = this.J;
        if (i >= 0) {
            return i;
        }
        int iMin = Math.min(getPaddingStart(), getPaddingEnd());
        return iMin + iMin + this.h;
    }

    public final void y() {
        B(3);
    }

    protected final void z(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public stk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public stk(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.z = 0;
        this.a = true;
        xzg xzgVar = new xzg();
        this.M = xzgVar;
        sti stiVar = new sti(this, xzgVar);
        this.d = stiVar;
        sth sthVar = new sth(this, xzgVar);
        this.I = sthVar;
        this.C = true;
        this.D = false;
        Context context2 = getContext();
        this.K = new ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayA = suy.a(context2, attributeSet, stu.a, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        snw snwVarB = snw.b(context2, typedArrayA, 5);
        snw snwVarB2 = snw.b(context2, typedArrayA, 4);
        snw snwVarB3 = snw.b(context2, typedArrayA, 2);
        snw snwVarB4 = snw.b(context2, typedArrayA, 6);
        this.J = typedArrayA.getDimensionPixelSize(0, -1);
        int i2 = typedArrayA.getInt(3, 1);
        this.L = i2;
        this.A = getPaddingStart();
        this.B = getPaddingEnd();
        xzg xzgVar2 = new xzg();
        stj ssyVar = new ssy(this, 0);
        stj sszVar = new ssz(this, ssyVar);
        stj staVar = new sta(this, sszVar, ssyVar);
        ?? r3 = 1;
        if (i2 != 1) {
            ssyVar = i2 != 2 ? staVar : sszVar;
            r3 = 1;
        }
        stg stgVar = new stg(this, xzgVar2, ssyVar, r3);
        this.c = stgVar;
        stg stgVar2 = new stg(this, xzgVar2, new ssy(this, r3), false);
        this.b = stgVar2;
        stiVar.b = snwVarB;
        sthVar.b = snwVarB2;
        stgVar.b = snwVarB3;
        stgVar2.b = snwVarB4;
        typedArrayA.recycle();
        p(new szq(szq.d(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, szq.a)));
        b();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }
}
