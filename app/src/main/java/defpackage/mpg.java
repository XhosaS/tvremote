package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpg extends drn {
    final mpi a;
    public final BitSet d;
    private final String[] e;

    public mpg(dru druVar, mpi mpiVar) {
        super(druVar, mpiVar);
        this.e = new String[]{"collapsedCommandFuture", "commandResolver", "conversionContext", "dataLayerSelector", "drawableRequester", "expandableTextType", "expandedCommandFuture", "logger", "styleRunExtensionConverters", "typefaceProvider"};
        BitSet bitSet = new BitSet(10);
        this.d = bitSet;
        this.a = mpiVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(10, this.d, this.e);
        return this.a;
    }
}
