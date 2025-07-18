package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
class od implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        of ofVar = (of) obj;
        of ofVar2 = (of) obj2;
        RecyclerView recyclerView = ofVar.d;
        if ((recyclerView == null) != (ofVar2.d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = ofVar.a;
        if (z != ofVar2.a) {
            return !z ? 1 : -1;
        }
        int i = ofVar2.b - ofVar.b;
        if (i != 0) {
            return i;
        }
        int i2 = ofVar.c - ofVar2.c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
