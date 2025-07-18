package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxi extends drn {
    final uxk a;
    final dru d;
    public final BitSet e;
    private final String[] f;

    public uxi(dru druVar, uxk uxkVar) {
        super(druVar, uxkVar);
        this.f = new String[]{"contentComponent", "conversionContext", "dataStore", "defaultStyles", "focusUtils", "groupFocusedStyles", "groupKey", "itemFocusedStyles", "itemKey", "tvWrapperHandle", "uiExecutor"};
        BitSet bitSet = new BitSet(11);
        this.e = bitSet;
        this.a = uxkVar;
        this.d = druVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(11, this.e, this.f);
        uxk uxkVar = this.a;
        dtx dtxVarQ = uxkVar.x;
        if (dtxVarQ == null) {
            dtxVarQ = uxk.q(this.d, uxkVar, 1839493254);
        }
        uxkVar.x = dtxVarQ;
        return uxkVar;
    }
}
