package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bzi implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b = "";

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(bzi bziVar) {
        if (bziVar == bzh.a) {
            return 1;
        }
        if (bziVar == bzf.a) {
            return -1;
        }
        Comparable comparable = bziVar.b;
        cau cauVar = cau.a;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof bzg, bziVar instanceof bzg);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bzi) {
            try {
                if (compareTo((bzi) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
