package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgn {
    public static final Comparator a = new Comparator() { // from class: bgl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            bgn bgnVar = (bgn) obj;
            bgn bgnVar2 = (bgn) obj2;
            int iCompare = Integer.compare(bgnVar2.d, bgnVar.d);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bgnVar.e.compareTo(bgnVar2.e);
            return iCompareTo != 0 ? iCompareTo : bgnVar.f.compareTo(bgnVar2.f);
        }
    };
    public static final Comparator b = new Comparator() { // from class: bgm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            bgn bgnVar = (bgn) obj;
            bgn bgnVar2 = (bgn) obj2;
            int iCompare = Integer.compare(bgnVar2.c, bgnVar.c);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bgnVar2.e.compareTo(bgnVar.e);
            return iCompareTo != 0 ? iCompareTo : bgnVar2.f.compareTo(bgnVar.f);
        }
    };
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public bgn(int i, int i2, String str, String str2) {
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
    }
}
