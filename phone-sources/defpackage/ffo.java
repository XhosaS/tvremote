package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffo {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r8 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mwn a(java.lang.String r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "x:xmpmeta"
            r1 = 0
            org.xmlpull.v1.XmlPullParserFactory r2 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: java.lang.Throwable -> Ldc
            org.xmlpull.v1.XmlPullParser r2 = r2.newPullParser()     // Catch: java.lang.Throwable -> Ldc
            java.io.StringReader r3 = new java.io.StringReader     // Catch: java.lang.Throwable -> Ldc
            r4 = r21
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Ldc
            r2.setInput(r3)     // Catch: java.lang.Throwable -> Ldc
            r2.next()     // Catch: java.lang.Throwable -> Ldc
            boolean r3 = defpackage.eci.n(r2, r0)     // Catch: java.lang.Throwable -> Ldc
            r4 = 1
            if (r3 == 0) goto Ld4
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()     // Catch: java.lang.Throwable -> Ldc
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L29:
            r2.next()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r9 = "rdf:Description"
            boolean r9 = defpackage.eci.n(r2, r9)     // Catch: java.lang.Throwable -> Ldc
            if (r9 != 0) goto L58
            java.lang.String r9 = "Container:Directory"
            boolean r9 = defpackage.eci.n(r2, r9)     // Catch: java.lang.Throwable -> Ldc
            if (r9 == 0) goto L46
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            com.google.common.collect.ImmutableList r3 = b(r2, r3, r9)     // Catch: java.lang.Throwable -> Ldc
            goto Lbc
        L46:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = defpackage.eci.n(r2, r9)     // Catch: java.lang.Throwable -> Ldc
            if (r9 == 0) goto Lbc
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            com.google.common.collect.ImmutableList r3 = b(r2, r3, r9)     // Catch: java.lang.Throwable -> Ldc
            goto Lbc
        L58:
            java.lang.String[] r3 = defpackage.ffo.a     // Catch: java.lang.Throwable -> Ldc
            r7 = 0
            r8 = r7
        L5c:
            r9 = 4
            if (r8 >= r9) goto Ld3
            r10 = r3[r8]     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r10 = defpackage.eci.i(r2, r10)     // Catch: java.lang.Throwable -> Ldc
            if (r10 == 0) goto Ld0
            int r3 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Throwable -> Ldc
            if (r3 != r4) goto Lcf
            java.lang.String[] r3 = defpackage.ffo.b     // Catch: java.lang.Throwable -> Ldc
            r8 = r7
        L70:
            if (r8 >= r9) goto L88
            r10 = r3[r8]     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r10 = defpackage.eci.i(r2, r10)     // Catch: java.lang.Throwable -> Ldc
            if (r10 == 0) goto L85
            long r8 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Throwable -> Ldc
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L89
            goto L88
        L85:
            int r8 = r8 + 1
            goto L70
        L88:
            r8 = r5
        L89:
            java.lang.String[] r3 = defpackage.ffo.c     // Catch: java.lang.Throwable -> Ldc
        L8b:
            r10 = 2
            if (r7 >= r10) goto Lb7
            r10 = r3[r7]     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r10 = defpackage.eci.i(r2, r10)     // Catch: java.lang.Throwable -> Ldc
            if (r10 == 0) goto Lb4
            long r13 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Throwable -> Ldc
            fkx r15 = new fkx     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r16 = "image/jpeg"
            r17 = 0
            r19 = 0
            r15.<init>(r16, r17, r19)     // Catch: java.lang.Throwable -> Ldc
            r3 = r15
            fkx r11 = new fkx     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r12 = "video/mp4"
            r15 = 0
            r11.<init>(r12, r13, r15)     // Catch: java.lang.Throwable -> Ldc
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3, r11)     // Catch: java.lang.Throwable -> Ldc
            goto Lbb
        Lb4:
            int r7 = r7 + 1
            goto L8b
        Lb7:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()     // Catch: java.lang.Throwable -> Ldc
        Lbb:
            r7 = r8
        Lbc:
            boolean r9 = defpackage.eci.l(r2, r0)     // Catch: java.lang.Throwable -> Ldc
            if (r9 == 0) goto L29
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> Ldc
            if (r0 == 0) goto Lc9
            return r1
        Lc9:
            mwn r0 = new mwn     // Catch: java.lang.Throwable -> Ldc
            r0.<init>(r7, r3)     // Catch: java.lang.Throwable -> Ldc
            return r0
        Lcf:
            return r1
        Ld0:
            int r8 = r8 + 1
            goto L5c
        Ld3:
            return r1
        Ld4:
            java.lang.String r0 = "Couldn't find xmp metadata"
            eaf r2 = new eaf     // Catch: java.lang.Throwable -> Ldc
            r2.<init>(r0, r1, r4, r4)     // Catch: java.lang.Throwable -> Ldc
            throw r2     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            java.lang.String r0 = "MotionPhotoXmpParser"
            java.lang.String r2 = "Ignoring unexpected XMP metadata"
            defpackage.edb.e(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffo.a(java.lang.String):mwn");
    }

    private static ImmutableList b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (eci.n(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strI = eci.i(xmlPullParser, strConcat2);
                String strI2 = eci.i(xmlPullParser, strConcat3);
                String strI3 = eci.i(xmlPullParser, strConcat4);
                String strI4 = eci.i(xmlPullParser, strConcat5);
                if (strI == null || strI2 == null) {
                    return ImmutableList.of();
                }
                builder.add((ImmutableList.Builder) new fkx(strI, strI3 != null ? Long.parseLong(strI3) : 0L, strI4 != null ? Long.parseLong(strI4) : 0L));
            }
        } while (!eci.l(xmlPullParser, str.concat(":Directory")));
        return builder.build();
    }
}
