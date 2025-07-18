package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class tqa extends tpw {
    private final tqo a;

    public tqa(String str, tqt tqtVar, tqo tqoVar, yau yauVar) {
        super(str, tqtVar, yauVar);
        a.H(tqoVar.d);
        this.a = tqoVar;
    }

    @Override // defpackage.tqt
    public final tqo h() {
        return tqo.a(this.a, i());
    }

    public tqa(String str, UUID uuid, String str2, tqo tqoVar, yau yauVar) {
        super(str, uuid, str2, yauVar);
        a.H(tqoVar.d);
        this.a = tqoVar;
    }
}
