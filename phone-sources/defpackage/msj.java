package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msj extends npd {
    @Override // defpackage.npd
    public final oak a(nli nliVar, npc npcVar) {
        if (nliVar == null || !nliVar.d()) {
            return null;
        }
        List list = nliVar.a;
        return (list.size() == 1 || npcVar.a == 2) ? (oak) list.get(0) : (oak) list.get(1);
    }
}
