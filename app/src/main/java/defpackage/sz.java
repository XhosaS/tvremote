package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sz extends pz implements qf {
    private List A;
    private List B;
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final st l;
    int m;
    public int o;
    public RecyclerView p;
    VelocityTracker r;
    public GestureDetector t;
    public su u;
    public Rect w;
    public long x;
    final List a = new ArrayList();
    private final float[] y = new float[2];
    qv b = null;
    int k = -1;
    private int z = 0;
    public final List n = new ArrayList();
    final Runnable q = new so(this);
    public View s = null;
    public final qh v = new sp(this);

    public sz(st stVar) {
        this.l = stVar;
    }

    private final void o(float[] fArr) {
        if ((this.m & 12) != 0) {
            fArr[0] = (this.i + this.g) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.m & 3) != 0) {
            fArr[1] = (this.j + this.h) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int q(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.g > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null && this.k >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.r.getXVelocity(this.k);
            float yVelocity = this.r.getYVelocity(this.k);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.e && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.p.getWidth();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.g) > width * 0.5f) {
            return i2;
        }
        return 0;
    }

    private final int r(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null && this.k >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.r.getXVelocity(this.k);
            float yVelocity = this.r.getYVelocity(this.k);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.e && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.p.getHeight();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.h) > height * 0.5f) {
            return i2;
        }
        return 0;
    }

    @Override // defpackage.qf
    public final void a(View view) {
        l(view);
        qv qvVarL = this.p.l(view);
        if (qvVarL == null) {
            return;
        }
        qv qvVar = this.b;
        if (qvVar != null && qvVarL == qvVar) {
            m(null, 0);
            return;
        }
        e(qvVarL, false);
        if (this.a.remove(qvVarL.a)) {
            this.l.c(qvVarL);
        }
    }

    final View c(MotionEvent motionEvent) {
        sw swVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        qv qvVar = this.b;
        if (qvVar != null) {
            float f = this.i + this.g;
            float f2 = this.j + this.h;
            View view2 = qvVar.a;
            if (p(view2, x, y, f, f2)) {
                return view2;
            }
        }
        List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return this.p.o(x, y);
            }
            swVar = (sw) list.get(size);
            view = swVar.h.a;
        } while (!p(view, x, y, swVar.l, swVar.m));
        return view;
    }

    final void d(int i, MotionEvent motionEvent, int i2) {
        View viewC;
        if (this.b != null || i != 2 || this.z == 2 || this.p.getScrollState() == 1) {
            return;
        }
        qd layoutManager = this.p.getLayoutManager();
        int i3 = this.k;
        qv qvVarL = null;
        if (i3 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(iFindPointerIndex) - this.c;
            float y = motionEvent.getY(iFindPointerIndex) - this.d;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.o;
            if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.ad()) && ((fAbs2 <= fAbs || !layoutManager.ae()) && (viewC = c(motionEvent)) != null))) {
                qvVarL = this.p.l(viewC);
            }
        }
        if (qvVarL != null) {
            int iG = this.l.g(this.p) >> 8;
            if ((iG & 255) != 0) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.c;
                float f3 = y2 - this.d;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.o;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iG & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iG & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iG & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iG & 2) == 0) {
                            return;
                        }
                    }
                    this.h = 0.0f;
                    this.g = 0.0f;
                    this.k = motionEvent.getPointerId(0);
                    m(qvVarL, 1);
                }
            }
        }
    }

    final void e(qv qvVar, boolean z) {
        sw swVar;
        List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                swVar = (sw) list.get(size);
            }
        } while (swVar.h != qvVar);
        swVar.n |= z;
        if (!swVar.o) {
            swVar.j.cancel();
        }
        list.remove(size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void f(qv qvVar) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.p.isLayoutRequested()) {
            return;
        }
        int i6 = 2;
        if (this.z == 2) {
            float f = this.i + this.g;
            float f2 = this.j + this.h;
            View view = qvVar.a;
            int i7 = (int) f2;
            int i8 = (int) f;
            if (Math.abs(i7 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i8 - view.getLeft()) >= view.getWidth() * 0.5f) {
                List list = this.A;
                if (list == null) {
                    this.A = new ArrayList();
                    this.B = new ArrayList();
                } else {
                    list.clear();
                    this.B.clear();
                }
                int iRound = Math.round(this.i + this.g);
                int iRound2 = Math.round(this.j + this.h);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i9 = (iRound + width) / 2;
                int i10 = (iRound2 + height) / 2;
                qd layoutManager = this.p.getLayoutManager();
                int iAt = layoutManager.at();
                int i11 = 0;
                while (i11 < iAt) {
                    View viewAI = layoutManager.aI(i11);
                    if (viewAI == view) {
                        i2 = i8;
                        i = i6;
                    } else {
                        i = i6;
                        if (viewAI.getBottom() < iRound2 || viewAI.getTop() > height || viewAI.getRight() < iRound || viewAI.getLeft() > width) {
                            i2 = i8;
                        } else {
                            qv qvVarL = this.p.l(viewAI);
                            int iAbs5 = Math.abs(i9 - ((viewAI.getLeft() + viewAI.getRight()) / 2));
                            int i12 = iAbs5 * iAbs5;
                            int iAbs6 = Math.abs(i10 - ((viewAI.getTop() + viewAI.getBottom()) / 2));
                            int i13 = iAbs6 * iAbs6;
                            i2 = i8;
                            int size = this.A.size();
                            i3 = i7;
                            i4 = iRound;
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i5 = i12 + i13;
                                if (i14 >= size) {
                                    break;
                                }
                                int i16 = size;
                                if (i5 <= ((Integer) this.B.get(i14)).intValue()) {
                                    break;
                                }
                                i15++;
                                i14++;
                                size = i16;
                            }
                            this.A.add(i15, qvVarL);
                            this.B.add(i15, Integer.valueOf(i5));
                            i11++;
                            i6 = i;
                            i8 = i2;
                            i7 = i3;
                            iRound = i4;
                        }
                    }
                    i3 = i7;
                    i4 = iRound;
                    i11++;
                    i6 = i;
                    i8 = i2;
                    i7 = i3;
                    iRound = i4;
                }
                int i17 = i8;
                int i18 = i6;
                int i19 = i7;
                List list2 = this.A;
                if (list2.size() != 0) {
                    int width2 = i17 + view.getWidth();
                    int height2 = i19 + view.getHeight();
                    int left = i17 - view.getLeft();
                    int top = i19 - view.getTop();
                    int size2 = list2.size();
                    qv qvVar2 = null;
                    int i20 = -1;
                    for (int i21 = 0; i21 < size2; i21++) {
                        qv qvVar3 = (qv) list2.get(i21);
                        if (left > 0) {
                            View view2 = qvVar3.a;
                            int right = view2.getRight() - width2;
                            if (right < 0 && view2.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i20) {
                                qvVar2 = qvVar3;
                                i20 = iAbs4;
                            }
                        }
                        if (left < 0) {
                            View view3 = qvVar3.a;
                            int left2 = view3.getLeft() - i17;
                            if (left2 > 0 && view3.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left2)) > i20) {
                                qvVar2 = qvVar3;
                                i20 = iAbs3;
                            }
                        }
                        if (top < 0) {
                            View view4 = qvVar3.a;
                            int top2 = view4.getTop() - i19;
                            if (top2 > 0 && view4.getTop() < view.getTop() && (iAbs2 = Math.abs(top2)) > i20) {
                                qvVar2 = qvVar3;
                                i20 = iAbs2;
                            }
                        }
                        if (top > 0) {
                            View view5 = qvVar3.a;
                            int bottom = view5.getBottom() - height2;
                            if (bottom < 0 && view5.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i20) {
                                qvVar2 = qvVar3;
                                i20 = iAbs;
                            }
                        }
                    }
                    if (qvVar2 == null) {
                        this.A.clear();
                        this.B.clear();
                        return;
                    }
                    int iCs = qvVar2.cs();
                    qvVar.cs();
                    st stVar = this.l;
                    Object adapter = this.p.getAdapter();
                    if (adapter instanceof eja) {
                        int iCs2 = qvVar.cs();
                        int iCs3 = qvVar2.cs();
                        mqx mqxVar = (mqx) stVar;
                        if (mqxVar.b == -1) {
                            mqxVar.b = iCs2;
                        }
                        ((eja) adapter).m(iCs2, iCs3);
                        Iterator it = mqxVar.a.iterator();
                        while (it.hasNext()) {
                            ecr ecrVar = (ecr) ((mmu) it.next()).a.get();
                            int i22 = mmr.y;
                            if (ecrVar.p() != null) {
                                Integer numValueOf = Integer.valueOf(iCs2);
                                Integer numValueOf2 = Integer.valueOf(iCs3);
                                Object[] objArr = new Object[i18];
                                objArr[0] = numValueOf;
                                objArr[1] = numValueOf2;
                                ecrVar.l(new dxw(1, objArr), "updateState:DataDrivenCollectionSection.onItemDraggedStateUpdate");
                            }
                        }
                        RecyclerView recyclerView = this.p;
                        qd layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof sy) {
                            ((sy) layoutManager2).ap(view, qvVar2.a);
                            return;
                        }
                        if (layoutManager2.ad()) {
                            View view6 = qvVar2.a;
                            if (layoutManager2.aw(view6) <= recyclerView.getPaddingLeft()) {
                                recyclerView.ae(iCs);
                            }
                            if (layoutManager2.az(view6) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.ae(iCs);
                            }
                        }
                        if (layoutManager2.ae()) {
                            View view7 = qvVar2.a;
                            if (layoutManager2.aA(view7) <= recyclerView.getPaddingTop()) {
                                recyclerView.ae(iCs);
                            }
                            if (layoutManager2.av(view7) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.ae(iCs);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.pz
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            o(this.y);
        }
        qv qvVar = this.b;
        List list = this.n;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            sw swVar = (sw) list.get(i);
            int iSave = canvas.save();
            qv qvVar2 = swVar.h;
            float f = swVar.l;
            float f2 = swVar.m;
            int i2 = swVar.i;
            canvas.restoreToCount(iSave);
        }
        if (qvVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            sw swVar2 = (sw) list.get(size);
            if (!swVar2.o) {
                z = true;
            } else if (!swVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void h() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.r = VelocityTracker.obtain();
    }

    @Override // defpackage.pz
    public final void i(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // defpackage.pz
    public final void j(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        int i = 0;
        if (this.b != null) {
            float[] fArr = this.y;
            o(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        st stVar = this.l;
        qv qvVar = this.b;
        List list = this.n;
        int size = list.size();
        while (i < size) {
            sw swVar = (sw) list.get(i);
            float f4 = swVar.d;
            float f5 = swVar.f;
            if (f4 == f5) {
                swVar.l = swVar.h.a.getTranslationX();
            } else {
                swVar.l = f4 + (swVar.p * (f5 - f4));
            }
            float f6 = swVar.e;
            float f7 = swVar.g;
            if (f6 == f7) {
                swVar.m = swVar.h.a.getTranslationY();
            } else {
                swVar.m = f6 + (swVar.p * (f7 - f6));
            }
            int iSave = canvas.save();
            qv qvVar2 = swVar.h;
            float f8 = swVar.l;
            float f9 = swVar.m;
            int i2 = swVar.i;
            st stVar2 = stVar;
            stVar2.f(recyclerView, qvVar2, f8, f9, false);
            canvas.restoreToCount(iSave);
            i++;
            stVar = stVar2;
        }
        st stVar3 = stVar;
        if (qvVar != null) {
            int iSave2 = canvas.save();
            stVar3.f(recyclerView, qvVar, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    final void l(View view) {
        if (view == this.s) {
            this.s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.qv r19, int r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz.m(qv, int):void");
    }

    final void n(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.c;
        this.g = fMax;
        this.h = y - this.d;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.g = fMax;
        }
        if ((i & 8) == 0) {
            this.g = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.h = Math.max(0.0f, this.h);
        }
        if ((i & 2) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
    }

    @Override // defpackage.qf
    public final void b() {
    }
}
