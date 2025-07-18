package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gh {
    private static final bcp a = new bbl(bcz.c, new gf(2));

    public static final fz a(bao baoVar) {
        fz fzVar = (fz) baoVar.f(a);
        Object obj = null;
        if (fzVar == null) {
            baoVar.x(1208426157);
            View view = (View) baoVar.f(AndroidCompositionLocals_androidKt.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    fzVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                fz fzVar2 = tag instanceof fz ? (fz) tag : null;
                if (fzVar2 != null) {
                    fzVar = fzVar2;
                    break;
                }
                Object objD = cws.d(view);
                view = objD instanceof View ? (View) objD : null;
            }
            ((bas) baoVar).aa();
        } else {
            baoVar.x(1208423708);
            ((bas) baoVar).aa();
        }
        if (fzVar != null) {
            baoVar.x(1208423789);
            ((bas) baoVar).aa();
            return fzVar;
        }
        baoVar.x(1208428160);
        Context baseContext = (Context) baoVar.f(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof fz) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        fz fzVar3 = (fz) obj;
        ((bas) baoVar).aa();
        return fzVar3;
    }
}
