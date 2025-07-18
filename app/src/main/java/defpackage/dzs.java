package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzs extends drn {
    private static final String[] a = {"delegate"};
    private final BitSet d;
    private final dzt e;

    public dzs(dru druVar, dzt dztVar) {
        super(druVar, dztVar);
        this.d = new BitSet(1);
        this.e = dztVar;
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dzt a() {
        j(1, this.d, a);
        return this.e;
    }

    public final void c(drq drqVar) {
        this.d.set(0);
        this.e.a = drqVar;
    }
}
