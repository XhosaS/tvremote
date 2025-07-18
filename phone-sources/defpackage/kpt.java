package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpt {
    public static final kpt a = new kpt();

    private kpt() {
    }

    public static final long b(long j, final double d, boolean z) {
        return bny.i(new wfn("primary#" + d, new nrc(1), new Function() { // from class: kps
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, true, null, null, null, new wfk(2), null, null).c(new wfo(new wfs(bny.h(j)), z)));
    }

    public static /* synthetic */ wfo c(int i, int i2, int i3) {
        wfv wfvVarA;
        wfv wfvVarA2;
        wfv wfvVarA3;
        wfv wfvVarA4;
        wfv wfvVarA5;
        int i4 = 3;
        int i5 = (i3 & 4) != 0 ? 3 : i2;
        if (i5 == 0) {
            throw null;
        }
        int i6 = 2;
        int i7 = 1;
        int i8 = 0;
        boolean z = (i3 & 2) != 0;
        wfs wfsVar = new wfs(i);
        int i9 = i5 - 1;
        if (i9 == 0) {
            double d = wfsVar.a;
            wfvVarA = wfv.a(wfs.a(d, 0.0d, 85.0d));
            wfvVarA2 = wfv.a(wfs.a(d, 0.0d, 30.0d));
            wfvVarA3 = wfv.a(wfs.a(d, 0.0d, 60.0d));
            wfvVarA4 = wfv.a(wfs.a(d, 0.0d, 6.0d));
            wfvVarA5 = wfv.a(wfs.a(d, 0.0d, 30.0d));
        } else {
            if (i9 != 2) {
                Objects.toString(a.f(i5));
                throw new IllegalArgumentException("Unsupported variant: ".concat(a.f(i5)));
            }
            wfo wfoVar = new wfo(wfsVar, z);
            wfm wfmVar = new wfm();
            wfmVar.a = "primary_palette_key_color";
            wfmVar.b = new wfa(i8);
            wfmVar.c = new wfa(i4);
            wfs wfsVarE = wfmVar.a().e(wfoVar);
            wfm wfmVar2 = new wfm();
            wfmVar2.a = "secondary_palette_key_color";
            wfmVar2.b = new wfa(4);
            wfmVar2.c = new wfa(5);
            wfs wfsVarE2 = wfmVar2.a().e(wfoVar);
            wfm wfmVar3 = new wfm();
            wfmVar3.a = "tertiary_palette_key_color";
            wfmVar3.b = new wez(18);
            wfmVar3.c = new wfa(i6);
            wfs wfsVarE3 = wfmVar3.a().e(wfoVar);
            wfm wfmVar4 = new wfm();
            wfmVar4.a = "neutral_palette_key_color";
            wfmVar4.b = new wey(8);
            wfmVar4.c = new wey(9);
            wfs wfsVarE4 = wfmVar4.a().e(wfoVar);
            wfm wfmVar5 = new wfm();
            wfmVar5.a = "neutral_variant_palette_key_color";
            wfmVar5.b = new wew(i7);
            wfmVar5.c = new wew(i8);
            wfs wfsVarE5 = wfmVar5.a().e(wfoVar);
            wfvVarA = wfv.a(wfsVarE);
            wfvVarA2 = wfv.a(wfsVarE2);
            wfvVarA3 = wfv.a(wfsVarE3);
            wfvVarA4 = wfv.a(wfsVarE4);
            wfvVarA5 = wfv.a(wfsVarE5);
        }
        return new wfo(wfsVar, i5, z, 2, wfvVarA, wfvVarA2, wfvVarA3, wfvVarA4, wfvVarA5, Optional.empty());
    }

    public final List a(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return yhb.a;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 128; i++) {
                for (int i2 = 0; i2 < 128; i2++) {
                    arrayList.add(Integer.valueOf(bitmap.getPixel((int) ((i2 / 128.0d) * bitmap.getWidth()), (int) ((i / 128.0d) * bitmap.getHeight()))));
                }
            }
            return vyf.k(vyf.r(yfm.at(arrayList)));
        }
        ArrayList arrayList2 = new ArrayList();
        int width = bitmap.getWidth();
        for (int i3 = 0; i3 < width; i3++) {
            int height = bitmap.getHeight();
            for (int i4 = 0; i4 < height; i4++) {
                arrayList2.add(Integer.valueOf(bitmap.getPixel(i3, i4)));
            }
        }
        return vyf.k(vyf.r(yfm.at(arrayList2)));
    }
}
