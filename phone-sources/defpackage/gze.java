package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gze {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public gze(int i, WeakReference weakReference, Map map, int i2) {
        this.a = i;
        this.c = weakReference;
        this.d = map;
        this.b = i2;
    }

    public gze(int i, float[] fArr, float[] fArr2, int i2) {
        this.b = i;
        long length = fArr2.length;
        long length2 = fArr.length;
        a.H(length2 + length2 == length * 3);
        this.d = fArr;
        this.c = fArr2;
        this.a = i2;
    }

    public gze(gze gzeVar) {
        float[] fArr = (float[]) gzeVar.d;
        this.b = fArr.length / 3;
        this.d = clw.Q(fArr);
        this.c = clw.Q((float[]) gzeVar.c);
        int i = gzeVar.a;
        this.a = i != 1 ? i != 2 ? 4 : 6 : 5;
    }
}
