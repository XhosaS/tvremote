package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkk {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final fkp f;
    public final String[] g;
    public final String h;
    public final String i;
    public final fkk j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public fkk(String str, String str2, long j, long j2, fkp fkpVar, String[] strArr, String str3, String str4, fkk fkkVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = fkpVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = fkkVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            ebz ebzVar = new ebz();
            ebzVar.e(new SpannableStringBuilder());
            map.put(str, ebzVar);
        }
        CharSequence charSequence = ((ebz) map.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final fkk b(int i) {
        List list = this.m;
        if (list != null) {
            return (fkk) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void c(fkk fkkVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(fkkVar);
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                fkk fkkVar = (fkk) this.m.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                fkkVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, String str, List list) {
        String str2;
        String str3 = this.h;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (h(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            b(i).e(j, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkk.f(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final void g(long j, boolean z, String str, Map map) {
        long j2;
        boolean z2;
        HashMap map2 = this.k;
        map2.clear();
        HashMap map3 = this.l;
        map3.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, map);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            i(str4, map).append('\n');
            return;
        }
        if (h(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((ebz) entry.getValue()).a;
                charSequence.getClass();
                map2.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < a(); i++) {
                fkk fkkVarB = b(i);
                if (z || zEquals) {
                    j2 = j;
                    z2 = true;
                } else {
                    j2 = j;
                    z2 = false;
                }
                fkkVarB.g(j2, z2, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str4, map);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((ebz) entry2.getValue()).a;
                charSequence2.getClass();
                map3.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final boolean h(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L) {
            if (this.e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }
}
