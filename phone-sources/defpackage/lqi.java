package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqi {
    static final ImmutableSet a = ImmutableSet.of(vce.STREAM_SEARCH, vce.SEARCH, vce.CARD, vce.SVOD_DISTRIBUTOR_CONTENT, vce.VERTICAL_SEARCH, vce.STREAM_PRIMETIME_GUIDE, vce.CONTINUE_WATCHING, vce.STREAM_EMBEDDED, vce.NO_ANNOTATION, vce.WITH_ANNOTATION, vce.EMBEDDED_STREAM_CONTENT, vce.EMBEDDED_STREAM_CONTENT_TWO_ROWS, vce.EMBEDDED_STREAM_CONTENT_TWO_ROWS_WITH_ANNOTATION, vce.EMBEDDED_STREAM_CONTENT_WITH_ANNOTATION, vce.TAG_BROWSE, vce.PROMOTIONAL_BANNER, vce.FHR_CONTAINER, vce.PLAY_MOVIES_AVOD_CONTENT);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v159, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v162, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v19, types: [tst] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.tst a(defpackage.vat r36, defpackage.idw r37) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqi.a(vat, idw):tst");
    }

    private static tst b(vat vatVar) {
        vay vayVar = vatVar.d;
        if (vayVar == null) {
            vayVar = vay.a;
        }
        if (vayVar.b != 6) {
            return trk.a;
        }
        ArrayList arrayList = new ArrayList();
        vay vayVar2 = vatVar.d;
        if (vayVar2 == null) {
            vayVar2 = vay.a;
        }
        Iterator<E> it = (vayVar2.b == 6 ? (vax) vayVar2.c : vax.a).b.iterator();
        while (it.hasNext()) {
            vaz vazVar = ((vaw) it.next()).b;
            if (vazVar == null) {
                vazVar = vaz.a;
            }
            arrayList.add(vazVar.b);
        }
        return tst.i(arrayList);
    }
}
