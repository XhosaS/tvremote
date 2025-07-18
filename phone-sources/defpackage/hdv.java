package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdv extends hdn {
    public hdv(List list) {
        super(list);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        Object obj;
        hhu hhuVar = this.d;
        if (hhuVar == null) {
            return (f != 1.0f || (obj = hhsVar.c) == null) ? (hea) hhsVar.b : (hea) obj;
        }
        float f2 = hhsVar.g;
        Float f3 = hhsVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        hea heaVar = (hea) hhsVar.b;
        Object obj2 = hhsVar.c;
        return (hea) hhuVar.b(f2, fFloatValue, heaVar, obj2 == null ? heaVar : (hea) obj2, f, b(), this.c);
    }
}
