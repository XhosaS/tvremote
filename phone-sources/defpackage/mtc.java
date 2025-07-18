package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mtc implements thy {
    public final /* synthetic */ ifb a;
    public final /* synthetic */ Map b;
    private final /* synthetic */ int c;

    public /* synthetic */ mtc(ifb ifbVar, Map map, int i) {
        this.c = i;
        this.a = ifbVar;
        this.b = map;
    }

    @Override // defpackage.thy
    public final tid a(int i) {
        if (this.c != 0) {
            Integer numValueOf = Integer.valueOf(this.a.getItemViewType(i));
            Map map = this.b;
            return map.containsKey(numValueOf) ? (tid) map.get(numValueOf) : new tid(1, 1);
        }
        Integer numValueOf2 = Integer.valueOf(this.a.getItemViewType(i));
        Map map2 = this.b;
        return map2.containsKey(numValueOf2) ? (tid) map2.get(numValueOf2) : new tid(2, 1);
    }
}
