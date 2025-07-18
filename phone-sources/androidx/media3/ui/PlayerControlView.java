package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import defpackage.a;
import defpackage.dxc;
import defpackage.dyq;
import defpackage.dzz;
import defpackage.eao;
import defpackage.eav;
import defpackage.eax;
import defpackage.eay;
import defpackage.ebf;
import defpackage.ebh;
import defpackage.edt;
import defpackage.fsr;
import defpackage.fss;
import defpackage.fsu;
import defpackage.fsv;
import defpackage.fsw;
import defpackage.fsx;
import defpackage.ftk;
import defpackage.rza;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Formatter;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    private static final float[] R;
    public final View A;
    public final TextView B;
    public final StringBuilder C;
    public final Formatter D;
    public final Drawable E;
    public final Drawable F;
    public final String G;
    public final String H;
    public eao I;
    public fsv J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public boolean Q;
    private final Resources S;
    private final fss T;
    private final RecyclerView U;
    private final TextView V;
    private final TextView W;
    public final ftk a;
    private boolean[] aA;
    private long[] aB;
    private boolean[] aC;
    private long aD;
    private final DefaultTimeBar aE;
    private final dxc aF;
    private final ImageView aa;
    private final TextView ab;
    private final eav ac;
    private final eax ad;
    private final Runnable ae;
    private final Drawable af;
    private final Drawable ag;
    private final Drawable ah;
    private final Drawable ai;
    private final Drawable aj;
    private final String ak;
    private final String al;
    private final String am;
    private final Drawable an;
    private final Drawable ao;
    private final float ap;
    private final float aq;
    private final String ar;
    private final String as;
    private final Drawable at;
    private final Drawable au;
    private final String av;
    private final String aw;
    private boolean ax;
    private int ay;
    private long[] az;
    public final Class b;
    public final Method c;
    public final Method d;
    public final Class e;
    public final Method f;
    public final Method g;
    public final CopyOnWriteArrayList h;
    public final fsw i;
    public final fsu j;
    public final fsx k;
    public final fsr l;
    public final PopupWindow m;
    public final int n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final View y;
    public final View z;

    static {
        dzz.b("media3.ui");
        R = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.common.collect.ImmutableList t(defpackage.ebh r18, int r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.t(ebh, int):com.google.common.collect.ImmutableList");
    }

    private static void u(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private final void v(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.ap : this.aq);
    }

    private final void w() {
        fsw fswVar = this.i;
        boolean z = true;
        if (!fswVar.b(1) && !fswVar.b(0)) {
            z = false;
        }
        v(z, this.y);
    }

    public final void a(RecyclerView.Adapter adapter, View view) {
        this.U.setAdapter(adapter);
        m();
        this.Q = false;
        PopupWindow popupWindow = this.m;
        popupWindow.dismiss();
        this.Q = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = -popupWindow.getHeight();
        int i2 = this.n;
        popupWindow.showAsDropDown(view, width - i2, i - i2);
    }

    public final void b() {
        ftk ftkVar = this.a;
        int i = ftkVar.s;
        if (i == 3 || i == 2) {
            return;
        }
        ftkVar.h();
        if (!ftkVar.v) {
            ftkVar.e();
        } else if (ftkVar.s == 1) {
            ftkVar.f();
        } else {
            ftkVar.d();
        }
    }

    public final void c(eao eaoVar, long j) {
        if (eaoVar.q(5)) {
            ((dyq) eaoVar).w(j);
        }
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.eao r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            defpackage.a.ab(r0)
            if (r5 == 0) goto L1f
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1 = r5
            eiz r1 = (defpackage.eiz) r1
            android.os.Looper r1 = r1.h
            if (r1 != r0) goto L20
        L1f:
            r2 = r3
        L20:
            defpackage.a.H(r2)
            eao r0 = r4.I
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L2f
            fss r1 = r4.T
            r0.X(r1)
        L2f:
            r4.I = r5
            if (r5 == 0) goto L38
            fss r0 = r4.T
            r5.S(r0)
        L38:
            r4.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.d(eao):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return q(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(int i) {
        this.N = i;
        if (r()) {
            this.a.i();
        }
    }

    final void f() {
        i();
        h();
        l();
        n();
        p();
        j();
        o();
    }

    public final void g(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.at);
            imageView.setContentDescription(this.av);
        } else {
            imageView.setImageDrawable(this.au);
            imageView.setContentDescription(this.aw);
        }
    }

    public final void h() {
        boolean zQ;
        boolean zQ2;
        boolean zQ3;
        boolean zQ4;
        boolean zQ5;
        if (s() && this.ax) {
            eao eaoVar = this.I;
            if (eaoVar != null) {
                zQ2 = eaoVar.q(5);
                zQ3 = eaoVar.q(7);
                zQ4 = eaoVar.q(11);
                zQ5 = eaoVar.q(12);
                zQ = eaoVar.q(9);
            } else {
                zQ = false;
                zQ2 = false;
                zQ3 = false;
                zQ4 = false;
                zQ5 = false;
            }
            if (zQ4) {
                eao eaoVar2 = this.I;
                long jG = eaoVar2 != null ? eaoVar2.G() : 5000L;
                TextView textView = this.W;
                int i = (int) (jG / 1000);
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                View view = this.s;
                if (view != null) {
                    view.setContentDescription(this.S.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            if (zQ5) {
                eao eaoVar3 = this.I;
                long jH = eaoVar3 != null ? eaoVar3.H() : 15000L;
                TextView textView2 = this.V;
                int i2 = (int) (jH / 1000);
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                View view2 = this.r;
                if (view2 != null) {
                    view2.setContentDescription(this.S.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            v(zQ3, this.o);
            v(zQ4, this.s);
            v(zQ5, this.r);
            v(zQ, this.p);
            DefaultTimeBar defaultTimeBar = this.aE;
            if (defaultTimeBar != null) {
                defaultTimeBar.setEnabled(zQ2);
            }
        }
    }

    public final void i() {
        ImageView imageView;
        if (s() && this.ax && (imageView = this.q) != null) {
            boolean zAp = edt.ap(this.I, this.L);
            Drawable drawable = zAp ? this.af : this.ag;
            boolean z = true;
            int i = true != zAp ? R.string.exo_controls_pause_description : R.string.exo_controls_play_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.S.getString(i));
            eao eaoVar = this.I;
            if (eaoVar == null || !eaoVar.q(1) || (eaoVar.q(17) && eaoVar.N().q())) {
                z = false;
            }
            v(z, imageView);
        }
    }

    public final void j() {
        eao eaoVar = this.I;
        if (eaoVar == null) {
            return;
        }
        fsu fsuVar = this.j;
        float f = eaoVar.L().d;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = fsuVar.b;
            int length = fArr.length;
            if (i >= 7) {
                fsuVar.c = i2;
                this.i.a(0, fsuVar.a[i2]);
                w();
                return;
            } else {
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
                if (fAbs < f2) {
                    i2 = i;
                }
                i++;
            }
        }
    }

    public final void k() {
        long jC;
        long jB;
        long j;
        if (s() && this.ax) {
            eao eaoVar = this.I;
            if (eaoVar == null || !eaoVar.q(16)) {
                jC = 0;
                jB = 0;
            } else {
                jC = this.aD + eaoVar.C();
                jB = this.aD + eaoVar.B();
            }
            TextView textView = this.B;
            if (textView != null && !this.M) {
                textView.setText(edt.X(this.C, this.D, jC));
            }
            DefaultTimeBar defaultTimeBar = this.aE;
            if (defaultTimeBar != null) {
                if (defaultTimeBar.i != jC) {
                    defaultTimeBar.i = jC;
                    defaultTimeBar.setContentDescription(defaultTimeBar.a());
                    defaultTimeBar.e();
                }
                if (defaultTimeBar.j != jB) {
                    defaultTimeBar.j = jB;
                    defaultTimeBar.e();
                }
            }
            fsv fsvVar = this.J;
            if (fsvVar != null) {
                fsvVar.a(jC);
            }
            Runnable runnable = this.ae;
            removeCallbacks(runnable);
            int iBf = eaoVar == null ? 1 : eaoVar.bf();
            if (eaoVar == null || !eaoVar.u()) {
                if (iBf == 4 || iBf == 1) {
                    return;
                }
                postDelayed(runnable, 1000L);
                return;
            }
            if (defaultTimeBar != null) {
                int iWidth = (int) (defaultTimeBar.b.width() / defaultTimeBar.c);
                j = Long.MAX_VALUE;
                if (iWidth != 0) {
                    long j2 = defaultTimeBar.h;
                    if (j2 != 0 && j2 != -9223372036854775807L) {
                        j = j2 / iWidth;
                    }
                }
            } else {
                j = 1000;
            }
            long jMin = Math.min(j, 1000 - (jC % 1000));
            float f = eaoVar.L().d;
            postDelayed(runnable, edt.t(f > 0.0f ? (long) (jMin / f) : 1000L, this.ay, 1000L));
        }
    }

    public final void l() {
        ImageView imageView;
        if (s() && this.ax && (imageView = this.t) != null) {
            if (this.P == 0) {
                v(false, imageView);
                return;
            }
            eao eaoVar = this.I;
            if (eaoVar == null || !eaoVar.q(15)) {
                v(false, imageView);
                imageView.setImageDrawable(this.ah);
                imageView.setContentDescription(this.ak);
                return;
            }
            v(true, imageView);
            int iBh = eaoVar.bh();
            if (iBh == 0) {
                imageView.setImageDrawable(this.ah);
                imageView.setContentDescription(this.ak);
            } else if (iBh == 1) {
                imageView.setImageDrawable(this.ai);
                imageView.setContentDescription(this.al);
            } else {
                if (iBh != 2) {
                    return;
                }
                imageView.setImageDrawable(this.aj);
                imageView.setContentDescription(this.am);
            }
        }
    }

    public final void m() {
        RecyclerView recyclerView = this.U;
        recyclerView.measure(0, 0);
        int i = this.n;
        int i2 = i + i;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), getWidth() - i2);
        PopupWindow popupWindow = this.m;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - i2, recyclerView.getMeasuredHeight()));
    }

    public final void n() {
        ImageView imageView;
        if (s() && this.ax && (imageView = this.u) != null) {
            eao eaoVar = this.I;
            if (!this.a.m(imageView)) {
                v(false, imageView);
                return;
            }
            if (eaoVar == null || !eaoVar.q(14)) {
                v(false, imageView);
                imageView.setImageDrawable(this.ao);
                imageView.setContentDescription(this.as);
            } else {
                v(true, imageView);
                imageView.setImageDrawable(eaoVar.am() ? this.an : this.ao);
                imageView.setContentDescription(eaoVar.am() ? this.ar : this.as);
            }
        }
    }

    public final void o() {
        eao eaoVar = this.I;
        if (eaoVar == null) {
            return;
        }
        long jY = 0;
        this.aD = 0L;
        eay eayVarN = eaoVar.q(17) ? eaoVar.N() : eay.a;
        if (!eayVarN.q()) {
            int iBd = eaoVar.bd();
            int i = iBd;
            while (true) {
                if (i > iBd) {
                    break;
                }
                if (i == iBd) {
                    this.aD = edt.F(jY);
                }
                eax eaxVar = this.ad;
                eayVarN.p(i, eaxVar);
                if (eaxVar.A == -9223372036854775807L) {
                    a.ab(true);
                    break;
                }
                for (int i2 = eaxVar.B; i2 <= eaxVar.C; i2++) {
                    eav eavVar = this.ac;
                    eayVarN.n(i2, eavVar);
                    eavVar.i();
                    eavVar.l();
                }
                jY += eaxVar.A;
                i++;
            }
        } else if (eaoVar.q(16)) {
            long jD = eaoVar.d();
            if (jD != -9223372036854775807L) {
                jY = edt.y(jD);
            }
        }
        TextView textView = this.ab;
        long jF = edt.F(jY);
        if (textView != null) {
            textView.setText(edt.X(this.C, this.D, jF));
        }
        DefaultTimeBar defaultTimeBar = this.aE;
        if (defaultTimeBar != null) {
            if (defaultTimeBar.h != jF) {
                defaultTimeBar.h = jF;
                if (defaultTimeBar.g && jF == -9223372036854775807L) {
                    defaultTimeBar.d(true);
                }
                defaultTimeBar.e();
            }
            int length = this.aB.length;
            long[] jArr = this.az;
            if (jArr.length < 0) {
                this.az = Arrays.copyOf(jArr, 0);
                this.aA = Arrays.copyOf(this.aA, 0);
            }
            System.arraycopy(this.aB, 0, this.az, 0, 0);
            System.arraycopy(this.aC, 0, this.aA, 0, 0);
            long[] jArr2 = this.az;
            boolean[] zArr = this.aA;
            a.H(true);
            defaultTimeBar.k = 0;
            defaultTimeBar.l = jArr2;
            defaultTimeBar.m = zArr;
            defaultTimeBar.e();
        }
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ftk ftkVar = this.a;
        ftkVar.a.addOnLayoutChangeListener(ftkVar.q);
        this.ax = true;
        if (r()) {
            ftkVar.i();
        }
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ftk ftkVar = this.a;
        ftkVar.a.removeOnLayoutChangeListener(ftkVar.q);
        this.ax = false;
        removeCallbacks(this.ae);
        ftkVar.h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() throws Resources.NotFoundException {
        fsx fsxVar = this.k;
        fsxVar.e();
        fsr fsrVar = this.l;
        fsrVar.e();
        eao eaoVar = this.I;
        if (eaoVar != null && eaoVar.q(30) && this.I.q(29)) {
            ebh ebhVarP = this.I.P();
            ImmutableList immutableListT = t(ebhVarP, 1);
            fsrVar.b = immutableListT;
            PlayerControlView playerControlView = fsrVar.a;
            eao eaoVar2 = playerControlView.I;
            eaoVar2.getClass();
            ebf ebfVarO = eaoVar2.O();
            if (!immutableListT.isEmpty()) {
                if (fsrVar.b(ebfVarO)) {
                    int i = 0;
                    while (true) {
                        if (i >= immutableListT.size()) {
                            break;
                        }
                        rza rzaVar = (rza) immutableListT.get(i);
                        if (rzaVar.g()) {
                            playerControlView.i.a(1, (String) rzaVar.b);
                            break;
                        }
                        i++;
                    }
                } else {
                    playerControlView.i.a(1, playerControlView.getResources().getString(R.string.exo_track_selection_auto));
                }
            } else {
                playerControlView.i.a(1, playerControlView.getResources().getString(R.string.exo_track_selection_none));
            }
            if (this.a.m(this.v)) {
                fsxVar.b(t(ebhVarP, 3));
            } else {
                fsxVar.b(ImmutableList.of());
            }
        }
        v(fsxVar.getItemCount() > 0, this.v);
        w();
    }

    public final boolean q(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        eao eaoVar = this.I;
        if (eaoVar == null) {
            return false;
        }
        int i = 89;
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87) {
            if (keyCode != 88) {
                return false;
            }
            keyCode = 88;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (eaoVar.bf() == 4 || !eaoVar.q(12)) {
                return true;
            }
            eaoVar.h();
            return true;
        }
        if (keyCode != 89) {
            i = keyCode;
        } else if (eaoVar.q(11)) {
            eaoVar.g();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (i == 79 || i == 85) {
            edt.aA(eaoVar, this.L);
            return true;
        }
        if (i == 87) {
            if (!eaoVar.q(9)) {
                return true;
            }
            eaoVar.k();
            return true;
        }
        if (i == 88) {
            if (!eaoVar.q(7)) {
                return true;
            }
            eaoVar.m();
            return true;
        }
        if (i == 126) {
            edt.aF(eaoVar);
            return true;
        }
        if (i != 127) {
            return true;
        }
        edt.aE(eaoVar);
        return true;
    }

    public final boolean r() {
        ftk ftkVar = this.a;
        return ftkVar.s == 0 && ftkVar.a.s();
    }

    public final boolean s() {
        return getVisibility() == 0;
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0612  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.View, android.view.ViewGroup, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayerControlView(android.content.Context r43, android.util.AttributeSet r44, int r45, android.util.AttributeSet r46) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }
}
