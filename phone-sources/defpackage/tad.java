package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.videos.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tad {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public tad() {
    }

    public static final boolean c(int i, int i2) {
        return (i2 | i) == i;
    }

    private final void h() {
        this.b = new szq();
        this.c = new int[10][];
        this.d = new szq[10];
    }

    public final tae a() {
        if (this.a == 0) {
            return null;
        }
        return new tae(this);
    }

    public final void b(int[] iArr, szq szqVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = szqVar;
        }
        Object obj = this.c;
        if (i >= ((int[][]) obj).length) {
            int i2 = i + 10;
            int[][] iArr2 = new int[i2][];
            System.arraycopy(obj, 0, iArr2, 0, i);
            this.c = iArr2;
            szq[] szqVarArr = new szq[i2];
            System.arraycopy(this.d, 0, szqVarArr, 0, i);
            this.d = szqVarArr;
        }
        Object obj2 = this.c;
        int i3 = this.a;
        ((int[][]) obj2)[i3] = iArr;
        ((szq[]) this.d)[i3] = szqVar;
        this.a = i3 + 1;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, vvj] */
    public final pjn d() {
        ?? r3;
        Object obj = this.d;
        if (obj == null || (r3 = this.g) == 0 || this.a == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" logSource");
            }
            if (this.g == null) {
                sb.append(" message");
            }
            if (this.a == 0) {
                sb.append(" qosTier");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj2 = this.b;
        Object obj3 = this.h;
        Object obj4 = this.f;
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) obj4;
        Integer num = (Integer) obj3;
        pjn pjnVar = new pjn((String) obj, r3, (uao) obj2, num, iArr2, iArr, (nte) this.e);
        nte nteVar = pjnVar.h;
        if (nteVar != null) {
            whn whnVar = nteVar.b;
            boolean z = true;
            if (whnVar != whn.EVENT_OVERRIDE && whnVar != whn.EVENT_DEFERRING) {
                z = false;
            }
            sij.i(z);
        }
        return pjnVar;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null logSource");
        }
        this.d = str;
    }

    public final void f(vvj vvjVar) {
        if (vvjVar == null) {
            throw new NullPointerException("Null message");
        }
        this.g = vvjVar;
    }

    public final void g() {
        this.a = 1;
    }

    public /* synthetic */ tad(int i, String str, String str2, wlx wlxVar, int i2) {
        if ((i | (i2 & 1)) == 0) {
            throw null;
        }
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        wlxVar = i3 != 0 ? null : wlxVar;
        str2 = i4 != 0 ? null : str2;
        str = i5 != 0 ? null : str;
        this.a = 1;
        this.f = str;
        this.c = str2;
        this.b = wlxVar;
        this.g = null;
        this.h = null;
        this.d = null;
        this.e = null;
    }

    public tad(Context context, int i) throws Throwable {
        int next;
        int depth;
        TypedArray typedArrayObtainStyledAttributes;
        h();
        try {
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
                                        Resources resources = context.getResources();
                                        if (theme == null) {
                                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, szm.a);
                                        } else {
                                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, szm.a, 0, 0);
                                        }
                                        szq szqVar = new szq(szq.b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0)));
                                        typedArrayObtainStyledAttributes.recycle();
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
                                        try {
                                            b(StateSet.trimStateSet(iArr, i2), szqVar);
                                        } catch (Throwable th) {
                                            th = th;
                                            Throwable th2 = th;
                                            if (xml == null) {
                                                throw th2;
                                            }
                                            try {
                                                xml.close();
                                                throw th2;
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                                throw th2;
                                            }
                                        }
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
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                h();
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
            h();
        }
    }

    public tad(szq szqVar) {
        h();
        b(StateSet.WILD_CARD, szqVar);
    }

    public tad(tae taeVar) {
        int i = taeVar.a;
        this.a = i;
        this.b = taeVar.b;
        this.c = new int[((int[][]) taeVar.c).length][];
        this.d = new szq[((szq[]) taeVar.d).length];
        System.arraycopy(taeVar.c, 0, this.c, 0, i);
        System.arraycopy(taeVar.d, 0, this.d, 0, this.a);
        this.e = taeVar.e;
        this.f = taeVar.f;
        this.g = taeVar.g;
        this.h = taeVar.h;
    }
}
