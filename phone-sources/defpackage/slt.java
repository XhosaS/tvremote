package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class slt implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ slt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        szk szkVarA;
        Context context;
        Rect rect;
        int iT = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                Object obj2 = ((slw) obj).f;
                synchronized (obj2) {
                    ((slw) obj).g = null;
                    ((slw) obj).h = true;
                    synchronized (obj2) {
                    }
                    return;
                }
                return;
            case 1:
                break;
            case 2:
                Object obj3 = this.a;
                synchronized (((smq) obj3).h) {
                    if (((smq) obj3).k == 0) {
                        ((smq) obj3).d();
                    }
                }
                return;
            case 3:
                ?? r0 = this.a;
                smq smqVar = (smq) r0;
                synchronized (smqVar.h) {
                    uhp uhpVar = ((smq) r0).j;
                    if (((smq) r0).k == 0 && uhpVar != null) {
                        ((smq) r0).j = null;
                        if (!uhpVar.cancel(true)) {
                            try {
                                ((SQLiteDatabase) sfy.J(uhpVar)).close();
                            } catch (ExecutionException unused) {
                            }
                        }
                        smqVar.b.unregisterComponentCallbacks(r0);
                        Iterator it = smqVar.g.iterator();
                        while (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == null) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
            case 4:
                ((snl) this.a).b();
                return;
            case 5:
                ((View) this.a).requestLayout();
                return;
            case 6:
                sqb sqbVar = (sqb) this.a;
                sqbVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = sqbVar.c;
                das dasVar = bottomSheetBehavior.z;
                if (dasVar != null && dasVar.l()) {
                    sqbVar.a(sqbVar.a);
                    return;
                } else {
                    if (bottomSheetBehavior.y == 2) {
                        bottomSheetBehavior.Q(sqbVar.a);
                        return;
                    }
                    return;
                }
            case 7:
                MaterialButton materialButton = (MaterialButton) this.a;
                if (materialButton.m && materialButton.o && (szkVarA = materialButton.e.a()) != null) {
                    iT = (int) (szkVarA.t() * 0.11f);
                }
                materialButton.n = iT;
                materialButton.s();
                materialButton.invalidate();
                return;
            case 8:
                ((swt) this.a).e();
                return;
            case 9:
                swt swtVar = (swt) this.a;
                ((sxm) swtVar.getCurrentDrawable()).l(false, false, true);
                if (swtVar.getProgressDrawable() == null || !swtVar.getProgressDrawable().isVisible()) {
                    if (swtVar.getIndeterminateDrawable() == null || !swtVar.getIndeterminateDrawable().isVisible()) {
                        swtVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((syz) this.a).e();
                return;
            case 11:
                EditText editText = ((sys) this.a).k;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                sil.l(editText).showSoftInput(editText, 1);
                return;
            case 12:
                ((sys) this.a).n();
                return;
            case 13:
                EditText editText2 = ((sys) this.a).k;
                editText2.clearFocus();
                InputMethodManager inputMethodManagerL = sil.l(editText2);
                if (inputMethodManagerL != null) {
                    inputMethodManagerL.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    return;
                }
                return;
            case 14:
                syz syzVar = (syz) this.a;
                AnimatorSet animatorSetC = syzVar.c(true);
                animatorSetC.addListener(new syu(syzVar));
                animatorSetC.start();
                return;
            case 15:
                ((sys) this.a).g();
                return;
            case 16:
                syz syzVar2 = (syz) this.a;
                syzVar2.b.setTranslationY(r1.getHeight());
                AnimatorSet animatorSetD = syzVar2.d(true);
                animatorSetD.addListener(new syw(syzVar2));
                animatorSetD.start();
                return;
            case 17:
                tam tamVar = (tam) this.a;
                tamVar.h = -1;
                tamVar.invalidate();
                return;
            case 18:
                taz tazVar = (taz) this.a;
                tay tayVar = tazVar.j;
                if (tayVar == null || (context = tazVar.i) == null) {
                    return;
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                tayVar.getLocationInWindow(iArr);
                int height = iHeight - (iArr[1] + tayVar.getHeight());
                int translationY = (int) tayVar.getTranslationY();
                int i = tazVar.r;
                int i2 = height + translationY;
                if (i2 >= i) {
                    tazVar.s = i;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = tayVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(taz.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                tazVar.s = tazVar.r;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += tazVar.r - i2;
                tayVar.requestLayout();
                return;
            case 19:
                ((taz) this.a).l();
                return;
            default:
                Object obj4 = this.a;
                taz tazVar2 = (taz) obj4;
                tay tayVar2 = tazVar2.j;
                if (tayVar2 == null) {
                    return;
                }
                if (tayVar2.getParent() != null) {
                    tayVar2.setVisibility(0);
                }
                if (tayVar2.c == 1) {
                    ValueAnimator valueAnimatorC = tazVar2.c(0.0f, 1.0f);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(tazVar2.g);
                    valueAnimatorOfFloat.addUpdateListener(new spv(obj4, 4));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
                    animatorSet.setDuration(tazVar2.c);
                    animatorSet.addListener(new tav(tazVar2));
                    animatorSet.start();
                    return;
                }
                int iB = tazVar2.b();
                tayVar2.setTranslationY(iB);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(iB, 0);
                valueAnimator.setInterpolator(tazVar2.f);
                valueAnimator.setDuration(tazVar2.e);
                valueAnimator.addListener(new taq(tazVar2));
                valueAnimator.addUpdateListener(new spv(obj4, 5));
                valueAnimator.start();
                return;
        }
        while (true) {
            sid sidVar = (sid) this.a;
            if (iT >= sidVar.getItemCount()) {
                return;
            }
            ust ustVar = (ust) sidVar.b.e.findViewHolderForAdapterPosition(iT);
            if (ustVar != null) {
                ((View) ustVar.a).setClickable(true);
            }
            iT++;
        }
    }

    public slt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
