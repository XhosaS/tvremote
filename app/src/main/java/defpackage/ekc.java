package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekc extends drn {
    final ekd a;
    private final String[] d;
    private final BitSet e;

    public ekc(dru druVar, ekd ekdVar) {
        super(druVar, ekdVar);
        this.d = new String[]{"color"};
        BitSet bitSet = new BitSet(1);
        this.e = bitSet;
        this.a = ekdVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekd a() {
        j(1, this.e, this.d);
        return this.a;
    }

    public final void c() {
        this.e.set(0);
    }

    @Override // defpackage.drn
    public final /* synthetic */ void l(float f) {
        this.a.a = f;
    }
}
