package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements pw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public td(CoordinatorLayout coordinatorLayout, int i) {
        this.b = i;
        this.a = coordinatorLayout;
    }

    @Override // defpackage.pw
    public final sf a(View view, sf sfVar) {
        if (this.b != 0) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, sfVar)) {
                coordinatorLayout.e = sfVar;
                boolean z = sfVar.d() > 0;
                coordinatorLayout.f = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!sfVar.s()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        int[] iArr = qv.a;
                        if (childAt.getFitsSystemWindows() && ((mr) childAt.getLayoutParams()).a != null && sfVar.s()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
                return sfVar;
            }
        } else {
            nt ntVarA = tg.a(sfVar);
            nt ntVarC = nt.c(sfVar.g(519), sfVar.g(64));
            tg tgVar = (tg) this.a;
            if (!ntVarA.equals(tgVar.c) || !ntVarC.equals(tgVar.d)) {
                tgVar.c = ntVarA;
                tgVar.d = ntVarC;
                ArrayList arrayList = tgVar.b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    tc.b((tc) arrayList.get(size));
                }
            }
        }
        return sfVar;
    }

    public /* synthetic */ td(tg tgVar, int i) {
        this.b = i;
        this.a = tgVar;
    }
}
