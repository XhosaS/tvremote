package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egh extends drn {
    public final egk a;
    public final BitSet d;
    private final String[] e;

    public egh(dru druVar, egk egkVar) {
        super(druVar, egkVar);
        this.e = new String[]{"contentProps"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = egkVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(1, this.d, this.e);
        return this.a;
    }
}
