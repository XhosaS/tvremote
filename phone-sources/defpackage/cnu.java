package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.videos.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnu extends fm {
    public yjk a;
    public cns b;
    public final cnr c;
    private final View d;
    private final float e;
    private boolean f;

    public cnu(yjk yjkVar, cns cnsVar, View view, cmi cmiVar, clx clxVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), true != cnsVar.d ? R.style.FloatingDialogWindowTheme : R.style.DialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.a = yjkVar;
        this.b = cnsVar;
        this.d = view;
        this.e = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        cwn.c(window, this.b.d);
        window.setGravity(17);
        if (!this.b.d) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                cnl.a.a(attributes);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                cnm cnmVar = cnm.a;
                cnmVar.a(attributes, 0);
                cnmVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        cnr cnrVar = new cnr(getContext(), window);
        setTitle(this.b.e);
        Objects.toString(uuid);
        cnrVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        cnrVar.setClipChildren(false);
        cnrVar.setElevation(clxVar.cr(8.0f));
        cnrVar.setOutlineProvider(new cnt());
        this.c = cnrVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(cnrVar);
        dwf.f(cnrVar, dwf.e(view));
        dwf.d(cnrVar, dwf.c(view));
        gez.w(cnrVar, gez.v(view));
        a(this.a, this.b, cmiVar);
        fx onBackPressedDispatcher = getOnBackPressedDispatcher();
        cbq cbqVar = new cbq(this, 20);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.b(this, new fy(cbqVar));
    }

    private static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof cnr) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    public final void a(yjk yjkVar, cns cnsVar, cmi cmiVar) {
        int i;
        this.a = yjkVar;
        this.b = cnsVar;
        int i2 = cnsVar.f;
        int i3 = i2 - 1;
        boolean zC = a.C(this.d);
        if (i2 == 0) {
            throw null;
        }
        if (i3 != 0) {
            throw new yfu();
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(true != zC ? -8193 : 8192, 8192);
        cnr cnrVar = this.c;
        int iOrdinal = cmiVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                throw new yfu();
            }
            i = 1;
        }
        cnrVar.setLayoutDirection(i);
        boolean z = cnsVar.d;
        boolean z2 = cnsVar.c;
        boolean z3 = (cnrVar.d && z2 == cnrVar.b && z == cnrVar.c) ? false : true;
        cnrVar.b = z2;
        cnrVar.c = z;
        if (z3) {
            Window window2 = cnrVar.a;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i4 = true != z2 ? -1 : -2;
            if (i4 != attributes.width || !cnrVar.d) {
                window2.setLayout(i4, -2);
                cnrVar.d = true;
            }
        }
        setCanceledOnTouchOutside(cnsVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.b.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.a.a();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6 <= r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r10 != 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r10 != 3) goto L37;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            cns r1 = r9.b
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L85
            cnr r1 = r9.c
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6b
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6b
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L36
            goto L6b
        L36:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r6 = r6 + r7
            int r7 = r5.getWidth()
            int r7 = r7 + r6
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r1 = r1 + r8
            int r5 = r5.getHeight()
            int r5 = r5 + r1
            float r8 = r10.getX()
            int r8 = defpackage.yln.v(r8)
            if (r6 > r8) goto L6b
            if (r8 > r7) goto L6b
            float r6 = r10.getY()
            int r6 = defpackage.yln.v(r6)
            if (r1 > r6) goto L6b
            if (r6 > r5) goto L6b
            goto L85
        L6b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L82
            if (r10 == r4) goto L76
            if (r10 == r2) goto L90
            goto L8f
        L76:
            boolean r10 = r9.f
            if (r10 == 0) goto L8f
            yjk r10 = r9.a
            r10.a()
            r9.f = r3
            return r4
        L82:
            r9.f = r4
            return r4
        L85:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L90
            if (r10 == r4) goto L90
            if (r10 == r2) goto L90
        L8f:
            return r0
        L90:
            r9.f = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnu.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
