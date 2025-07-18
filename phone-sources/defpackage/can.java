package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class can extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private bav c;
    private baw d;
    private yjk e;
    private boolean f;
    private boolean g;

    public can(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void b() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x020c, TryCatch #0 {all -> 0x020c, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b8, B:39:0x00b2, B:41:0x00b6, B:43:0x00bc, B:44:0x00c3, B:45:0x00c4, B:47:0x00df, B:48:0x00ff, B:50:0x0105, B:52:0x010d, B:56:0x0116, B:57:0x0128, B:59:0x0133, B:62:0x0139, B:63:0x014d, B:65:0x015c, B:67:0x016c, B:68:0x0172, B:70:0x017a, B:71:0x017f, B:73:0x0190, B:75:0x019b, B:77:0x019f, B:81:0x01af, B:85:0x01b8, B:87:0x01bc, B:89:0x01c2, B:108:0x01fb, B:90:0x01c8, B:92:0x01cd, B:94:0x01d1, B:96:0x01d9, B:98:0x01de, B:102:0x01e6, B:104:0x01ef, B:105:0x01f2, B:106:0x01f6, B:109:0x0200, B:110:0x0203, B:74:0x0198, B:111:0x0207, B:53:0x0110), top: B:118:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116 A[Catch: all -> 0x020c, TryCatch #0 {all -> 0x020c, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b8, B:39:0x00b2, B:41:0x00b6, B:43:0x00bc, B:44:0x00c3, B:45:0x00c4, B:47:0x00df, B:48:0x00ff, B:50:0x0105, B:52:0x010d, B:56:0x0116, B:57:0x0128, B:59:0x0133, B:62:0x0139, B:63:0x014d, B:65:0x015c, B:67:0x016c, B:68:0x0172, B:70:0x017a, B:71:0x017f, B:73:0x0190, B:75:0x019b, B:77:0x019f, B:81:0x01af, B:85:0x01b8, B:87:0x01bc, B:89:0x01c2, B:108:0x01fb, B:90:0x01c8, B:92:0x01cd, B:94:0x01d1, B:96:0x01d9, B:98:0x01de, B:102:0x01e6, B:104:0x01ef, B:105:0x01f2, B:106:0x01f6, B:109:0x0200, B:110:0x0203, B:74:0x0198, B:111:0x0207, B:53:0x0110), top: B:118:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133 A[Catch: all -> 0x020c, TryCatch #0 {all -> 0x020c, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b8, B:39:0x00b2, B:41:0x00b6, B:43:0x00bc, B:44:0x00c3, B:45:0x00c4, B:47:0x00df, B:48:0x00ff, B:50:0x0105, B:52:0x010d, B:56:0x0116, B:57:0x0128, B:59:0x0133, B:62:0x0139, B:63:0x014d, B:65:0x015c, B:67:0x016c, B:68:0x0172, B:70:0x017a, B:71:0x017f, B:73:0x0190, B:75:0x019b, B:77:0x019f, B:81:0x01af, B:85:0x01b8, B:87:0x01bc, B:89:0x01c2, B:108:0x01fb, B:90:0x01c8, B:92:0x01cd, B:94:0x01d1, B:96:0x01d9, B:98:0x01de, B:102:0x01e6, B:104:0x01ef, B:105:0x01f2, B:106:0x01f6, B:109:0x0200, B:110:0x0203, B:74:0x0198, B:111:0x0207, B:53:0x0110), top: B:118:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139 A[Catch: all -> 0x020c, TryCatch #0 {all -> 0x020c, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b8, B:39:0x00b2, B:41:0x00b6, B:43:0x00bc, B:44:0x00c3, B:45:0x00c4, B:47:0x00df, B:48:0x00ff, B:50:0x0105, B:52:0x010d, B:56:0x0116, B:57:0x0128, B:59:0x0133, B:62:0x0139, B:63:0x014d, B:65:0x015c, B:67:0x016c, B:68:0x0172, B:70:0x017a, B:71:0x017f, B:73:0x0190, B:75:0x019b, B:77:0x019f, B:81:0x01af, B:85:0x01b8, B:87:0x01bc, B:89:0x01c2, B:108:0x01fb, B:90:0x01c8, B:92:0x01cd, B:94:0x01d1, B:96:0x01d9, B:98:0x01de, B:102:0x01e6, B:104:0x01ef, B:105:0x01f2, B:106:0x01f6, B:109:0x0200, B:110:0x0203, B:74:0x0198, B:111:0x0207, B:53:0x0110), top: B:118:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c A[Catch: all -> 0x020c, TryCatch #0 {all -> 0x020c, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:15:0x002a, B:18:0x0031, B:20:0x0035, B:22:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:35:0x006c, B:36:0x0074, B:38:0x007a, B:42:0x00b8, B:39:0x00b2, B:41:0x00b6, B:43:0x00bc, B:44:0x00c3, B:45:0x00c4, B:47:0x00df, B:48:0x00ff, B:50:0x0105, B:52:0x010d, B:56:0x0116, B:57:0x0128, B:59:0x0133, B:62:0x0139, B:63:0x014d, B:65:0x015c, B:67:0x016c, B:68:0x0172, B:70:0x017a, B:71:0x017f, B:73:0x0190, B:75:0x019b, B:77:0x019f, B:81:0x01af, B:85:0x01b8, B:87:0x01bc, B:89:0x01c2, B:108:0x01fb, B:90:0x01c8, B:92:0x01cd, B:94:0x01d1, B:96:0x01d9, B:98:0x01de, B:102:0x01e6, B:104:0x01ef, B:105:0x01f2, B:106:0x01f6, B:109:0x0200, B:110:0x0203, B:74:0x0198, B:111:0x0207, B:53:0x0110), top: B:118:0x0006 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, can, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [bko] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [bko] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [bfz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.can.j():void");
    }

    private final void k(baw bawVar) {
        if (true != l(bawVar)) {
            bawVar = null;
        }
        if (bawVar != null) {
            this.a = new WeakReference(bawVar);
        }
    }

    private static final boolean l(baw bawVar) {
        return !(bawVar instanceof bcy) || ((bcu) ((bcy) bawVar).l.d()).compareTo(bcu.b) > 0;
    }

    public abstract void a(bao baoVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    protected boolean c() {
        throw null;
    }

    public final void d() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        j();
    }

    public final void e() {
        bav bavVar = this.c;
        if (bavVar != null) {
            bavVar.d();
        }
        this.c = null;
        requestLayout();
    }

    public void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final void h(baw bawVar) {
        if (this.d != bawVar) {
            this.d = bawVar;
            if (bawVar != null) {
                this.a = null;
            }
            bav bavVar = this.c;
            if (bavVar != null) {
                bavVar.d();
                this.c = null;
                if (isAttachedToWindow()) {
                    j();
                }
            }
        }
    }

    public final void i() {
        yjk cdqVar;
        yjk yjkVar = this.e;
        if (yjkVar != null) {
            yjkVar.a();
        }
        if (isAttachedToWindow()) {
            dvk dvkVarE = dwf.e(this);
            if (dvkVarE == null) {
                bty.a(a.cj(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new yfs();
            }
            cdqVar = cbp.u(this, dvkVarE.getLifecycle());
        } else {
            ylf ylfVar = new ylf();
            cdr cdrVar = new cdr(this, ylfVar, 0);
            addOnAttachStateChangeListener(cdrVar);
            ylfVar.a = new bmq(this, cdrVar, 9, null);
            cdqVar = new cdq(ylfVar, 0);
        }
        this.e = cdqVar;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.g || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder windowToken = getWindowToken();
        if (this.b != windowToken) {
            this.b = windowToken;
            this.a = null;
        }
        if (c()) {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        j();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public can(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public can(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        bne bneVar = new bne(this, 3);
        addOnAttachStateChangeListener(bneVar);
        pku pkuVar = new pku(this, null);
        ((ArrayList) dad.j(this).a).add(pkuVar);
        this.e = new cdp(this, bneVar, pkuVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    public /* synthetic */ can(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
