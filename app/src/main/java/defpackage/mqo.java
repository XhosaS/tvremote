package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqo extends drn {
    public final mqp a;
    public final BitSet d;
    private final String[] e;

    public mqo(dru druVar, mqp mqpVar) {
        super(druVar, mqpVar);
        this.e = new String[]{"column", "content", "row"};
        BitSet bitSet = new BitSet(3);
        this.d = bitSet;
        this.a = mqpVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mqp a() {
        j(3, this.d, this.e);
        return this.a;
    }
}
