package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abr {
    public final aaz a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final List g;
    public int h;
    private List i;

    public abr(aaz aazVar) {
        this.a = aazVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d());
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.i = yhb.a;
    }

    public final int a(int i) {
        if (b() <= 0) {
            return 0;
        }
        if (i >= b()) {
            wv.c("ItemIndex > total count");
        }
        return i / this.h;
    }

    public final int b() {
        return this.a.b.b;
    }

    public final zuw c(int i) {
        List list;
        int i2 = this.h;
        int i3 = i * i2;
        int iK = ykn.k(i2, b() - i3);
        int size = this.i.size();
        int iJ = ykn.j(iK, 0);
        if (iJ == size) {
            list = this.i;
        } else {
            ArrayList arrayList = new ArrayList(iJ);
            for (int i4 = 0; i4 < iJ; i4++) {
                arrayList.add(new aat());
            }
            this.i = arrayList;
            list = arrayList;
        }
        return new zuw(i3, list, null);
    }
}
