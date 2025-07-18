package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhb {
    public static final dha a = new dgu();
    public static final dha b = new dgv();
    public static final dha c = new dgw();
    public static final dha d = new dgx();
    public static final dha e = new dgy();
    public static final dha f = new dgs();
    public float g;
    float h;
    boolean i;
    final Object j;
    final dhc k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public final ArrayList p;
    public final ArrayList q;
    public dhe r;
    private long s;
    private float t;
    private boolean u;

    public dhb(dhd dhdVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.s = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = null;
        this.k = new dgt(dhdVar);
        this.o = 1.0f;
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    private static void f(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    final void a(float f2) {
        this.k.b(this.j, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.q;
            if (i >= arrayList.size()) {
                f(arrayList);
                return;
            }
            if (arrayList.get(i) != null) {
                gjq gjqVar = (gjq) arrayList.get(i);
                long jMax = Math.max(-1L, Math.min(gjqVar.h() + 1, Math.round(this.h)));
                gjqVar.f.x(jMax, gjqVar.a);
                gjqVar.a = jMax;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r26) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhb.b(long):void");
    }

    public final void c(float f2) {
        this.h = f2;
        this.i = true;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    public final void d(float f2) {
        if (this.l) {
            this.t = f2;
            return;
        }
        if (this.r == null) {
            this.r = new dhe(f2);
        }
        this.r.d(f2);
        dhe dheVar = this.r;
        if (dheVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = dheVar.a();
        if (dA > this.m) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.o * 0.75f);
        dheVar.c = dAbs;
        dheVar.d = dAbs * 62.5d;
        if (!dgr.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            return;
        }
        this.l = true;
        if (!this.i) {
            this.h = this.k.a(this.j);
        }
        float f3 = this.h;
        if (f3 > this.m || f3 < this.n) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        dgr dgrVarA = dgr.a();
        ArrayList arrayList = dgrVarA.b;
        if (arrayList.size() == 0) {
            dgrVarA.f.a(dgrVarA.c);
            if (Build.VERSION.SDK_INT >= 33) {
                dgrVarA.e = ValueAnimator.getDurationScale();
                if (dgrVarA.g == null) {
                    dgrVarA.g = new fbc(dgrVarA);
                }
                final fbc fbcVar = dgrVarA.g;
                if (fbcVar.a == null) {
                    fbcVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: dgp
                        public final void onChanged(float f4) {
                            ((dgr) fbcVar.b).e = f4;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(fbcVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void e() {
        if (this.r.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!dgr.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            this.u = true;
        }
    }

    public dhb(Object obj, dhc dhcVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.s = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = obj;
        this.k = dhcVar;
        float f2 = 0.1f;
        if (dhcVar != c && dhcVar != d && dhcVar != e) {
            if (dhcVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (dhcVar != a && dhcVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }
}
