package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mef {
    private static final Comparator a = new fab(13);
    private final List b = new ArrayList();
    private final List c = new ArrayList(64);
    private int d = 0;

    private final synchronized void e() {
        while (this.d > 524288) {
            mee meeVar = (mee) this.b.remove(0);
            this.c.remove(meeVar);
            this.d -= meeVar.a;
        }
    }

    public final synchronized mee a(int i) {
        int i2 = 0;
        while (true) {
            List list = this.c;
            if (i2 >= list.size()) {
                return new mee(i);
            }
            mee meeVar = (mee) list.get(i2);
            int i3 = meeVar.a;
            if (i3 >= i) {
                this.d -= i3;
                list.remove(i2);
                this.b.remove(meeVar);
                return meeVar;
            }
            i2++;
        }
    }

    public final synchronized mee b(mee meeVar, int i) {
        mee meeVarA;
        meeVarA = a(i);
        System.arraycopy(meeVar.b, 0, meeVarA.b, 0, meeVar.a);
        d(meeVar);
        return meeVarA;
    }

    public final synchronized void c() {
        this.b.clear();
        this.c.clear();
        this.d = 0;
    }

    public final synchronized void d(mee meeVar) {
        if (meeVar != null) {
            int i = meeVar.a;
            if (i <= 524288) {
                this.b.add(meeVar);
                List list = this.c;
                int iBinarySearch = Collections.binarySearch(list, meeVar, a);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                list.add(iBinarySearch, meeVar);
                this.d += i;
                e();
            }
        }
    }
}
