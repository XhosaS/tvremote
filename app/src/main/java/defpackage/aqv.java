package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class aqv implements Runnable {
    private final List a;
    private final int b;

    public aqv(Collection collection, int i) {
        afk.e(collection, "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.a;
        int size = list.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                i++;
            }
        } else {
            while (i < size) {
                ((aqu) list.get(i)).a();
                i++;
            }
        }
    }
}
