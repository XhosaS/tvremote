package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brq {
    public final XmlPullParser a;
    private int c = 0;
    public final nxb b = new nxb((byte[]) null, (short[]) null, (byte[]) null);

    public brq(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float fH = crn.h(typedArray, this.a, str, i, f);
        e(typedArray.getChangingConfigurations());
        return fH;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        int iJ = crn.j(typedArray, this.a, str, i, i2);
        e(typedArray.getChangingConfigurations());
        return iJ;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayL = crn.l(resources, theme, attributeSet, iArr);
        e(typedArrayL.getChangingConfigurations());
        return typedArrayL;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.c = i | this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brq)) {
            return false;
        }
        brq brqVar = (brq) obj;
        return yks.e(this.a, brqVar.a) && this.c == brqVar.c;
    }

    public final float f(TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final nuh h(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        nuh nuhVarA = crn.A(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return nuhVarA;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.c + ')';
    }
}
