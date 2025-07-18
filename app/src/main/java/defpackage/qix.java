package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qix {
    public static vfc a(abla ablaVar) {
        if (ablaVar.b.isEmpty()) {
            return null;
        }
        vew vewVar = ((ablc) ablaVar.b.get(0)).b;
        if (vewVar == null) {
            vewVar = vew.a;
        }
        abxs<vfc> abxsVar = vewVar.d;
        if (abxsVar.isEmpty()) {
            return null;
        }
        for (vfc vfcVar : abxsVar) {
            if ((vfcVar.b & 1) != 0) {
                vey veyVar = vfcVar.c;
                if (veyVar == null) {
                    veyVar = vey.a;
                }
                if (veyVar.b) {
                    return vfcVar;
                }
            }
        }
        return (vfc) abxsVar.get(0);
    }
}
