package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcd {
    public String a;
    public String d;
    public final List f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public zcd() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        char[] cArr = zce.a;
        String str = this.a;
        str.getClass();
        return wbb.N(str);
    }

    public final zce a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        char[] cArr = zce.a;
        String strO = wbb.O(this.b, 0, 0, false, 7);
        String strO2 = wbb.O(this.c, 0, 0, false, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iD = d();
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(wbb.O((String) it.next(), 0, 0, false, 7));
        }
        List<String> list2 = this.g;
        if (list2 != null) {
            arrayList = new ArrayList(yfm.z(list2, 10));
            for (String str3 : list2) {
                arrayList.add(str3 != null ? wbb.O(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new zce(str, strO, strO2, str2, iD, arrayList, str4 != null ? wbb.O(str4, 0, 0, false, 7) : null, toString());
    }

    public final void b(String str) {
        List listP;
        if (str != null) {
            char[] cArr = zce.a;
            listP = wbb.P(wbb.R(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            listP = null;
        }
        this.g = listP;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.zce r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcd.c(zce, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r5.b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r5.c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = r5.c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r5.c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r5.d
            if (r1 == 0) goto L63
            boolean r1 = defpackage.ylh.N(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r5.d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r5.d
            r0.append(r1)
        L63:
            int r1 = r5.e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r5.a
            if (r1 == 0) goto L87
        L6c:
            int r1 = r5.d()
            java.lang.String r3 = r5.a
            if (r3 == 0) goto L81
            char[] r3 = defpackage.zce.a
            java.lang.String r3 = r5.a
            r3.getClass()
            int r3 = defpackage.wbb.N(r3)
            if (r1 == r3) goto L87
        L81:
            r0.append(r2)
            r0.append(r1)
        L87:
            char[] r1 = defpackage.zce.a
            java.util.List r1 = r5.f
            int r2 = r1.size()
            r3 = 0
        L90:
            if (r3 >= r2) goto La3
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L90
        La3:
            java.util.List r1 = r5.g
            if (r1 == 0) goto Lb4
            r1 = 63
            r0.append(r1)
            java.util.List r1 = r5.g
            r1.getClass()
            defpackage.wbb.Q(r1, r0)
        Lb4:
            java.lang.String r1 = r5.h
            if (r1 == 0) goto Lc2
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r5.h
            r0.append(r1)
        Lc2:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcd.toString():java.lang.String");
    }
}
