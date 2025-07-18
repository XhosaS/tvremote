package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bif extends rg {
    private final View b;
    private int c;
    private int d;
    private final int[] e = new int[2];

    public bif(View view) {
        this.b = view;
    }

    @Override // defpackage.rg
    public final void a(sf sfVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apl aplVar = (apl) it.next();
            if ((aplVar.f() & 8) != 0) {
                int i = this.d;
                float fE = aplVar.e() * (-i);
                TimeInterpolator timeInterpolator = bgz.a;
                this.b.setTranslationY(i + Math.round(fE));
                return;
            }
        }
    }

    @Override // defpackage.rg
    public final void b(apl aplVar) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.rg
    public final void c(apl aplVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.rg
    public final void d(apl aplVar, rf rfVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
    }
}
