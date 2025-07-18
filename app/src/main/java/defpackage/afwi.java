package defpackage;

import io.grpc.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afwi extends afhn {
    static final boolean a = afrq.i("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.afhc
    public final afhm a(afhe afheVar) {
        return a ? new afwb(afheVar) : new afwh(afheVar);
    }

    @Override // defpackage.afhn
    public final afip b(Map map) {
        try {
            Boolean boolA = afsx.a(map, "shuffleAddressList");
            return new afip(a ? new afvw(boolA) : new afwd(boolA));
        } catch (RuntimeException e) {
            return new afip(Status.l.c(e).withDescription("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.afhn
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.afhn
    public final void d() {
    }

    @Override // defpackage.afhn
    public final void e() {
    }
}
