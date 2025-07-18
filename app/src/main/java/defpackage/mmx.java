package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmx extends drn {
    final mmz a;
    public final BitSet d;
    private final String[] e;

    public mmx(dru druVar, mmz mmzVar) {
        super(druVar, mmzVar);
        this.e = new String[]{"child", "directUpdateProcessorWrapper", "enableCheckDirectUpdateStateDisposed"};
        BitSet bitSet = new BitSet(3);
        this.d = bitSet;
        this.a = mmzVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(3, this.d, this.e);
        return this.a;
    }
}
