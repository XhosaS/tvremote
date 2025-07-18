package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eki extends drn {
    public final ekk a;
    public final BitSet d;
    private final String[] e;

    public eki(dru druVar, ekk ekkVar) {
        super(druVar, ekkVar);
        this.e = new String[]{"text"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = ekkVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekk a() {
        j(1, this.d, this.e);
        return this.a;
    }
}
