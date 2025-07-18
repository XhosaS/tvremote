package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class agzk extends agzh {
    public static final int h(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final CharSequence i(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zA = agyl.a(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zA) {
                    break;
                }
                length--;
            } else if (zA) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String j(String str, CharSequence charSequence) {
        if (!str.startsWith((String) charSequence)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String k(String str, String str2, String str3) {
        int iR = agyv.r(str, str2, 0, 6);
        if (iR == -1) {
            return str3;
        }
        String strSubstring = str.substring(iR + str2.length(), str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String l(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iLastIndexOf = str.lastIndexOf(c, agyv.h(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final List m(CharSequence charSequence) {
        return agxv.b(new agzj(charSequence));
    }

    public static final boolean n(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!agyl.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        return agyv.r(charSequence, (String) charSequence2, 0, 2) >= 0;
    }

    public static final int p(CharSequence charSequence, String str, int i) {
        str.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        agwy agwyVar = new agwy(i, length);
        int i2 = agwyVar.a;
        int i3 = agwyVar.b;
        if (i2 > i3) {
            return -1;
        }
        while (!agyv.s(str, charSequence, i2, str.length())) {
            if (i2 == i3) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    public static /* synthetic */ int q(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int r(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return agyv.p(charSequence, str, i);
    }

    public static final boolean s(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (charSequence.charAt(i3) != charSequence2.charAt(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final List t(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int length = 0;
        String str = strArr[0];
        if (str.length() != 0) {
            int iP = agyv.p(charSequence, str, 0);
            if (iP == -1) {
                List listSingletonList = Collections.singletonList(charSequence);
                listSingletonList.getClass();
                return listSingletonList;
            }
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(charSequence.subSequence(length, iP).toString());
                length = str.length() + iP;
                iP = agyv.p(charSequence, str, length);
            } while (iP != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        final List listC = agqj.c(strArr);
        agyd<agwy> agydVar = new agyd(new agyq(charSequence, new agvb() { // from class: agzi
            /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[EDGE_INSN: B:48:0x0022->B:6:0x0022 BREAK  A[LOOP:0: B:16:0x0048->B:27:0x007b]] */
            @Override // defpackage.agvb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r10, java.lang.Object r11) {
                /*
                    r9 = this;
                    java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                    java.lang.Integer r11 = (java.lang.Integer) r11
                    int r11 = r11.intValue()
                    r10.getClass()
                    java.util.List r0 = r1
                    int r1 = r0.size()
                    r2 = 1
                    r3 = 0
                    if (r1 != r2) goto L30
                    java.lang.Object r0 = defpackage.agqq.r(r0)
                    java.lang.String r0 = (java.lang.String) r0
                    r1 = 4
                    int r10 = defpackage.agyv.r(r10, r0, r11, r1)
                    if (r10 >= 0) goto L25
                L22:
                    r11 = r3
                    goto Lb5
                L25:
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    agpi r11 = new agpi
                    r11.<init>(r10, r0)
                    goto Lb5
                L30:
                    agwy r1 = new agwy
                    r2 = 0
                    if (r11 >= 0) goto L36
                    r11 = r2
                L36:
                    int r4 = r10.length()
                    r1.<init>(r11, r4)
                    boolean r11 = r10 instanceof java.lang.String
                    if (r11 == 0) goto L7e
                    int r11 = r1.a
                    int r1 = r1.b
                    if (r11 <= r1) goto L48
                    goto L22
                L48:
                    java.util.Iterator r4 = r0.iterator()
                L4c:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L6a
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    java.lang.String r6 = (java.lang.String) r6
                    r7 = r10
                    java.lang.String r7 = (java.lang.String) r7
                    int r8 = r6.length()
                    r6.getClass()
                    boolean r6 = r6.regionMatches(r2, r7, r11, r8)
                    if (r6 == 0) goto L4c
                    goto L6b
                L6a:
                    r5 = r3
                L6b:
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 == 0) goto L79
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
                    agpi r11 = new agpi
                    r11.<init>(r10, r5)
                    goto Lb5
                L79:
                    if (r11 == r1) goto L22
                    int r11 = r11 + 1
                    goto L48
                L7e:
                    int r11 = r1.a
                    int r1 = r1.b
                    if (r11 <= r1) goto L85
                    goto L22
                L85:
                    java.util.Iterator r2 = r0.iterator()
                L89:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto La1
                    java.lang.Object r4 = r2.next()
                    r5 = r4
                    java.lang.String r5 = (java.lang.String) r5
                    int r6 = r5.length()
                    boolean r5 = defpackage.agyv.s(r5, r10, r11, r6)
                    if (r5 == 0) goto L89
                    goto La2
                La1:
                    r4 = r3
                La2:
                    java.lang.String r4 = (java.lang.String) r4
                    if (r4 == 0) goto Lb0
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
                    agpi r11 = new agpi
                    r11.<init>(r10, r4)
                    goto Lb5
                Lb0:
                    if (r11 == r1) goto L22
                    int r11 = r11 + 1
                    goto L85
                Lb5:
                    if (r11 == 0) goto Lcb
                    java.lang.Object r10 = r11.b
                    java.lang.String r10 = (java.lang.String) r10
                    int r10 = r10.length()
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    java.lang.Object r11 = r11.a
                    agpi r0 = new agpi
                    r0.<init>(r11, r10)
                    return r0
                Lcb:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.agzi.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        ArrayList arrayList2 = new ArrayList(agqq.i(agydVar, 10));
        for (agwy agwyVar : agydVar) {
            agwyVar.getClass();
            int i = agwyVar.a;
            Integer.valueOf(i).getClass();
            int i2 = agwyVar.b;
            Integer.valueOf(i2).getClass();
            arrayList2.add(charSequence.subSequence(i, i2 + 1).toString());
        }
        return arrayList2;
    }

    public static /* synthetic */ int u(CharSequence charSequence, String str) {
        int iH = agyv.h(charSequence);
        charSequence.getClass();
        return ((String) charSequence).lastIndexOf(str, iH);
    }
}
