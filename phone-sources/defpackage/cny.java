package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.videos.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cny extends can {
    private static final yjv j = ccu.p;
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public coa d;
    public cmi e;
    public final bcb f;
    public final bcb g;
    public final bdy h;
    public final int[] i;
    private yjk k;
    private cob l;
    private cmg m;
    private final float n;
    private final Rect o;
    private final bji p;
    private Object q;
    private final bcb r;
    private boolean s;
    private final cqv t;

    public cny(yjk yjkVar, cob cobVar, View view, clx clxVar, coa coaVar, UUID uuid, cqv cqvVar) {
        super(view.getContext(), null, 0, 6, null);
        this.k = yjkVar;
        this.l = cobVar;
        this.a = view;
        this.t = cqvVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.b = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = cnk.a(this.l, a.C(view));
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.c = layoutParams;
        this.d = coaVar;
        this.e = cmi.a;
        bcz bczVar = bcz.c;
        this.f = new bci(null, bczVar);
        this.g = new bci(null, bczVar);
        cdq cdqVar = new cdq(this, 9);
        ivx ivxVar = bdt.a;
        this.h = new bbh(cdqVar, null);
        this.n = 8.0f;
        this.o = new Rect();
        this.p = new bji(new cnw(this));
        setId(android.R.id.content);
        dwf.f(this, dwf.e(view));
        dwf.d(this, dwf.c(view));
        gez.w(this, gez.v(view));
        Objects.toString(uuid);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:".concat(String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(clxVar.cr(8.0f));
        setOutlineProvider(new cnv());
        this.r = new bci(cno.a, bczVar);
        this.i = new int[2];
    }

    private final cmg o() {
        View view = this.a;
        Rect rect = this.o;
        view.getWindowVisibleDisplayFrame(rect);
        return new cmg(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.can
    public final void a(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-857613600);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            ((yjz) this.r.a()).a(baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new cnq(this, i, 2);
        }
    }

    public final bvc b() {
        return (bvc) this.g.a();
    }

    @Override // defpackage.can
    protected final boolean c() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                yjk yjkVar = this.k;
                if (yjkVar != null) {
                    yjkVar.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.can
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        super.f(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        cqv.x(this.b, this, layoutParams);
    }

    @Override // defpackage.can
    public final void g(int i, int i2) {
        cmg cmgVarO = o();
        super.g(View.MeasureSpec.makeMeasureSpec(cmgVarO.b(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(cmgVarO.a(), Integer.MIN_VALUE));
    }

    public final cmh j() {
        return (cmh) this.f.a();
    }

    public final void k(baw bawVar, yjz yjzVar) {
        super.h(bawVar);
        this.r.b(yjzVar);
        this.s = true;
    }

    public final void l() {
        bvc bvcVarB = b();
        if (bvcVarB != null) {
            if (true != bvcVarB.s()) {
                bvcVarB = null;
            }
            if (bvcVarB == null) {
                return;
            }
            long jH = bvcVarB.h();
            long jR = bty.r(bvcVarB);
            cmg cmgVarZ = clw.z((Math.round(Float.intBitsToFloat((int) (jR >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jR & 4294967295L)))), jH);
            if (yks.e(cmgVarZ, this.m)) {
                return;
            }
            this.m = cmgVarZ;
            m();
        }
    }

    public final void m() {
        cmh cmhVarJ;
        cmg cmgVar = this.m;
        if (cmgVar == null || (cmhVarJ = j()) == null) {
            return;
        }
        cmg cmgVarO = o();
        int iB = cmgVarO.b();
        long jA = cmgVarO.a();
        yle yleVar = new yle();
        yleVar.a = 0L;
        long j2 = (iB << 32) | (jA & 4294967295L);
        this.p.c(this, j, new cnx(yleVar, this, cmgVar, j2, cmhVarJ.a));
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.x = cmf.a(yleVar.a);
        layoutParams.y = cmf.b(yleVar.a);
        this.t.a(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        cqv.x(this.b, this, layoutParams);
    }

    public final void n(yjk yjkVar, cob cobVar, cmi cmiVar) {
        int i;
        this.k = yjkVar;
        if (!yks.e(this.l, cobVar)) {
            this.l = cobVar;
            WindowManager.LayoutParams layoutParams = this.c;
            layoutParams.flags = cnk.a(cobVar, a.C(this.a));
            cqv.x(this.b, this, layoutParams);
        }
        int iOrdinal = cmiVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new yfu();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.can, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onAttachedToWindow();
        this.p.d();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.q == null) {
            this.q = new fyz(this.k, 1);
        }
        ?? r0 = this.q;
        if (!fm$$ExternalSyntheticApiModelOutline0.m410m((Object) r0) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, r0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onDetachedFromWindow();
        bji bjiVar = this.p;
        bjiVar.e();
        bjiVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            ?? r0 = this.q;
            if (fm$$ExternalSyntheticApiModelOutline0.m410m((Object) r0) && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(r0);
            }
        }
        this.q = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            yjk yjkVar = this.k;
            if (yjkVar == null) {
                return true;
            }
            yjkVar.a();
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        yjk yjkVar2 = this.k;
        if (yjkVar2 == null) {
            return true;
        }
        yjkVar2.a();
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}
