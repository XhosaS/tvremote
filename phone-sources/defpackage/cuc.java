package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuc {
    static final cuc a;
    static final cuc b;
    static final xqr c;
    private static final String d;
    private static final String e;
    private final boolean f;
    private final xqr g;

    static {
        xqr xqrVar = cug.c;
        c = xqrVar;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        a = new cuc(false, xqrVar);
        b = new cuc(true, xqrVar);
    }

    public cuc(boolean z, xqr xqrVar) {
        this.f = z;
        this.g = xqrVar;
    }

    public static cuc a() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? b : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r2 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L61;
            case 17: goto L61;
            case 18: goto L60;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(java.lang.CharSequence r9) {
        /*
            cub r0 = new cub
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L65
            if (r1 != 0) goto L65
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L42
        L37:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            byte r4 = defpackage.cub.b(r4)
        L42:
            if (r4 == 0) goto L60
            if (r4 == r7) goto L5d
            r5 = 2
            if (r4 == r5) goto L5d
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L59;
                case 15: goto L59;
                case 16: goto L55;
                case 17: goto L55;
                case 18: goto L51;
                default: goto L50;
            }
        L50:
            goto L63
        L51:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L55:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L59:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L5d:
            if (r3 != 0) goto L63
            return r7
        L60:
            if (r3 != 0) goto L63
            return r6
        L63:
            r1 = r3
            goto Lb
        L65:
            if (r1 != 0) goto L68
            return r9
        L68:
            if (r2 != 0) goto L83
        L6a:
            int r2 = r0.c
            if (r2 <= 0) goto L82
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L7c;
                case 15: goto L7c;
                case 16: goto L79;
                case 17: goto L79;
                case 18: goto L76;
                default: goto L75;
            }
        L75:
            goto L6a
        L76:
            int r3 = r3 + 1
            goto L6a
        L79:
            if (r1 != r3) goto L7f
            return r7
        L7c:
            if (r1 != r3) goto L7f
            return r6
        L7f:
            int r3 = r3 + (-1)
            goto L6a
        L82:
            return r9
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuc.c(java.lang.CharSequence):int");
    }

    private static int d(CharSequence charSequence) {
        cub cubVar = new cub(charSequence);
        cubVar.c = cubVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (cubVar.c > 0) {
                byte bA = cubVar.a();
                if (bA != 0) {
                    if (bA == 1 || bA == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            xqr r0 = r8.g
            int r1 = r9.length()
            boolean r0 = r0.l(r9, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            if (r0 == 0) goto L18
            xqr r2 = defpackage.cug.b
            goto L1a
        L18:
            xqr r2 = defpackage.cug.a
        L1a:
            int r3 = r9.length()
            boolean r2 = r2.l(r9, r3)
            boolean r3 = r8.f
            r4 = -1
            r5 = 0
            java.lang.String r6 = ""
            r7 = 1
            if (r3 != 0) goto L39
            if (r2 != 0) goto L36
            int r2 = c(r9)
            if (r2 != r7) goto L34
            goto L36
        L34:
            r2 = r5
            goto L39
        L36:
            java.lang.String r2 = defpackage.cuc.d
            goto L47
        L39:
            if (r3 == 0) goto L46
            if (r2 == 0) goto L43
            int r2 = c(r9)
            if (r2 != r4) goto L46
        L43:
            java.lang.String r2 = defpackage.cuc.e
            goto L47
        L46:
            r2 = r6
        L47:
            r1.append(r2)
            if (r0 == r3) goto L5f
            if (r7 == r0) goto L51
            r2 = 8234(0x202a, float:1.1538E-41)
            goto L53
        L51:
            r2 = 8235(0x202b, float:1.154E-41)
        L53:
            r1.append(r2)
            r1.append(r9)
            r2 = 8236(0x202c, float:1.1541E-41)
            r1.append(r2)
            goto L62
        L5f:
            r1.append(r9)
        L62:
            if (r0 == 0) goto L67
            xqr r0 = defpackage.cug.b
            goto L69
        L67:
            xqr r0 = defpackage.cug.a
        L69:
            int r2 = r9.length()
            boolean r0 = r0.l(r9, r2)
            if (r3 != 0) goto L7e
            if (r0 != 0) goto L7b
            int r0 = d(r9)
            if (r0 != r7) goto L7f
        L7b:
            java.lang.String r6 = defpackage.cuc.d
            goto L8b
        L7e:
            r5 = r0
        L7f:
            if (r3 == 0) goto L8b
            if (r5 == 0) goto L89
            int r9 = d(r9)
            if (r9 != r4) goto L8b
        L89:
            java.lang.String r6 = defpackage.cuc.e
        L8b:
            r1.append(r6)
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuc.b(java.lang.String):java.lang.String");
    }
}
