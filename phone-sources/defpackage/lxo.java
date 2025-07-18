package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxo {
    public static final idf a = new kzj(20);
    public final Collection b;
    public final String c;
    public final int d;
    public final Locale e;
    public final String f;

    public lxo(Collection collection, String str, int i, Locale locale, String str2) {
        this.e = locale;
        this.b = collection;
        this.c = str;
        this.d = i;
        this.f = str2;
    }

    public static Collection b(String str, int i, Collection collection, String str2) {
        return c(str, i, collection, Locale.getDefault(), str2);
    }

    public static Collection c(String str, int i, Collection collection, Locale locale, String str2) {
        String str3;
        int i2;
        Locale locale2;
        String str4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        int i3 = 0;
        ArrayList arrayList3 = arrayList2;
        while (it.hasNext()) {
            ksy ksyVar = (ksy) it.next();
            int length = ksyVar.c.length();
            if (length <= 1800) {
                int i4 = i3 + length;
                int i5 = !arrayList3.isEmpty() ? 1 : 0;
                if (arrayList3.size() == 100 || (i3 = i4 + i5) > 1800) {
                    str3 = str;
                    i2 = i;
                    locale2 = locale;
                    str4 = str2;
                    arrayList.add(new lxo(arrayList3, str3, i2, locale2, str4));
                    arrayList3 = new ArrayList();
                    i3 = length;
                } else {
                    str3 = str;
                    i2 = i;
                    locale2 = locale;
                    str4 = str2;
                }
                arrayList3.add(ksyVar);
                str = str3;
                i = i2;
                locale = locale2;
                str2 = str4;
            }
        }
        String str5 = str;
        int i6 = i;
        Locale locale3 = locale;
        String str6 = str2;
        if (!arrayList3.isEmpty()) {
            arrayList.add(new lxo(arrayList3, str5, i6, locale3, str6));
        }
        return arrayList;
    }

    public final String a() {
        Iterator it = this.b.iterator();
        StringBuilder sb = new StringBuilder(it.hasNext() ? ((ksy) it.next()).c : "");
        while (it.hasNext()) {
            sb.append(",");
            sb.append(((ksy) it.next()).c);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lxo lxoVar = (lxo) obj;
        if (this.d == lxoVar.d && this.b.equals(lxoVar.b) && this.c.equals(lxoVar.c) && this.f.equals(lxoVar.f)) {
            return this.e.equals(lxoVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }
}
