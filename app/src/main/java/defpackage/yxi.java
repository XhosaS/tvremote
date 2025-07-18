package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yxi implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b = "";

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(yxi yxiVar) {
        if (yxiVar == yxh.a) {
            return 1;
        }
        if (yxiVar == yxf.a) {
            return -1;
        }
        Comparable comparable = yxiVar.b;
        zcd zcdVar = zcd.a;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof yxg, yxiVar instanceof yxg);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yxi) {
            try {
                if (compareTo((yxi) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
