package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejw extends drn {
    public final ejy a;
    public final BitSet d;
    private final String[] e;

    public ejw(dru druVar, ejy ejyVar) {
        super(druVar, ejyVar);
        this.e = new String[]{"component"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = ejyVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(1, this.d, this.e);
        return this.a;
    }
}
