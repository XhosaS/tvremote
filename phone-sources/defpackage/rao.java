package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rao extends rbn {
    private final rag a;
    private final vvd b;

    public rao(rag ragVar, vvd vvdVar) {
        this.a = ragVar;
        this.b = vvdVar;
    }

    private static final boolean d(int i) {
        return i == 4 || i == 2;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        rap rapVar = (rap) obj;
        vov vovVar = (vov) obj2;
        vovVar.getClass();
        vpq vpqVar = new vpq(vovVar.e == 3);
        ViewGroup viewGroup = rapVar.c;
        vvd vvdVar = this.b;
        vvdVar.o(viewGroup, 90784, null, new nay(vvdVar, vpqVar, 6));
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        rap rapVar = (rap) obj;
        vov vovVar = (vov) obj2;
        vovVar.getClass();
        int i = vovVar.e;
        if (i == 2) {
            rapVar.c.setVisibility(8);
            rapVar.h.setVisibility(8);
        } else {
            this.a.c(rapVar.b, vovVar);
            rapVar.c.setVisibility(0);
            rapVar.h.setVisibility(i == 4 ? 0 : 8);
        }
        raf rafVar = rapVar.d;
        List list = vovVar.a;
        rafVar.submitList(list);
        rapVar.e.setVisibility(true != d(i) ? 8 : 0);
        rcb rcbVar = rapVar.g;
        List list2 = vovVar.d.a;
        rcbVar.submitList(list2);
        rapVar.f.setVisibility(true != d(i) ? 8 : 0);
        rapVar.a.setVisibility((list.isEmpty() && list2.isEmpty()) ? 8 : 0);
    }
}
