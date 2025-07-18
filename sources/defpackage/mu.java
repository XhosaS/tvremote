package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mu implements Comparator {
    private final /* synthetic */ int a;

    public mu(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            int[] iArr = qv.a;
            float fA = qm.a((View) obj);
            float fA2 = qm.a((View) obj2);
            if (fA > fA2) {
                return -1;
            }
            return fA < fA2 ? 1 : 0;
        }
        if (i != 1) {
            return ((View) obj).getTop() - ((View) obj2).getTop();
        }
        hl hlVar = (hl) obj;
        hl hlVar2 = (hl) obj2;
        RecyclerView recyclerView = hlVar.d;
        if ((recyclerView == null) != (hlVar2.d == null)) {
            return recyclerView == null ? 1 : -1;
        }
        boolean z = hlVar.a;
        if (z != hlVar2.a) {
            return z ? -1 : 1;
        }
        int i2 = hlVar2.b - hlVar.b;
        if (i2 != 0) {
            return i2;
        }
        int i3 = hlVar.c - hlVar2.c;
        if (i3 == 0) {
            return 0;
        }
        return i3;
    }
}
