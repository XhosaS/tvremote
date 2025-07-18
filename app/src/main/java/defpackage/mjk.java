package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjk implements nzy {
    public static void c(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return aczp.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        agff agffVarH = agff.h(new Runnable() { // from class: mjj
            @Override // java.lang.Runnable
            public final void run() {
                View viewN = nzxVar.n();
                if (viewN == null) {
                    return;
                }
                Context context = viewN.getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    View currentFocus = activity.getCurrentFocus();
                    if (currentFocus == null) {
                        mjk.c(activity.getWindow().getDecorView());
                    } else {
                        mjk.c(currentFocus);
                        currentFocus.clearFocus();
                    }
                }
            }
        });
        agfx agfxVar = aggd.a;
        aggb.a(agfxVar);
        return agffVarH.j(agfxVar);
    }
}
