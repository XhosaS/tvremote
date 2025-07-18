package androidx.slice;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.bra;
import defpackage.bww;
import defpackage.bwy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SliceItemHolderParcelizer {
    private static bra sBuilder = new bra();

    public static SliceItemHolder read(bww bwwVar) {
        bra braVar = sBuilder;
        ArrayList arrayList = braVar.a;
        SliceItemHolder sliceItemHolder = arrayList.size() > 0 ? (SliceItemHolder) arrayList.remove(arrayList.size() - 1) : new SliceItemHolder(braVar);
        sliceItemHolder.a = bwwVar.j(sliceItemHolder.a, 1);
        sliceItemHolder.b = bwwVar.g(sliceItemHolder.b, 2);
        sliceItemHolder.c = bwwVar.n(sliceItemHolder.c, 3);
        sliceItemHolder.d = bwwVar.b(sliceItemHolder.d, 4);
        long jC = sliceItemHolder.e;
        if (bwwVar.D(5)) {
            jC = bwwVar.c();
        }
        sliceItemHolder.e = jC;
        Bundle bundleD = sliceItemHolder.f;
        if (bwwVar.D(6)) {
            bundleD = bwwVar.d();
        }
        sliceItemHolder.f = bundleD;
        return sliceItemHolder;
    }

    public static void write(SliceItemHolder sliceItemHolder, bww bwwVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bwy bwyVar = sliceItemHolder.a;
        if (bwyVar != null) {
            bwwVar.p(1);
            bwwVar.A(bwyVar);
        }
        Parcelable parcelable = sliceItemHolder.b;
        if (parcelable != null) {
            bwwVar.p(2);
            bwwVar.x(parcelable);
        }
        String str = sliceItemHolder.c;
        if (str != null) {
            bwwVar.p(3);
            bwwVar.y(str);
        }
        int i = sliceItemHolder.d;
        if (i != 0) {
            bwwVar.p(4);
            bwwVar.v(i);
        }
        long j = sliceItemHolder.e;
        if (j != 0) {
            bwwVar.p(5);
            bwwVar.w(j);
        }
        Bundle bundle = sliceItemHolder.f;
        if (bundle != null) {
            bwwVar.p(6);
            bwwVar.s(bundle);
        }
    }
}
