package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqj extends cxj {
    private final View a;
    private int d;
    private int e;
    private final int[] f;

    public sqj(View view) {
        super(0);
        this.f = new int[2];
        this.a = view;
    }

    @Override // defpackage.cxj
    public final cyh a(cyh cyhVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((nxb) it.next()).o() & 8) != 0) {
                this.a.setTranslationY(sns.b(this.e, 0, r0.n()));
                break;
            }
        }
        return cyhVar;
    }

    @Override // defpackage.cxj
    public final cxi b(nxb nxbVar, cxi cxiVar) {
        View view = this.a;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return cxiVar;
    }

    @Override // defpackage.cxj
    public final void c(nxb nxbVar) {
        this.a.setTranslationY(0.0f);
    }

    @Override // defpackage.cxj
    public final void d(nxb nxbVar) {
        View view = this.a;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }
}
