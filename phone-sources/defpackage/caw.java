package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class caw implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ caw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        Object obj;
        Object obj2;
        int i = 3;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                Class cls = cbc.a;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    this.a.a();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 1:
                cbc cbcVar = (cbc) this.a;
                cbcVar.J = false;
                MotionEvent motionEvent = cbcVar.H;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                cbcVar.D(motionEvent);
                return;
            case 2:
                cbc cbcVar2 = (cbc) this.a;
                cbcVar2.removeCallbacks(this);
                MotionEvent motionEvent2 = cbcVar2.H;
                if (motionEvent2 != null) {
                    int toolType = motionEvent2.getToolType(0);
                    int actionMasked = motionEvent2.getActionMasked();
                    if (toolType == 3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    cbcVar2.I(motionEvent2, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, cbcVar2.I, false);
                    return;
                }
                return;
            case 3:
                this.a.a();
                return;
            case 4:
                ckm ckmVar = (ckm) this.a;
                ckmVar.c = null;
                View view = ckmVar.a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    ckmVar.b.h();
                    return;
                }
                ylf ylfVar = new ylf();
                ylf ylfVar2 = new ylf();
                bfz bfzVar = ckmVar.b;
                Object[] objArr = bfzVar.a;
                int i2 = bfzVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ckl cklVar = (ckl) objArr[i3];
                    int iOrdinal = cklVar.ordinal();
                    if (iOrdinal == 0) {
                        ylfVar.a = true;
                        ylfVar2.a = true;
                    } else if (iOrdinal == 1) {
                        ylfVar.a = false;
                        ylfVar2.a = false;
                    } else {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            throw new yfu();
                        }
                        if (!yks.e(ylfVar.a, false)) {
                            ylfVar2.a = Boolean.valueOf(cklVar == ckl.c);
                        }
                    }
                }
                bfzVar.h();
                if (yks.e(ylfVar.a, true)) {
                    ckmVar.a();
                }
                Boolean bool = (Boolean) ylfVar2.a;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ((cwk) ckmVar.d.c.a).b();
                    } else {
                        ckmVar.d.c.c();
                    }
                }
                if (yks.e(ylfVar.a, false)) {
                    ckmVar.a();
                    return;
                }
                return;
            case 5:
                this.a.a();
                return;
            case 6:
                this.a.a();
                return;
            case 7:
                this.a.a();
                return;
            case 8:
                Object obj3 = this.a;
                Activity activity = (Activity) obj3;
                if (activity.isFinishing()) {
                    return;
                }
                Field field = cre.b;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                    return;
                }
                if ((!cre.a() || cre.f != null) && (cre.e != null || cre.d != null)) {
                    try {
                        Object obj4 = cre.c.get(obj3);
                        if (obj4 != null && (obj = cre.b.get(obj3)) != null) {
                            Application application = ((Activity) obj3).getApplication();
                            crd crdVar = new crd((Activity) obj3);
                            application.registerActivityLifecycleCallbacks(crdVar);
                            cre.g.post(new be(crdVar, obj4, 10, (char[]) null));
                            try {
                                if (cre.a()) {
                                    cre.f.invoke(obj, obj4, null, null, 0, false, null, null, false, false);
                                } else {
                                    ((Activity) obj3).recreate();
                                }
                                return;
                            } finally {
                                cre.g.post(new be(application, crdVar, 11, (char[]) null));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 9:
                View view2 = (View) this.a;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
            case 10:
                View view3 = ((czq) this.a).a;
                ViewParent parent = view3.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view3);
                    return;
                }
                return;
            case 11:
                czs czsVar = (czs) this.a;
                if (czsVar.e) {
                    if (czsVar.c) {
                        czsVar.c = false;
                        czr czrVar = czsVar.a;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        czrVar.e = jCurrentAnimationTimeMillis;
                        czrVar.g = -1L;
                        czrVar.f = jCurrentAnimationTimeMillis;
                        czrVar.h = 0.5f;
                    }
                    czr czrVar2 = czsVar.a;
                    if ((czrVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > czrVar2.g + czrVar2.i) || !czsVar.c()) {
                        czsVar.e = false;
                        return;
                    }
                    if (czsVar.d) {
                        czsVar.d = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        czsVar.b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (czrVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = czrVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - czrVar2.f;
                    czrVar2.f = jCurrentAnimationTimeMillis2;
                    czsVar.d((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * czrVar2.d));
                    View view4 = czsVar.b;
                    int[] iArr = cww.a;
                    view4.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                ((das) this.a).f(0);
                return;
            case 13:
                Object obj5 = ((dgr) this.a).h.a;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                int i4 = 0;
                while (true) {
                    dgr dgrVar = (dgr) obj5;
                    ArrayList arrayList = dgrVar.b;
                    if (i4 >= arrayList.size()) {
                        if (dgrVar.d) {
                            int size = arrayList.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                        fbc fbcVar = dgrVar.g;
                                        ValueAnimator.unregisterDurationScaleChangeListener(fbcVar.a);
                                        fbcVar.a = null;
                                    }
                                    dgrVar.d = false;
                                } else if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            dgrVar.f.a(dgrVar.c);
                            return;
                        }
                        return;
                    }
                    dhb dhbVar = (dhb) arrayList.get(i4);
                    if (dhbVar != null) {
                        ko koVar = dgrVar.a;
                        Long l = (Long) koVar.get(dhbVar);
                        if (l == null) {
                            dhbVar.b(jUptimeMillis2);
                        } else if (l.longValue() < jUptimeMillis3) {
                            koVar.remove(dhbVar);
                            dhbVar.b(jUptimeMillis2);
                        }
                    }
                    i4++;
                }
                break;
            case 14:
                Object obj6 = this.a;
                synchronized (((dvs) obj6).b) {
                    obj2 = ((dvs) obj6).e;
                    ((dvs) obj6).e = dvs.a;
                }
                ((dvs) this.a).k(obj2);
                return;
            case 15:
                dwa dwaVar = (dwa) this.a;
                if (dwaVar.c == 0) {
                    dwaVar.d = true;
                    dwaVar.f.e(dvc.ON_PAUSE);
                }
                dwaVar.c();
                return;
            case 16:
                hnj hnjVar = (hnj) this.a;
                edf edfVar = (edf) ((WeakReference) hnjVar.b).get();
                if (edfVar != null) {
                    edfVar.a(((nxo) hnjVar.c).b());
                    return;
                }
                return;
            case 17:
                eiz eizVar = (eiz) this.a;
                Context context = eizVar.c;
                String str = edt.a;
                Integer numValueOf = Integer.valueOf(dvb.i(context).generateAudioSessionId());
                eck eckVar = eizVar.k;
                eckVar.d = numValueOf;
                eckVar.b.d(new be(eckVar, numValueOf, 20, bArr));
                return;
            case 18:
                try {
                    eje.h((eka) this.a);
                    return;
                } catch (eii e) {
                    edb.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 19:
                ele eleVar = (ele) this.a;
                eleVar.N(eleVar.G(), 1028, new eit(i));
                eleVar.f.f();
                return;
            default:
                emm emmVar = (emm) this.a;
                if (emmVar.o >= 300000) {
                    emmVar.e.j();
                    emmVar.o = 0L;
                    return;
                }
                return;
        }
    }

    public caw(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
