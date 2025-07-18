package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tac {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public tac() {
        this.c = new int[10][];
        this.d = new sze[10];
    }

    public static tac b(sze szeVar) {
        tac tacVar = new tac();
        tacVar.z(StateSet.WILD_CARD, szeVar);
        return tacVar;
    }

    public static tac d(Context context, TypedArray typedArray, sze szeVar) throws Resources.NotFoundException {
        int next;
        int depth;
        int i = 3;
        int resourceId = typedArray.getResourceId(3, 0);
        if (resourceId == 0) {
            return b(szq.a(typedArray, 3, szeVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return b(szq.a(typedArray, 3, szeVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                tac tacVar = new tac();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == i)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, szm.b) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, szm.b, 0, 0);
                                    sze szeVarA = szq.a(typedArrayObtainAttributes, 5, new szb(0.0f));
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.cornerSize) {
                                            int i4 = i2 + 1;
                                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false)) {
                                                attributeNameResource = -attributeNameResource;
                                            }
                                            iArr[i2] = attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    tacVar.z(StateSet.trimStateSet(iArr, i2), szeVarA);
                                    i = 3;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                        }
                        return tacVar;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return b(szeVar);
        }
    }

    private final int y(int[] iArr) {
        Object obj = this.c;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(((int[][]) obj)[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    private final void z(int[] iArr, sze szeVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = szeVar;
        }
        Object obj = this.c;
        if (i >= ((int[][]) obj).length) {
            int i2 = i + 10;
            int[][] iArr2 = new int[i2][];
            System.arraycopy(obj, 0, iArr2, 0, i);
            this.c = iArr2;
            sze[] szeVarArr = new sze[i2];
            System.arraycopy(this.d, 0, szeVarArr, 0, i);
            this.d = szeVarArr;
        }
        Object obj2 = this.c;
        int i3 = this.a;
        ((int[][]) obj2)[i3] = iArr;
        ((sze[]) this.d)[i3] = szeVar;
        this.a = i3 + 1;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, sze] */
    public final sze a(int[] iArr) {
        int iY = y(iArr);
        if (iY < 0) {
            iY = y(StateSet.WILD_CARD);
        }
        return iY < 0 ? this.b : ((sze[]) this.d)[iY];
    }

    public final boolean c() {
        return this.a > 1;
    }

    public final pil e() {
        Object obj = this.d;
        if (obj != null) {
            this.b = ((ImmutableMap.Builder) obj).buildOrThrow();
        } else if (this.b == null) {
            this.b = ImmutableMap.of();
        }
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: promoType");
        }
        return new pil(i, (String) this.c, (ImmutableMap) this.b);
    }

    public final float f() {
        return ((Paint) this.d).getAlpha() / 255.0f;
    }

    public final float g() {
        return ((Paint) this.d).getStrokeMiter();
    }

    public final float h() {
        return ((Paint) this.d).getStrokeWidth();
    }

    public final int i() {
        return !((Paint) this.d).isFilterBitmap() ? 0 : 1;
    }

    public final int j() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.d).getStrokeCap();
        if (strokeCap == null || (i = bnh.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int k() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.d).getStrokeJoin();
        if (strokeJoin == null || (i = bnh.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final long l() {
        return bny.i(((Paint) this.d).getColor());
    }

    public final void m(float f) {
        double d = f * 255.0f;
        ((Paint) this.d).setAlpha((int) Math.rint(d));
    }

    public final void n(int i) {
        if (a.r(this.a, i)) {
            return;
        }
        this.a = i;
        Object obj = this.d;
        if (Build.VERSION.SDK_INT >= 29) {
            ((Paint) obj).setBlendMode(bnj.k(i));
        } else {
            ((Paint) obj).setXfermode(new PorterDuffXfermode(bnj.l(i)));
        }
    }

    public final void o(long j) {
        ((Paint) this.d).setColor(bny.h(j));
    }

    public final void p(bnr bnrVar) {
        this.c = bnrVar;
        ((Paint) this.d).setColorFilter(bnrVar != null ? bnrVar.b : null);
    }

    public final void q(int i) {
        ((Paint) this.d).setFilterBitmap(!a.r(i, 0));
    }

    public final void r(Shader shader) {
        this.b = shader;
        ((Paint) this.d).setShader(shader);
    }

    public final void s(int i) {
        Paint.Cap cap;
        Object obj = this.d;
        if (a.r(i, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (a.r(i, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            a.r(i, 0);
            cap = Paint.Cap.BUTT;
        }
        ((Paint) obj).setStrokeCap(cap);
    }

    public final void t(int i) {
        ((Paint) this.d).setStrokeJoin(a.r(i, 0) ? Paint.Join.MITER : a.r(i, 2) ? Paint.Join.BEVEL : a.r(i, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void u(float f) {
        ((Paint) this.d).setStrokeMiter(f);
    }

    public final void v(float f) {
        ((Paint) this.d).setStrokeWidth(f);
    }

    public final void w(int i) {
        ((Paint) this.d).setStyle(a.r(i, 1) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public final void x() {
        ((Paint) this.d).setPathEffect(null);
    }

    public tac(Paint paint) {
        this.d = paint;
        this.a = 3;
    }

    public tac(byte[] bArr) {
    }

    public tac(byte[] bArr, byte[] bArr2) {
        this(new Paint(7));
    }
}
