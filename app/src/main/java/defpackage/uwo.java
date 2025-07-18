package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwo extends drn {
    final uwp a;
    public final BitSet d;
    private final String[] e;

    public uwo(dru druVar, uwp uwpVar) {
        super(druVar, uwpVar);
        this.e = new String[]{"itemPosition", "leanbackLayoutInfo", "wrappedComponent"};
        BitSet bitSet = new BitSet(3);
        this.d = bitSet;
        this.a = uwpVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uwp a() {
        j(3, this.d, this.e);
        return this.a;
    }
}
