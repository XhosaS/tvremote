package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acp {
    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !g(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int b(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !g(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static TypedArray d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence e(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String f(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] h(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int i(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (g(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0182, code lost:
    
        if (r12.size() <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0184, code lost:
    
        r0 = new defpackage.acf(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018b, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018f, code lost:
    
        if (r18 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0191, code lost:
    
        r0 = new defpackage.acf(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        r0 = new defpackage.acf(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019d, code lost:
    
        if (r13 == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
    
        if (r13 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a2, code lost:
    
        r13 = new android.graphics.LinearGradient(r23, r15, r16, r17, r0.a, r0.b, defpackage.acg.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b6, code lost:
    
        r13 = new android.graphics.SweepGradient(r10, r5, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c4, code lost:
    
        if (r21 <= 0.0f) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c6, code lost:
    
        r13 = new android.graphics.RadialGradient(r10, r5, r21, r0.a, r0.b, defpackage.acg.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dd, code lost:
    
        r1 = new defpackage.aca(r13, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ec, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.aca k(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acp.k(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):aca");
    }
}
