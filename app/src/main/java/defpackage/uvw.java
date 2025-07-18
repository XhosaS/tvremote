package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvw extends drn {
    final uvz a;
    public final BitSet d;
    private final String[] e;

    public uvw(dru druVar, uvz uvzVar) {
        super(druVar, uvzVar);
        this.e = new String[]{"childComponent", "dataStore", "focusKey", "focusedCornerRadius", "focusedDefaultShadowColor", "focusedScale", "focusedShadowAlpha", "focusedShadowBlurDistance", "runnableHandler", "uiThreadExecutor"};
        BitSet bitSet = new BitSet(10);
        this.d = bitSet;
        this.a = uvzVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(10, this.d, this.e);
        return this.a;
    }
}
