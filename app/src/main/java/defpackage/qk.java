package defpackage;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qk {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    final Set c = Collections.newSetFromMap(new IdentityHashMap());

    final long a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final qj b(int i) {
        SparseArray sparseArray = this.a;
        qj qjVar = (qj) sparseArray.get(i);
        if (qjVar != null) {
            return qjVar;
        }
        qj qjVar2 = new qj();
        sparseArray.put(i, qjVar2);
        return qjVar2;
    }

    public final void c() {
        this.b++;
    }

    public final void d() {
        this.b--;
    }
}
