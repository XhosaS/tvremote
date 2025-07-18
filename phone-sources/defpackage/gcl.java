package defpackage;

import android.util.SparseBooleanArray;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcl {
    public static final gez f = new gez(null);
    public final List a;
    public final List b;
    public final gck e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final ko c = new ko();

    public gcl(List list, List list2) {
        this.a = list;
        this.b = list2;
        int size = list.size();
        gck gckVar = null;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            gck gckVar2 = (gck) this.a.get(i2);
            int i3 = gckVar2.b;
            gckVar = i3 > i ? gckVar2 : gckVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.e = gckVar;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.a);
    }
}
