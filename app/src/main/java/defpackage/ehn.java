package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehn extends drn {
    public final ehp a;
    public final BitSet d;
    private final String[] e;

    public ehn(dru druVar, ehp ehpVar) {
        super(druVar, ehpVar);
        this.e = new String[]{"binder"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = ehpVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.drn
    public final /* synthetic */ void q(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.drn
    public final /* synthetic */ void r() {
        this.a.d = false;
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ void s(CharSequence charSequence) {
        super.s(charSequence);
        this.a.e = charSequence;
    }
}
