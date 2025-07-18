package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class buf extends cpa {
    private final ArrayList a = new ArrayList();

    public final void k(Runnable runnable) {
        this.a.add(runnable);
    }

    @Override // android.app.Service
    public void onDestroy() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                super.onDestroy();
                return;
            }
            ((Runnable) arrayList.get(size)).run();
        }
    }
}
