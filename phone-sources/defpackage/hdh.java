package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdh extends hdn {
    public hdh(List list) {
        super(list);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        return Integer.valueOf(l(hhsVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(hhs hhsVar, float f) {
        float f2;
        Object obj = hhsVar.b;
        if (obj == null || hhsVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hhu hhuVar = this.d;
        if (hhuVar != null) {
            f2 = f;
            Integer num = (Integer) hhuVar.b(hhsVar.g, hhsVar.h.floatValue(), (Integer) obj, (Integer) hhsVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        return hjs.j(hhm.a(f2, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) hhsVar.c).intValue());
    }
}
