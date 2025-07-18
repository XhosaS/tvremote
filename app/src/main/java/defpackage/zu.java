package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
class zu {
    float a;
    float b;
    float c;
    float d;
    int e;
    aac f;

    public zu(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aag.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.e = typedArrayObtainStyledAttributes.getResourceId(0, this.e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                context.getResources().getResourceName(this.e);
                if ("layout".equals(resourceTypeName)) {
                    aac aacVar = new aac();
                    this.f = aacVar;
                    aacVar.d(context, this.e);
                }
            } else if (index == 1) {
                this.d = typedArrayObtainStyledAttributes.getDimension(1, this.d);
            } else if (index == 2) {
                this.b = typedArrayObtainStyledAttributes.getDimension(2, this.b);
            } else if (index == 3) {
                this.c = typedArrayObtainStyledAttributes.getDimension(3, this.c);
            } else if (index == 4) {
                this.a = typedArrayObtainStyledAttributes.getDimension(4, this.a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
