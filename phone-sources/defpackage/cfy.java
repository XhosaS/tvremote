package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfy implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public cfy(String str, List list) {
        this(true == list.isEmpty() ? null : list, str);
    }

    public final int a() {
        return this.b.length();
    }

    public final cfy b(yjv yjvVar) {
        cfw cfwVar = new cfw(this);
        List list = cfwVar.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, ccf.V((cfx) yjvVar.a(((cfv) list.get(i)).a(Integer.MIN_VALUE))));
        }
        return cfwVar.a();
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cfy subSequence(int i, int i2) {
        if (i > i2) {
            cko.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String strSubstring = this.b.substring(i, i2);
        strSubstring.getClass();
        List list = this.a;
        int i3 = cfz.a;
        if (i > i2) {
            cko.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                cfx cfxVar = (cfx) list.get(i4);
                int i5 = cfxVar.b;
                int i6 = cfxVar.c;
                if (cfz.b(i, i2, i5, i6)) {
                    arrayList2.add(new cfx(cfxVar.a, Math.max(i, i5) - i, Math.min(i2, i6) - i, cfxVar.d));
                }
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new cfy(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    public final List d() {
        List list = this.c;
        return list == null ? yhb.a : list;
    }

    public final List e(int i) {
        List list = this.a;
        if (list == null) {
            return yhb.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            cfx cfxVar = (cfx) obj;
            if ((cfxVar.a instanceof cgf) && cfz.b(0, i, cfxVar.b, cfxVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfy)) {
            return false;
        }
        cfy cfyVar = (cfy) obj;
        return yks.e(this.b, cfyVar.b) && yks.e(this.a, cfyVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ cfy(String str) {
        this(str, yhb.a);
    }

    public cfy(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                cfx cfxVar = (cfx) list.get(i);
                Object obj = cfxVar.a;
                if (obj instanceof cgs) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    cfxVar.getClass();
                    arrayList.add(cfxVar);
                } else if (obj instanceof cgm) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    cfxVar.getClass();
                    arrayList2.add(cfxVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listAj = arrayList2 != null ? yfm.aj(arrayList2, new ade(6)) : null;
        if (listAj == null || listAj.isEmpty()) {
            return;
        }
        ja jaVarA = jb.a(((cfx) yfm.S(listAj)).c);
        int size2 = listAj.size();
        for (int i2 = 1; i2 < size2; i2++) {
            cfx cfxVar2 = (cfx) listAj.get(i2);
            while (true) {
                if (jaVarA.b == 0) {
                    break;
                }
                int iB = jaVarA.b();
                if (cfxVar2.b >= iB) {
                    jaVarA.e(jaVarA.b - 1);
                } else if (cfxVar2.c > iB) {
                    cko.a("Paragraph overlap not allowed, end " + cfxVar2.c + " should be less than or equal to " + iB);
                }
            }
            jaVarA.d(cfxVar2.c);
        }
    }
}
