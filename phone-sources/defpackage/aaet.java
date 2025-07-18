package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaet implements aafh, aaff {
    public static final aaet a;
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    private static final /* synthetic */ aaet[] g;

    static {
        aaet aaetVar = new aaet();
        a = aaetVar;
        g = new aaet[]{aaetVar};
        f = new ArrayList();
        ArrayList<String> arrayList = new ArrayList(aabs.c);
        d = arrayList;
        Collections.sort(arrayList);
        e = new HashMap();
        int iMax = 0;
        int iMax2 = 0;
        for (String str : arrayList) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf >= 0) {
                iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                iMax2 = Math.max(iMax2, iIndexOf);
                String strSubstring = str.substring(0, iIndexOf + 1);
                String strSubstring2 = str.substring(iIndexOf);
                Map map = e;
                if (!map.containsKey(strSubstring)) {
                    map.put(strSubstring, new ArrayList());
                }
                ((List) map.get(strSubstring)).add(strSubstring2);
            } else {
                f.add(str);
            }
            iMax = Math.max(iMax, str.length());
        }
        b = iMax;
        c = iMax2;
    }

    private aaet() {
    }

    public static aaet[] values() {
        return (aaet[]) g.clone();
    }

    @Override // defpackage.aaff
    public final int a() {
        return b;
    }

    @Override // defpackage.aafh
    public final int b() {
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r3 = 0;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r3 >= r0.size()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r5 = (java.lang.String) r0.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (defpackage.aaey.c(r11, r2, r5) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r5.length() <= r4.length()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r10.f(defpackage.aabs.l(java.lang.String.valueOf(r1).concat(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        return r2 + r4.length();
     */
    @Override // defpackage.aaff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.aafb r10, java.lang.CharSequence r11, int r12) {
        /*
            r9 = this;
            java.util.List r0 = defpackage.aaet.f
            int r1 = r11.length()
            int r2 = defpackage.aaet.c
            int r2 = r2 + r12
            int r2 = java.lang.Math.min(r1, r2)
            r3 = r12
        Le:
            if (r3 >= r2) goto L50
            int r4 = r3 + 1
            char r5 = r11.charAt(r3)
            r6 = 47
            if (r5 != r6) goto L4e
            java.lang.CharSequence r0 = r11.subSequence(r12, r4)
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r12
            int r1 = r1 + (-1)
            if (r3 >= r1) goto L3f
            char r1 = r11.charAt(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L40
        L3f:
            r1 = r0
        L40:
            java.util.Map r3 = defpackage.aaet.e
            java.lang.Object r1 = r3.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L8e
            r8 = r1
            r1 = r0
            r0 = r8
            goto L53
        L4e:
            r3 = r4
            goto Le
        L50:
            java.lang.String r1 = ""
            r2 = r12
        L53:
            r3 = 0
            r4 = 0
        L55:
            int r5 = r0.size()
            if (r3 >= r5) goto L77
            java.lang.Object r5 = r0.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = defpackage.aaey.c(r11, r2, r5)
            if (r6 == 0) goto L74
            if (r4 == 0) goto L73
            int r6 = r5.length()
            int r7 = r4.length()
            if (r6 <= r7) goto L74
        L73:
            r4 = r5
        L74:
            int r3 = r3 + 1
            goto L55
        L77:
            if (r4 == 0) goto L8e
            java.lang.String r11 = java.lang.String.valueOf(r1)
            java.lang.String r11 = r11.concat(r4)
            aabs r11 = defpackage.aabs.l(r11)
            r10.f(r11)
            int r10 = r4.length()
            int r2 = r2 + r10
            return r2
        L8e:
            int r10 = ~r12
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaet.c(aafb, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        appendable.append(aabsVar != null ? aabsVar.e : "");
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) {
    }
}
