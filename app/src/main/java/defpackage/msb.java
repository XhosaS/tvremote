package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class msb implements oes {
    private static final Rect a = new Rect(0, 0, 0, 0);
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final mrw e;

    public msb(mrw mrwVar) {
        this.e = mrwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(android.support.v7.widget.RecyclerView r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msb.d(android.support.v7.widget.RecyclerView, int, int):void");
    }

    @Override // defpackage.oes
    public final oer a(String str, IntersectionObserver intersectionObserver) {
        final mrw mrwVar = this.e;
        if (mrwVar.b == null) {
            mrwVar.b = Collections.newSetFromMap(new WeakHashMap());
        }
        final mru mruVar = new mru(((IntersectionEngine) mrwVar.a.a()).subscribe(str, intersectionObserver));
        Set set = mrwVar.b;
        if (set != null) {
            set.add(mruVar);
        }
        return new oer() { // from class: mrv
            @Override // defpackage.oer
            public final void a() {
                oer oerVar = mruVar;
                mrw.a(((mru) oerVar).a);
                Set set2 = mrwVar.b;
                if (set2 != null) {
                    set2.remove(oerVar);
                }
            }
        };
    }

    @Override // defpackage.oes
    public final void b(String str) {
        mrw mrwVar = this.e;
        if (mrwVar.c()) {
            mrwVar.b(str, this.d, a, this.b, false);
        }
    }

    @Override // defpackage.oes
    public final void c(RecyclerView recyclerView) {
        d(recyclerView, 1, -1);
    }
}
