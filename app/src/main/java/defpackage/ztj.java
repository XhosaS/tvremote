package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztj extends ztk {
    public static int a(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static float[] b(Collection collection) {
        if (collection instanceof zti) {
            zti ztiVar = (zti) collection;
            return Arrays.copyOfRange(ztiVar.a, ztiVar.b, ztiVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }
}
