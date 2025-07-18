package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import defpackage.a;
import defpackage.eao;
import defpackage.ebg;
import defpackage.ebh;
import defpackage.ebo;
import defpackage.eci;
import defpackage.eiz;
import defpackage.ftk;
import defpackage.ftm;
import defpackage.jde;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    private boolean A;
    public final View a;
    public final ImageView b;
    public final SubtitleView c;
    public final PlayerControlView d;
    public final Handler e;
    public eao f;
    public boolean g;
    public jde h;
    private final ftm i;
    private final AspectRatioFrameLayout j;
    private final View k;
    private final boolean l;
    private final ImageView m;
    private final View n;
    private final TextView o;
    private final Class p;
    private final Method q;
    private final Object r;
    private boolean s;
    private int t;
    private int u;
    private Drawable v;
    private int w;
    private boolean x;
    private int y;
    private boolean z;

    public PlayerView(Context context) {
        this(context, null);
    }

    private final void B() {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    private final void C(boolean z) {
        if (!(x() && this.g) && G()) {
            PlayerControlView playerControlView = this.d;
            boolean z2 = true;
            boolean z3 = false;
            if (playerControlView.r() && playerControlView.N <= 0) {
                z3 = true;
            }
            boolean zF = F();
            if (z || z3) {
                z2 = zF;
            } else if (!zF) {
                return;
            }
            D(z2);
        }
    }

    private final void D(boolean z) {
        if (G()) {
            PlayerControlView playerControlView = this.d;
            playerControlView.e(z ? 0 : this.y);
            ftk ftkVar = playerControlView.a;
            PlayerControlView playerControlView2 = ftkVar.a;
            if (!playerControlView2.s()) {
                playerControlView2.setVisibility(0);
                playerControlView2.f();
                ImageView imageView = playerControlView2.q;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            ftkVar.l();
        }
    }

    private final boolean E(Drawable drawable) {
        ImageView imageView = this.m;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                float height = intrinsicHeight;
                float width = intrinsicWidth;
                if (this.t == 2) {
                    width = getWidth();
                    height = getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                y(this.j, width / height);
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private final boolean F() {
        eao eaoVar = this.f;
        if (eaoVar == null) {
            return true;
        }
        int iBf = eaoVar.bf();
        if (!this.z) {
            return false;
        }
        if (this.f.q(17) && this.f.N().q()) {
            return false;
        }
        if (iBf != 1 && iBf != 4) {
            eao eaoVar2 = this.f;
            eaoVar2.getClass();
            if (eaoVar2.al()) {
                return false;
            }
        }
        return true;
    }

    private final boolean G() {
        if (!this.s) {
            return false;
        }
        eci.e(this.d);
        return true;
    }

    protected static final void y(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout == null || aspectRatioFrameLayout.a == f) {
            return;
        }
        aspectRatioFrameLayout.a = f;
        aspectRatioFrameLayout.requestLayout();
    }

    public final void A() {
        PlayerControlView playerControlView = this.d;
        eci.e(playerControlView);
        playerControlView.a.j(playerControlView.o, false);
        playerControlView.h();
    }

    public final int a() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.j;
        eci.e(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.b;
    }

    public final void b() {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void c() {
        e();
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final void d() {
        PlayerControlView playerControlView = this.d;
        if (playerControlView != null) {
            playerControlView.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        eao eaoVar = this.f;
        if (eaoVar != null && eaoVar.q(16) && this.f.an()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && G() && !this.d.r()) {
            C(true);
            return true;
        }
        if ((G() && this.d.q(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            C(true);
            return true;
        }
        if (!z || !G()) {
            return false;
        }
        C(true);
        return false;
    }

    public final void e() {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public final void f() {
        View view = this.k;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public final void g() {
        View view = this.k;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(eao eaoVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a.ab(Looper.myLooper() == Looper.getMainLooper());
        a.H(eaoVar == null || ((eiz) eaoVar).h == Looper.getMainLooper());
        eao eaoVar2 = this.f;
        if (eaoVar2 == eaoVar) {
            return;
        }
        if (eaoVar2 != null) {
            eaoVar2.X(this.i);
            if (eaoVar2.q(27)) {
                View view = this.k;
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    eiz eizVar = (eiz) eaoVar2;
                    eizVar.aG();
                    if (textureView != null && textureView == eizVar.u) {
                        eizVar.U();
                    }
                } else if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    eiz eizVar2 = (eiz) eaoVar2;
                    eizVar2.aG();
                    SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                    eizVar2.aG();
                    if (holder != null && holder == eizVar2.s) {
                        eizVar2.U();
                    }
                }
            }
            Class cls = this.p;
            if (cls != null && cls.isAssignableFrom(eaoVar2.getClass())) {
                try {
                    Method method = this.q;
                    method.getClass();
                    method.invoke(eaoVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        SubtitleView subtitleView = this.c;
        if (subtitleView != null) {
            subtitleView.a(null);
        }
        this.f = eaoVar;
        if (G()) {
            this.d.d(eaoVar);
        }
        o();
        r();
        s(true);
        if (eaoVar == null) {
            d();
            return;
        }
        if (eaoVar.q(27)) {
            View view2 = this.k;
            if (view2 instanceof TextureView) {
                eaoVar.ai((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                eaoVar.ah((SurfaceView) view2);
            }
            if (eaoVar.q(30)) {
                ebh ebhVarP = eaoVar.P();
                int i = 0;
                loop0: while (true) {
                    ImmutableList immutableList = ebhVarP.c;
                    if (i >= immutableList.size()) {
                        break;
                    }
                    if (((ebg) immutableList.get(i)).a() == 2) {
                        ebg ebgVar = (ebg) immutableList.get(i);
                        for (int i2 = 0; i2 < ebgVar.h.length; i2++) {
                            if (ebgVar.d(i2)) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                n();
            } else {
                n();
            }
        }
        if (subtitleView != null && eaoVar.q(28)) {
            subtitleView.a(eaoVar.R().d);
        }
        eaoVar.S(this.i);
        Class cls2 = this.p;
        if (cls2 != null && cls2.isAssignableFrom(eaoVar.getClass())) {
            try {
                Method method2 = this.q;
                method2.getClass();
                Object obj = this.r;
                obj.getClass();
                method2.invoke(eaoVar, obj);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        C(false);
    }

    public final void i(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.j;
        eci.e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.a(i);
    }

    public final void j(boolean z) {
        a.ab((z && this.d == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.s == z) {
            return;
        }
        this.s = z;
        if (G()) {
            this.d.d(this.f);
        } else {
            PlayerControlView playerControlView = this.d;
            if (playerControlView != null) {
                playerControlView.b();
                playerControlView.d(null);
            }
        }
        p();
    }

    public final void k() {
        D(F());
    }

    public final void l() {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
            t();
        }
    }

    public final void m() {
        if (!G() || this.f == null) {
            return;
        }
        PlayerControlView playerControlView = this.d;
        if (!playerControlView.r()) {
            C(true);
        } else if (this.A) {
            playerControlView.b();
        }
    }

    public final void n() {
        eao eaoVar = this.f;
        ebo eboVarQ = eaoVar != null ? eaoVar.Q() : ebo.a;
        int i = eboVarQ.e;
        int i2 = eboVarQ.f;
        y(this.j, true != this.l ? (i2 == 0 || i == 0) ? 0.0f : (i * eboVarQ.g) / i2 : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r4 = this;
            android.view.View r0 = r4.n
            if (r0 == 0) goto L25
            eao r1 = r4.f
            if (r1 == 0) goto L20
            int r1 = r1.bf()
            r2 = 2
            if (r1 != r2) goto L20
            int r1 = r4.w
            r3 = 0
            if (r1 == r2) goto L22
            r2 = 1
            if (r1 != r2) goto L20
            eao r1 = r4.f
            boolean r1 = r1.al()
            if (r1 == 0) goto L20
            goto L22
        L20:
            r3 = 8
        L22:
            r0.setVisibility(r3)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.o():void");
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!G() || this.f == null) {
            return false;
        }
        C(true);
        return true;
    }

    public final void p() {
        PlayerControlView playerControlView = this.d;
        if (playerControlView == null || !this.s) {
            setContentDescription(null);
        } else if (playerControlView.r()) {
            setContentDescription(this.A ? getResources().getString(com.google.android.videos.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.google.android.videos.R.string.exo_controls_show));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        m();
        return super.performClick();
    }

    public final void q() {
        if (x() && this.g) {
            d();
        } else {
            C(false);
        }
    }

    public final void r() {
        TextView textView = this.o;
        if (textView != null) {
            eao eaoVar = this.f;
            if (eaoVar != null) {
                ((eiz) eaoVar).aw();
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(boolean r7) {
        /*
            r6 = this;
            eao r0 = r6.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            r3 = 30
            boolean r3 = r0.q(r3)
            if (r3 == 0) goto L1a
            ebh r3 = r0.P()
            boolean r3 = r3.a()
            if (r3 != 0) goto L1a
            r3 = r1
            goto L1b
        L1a:
            r3 = r2
        L1b:
            boolean r4 = r6.x
            if (r4 != 0) goto L2c
            if (r3 == 0) goto L23
            if (r7 == 0) goto L2e
        L23:
            r6.B()
            r6.b()
            r6.c()
        L2c:
            if (r3 == 0) goto Lb5
        L2e:
            boolean r7 = r6.v()
            boolean r3 = r6.u()
            if (r7 != 0) goto L40
            if (r3 != 0) goto L40
            r6.b()
            r6.c()
        L40:
            android.view.View r4 = r6.a
            if (r4 == 0) goto L5d
            int r4 = r4.getVisibility()
            r5 = 4
            if (r4 != r5) goto L5d
            android.widget.ImageView r4 = r6.b
            if (r4 != 0) goto L50
            goto L5d
        L50:
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L5d
            int r4 = r4.getAlpha()
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r1 = r2
        L5e:
            if (r3 == 0) goto L6b
            if (r7 != 0) goto L6b
            if (r1 == 0) goto L6b
            r6.b()
            r6.l()
            goto L74
        L6b:
            if (r7 == 0) goto L74
            if (r3 != 0) goto L74
            if (r1 == 0) goto L74
            r6.c()
        L74:
            if (r7 != 0) goto Lb2
            if (r3 != 0) goto Lb2
            int r7 = r6.t
            if (r7 == 0) goto Lb2
            android.widget.ImageView r7 = r6.m
            defpackage.eci.e(r7)
            if (r0 == 0) goto La9
            r7 = 18
            boolean r7 = r0.q(r7)
            if (r7 != 0) goto L8c
            goto La9
        L8c:
            eab r7 = r0.J()
            byte[] r7 = r7.l
            if (r7 == 0) goto La9
            int r0 = r7.length
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r7, r2, r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r6.getResources()
            r0.<init>(r1, r7)
            boolean r7 = r6.E(r0)
            if (r7 == 0) goto La9
            goto Lb5
        La9:
            android.graphics.drawable.Drawable r7 = r6.v
            boolean r7 = r6.E(r7)
            if (r7 == 0) goto Lb2
            goto Lb5
        Lb2:
            r6.B()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.s(boolean):void");
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.k;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public final void t() {
        Drawable drawable;
        float f;
        ImageView imageView = this.b;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        float f2 = intrinsicHeight;
        float f3 = intrinsicWidth;
        if (this.u == 1) {
            float width = getWidth();
            float height = getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
            f = width / height;
        } else {
            f = f3 / f2;
        }
        if (imageView.getVisibility() == 0) {
            y(this.j, f);
        }
        imageView.setScaleType(scaleType);
    }

    public final boolean u() {
        eao eaoVar = this.f;
        return eaoVar != null && this.r != null && eaoVar.q(30) && eaoVar.P().b(4);
    }

    public final boolean v() {
        eao eaoVar = this.f;
        return eaoVar != null && eaoVar.q(30) && eaoVar.P().b(2);
    }

    public final boolean w() {
        PlayerControlView playerControlView = this.d;
        return playerControlView != null && playerControlView.r();
    }

    public final boolean x() {
        eao eaoVar = this.f;
        return eaoVar != null && eaoVar.q(16) && this.f.an() && this.f.al();
    }

    public final void z() {
        PlayerControlView playerControlView = this.d;
        eci.e(playerControlView);
        playerControlView.a.j(playerControlView.p, false);
        playerControlView.h();
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayerView(android.content.Context r23, android.util.AttributeSet r24, int r25) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
