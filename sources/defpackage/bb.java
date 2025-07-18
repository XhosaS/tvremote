package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bb implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bb(ahe aheVar, aeq aeqVar, int i) {
        this.c = i;
        this.b = aeqVar;
        this.a = aheVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, oy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [amc, amf, amg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [ahh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v90, types: [alx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        View view = null;
        int i = 0;
        switch (this.c) {
            case 0:
                bf bfVar = (bf) this.a;
                List list = bfVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    be beVar = (be) obj;
                    int i2 = beVar.h;
                    View view2 = beVar.a.L;
                    view2.getClass();
                    ii.Q(i2, view2, bfVar.a);
                    return;
                }
                return;
            case 1:
                ((bf) this.a).d((be) this.b);
                return;
            case 2:
                bf bfVar2 = (bf) this.a;
                List list2 = bfVar2.b;
                Object obj2 = this.b;
                list2.remove(obj2);
                bfVar2.c.remove(obj2);
                return;
            case 3:
                ?? r0 = this.a;
                Object obj3 = this.b;
                try {
                    r0.run();
                    return;
                } finally {
                    ((bt) obj3).a();
                }
            case 4:
                ?? r02 = this.a;
                int size = r02.size();
                while (i < size) {
                    ha haVar = (ha) r02.get(i);
                    Object obj4 = this.b;
                    ja jaVar = haVar.a;
                    int i3 = haVar.b;
                    int i4 = haVar.c;
                    int i5 = haVar.d;
                    int i6 = haVar.e;
                    View view3 = jaVar.b;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                    ik ikVar = (ik) obj4;
                    ikVar.j.add(jaVar);
                    viewPropertyAnimatorAnimate.setDuration(250L).setListener(new gw(ikVar, jaVar, i7, view3, i8, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((ArrayList) r02).clear();
                ((ik) this.b).g.remove((Object) r02);
                return;
            case 5:
                ?? r03 = this.a;
                int size2 = r03.size();
                while (i < size2) {
                    gz gzVar = (gz) r03.get(i);
                    Object obj5 = this.b;
                    ja jaVar2 = gzVar.a;
                    View view4 = jaVar2 == null ? view : jaVar2.b;
                    ja jaVar3 = gzVar.b;
                    View view5 = jaVar3 != null ? jaVar3.b : view;
                    if (view4 != null) {
                        ViewPropertyAnimator duration = view4.animate().setDuration(250L);
                        ik ikVar2 = (ik) obj5;
                        ikVar2.l.add(gzVar.a);
                        duration.translationX(gzVar.e - gzVar.c);
                        duration.translationY(gzVar.f - gzVar.d);
                        duration.alpha(0.0f).setListener(new gx(ikVar2, gzVar, duration, view4)).start();
                    }
                    if (view5 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view5.animate();
                        ik ikVar3 = (ik) obj5;
                        ikVar3.l.add(gzVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new gy(ikVar3, gzVar, viewPropertyAnimatorAnimate2, view5)).start();
                    }
                    i++;
                    view = null;
                }
                ((ArrayList) r03).clear();
                ((ik) this.b).h.remove((Object) r03);
                return;
            case 6:
                ?? r04 = this.a;
                int size3 = r04.size();
                while (i < size3) {
                    ja jaVar4 = (ja) r04.get(i);
                    Object obj6 = this.b;
                    View view6 = jaVar4.b;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view6.animate();
                    ik ikVar4 = (ik) obj6;
                    ikVar4.i.add(jaVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(120L).setListener(new gv(ikVar4, jaVar4, view6, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((ArrayList) r04).clear();
                ((ik) this.b).f.remove((Object) r04);
                return;
            case 7:
                ((kk) this.b).p((cih) this.a);
                return;
            case 8:
                ((mx) this.b).a = this.a;
                return;
            case 9:
                ((Application) this.b).unregisterActivityLifecycleCallbacks(this.a);
                return;
            case 10:
                try {
                    Method method = my.d;
                    if (method != null) {
                        method.invoke(this.b, this.a, false, "AppCompat recreation");
                        return;
                    } else {
                        my.e.invoke(this.b, this.a, false);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 11:
                ((no) this.a).a((Typeface) this.b);
                return;
            case 12:
                ((no) ((asv) this.a).a).a((Typeface) this.b);
                return;
            case 13:
                this.b.a(this.a);
                return;
            case 14:
                Object obj7 = this.b;
                Object obj8 = this.a;
                int i9 = up.a;
                Throwable th2 = (Throwable) obj7;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj8)), th2);
                throw th2;
            case 15:
                yq yqVar = (yq) this.b;
                if (yqVar.f()) {
                    yqVar.c();
                } else {
                    yqVar.b(this.a);
                }
                yqVar.f = 3;
                return;
            case 16:
                ahe aheVar = (ahe) this.a;
                ahc ahcVar = (ahc) aheVar.e.j.get(aheVar.b);
                if (ahcVar == null) {
                    return;
                }
                if (!((aeq) this.b).c()) {
                    ahcVar.i((aeq) this.b);
                    return;
                }
                aheVar.d = true;
                afx afxVar = aheVar.a;
                if (afxVar.l()) {
                    aheVar.c();
                    return;
                }
                try {
                    afxVar.p(null, afxVar.g());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    ((ahe) this.a).a.i("Failed to get service from broker.");
                    ahcVar.i(new aeq(10));
                    return;
                }
            case 17:
                Object obj9 = ((ahi) this.a).a;
                ?? r2 = this.b;
                if (obj9 == null) {
                    return;
                }
                r2.a(obj9);
                return;
            case 18:
                alv alvVar = (alv) this.a;
                aeq aeqVar = alvVar.b;
                boolean zC = aeqVar.c();
                Object obj10 = this.b;
                if (zC) {
                    ajb ajbVar = alvVar.c;
                    qp.p(ajbVar);
                    aeq aeqVar2 = ajbVar.c;
                    if (!aeqVar2.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(aeqVar2))), new Exception());
                        ahp ahpVar = (ahp) obj10;
                        ahpVar.f.b(aeqVar2);
                        ahpVar.e.u();
                        return;
                    }
                    ahp ahpVar2 = (ahp) obj10;
                    ahe aheVar2 = ahpVar2.f;
                    aip aipVarA = ajbVar.a();
                    Set set = ahpVar2.c;
                    if (aipVarA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        aheVar2.b(new aeq(4));
                    } else {
                        aheVar2.f = aipVarA;
                        aheVar2.c = set;
                        aheVar2.c();
                    }
                } else {
                    ((ahp) obj10).f.b(aeqVar);
                }
                ((ahp) obj10).e.u();
                return;
            case 19:
                Object obj11 = this.a;
                if (((amn) obj11).c) {
                    ((amn) ((amb) this.b).a).m();
                    return;
                }
                try {
                    ((amn) ((amb) this.b).a).l(((amb) this.b).b.a((ami) obj11));
                    return;
                } catch (amh e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((amn) ((amb) this.b).a).k((Exception) e3.getCause());
                        return;
                    } else {
                        ((amn) ((amb) this.b).a).k(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((amn) ((amb) this.b).a).k(e4);
                    return;
                }
            default:
                try {
                    ami amiVar = (ami) ((aly) this.b).a.a((ami) this.a);
                    if (amiVar == 0) {
                        ((aly) this.b).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ?? r22 = this.b;
                    Executor executor = amm.b;
                    amiVar.i(executor, r22);
                    amiVar.h(executor, r22);
                    amiVar.e(executor, r22);
                    return;
                } catch (amh e5) {
                    if (e5.getCause() instanceof Exception) {
                        ((aly) this.b).b.k((Exception) e5.getCause());
                        return;
                    } else {
                        ((aly) this.b).b.k(e5);
                        return;
                    }
                } catch (Exception e6) {
                    ((aly) this.b).b.k(e6);
                    return;
                }
        }
    }

    public bb(asv asvVar, Typeface typeface, int i) {
        this.c = i;
        this.a = asvVar;
        this.b = typeface;
    }

    public /* synthetic */ bb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public bb(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public bb(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
