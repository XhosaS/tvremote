package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yac extends xry {
    static final boolean a = xxc.h("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.xrn
    public final xrx a(xrp xrpVar) {
        return a ? new xzw(xrpVar) : new yab(xrpVar);
    }

    @Override // defpackage.xry
    public final xst b(Map map) {
        try {
            Boolean boolA = xxv.a(map, "shuffleAddressList");
            return new xst(a ? new xzs(boolA) : new xzy(boolA));
        } catch (RuntimeException e) {
            return new xst(xtk.k.d(e).e("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.xry
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.xry
    public final void d() {
    }

    @Override // defpackage.xry
    public final void e() {
    }
}
