package androidx.slice;

import defpackage.bww;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SliceSpecParcelizer {
    public static SliceSpec read(bww bwwVar) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.a = bwwVar.n(sliceSpec.a, 1);
        sliceSpec.b = bwwVar.b(sliceSpec.b, 2);
        return sliceSpec;
    }

    public static void write(SliceSpec sliceSpec, bww bwwVar) {
        String str = sliceSpec.a;
        bwwVar.p(1);
        bwwVar.y(str);
        int i = sliceSpec.b;
        if (i != 1) {
            bwwVar.p(2);
            bwwVar.v(i);
        }
    }
}
