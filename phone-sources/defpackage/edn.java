package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edn {
    public int a;
    public Object b;
    private int c;
    private Object d;

    public edn() {
        this.d = new long[10];
        this.b = new Object[10];
    }

    private final Object g(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        Object objH = null;
        while (this.a > 0) {
            long j3 = j - ((long[]) this.d)[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objH = h();
            j2 = j3;
        }
        return objH;
    }

    private final Object h() {
        a.ab(this.a > 0);
        Object obj = this.b;
        int i = this.c;
        Object[] objArr = (Object[]) obj;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.a--;
        return obj2;
    }

    public final synchronized int a() {
        return this.a;
    }

    public final synchronized Object b(long j) {
        return g(j, false);
    }

    public final synchronized Object c() {
        if (this.a == 0) {
            return null;
        }
        return h();
    }

    public final synchronized Object d(long j) {
        return g(j, true);
    }

    public final synchronized void e(long j, Object obj) {
        if (this.a > 0) {
            if (j <= ((long[]) this.d)[((this.c + r0) - 1) % ((Object[]) this.b).length]) {
                f();
            }
        }
        int length = ((Object[]) this.b).length;
        if (this.a >= length) {
            int i = length + length;
            long[] jArr = new long[i];
            Object[] objArr = new Object[i];
            int i2 = this.c;
            int i3 = length - i2;
            System.arraycopy(this.d, i2, jArr, 0, i3);
            System.arraycopy(this.b, this.c, objArr, 0, i3);
            int i4 = this.c;
            if (i4 > 0) {
                System.arraycopy(this.d, 0, jArr, i3, i4);
                System.arraycopy(this.b, 0, objArr, i3, this.c);
            }
            this.d = jArr;
            this.b = objArr;
            this.c = 0;
        }
        int i5 = this.c;
        int i6 = this.a;
        Object obj2 = this.b;
        int length2 = (i5 + i6) % ((Object[]) obj2).length;
        ((long[]) this.d)[length2] = j;
        ((Object[]) obj2)[length2] = obj;
        this.a = i6 + 1;
    }

    public final synchronized void f() {
        this.c = 0;
        this.a = 0;
        Arrays.fill((Object[]) this.b, (Object) null);
    }

    public edn(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        this.b = new ArrayList();
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), cqr.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.c = typedArrayObtainStyledAttributes.getResourceId(1, this.c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                context.getResources().getResourceName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    cqn cqnVar = new cqn();
                    this.d = cqnVar;
                    cqnVar.f(context, this.c);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
