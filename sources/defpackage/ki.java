package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ki implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ki(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        switch (this.b) {
            case 0:
                kj kjVar = (kj) this.a;
                Runnable runnable = kjVar.a;
                if (runnable != null) {
                    runnable.run();
                    kjVar.a = null;
                    return;
                }
                return;
            case 1:
                kk.k((kk) this.a);
                return;
            case 2:
                kl.e((kl) this.a);
                return;
            case 3:
                Object obj3 = this.a;
                Activity activity = (Activity) obj3;
                if (activity.isFinishing()) {
                    return;
                }
                Field field = my.b;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                    return;
                }
                if ((!my.a() || my.f != null) && (my.e != null || my.d != null)) {
                    try {
                        Object obj4 = my.c.get(obj3);
                        if (obj4 != null && (obj = my.b.get(obj3)) != null) {
                            Application application = ((Activity) obj3).getApplication();
                            mx mxVar = new mx((Activity) obj3);
                            application.registerActivityLifecycleCallbacks(mxVar);
                            my.g.post(new bb(mxVar, obj4, 8, (char[]) null));
                            try {
                                if (my.a()) {
                                    my.f.invoke(obj, obj4, null, null, 0, false, null, null, false, false);
                                } else {
                                    ((Activity) obj3).recreate();
                                }
                                return;
                            } finally {
                                my.g.post(new bb(application, mxVar, 9, (char[]) null));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 4:
                View view = ((tg) this.a).a;
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                    return;
                }
                return;
            case 5:
                ti tiVar = (ti) this.a;
                if (tiVar.e) {
                    if (tiVar.c) {
                        tiVar.c = false;
                        th thVar = tiVar.a;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        thVar.e = jCurrentAnimationTimeMillis;
                        thVar.g = -1L;
                        thVar.f = jCurrentAnimationTimeMillis;
                        thVar.h = 0.5f;
                    }
                    th thVar2 = tiVar.a;
                    if ((thVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > thVar2.g + thVar2.i) || !tiVar.b()) {
                        tiVar.e = false;
                        return;
                    }
                    if (tiVar.d) {
                        tiVar.d = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        tiVar.b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (thVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = thVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - thVar2.f;
                    thVar2.f = jCurrentAnimationTimeMillis2;
                    tiVar.f.scrollListBy((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * thVar2.d));
                    View view2 = tiVar.b;
                    int[] iArr = qv.a;
                    view2.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ((tv) this.a).f(0);
                return;
            case 7:
                ((in) this.a).aX();
                return;
            case 8:
                SearchBar searchBar = (SearchBar) this.a;
                String string = searchBar.a.getText().toString();
                if (TextUtils.equals(searchBar.c, string)) {
                    return;
                }
                searchBar.c = string;
                return;
            case 9:
                SearchBar searchBar2 = ((wg) this.a).a;
                searchBar2.e = true;
                searchBar2.b.requestFocus();
                return;
            case 10:
                SearchBar searchBar3 = (SearchBar) this.a;
                searchBar3.a.requestFocusFromTouch();
                searchBar3.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar3.a.getWidth(), searchBar3.a.getHeight(), 0));
                searchBar3.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar3.a.getWidth(), searchBar3.a.getHeight(), 0));
                return;
            case 11:
                Object obj5 = this.a;
                DatePicker datePicker = (DatePicker) obj5;
                int[] iArr2 = {datePicker.c, datePicker.b, datePicker.d};
                boolean z = true;
                boolean z2 = true;
                for (int i = 2; i >= 0; i--) {
                    int i2 = iArr2[i];
                    if (i2 >= 0) {
                        int i3 = DatePicker.a[i];
                        wq wqVar = (wq) obj5;
                        wr wrVarE = wqVar.e(i2);
                        boolean zC = (z ? DatePicker.c(wrVarE, datePicker.e.get(i3)) : DatePicker.c(wrVarE, datePicker.g.getActualMinimum(i3))) | (z2 ? DatePicker.b(wrVarE, datePicker.f.get(i3)) : DatePicker.b(wrVarE, datePicker.g.getActualMaximum(i3)));
                        z &= datePicker.g.get(i3) == datePicker.e.get(i3);
                        boolean z3 = datePicker.g.get(i3) == datePicker.f.get(i3);
                        if (zC) {
                            wqVar.f(iArr2[i], wrVarE);
                        }
                        z2 &= z3;
                        int i4 = iArr2[i];
                        int i5 = datePicker.g.get(i3);
                        wr wrVar = (wr) wqVar.j.get(i4);
                        if (wrVar.a != i5) {
                            wrVar.a = i5;
                            VerticalGridView verticalGridView = (VerticalGridView) wqVar.i.get(i4);
                            if (verticalGridView != null) {
                                verticalGridView.ao(i5 - ((wr) wqVar.j.get(i4)).b);
                            }
                        }
                    }
                }
                return;
            case 12:
                Object obj6 = this.a;
                synchronized (((xk) obj6).b) {
                    obj2 = ((xk) obj6).g;
                    ((xk) obj6).g = xk.a;
                }
                ((xk) this.a).e(obj2);
                return;
            case 13:
                ((yv) this.a).l();
                return;
            case 14:
                ((yy) this.a).h = -1;
                return;
            case 15:
                ((zs) this.a).b();
                return;
            case 16:
                SparseArray sparseArray = ((aai) this.a).g;
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((tj) sparseArray.valueAt(i6)).e(null, null);
                }
                sparseArray.clear();
                return;
            case 17:
                Object obj7 = this.a;
                aao aaoVar = ((aai) obj7).h;
                if (aaoVar.d == obj7) {
                    aaoVar.k();
                    return;
                }
                return;
            case 18:
                ((aar) this.a).a();
                return;
            case 19:
                ((ahc) this.a).h();
                return;
            default:
                afx afxVar = ((ahc) ((byj) this.a).a).b;
                afxVar.i(String.valueOf(afxVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
        }
    }

    public ki(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
