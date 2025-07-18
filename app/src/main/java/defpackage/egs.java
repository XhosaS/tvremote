package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egs extends drn {
    final egu a;
    public final BitSet d;
    private final String[] e;

    public egs(dru druVar, egu eguVar) {
        super(druVar, eguVar);
        this.e = new String[]{"drawable"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = eguVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final egu a() {
        j(1, this.d, this.e);
        return this.a;
    }
}
