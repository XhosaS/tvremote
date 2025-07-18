package defpackage;

import android.animation.ValueAnimator;
import android.view.KeyEvent;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuj {
    private static final uuh q;
    public ValueAnimator e;
    public int f;
    public awj g;
    public int h;
    public boolean i;
    public boolean j;
    private int s;
    private awr u;
    public final List a = new ArrayList(4);
    private final int[] r = new int[2];
    public final qi b = new uuc(this);
    public final awg c = new uud(this);
    public final aze d = new uue(this);
    private final boolean t = true;
    public float k = 1.0f;
    public float l = 1.0f;
    public float m = 1.0f;
    private int[] v = new int[16];
    private int[] w = new int[16];
    public boolean n = true;
    public boolean o = false;
    public int p = 0;

    static {
        uug uugVarO = uuh.o();
        uugVarO.i(1.0f);
        uugVarO.g(1.0f);
        uugVarO.h(0.0f);
        uugVarO.f();
        uugVarO.e();
        uugVarO.b();
        q = uugVarO.j();
    }

    private final int c(View view) {
        GridLayoutManager gridLayoutManager = this.g.ad;
        int i = gridLayoutManager.e;
        int[] iArr = this.r;
        if (i == 0) {
            iArr[0] = gridLayoutManager.k(view);
            iArr[1] = gridLayoutManager.r(view);
        } else {
            iArr[1] = gridLayoutManager.k(view);
            iArr[0] = gridLayoutManager.r(view);
        }
        return iArr[this.i ? 1 : 0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final uuh d(int i) {
        awr awrVar;
        awq awqVarE;
        awj awjVar = this.g;
        qv qvVarL = awjVar.l(awjVar.getChildAt(i));
        Object objDy = qvVarL instanceof awq ? ((awq) qvVarL).dy(uuh.class) : null;
        if (objDy == null && (awrVar = this.u) != null && (awqVarE = awrVar.e(qvVarL.f)) != null) {
            objDy = awqVarE.dy(uuh.class);
        }
        uuh uuhVar = (uuh) objDy;
        return uuhVar == null ? q : uuhVar;
    }

    private static int[] e(int[] iArr, int i) {
        return i > iArr.length ? new int[i] : iArr;
    }

    private final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uui) it.next()).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g(View view, int i, float f, float f2, float f3, float f4) {
        view.setAlpha(1.0f);
        int i2 = this.f;
        if (i2 != 0 && view.findViewById(i2) != null) {
            View viewFindViewById = view.findViewById(this.f);
            viewFindViewById.setAlpha(f2);
            viewFindViewById.setScaleX(f3);
            viewFindViewById.setScaleY(f3);
            viewFindViewById.setTranslationY(-f4);
        }
        Integer num = (Integer) view.getTag(R.id.grid_view_animation_custom_child_view_translation);
        if (this.i) {
            int i3 = -i;
            view.setTranslationY((num != null ? num.intValue() : 0) + i3);
            view.setTag(R.id.grid_view_animation_child_view_translation, Integer.valueOf(i3));
        } else {
            if (!this.j) {
                i = -i;
            }
            view.setTranslationX((num != null ? num.intValue() : 0) + i);
            view.setTag(R.id.grid_view_animation_child_view_translation, Integer.valueOf(i));
        }
        qv qvVarL = this.g.l(view);
        if (this.t) {
            uuf uufVar = null;
            if (qvVarL instanceof ayo) {
                ayo ayoVar = (ayo) qvVarL;
                azk azkVar = ayoVar.t;
                if (azkVar instanceof uuf) {
                    uufVar = (uuf) azkVar;
                } else {
                    azm azmVar = ayoVar.s;
                    if (azmVar instanceof azx) {
                        Object objY = ((azx) azmVar).y(azkVar);
                        if (objY instanceof uuf) {
                            uufVar = (uuf) objY;
                        }
                    }
                }
            } else if (qvVarL instanceof uuf) {
                uufVar = (uuf) qvVarL;
            } else {
                KeyEvent.Callback callback = qvVarL.a;
                if (callback instanceof uuf) {
                    uufVar = (uuf) callback;
                } else if (qvVarL instanceof awq) {
                    uufVar = (uuf) ((awq) qvVarL).dy(uuf.class);
                }
            }
            if (uufVar != null) {
                uufVar.d(f);
            }
        }
        boolean z = this.n;
        if (!(qvVarL instanceof ayo)) {
            View view2 = qvVarL.a;
            return;
        }
        ayo ayoVar2 = (ayo) qvVarL;
        azk azkVar2 = ayoVar2.t;
        if (azkVar2 instanceof hox) {
            ((hox) azkVar2).e(z);
            return;
        }
        azm azmVar2 = ayoVar2.s;
        if (azmVar2 instanceof azx) {
            azw azwVarY = ((azx) azmVar2).y(azkVar2);
            if (azwVarY instanceof hox) {
                ((hox) azwVarY).e(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuj.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuj.b():void");
    }
}
