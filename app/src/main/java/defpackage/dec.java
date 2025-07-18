package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dec {
    final Object a;
    public List b;
    dec c;
    dec d;

    dec() {
        throw null;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }

    public dec(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }
}
