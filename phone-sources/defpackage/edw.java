package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edw extends edy {
    public final long a;
    public final List b;
    public final List c;

    public edw(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final edw a(int i) {
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            edw edwVar = (edw) list.get(i2);
            if (edwVar.d == i) {
                return edwVar;
            }
        }
        return null;
    }

    public final edx b(int i) {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            edx edxVar = (edx) list.get(i2);
            if (edxVar.d == i) {
                return edxVar;
            }
        }
        return null;
    }

    public final void c(edw edwVar) {
        this.c.add(edwVar);
    }

    public final void d(edx edxVar) {
        this.b.add(edxVar);
    }

    @Override // defpackage.edy
    public final String toString() {
        List list = this.b;
        return e(this.d) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.c.toArray());
    }
}
