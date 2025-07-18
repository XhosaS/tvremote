package defpackage;

import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mme extends drn {
    public final mmf a;
    private final String[] d;
    private final BitSet e;

    public mme(dru druVar, mmf mmfVar) {
        super(druVar, mmfVar);
        this.d = new String[]{"children", "flexDirection"};
        BitSet bitSet = new BitSet(2);
        this.e = bitSet;
        this.a = mmfVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mmf a() {
        j(2, this.e, this.d);
        return this.a;
    }

    public final void c(List list) {
        this.a.a = list;
        this.e.set(0);
    }

    public final void d(int i) {
        this.a.B = i;
        this.e.set(1);
    }
}
