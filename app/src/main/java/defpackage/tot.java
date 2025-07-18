package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tot implements oeb {
    final /* synthetic */ oeb a;
    final /* synthetic */ tou b;
    final /* synthetic */ String c = "FocusPropertiesConverter";

    public tot(oeb oebVar, tou touVar) {
        this.a = oebVar;
        this.b = touVar;
    }

    @Override // defpackage.oeb
    public final abwk a() {
        abxc abxcVar = addh.b;
        abxcVar.getClass();
        return abxcVar;
    }

    @Override // defpackage.oee
    public final /* bridge */ /* synthetic */ void b(final dru druVar, final oal oalVar, final String str, Object obj, final obz obzVar, final nzw nzwVar) {
        final MessageLite messageLite = (MessageLite) obj;
        final oeb oebVar = this.a;
        agum agumVar = new agum() { // from class: tos
            @Override // defpackage.agum
            public final Object a() {
                oebVar.b(druVar, oalVar, str, messageLite, obzVar, nzwVar);
                return agpu.a;
            }
        };
        tpa.a(this.b.a, this.c, new String[]{"apply()"}, agumVar);
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        throw null;
    }
}
