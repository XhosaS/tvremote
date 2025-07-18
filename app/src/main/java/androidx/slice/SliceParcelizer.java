package androidx.slice;

import defpackage.bqx;
import defpackage.bww;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SliceParcelizer {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.lang.Object[]] */
    public static Slice read(bww bwwVar) {
        Slice slice = new Slice();
        slice.c = (SliceSpec) bwwVar.j(slice.c, 1);
        slice.d = (SliceItem[]) bwwVar.F(slice.d, 2);
        slice.e = (String[]) bwwVar.F(slice.e, 3);
        slice.f = bwwVar.n(slice.f, 4);
        int length = slice.d.length;
        while (true) {
            length--;
            if (length < 0) {
                return slice;
            }
            SliceItem[] sliceItemArr = slice.d;
            SliceItem sliceItem = sliceItemArr[length];
            if (sliceItem.d == null) {
                if (sliceItemArr != null && bqx.a(sliceItemArr, sliceItem)) {
                    int length2 = sliceItemArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        if (!Objects.equals(sliceItemArr[i], sliceItem)) {
                            i++;
                        } else if (length2 == 1) {
                            sliceItemArr = null;
                        } else {
                            ?? r7 = (Object[]) Array.newInstance((Class<?>) SliceItem.class, length2 - 1);
                            System.arraycopy(sliceItemArr, 0, r7, 0, i);
                            System.arraycopy(sliceItemArr, i + 1, r7, i, (length2 - i) - 1);
                            sliceItemArr = r7;
                        }
                    }
                }
                slice.d = sliceItemArr;
                if (slice.d == null) {
                    slice.d = new SliceItem[0];
                }
            }
        }
    }

    public static void write(Slice slice, bww bwwVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        SliceSpec sliceSpec = slice.c;
        if (sliceSpec != null) {
            bwwVar.p(1);
            bwwVar.A(sliceSpec);
        }
        if (!Arrays.equals(Slice.b, slice.d)) {
            SliceItem[] sliceItemArr = slice.d;
            bwwVar.p(2);
            bwwVar.q(sliceItemArr);
        }
        if (!Arrays.equals(Slice.a, slice.e)) {
            String[] strArr = slice.e;
            bwwVar.p(3);
            bwwVar.q(strArr);
        }
        String str = slice.f;
        if (str != null) {
            bwwVar.p(4);
            bwwVar.y(str);
        }
    }
}
