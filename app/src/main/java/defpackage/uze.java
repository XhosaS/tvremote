package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uze extends aib {
    private final View b;
    private int c;
    private int d;
    private final int[] e = new int[2];

    public uze(View view) {
        this.b = view;
    }

    @Override // defpackage.aib
    public final void a(aik aikVar) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.aib
    public final void b(aik aikVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.aib
    public final void c(ajc ajcVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aik aikVar = (aik) it.next();
            if ((aikVar.a.i() & 8) != 0) {
                int i = this.d;
                float fH = aikVar.a.h() * (-i);
                TimeInterpolator timeInterpolator = uxu.a;
                this.b.setTranslationY(i + Math.round(fH));
                return;
            }
        }
    }

    @Override // defpackage.aib
    public final void d(aik aikVar, aia aiaVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
    }
}
