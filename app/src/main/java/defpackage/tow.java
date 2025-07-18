package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tow implements ocg {
    final /* synthetic */ ocg a;
    final /* synthetic */ tox b;
    final /* synthetic */ String c;

    public tow(ocg ocgVar, tox toxVar, String str) {
        this.a = ocgVar;
        this.b = toxVar;
        this.c = str;
    }

    @Override // defpackage.ocg
    public final abwk a() {
        return this.a.a();
    }

    @Override // defpackage.ocg
    public final drq b(final dru druVar, final oal oalVar, final MessageLite messageLite, final String str, final nlr nlrVar, final List list, final obk obkVar) {
        final ocg ocgVar = this.a;
        agum agumVar = new agum() { // from class: tov
            @Override // defpackage.agum
            public final Object a() {
                return ocgVar.b(druVar, oalVar, messageLite, str, nlrVar, list, obkVar);
            }
        };
        return (drq) tpa.a(this.b.a, this.c, new String[]{"create()"}, agumVar);
    }
}
