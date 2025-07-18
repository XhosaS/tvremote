package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkh implements fji {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c = new StringBuilder();
    private final ArrayList d = new ArrayList();
    private final edi e = new edi();

    public static float e(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long f(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = Long.parseLong(strGroup2) * 60000;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = Long.parseLong(strGroup3) * 1000;
        String strGroup4 = matcher.group(i + 4);
        long j4 = j + j2 + j3;
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.eca g(android.text.Spanned r9, java.lang.String r10) {
        /*
            ebz r0 = new ebz
            r0.<init>()
            r0.e(r9)
            if (r10 != 0) goto Lf
            eca r9 = r0.a()
            return r9
        Lf:
            int r9 = r10.hashCode()
            java.lang.String r1 = "{\\an9}"
            java.lang.String r2 = "{\\an7}"
            java.lang.String r3 = "{\\an3}"
            java.lang.String r4 = "{\\an1}"
            r5 = 2
            r6 = 1
            r7 = 0
            switch(r9) {
                case -685620710: goto L4c;
                case -685620648: goto L42;
                case -685620617: goto L39;
                case -685620555: goto L30;
                case -685620524: goto L29;
                case -685620462: goto L22;
                default: goto L21;
            }
        L21:
            goto L56
        L22:
            boolean r9 = r10.equals(r1)
            if (r9 == 0) goto L56
            goto L48
        L29:
            boolean r9 = r10.equals(r2)
            if (r9 == 0) goto L56
            goto L52
        L30:
            java.lang.String r9 = "{\\an6}"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L56
            goto L48
        L39:
            java.lang.String r9 = "{\\an4}"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L56
            goto L52
        L42:
            boolean r9 = r10.equals(r3)
            if (r9 == 0) goto L56
        L48:
            r0.f = r5
            r9 = r5
            goto L59
        L4c:
            boolean r9 = r10.equals(r4)
            if (r9 == 0) goto L56
        L52:
            r0.f = r7
            r9 = r7
            goto L59
        L56:
            r0.f = r6
            r9 = r6
        L59:
            int r8 = r10.hashCode()
            switch(r8) {
                case -685620710: goto L8a;
                case -685620679: goto L81;
                case -685620648: goto L7a;
                case -685620524: goto L71;
                case -685620493: goto L68;
                case -685620462: goto L61;
                default: goto L60;
            }
        L60:
            goto L93
        L61:
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L93
            goto L77
        L68:
            java.lang.String r1 = "{\\an8}"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L93
            goto L77
        L71:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L93
        L77:
            r0.d = r7
            goto L95
        L7a:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L93
            goto L90
        L81:
            java.lang.String r1 = "{\\an2}"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L93
            goto L90
        L8a:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L93
        L90:
            r0.d = r5
            goto L95
        L93:
            r0.d = r6
        L95:
            float r9 = e(r9)
            r0.e = r9
            int r9 = r0.d
            float r9 = e(r9)
            r0.d(r9, r7)
            eca r9 = r0.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkh.g(android.text.Spanned, java.lang.String):eca");
    }

    @Override // defpackage.fji
    public final int a() {
        return 1;
    }

    @Override // defpackage.fji
    public final /* synthetic */ fix b(byte[] bArr, int i, int i2) {
        return fki.a(this, bArr, i2);
    }

    @Override // defpackage.fji
    public final void c(byte[] bArr, int i, int i2, fjh fjhVar, ecq ecqVar) throws NumberFormatException {
        edi ediVar;
        long j;
        String str;
        fkh fkhVar = this;
        edi ediVar2 = fkhVar.e;
        ediVar2.I(bArr, i + i2);
        ediVar2.K(i);
        Charset charsetA = ediVar2.A();
        if (charsetA == null) {
            charsetA = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (fjhVar.b == -9223372036854775807L || !fjhVar.c) ? null : new ArrayList();
        while (true) {
            String strV = ediVar2.v(charsetA);
            int i3 = 0;
            if (strV == null) {
                break;
            }
            if (strV.length() != 0) {
                try {
                    Integer.parseInt(strV);
                    edi ediVar3 = fkhVar.e;
                    String strV2 = ediVar3.v(charsetA);
                    if (strV2 == null) {
                        edb.e("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = a.matcher(strV2);
                    if (matcher.matches()) {
                        long jF = f(matcher, 1);
                        long jF2 = f(matcher, 6);
                        StringBuilder sb = fkhVar.c;
                        sb.setLength(0);
                        ArrayList arrayList2 = fkhVar.d;
                        arrayList2.clear();
                        String strV3 = ediVar3.v(charsetA);
                        while (!TextUtils.isEmpty(strV3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strV3.trim();
                            long j3 = j2;
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = b.matcher(strTrim);
                            int i4 = i3;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i4;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i4 += length;
                                matcher2 = matcher2;
                                ediVar2 = ediVar2;
                            }
                            sb.append(sb2.toString());
                            j2 = j3;
                            strV3 = ediVar3.v(charsetA);
                            i3 = 0;
                        }
                        ediVar = ediVar2;
                        j = j2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        long j4 = fjhVar.b;
                        if (j4 == j || jF2 >= j4) {
                            ecqVar.a(new fit(ImmutableList.of(g(spannedFromHtml, str)), jF, jF2 - jF));
                        } else if (arrayList != null) {
                            arrayList.add(new fit(ImmutableList.of(g(spannedFromHtml, str)), jF, jF2 - jF));
                        }
                    } else {
                        ediVar = ediVar2;
                        j = j2;
                        edb.e("SubripParser", "Skipping invalid timing: ".concat(strV2));
                    }
                } catch (NumberFormatException unused) {
                    ediVar = ediVar2;
                    j = j2;
                    edb.e("SubripParser", "Skipping invalid index: ".concat(strV));
                }
            } else {
                ediVar = ediVar2;
                j = j2;
            }
            fkhVar = this;
            j2 = j;
            ediVar2 = ediVar;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ecqVar.a((fit) arrayList.get(i6));
            }
        }
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}
