package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbm extends rbn {
    private final rbr a;
    private final vvd b;

    public rbm(rbr rbrVar, vvd vvdVar) {
        this.a = rbrVar;
        this.b = vvdVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vpe) obj2).getClass();
        Object obj3 = ((vvd) obj).c;
        vvd vvdVar = this.b;
        vvdVar.o((View) obj3, 93521, null, new nay(vvdVar, vpo.a, 6));
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        vpi vpiVar;
        vvd vvdVar = (vvd) obj;
        vpe vpeVar = (vpe) obj2;
        vpeVar.getClass();
        vrn vrnVar = vpeVar.a;
        if (vrnVar == null || (vpiVar = vpeVar.b) == null || !vpeVar.c) {
            ((FrameLayout) vvdVar.d).setVisibility(4);
        } else {
            this.a.c(vvdVar.a, new rbq(vrnVar, vpiVar));
            ((FrameLayout) vvdVar.d).setVisibility(0);
        }
        ((View) vvdVar.b).setBackgroundColor(vpeVar.c ? sip.d(((View) vvdVar.b).getContext(), R.attr.colorSurfaceContainerHigh, 0) : 0);
    }
}
