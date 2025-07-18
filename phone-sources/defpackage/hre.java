package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hre implements hln {
    private final hod a = new hoe();

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) {
        return c(eo$$ExternalSyntheticApiModelOutline0.m(obj), i, i2, hllVar);
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hll hllVar) {
        eo$$ExternalSyntheticApiModelOutline0.m(obj);
        return true;
    }

    public final hnv c(ImageDecoder.Source source, int i, int i2, hll hllVar) {
        return new hsj(ImageDecoder.decodeBitmap(source, new hqy(i, i2, hllVar)), this.a, 1);
    }
}
