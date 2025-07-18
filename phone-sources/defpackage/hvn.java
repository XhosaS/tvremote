package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvn implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public hvn(hvi hviVar, int i) {
        this.b = i;
        this.a = new WeakReference(hviVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b != 0) {
            hvi hviVar = (hvi) this.a.get();
            if (hviVar != null) {
                List list = hviVar.c;
                if (!list.isEmpty()) {
                    int iB = hviVar.b();
                    int iA = hviVar.a();
                    if (hvi.d(iB, iA)) {
                        ArrayList arrayList = new ArrayList(list);
                        int size = arrayList.size();
                        while (i < size) {
                            ((hvd) arrayList.get(i)).e(iB, iA);
                            i++;
                        }
                        hviVar.c();
                    }
                }
            }
            return true;
        }
        hvo hvoVar = (hvo) this.a.get();
        if (hvoVar != null) {
            List list2 = hvoVar.c;
            if (!list2.isEmpty()) {
                int iB2 = hvoVar.b();
                int iA2 = hvoVar.a();
                if (hvo.d(iB2, iA2)) {
                    ArrayList arrayList2 = new ArrayList(list2);
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        ((hvd) arrayList2.get(i)).e(iB2, iA2);
                        i++;
                    }
                    hvoVar.c();
                }
            }
        }
        return true;
    }

    public hvn(hvo hvoVar, int i) {
        this.b = i;
        this.a = new WeakReference(hvoVar);
    }
}
