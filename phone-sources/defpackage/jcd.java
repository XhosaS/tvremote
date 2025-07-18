package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jcd implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jcd(InputMethodManager inputMethodManager, int i) {
        this.b = i;
        this.a = inputMethodManager;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                return ((nhl) this.a).b(motionEvent);
            case 1:
                return ((nhl) this.a).b(motionEvent);
            case 2:
                tui tuiVar = jdd.a;
                return ((nhl) this.a).b(motionEvent);
            case 3:
                tui tuiVar2 = jdd.a;
                return ((nhl) this.a).b(motionEvent);
            case 4:
                phg phgVar = (phg) this.a;
                View.OnClickListener onClickListener = phgVar.k;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (phgVar.j != null && motionEvent.getActionMasked() == 4 && phgVar.a.contains(Math.round(motionEvent.getRawX()), Math.round(motionEvent.getRawY()))) {
                    phgVar.j.onClick(phgVar.f);
                }
                return false;
            case 5:
                SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.a;
                View.OnTouchListener onTouchListener = selectedAccountDisc.c;
                boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
                View.OnTouchListener onTouchListener2 = selectedAccountDisc.d;
                boolean z2 = onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent);
                if (selectedAccountDisc.d == null || !z) {
                    return z2 || z;
                }
                throw new RuntimeException("customOnTouchListener may not consume the event");
            case 6:
                UnmodifiableIterator it = ((ImmutableList) this.a).iterator();
                boolean zOnTouch = false;
                while (it.hasNext()) {
                    zOnTouch |= ((View.OnTouchListener) it.next()).onTouch(view, motionEvent);
                }
                if (zOnTouch) {
                    sij.x(motionEvent.getAction() != 0, "Internal onTouchListeners may not consume ACTION_DOWN.");
                }
                return zOnTouch;
            case 7:
                sys sysVar = (sys) this.a;
                if (sysVar.o()) {
                    sysVar.d();
                }
                return false;
            case 8:
                if (motionEvent.getAction() == 1) {
                    tck tckVar = (tck) this.a;
                    if (tckVar.p()) {
                        tckVar.c = false;
                    }
                    tckVar.m();
                    tckVar.n();
                }
                return false;
            default:
                ((InputMethodManager) this.a).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return false;
        }
    }

    public /* synthetic */ jcd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
