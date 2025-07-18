package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxc extends drn {
    final uxe a;
    public final BitSet d;
    private final String[] e;

    public uxc(dru druVar, uxe uxeVar) {
        super(druVar, uxeVar);
        this.e = new String[]{"binder", "broadcastGroupSelectionPrefix", "commonGridProperties", "focusUtils", "isRoot", "layoutInfo", "numColumns", "xUiKitBridge"};
        BitSet bitSet = new BitSet(8);
        this.d = bitSet;
        this.a = uxeVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(8, this.d, this.e);
        return this.a;
    }
}
