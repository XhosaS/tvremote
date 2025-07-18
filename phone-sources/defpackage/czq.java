package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czq {
    public final View a;
    public final ArrayList b = new ArrayList();
    public csr c;
    public csr d;
    public int e;

    public czq(ViewGroup viewGroup) {
        csr csrVar = csr.a;
        this.c = csrVar;
        this.d = csrVar;
        Drawable background = viewGroup.getBackground();
        int i = 0;
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        czo czoVar = new czo(this, viewGroup.getContext(), viewGroup);
        this.a = czoVar;
        czoVar.setWillNotDraw(true);
        czn cznVar = new czn(this, i);
        int[] iArr = cww.a;
        cwm.l(czoVar, cznVar);
        nxb.q(czoVar, new czp(this));
        viewGroup.addView(czoVar, 0);
    }

    public static final csr a(cyh cyhVar) {
        return csr.c(cyhVar.f(519), cyhVar.f(64));
    }
}
