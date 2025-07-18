package defpackage;

import com.google.protobuf.MessageLite;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwx implements mox {
    @Override // defpackage.mox
    public final /* synthetic */ drn a(dru druVar, oal oalVar, MessageLite messageLite, List list) {
        adfa adfaVar = (adfa) messageLite;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("horizontal_grid() must have children");
        }
        dru druVarC = dru.c(druVar);
        uws uwsVar = new uws(0, adfaVar.c);
        adey adeyVar = adfaVar.d;
        if (adeyVar == null) {
            adeyVar = adey.a;
        }
        eiz eizVarB = uwu.b(druVarC, oalVar, adeyVar, uwsVar, list);
        uwy uwyVar = new uwy(druVarC, new uwz());
        adey adeyVar2 = adfaVar.d;
        if (adeyVar2 == null) {
            adeyVar2 = adey.a;
        }
        uwz uwzVar = uwyVar.a;
        uwzVar.c = adeyVar2;
        BitSet bitSet = uwyVar.d;
        bitSet.set(2);
        uwzVar.a = eizVarB;
        bitSet.set(0);
        uwyVar.P(false);
        uwzVar.d = uwsVar;
        bitSet.set(3);
        uwzVar.b = adfaVar.e;
        bitSet.set(1);
        bitSet.set(6);
        uwzVar.e = adfaVar.c;
        bitSet.set(4);
        uwzVar.f = adfaVar.f;
        bitSet.set(5);
        return uwyVar;
    }
}
