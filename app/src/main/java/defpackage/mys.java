package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mys extends drn {
    public final myv a;
    public final BitSet d;
    private final String[] e;

    public mys(dru druVar, myv myvVar) {
        super(druVar, myvVar);
        this.e = new String[]{"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
        BitSet bitSet = new BitSet(7);
        this.d = bitSet;
        this.a = myvVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(7, this.d, this.e);
        return this.a;
    }
}
