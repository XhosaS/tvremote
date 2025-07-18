package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class dx implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ ArrayList e;

    public dx(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.a; i++) {
            View view = (View) this.b.get(i);
            String str = (String) this.c.get(i);
            int[] iArr = ahj.a;
            ahc.l(view, str);
            ahc.l((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
