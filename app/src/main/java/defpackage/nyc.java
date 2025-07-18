package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyc extends drn {
    final nyf a;
    public final BitSet d;
    private final String[] e;

    public nyc(dru druVar, nyf nyfVar) {
        super(druVar, nyfVar);
        this.e = new String[]{"enableAdditionalImagePerfLogging", "image", "imagePrefetchRangeRatio", "imageProcessorExtensionResolver", "imageSourceExtensionResolver", "imageTransitionType", "logger", "reportMissingImageSources"};
        BitSet bitSet = new BitSet(8);
        this.d = bitSet;
        this.a = nyfVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(8, this.d, this.e);
        return this.a;
    }
}
