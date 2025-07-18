package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eld extends drn {
    public final elg a;
    public final BitSet d;
    private final String[] e;

    public eld(dru druVar, elg elgVar) {
        super(druVar, elgVar);
        this.e = new String[]{"childComponent"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = elgVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(1, this.d, this.e);
        return this.a;
    }
}
