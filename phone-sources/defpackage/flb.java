package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flb {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.text.SpannedString a(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flb.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static fkx b(String str, Matcher matcher, edi ediVar, List list) {
        fla flaVar = new fla();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            flaVar.a = fld.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            flaVar.b = fld.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            c(strGroup3, flaVar);
            StringBuilder sb = new StringBuilder();
            String strU = ediVar.u();
            while (!TextUtils.isEmpty(strU)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strU.trim());
                strU = ediVar.u();
            }
            flaVar.c = a(str, sb.toString(), list);
            return new fkx(flaVar.a().a(), flaVar.a, flaVar.b);
        } catch (IllegalArgumentException unused) {
            edb.e("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: NumberFormatException -> 0x01a2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01a2, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x006d, B:32:0x0097, B:31:0x008d, B:33:0x009b, B:35:0x00a1, B:57:0x00eb, B:56:0x00df, B:58:0x00f1, B:59:0x00f9, B:81:0x013d, B:80:0x0133, B:82:0x0141, B:84:0x0147, B:100:0x017f, B:99:0x0174, B:101:0x0185, B:103:0x018d, B:104:0x0197), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df A[Catch: NumberFormatException -> 0x01a2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01a2, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x006d, B:32:0x0097, B:31:0x008d, B:33:0x009b, B:35:0x00a1, B:57:0x00eb, B:56:0x00df, B:58:0x00f1, B:59:0x00f9, B:81:0x013d, B:80:0x0133, B:82:0x0141, B:84:0x0147, B:100:0x017f, B:99:0x0174, B:101:0x0185, B:103:0x018d, B:104:0x0197), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133 A[Catch: NumberFormatException -> 0x01a2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01a2, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x006d, B:32:0x0097, B:31:0x008d, B:33:0x009b, B:35:0x00a1, B:57:0x00eb, B:56:0x00df, B:58:0x00f1, B:59:0x00f9, B:81:0x013d, B:80:0x0133, B:82:0x0141, B:84:0x0147, B:100:0x017f, B:99:0x0174, B:101:0x0185, B:103:0x018d, B:104:0x0197), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174 A[Catch: NumberFormatException -> 0x01a2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01a2, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x006d, B:32:0x0097, B:31:0x008d, B:33:0x009b, B:35:0x00a1, B:57:0x00eb, B:56:0x00df, B:58:0x00f1, B:59:0x00f9, B:81:0x013d, B:80:0x0133, B:82:0x0141, B:84:0x0147, B:100:0x017f, B:99:0x0174, B:101:0x0185, B:103:0x018d, B:104:0x0197), top: B:108:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r16, defpackage.fla r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flb.c(java.lang.String, fla):void");
    }

    private static int d(List list, String str, rld rldVar) {
        List listE = e(list, str, rldVar);
        for (int i = 0; i < listE.size(); i++) {
            int i2 = ((fkz) listE.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List e(java.util.List r10, java.lang.String r11, defpackage.rld r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r10.size()
            if (r2 >= r3) goto L7e
            java.lang.Object r3 = r10.get(r2)
            fkw r3 = (defpackage.fkw) r3
            java.lang.Object r4 = r12.d
            java.lang.Object r5 = r12.b
            java.lang.Object r6 = r12.c
            java.lang.String r7 = r3.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            java.lang.String r7 = r3.b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            java.util.Set r7 = r3.c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            java.lang.String r7 = r3.d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L70
            r4 = 1
            goto L71
        L41:
            java.lang.String r7 = r3.a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = defpackage.fkw.b(r1, r7, r11, r8)
            java.lang.String r8 = r3.b
            java.lang.String r4 = (java.lang.String) r4
            r9 = 2
            int r4 = defpackage.fkw.b(r7, r8, r4, r9)
            java.lang.String r7 = r3.d
            java.lang.String r6 = (java.lang.String) r6
            r8 = 4
            int r4 = defpackage.fkw.b(r4, r7, r6, r8)
            r6 = -1
            if (r4 == r6) goto L70
            java.util.Set r6 = r3.c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L67
            goto L70
        L67:
            java.util.Set r5 = r3.c
            int r5 = r5.size()
            int r5 = r5 * r8
            int r4 = r4 + r5
            goto L71
        L70:
            r4 = r1
        L71:
            if (r4 <= 0) goto L7b
            fkz r5 = new fkz
            r5.<init>(r4, r3)
            r0.add(r5)
        L7b:
            int r2 = r2 + 1
            goto L7
        L7e:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flb.e(java.util.List, java.lang.String, rld):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.Set] */
    private static void f(String str, rld rldVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = rldVar.a;
        int length = spannableStringBuilder.length();
        String str2 = (String) rldVar.d;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iD = d(list2, str, rldVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, fky.a);
                        int i3 = i;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((fky) arrayList.get(i4)).c.d)) {
                                fky fkyVar = (fky) arrayList.get(i4);
                                rld rldVar2 = fkyVar.c;
                                int iD2 = d(list2, str, rldVar2);
                                if (iD2 == i2) {
                                    iD2 = iD != i2 ? iD : 1;
                                }
                                int i5 = rldVar2.a - length2;
                                int i6 = fkyVar.b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                                spannableStringBuilder.delete(i5, i6);
                                spannableStringBuilder.setSpan(new ecf(charSequenceSubSequence.toString(), iD2), i3, i5, 33);
                                length2 += charSequenceSubSequence.length();
                                i3 = i5;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : rldVar.b) {
                                Map map = c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new ech((String) rldVar.c), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listE = e(list2, str, rldVar);
        for (int i7 = 0; i7 < listE.size(); i7++) {
            fkw fkwVar = ((fkz) listE.get(i7)).b;
            if (fkwVar != null) {
                if (fkwVar.a() != -1) {
                    eci.g(spannableStringBuilder, new StyleSpan(fkwVar.a()), i, length);
                }
                if (fkwVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (fkwVar.g) {
                    if (!fkwVar.g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    eci.g(spannableStringBuilder, new ForegroundColorSpan(fkwVar.f), i, length);
                }
                if (fkwVar.i) {
                    if (!fkwVar.i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    eci.g(spannableStringBuilder, new BackgroundColorSpan(fkwVar.h), i, length);
                }
                if (fkwVar.e != null) {
                    eci.g(spannableStringBuilder, new TypefaceSpan(fkwVar.e), i, length);
                }
                int i8 = fkwVar.m;
                if (i8 == 1) {
                    eci.g(spannableStringBuilder, new AbsoluteSizeSpan((int) fkwVar.n, true), i, length);
                } else if (i8 == 2) {
                    eci.g(spannableStringBuilder, new RelativeSizeSpan(fkwVar.n), i, length);
                } else if (i8 == 3) {
                    eci.g(spannableStringBuilder, new RelativeSizeSpan(fkwVar.n / 100.0f), i, length);
                }
                if (fkwVar.p) {
                    spannableStringBuilder.setSpan(new ecd(), i, length, 33);
                }
            }
        }
    }
}
