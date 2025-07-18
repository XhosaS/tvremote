package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tg {
    public final View a;
    public final ArrayList b = new ArrayList();
    public nt c;
    public nt d;
    public int e;

    public tg(ViewGroup viewGroup) {
        nt ntVar = nt.a;
        this.c = ntVar;
        this.d = ntVar;
        Drawable background = viewGroup.getBackground();
        int i = 0;
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        te teVar = new te(this, viewGroup.getContext(), viewGroup);
        this.a = teVar;
        teVar.setWillNotDraw(true);
        td tdVar = new td(this, i);
        int[] iArr = qv.a;
        qm.i(teVar, tdVar);
        apl.g(teVar, new tf(this));
        viewGroup.addView(teVar, 0);
    }

    public static final nt a(sf sfVar) {
        return nt.c(sfVar.f(519), sfVar.f(64));
    }
}
