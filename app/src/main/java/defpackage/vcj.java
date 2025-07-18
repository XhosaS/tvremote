package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.katniss.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcj {
    public int a;
    public vbw b;
    public int[][] c;
    public vbw[] d;

    public vcj(Context context, int i) throws Resources.NotFoundException {
        int next;
        int depth;
        a();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, vbs.a) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, vbs.a, 0, 0);
                                    vbw vbwVar = new vbw(vbw.b(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new vbf(0.0f)));
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                                        this.b = vbwVar;
                                    }
                                    int[][] iArr2 = this.c;
                                    if (i5 >= iArr2.length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr3 = new int[i6][];
                                        System.arraycopy(iArr2, 0, iArr3, 0, i5);
                                        this.c = iArr3;
                                        vbw[] vbwVarArr = new vbw[i6];
                                        System.arraycopy(this.d, 0, vbwVarArr, 0, i5);
                                        this.d = vbwVarArr;
                                    }
                                    int[][] iArr4 = this.c;
                                    int i7 = this.a;
                                    iArr4[i7] = iArrTrimStateSet;
                                    this.d[i7] = vbwVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a();
        }
    }

    private final void a() {
        this.b = new vbw();
        this.c = new int[10][];
        this.d = new vbw[10];
    }
}
