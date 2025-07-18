package androidx.slice;

import defpackage.bww;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SliceItemParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r2.equals("image") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        r5 = r5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (r2.equals("slice") != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.slice.SliceItem read(defpackage.bww r5) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItemParcelizer.read(bww):androidx.slice.SliceItem");
    }

    public static void write(SliceItem sliceItem, bww bwwVar) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sliceItem.e = new SliceItemHolder(sliceItem.b, sliceItem.d);
        if (!Arrays.equals(Slice.a, sliceItem.a)) {
            String[] strArr = sliceItem.a;
            bwwVar.p(1);
            bwwVar.q(strArr);
        }
        if (!"text".equals(sliceItem.b)) {
            String str = sliceItem.b;
            bwwVar.p(2);
            bwwVar.y(str);
        }
        String str2 = sliceItem.c;
        if (str2 != null) {
            bwwVar.p(3);
            bwwVar.y(str2);
        }
        SliceItemHolder sliceItemHolder = sliceItem.e;
        bwwVar.p(4);
        bwwVar.A(sliceItemHolder);
    }
}
