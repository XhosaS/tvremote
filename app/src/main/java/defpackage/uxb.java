package defpackage;

import com.google.protobuf.MessageLite;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxb implements mox {
    private final uwm a;

    public uxb(uwm uwmVar) {
        this.a = uwmVar;
    }

    @Override // defpackage.mox
    public final /* synthetic */ drn a(dru druVar, oal oalVar, MessageLite messageLite, List list) {
        adfc adfcVar = (adfc) messageLite;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("vertical_grid() must have children");
        }
        dru druVarC = dru.c(druVar);
        uws uwsVar = new uws(1, adfcVar.c);
        adey adeyVar = adfcVar.d;
        if (adeyVar == null) {
            adeyVar = adey.a;
        }
        eiz eizVarB = uwu.b(druVarC, oalVar, adeyVar, uwsVar, list);
        uxc uxcVar = new uxc(druVarC, new uxe());
        adey adeyVar2 = adfcVar.d;
        if (adeyVar2 == null) {
            adeyVar2 = adey.a;
        }
        uxe uxeVar = uxcVar.a;
        uxeVar.c = adeyVar2;
        BitSet bitSet = uxcVar.d;
        bitSet.set(2);
        uxeVar.a = eizVarB;
        bitSet.set(0);
        uxcVar.P(false);
        uxeVar.f = uwsVar;
        bitSet.set(5);
        uxeVar.r = adfcVar.c;
        bitSet.set(6);
        uxeVar.e = adfcVar.e;
        bitSet.set(4);
        uxeVar.b = adfcVar.f;
        bitSet.set(1);
        uxeVar.d = this.a;
        bitSet.set(3);
        bitSet.set(7);
        return uxcVar;
    }
}
