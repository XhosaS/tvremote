package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eld {
    public final eav a;
    public evz c;
    public evz d;
    public evz e;
    public ImmutableList b = ImmutableList.of();
    private ImmutableMap f = ImmutableMap.of();

    public eld(eav eavVar) {
        this.a = eavVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static evz b(eao eaoVar, ImmutableList immutableList, evz evzVar, eav eavVar) {
        eay eayVarN = eaoVar.N();
        int iBe = eaoVar.be();
        Object objF = eayVarN.q() ? null : eayVarN.f(iBe);
        int iB = -1;
        if (!eaoVar.an() && !eayVarN.q()) {
            iB = eayVarN.n(iBe, eavVar).b(edt.y(eaoVar.D()) - eavVar.j);
        }
        int i = iB;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            evz evzVar2 = (evz) immutableList.get(i2);
            if (e(evzVar2, objF, eaoVar.an(), eaoVar.bb(), eaoVar.bc(), i)) {
                return evzVar2;
            }
        }
        if (immutableList.isEmpty() && evzVar != null && e(evzVar, objF, eaoVar.an(), eaoVar.bb(), eaoVar.bc(), i)) {
            return evzVar;
        }
        return null;
    }

    private final void d(ImmutableMap.Builder builder, evz evzVar, eay eayVar) {
        if (evzVar == null) {
            return;
        }
        if (eayVar.a(evzVar.a) != -1) {
            builder.put(evzVar, eayVar);
            return;
        }
        eay eayVar2 = (eay) this.f.get(evzVar);
        if (eayVar2 != null) {
            builder.put(evzVar, eayVar2);
        }
    }

    private static boolean e(evz evzVar, Object obj, boolean z, int i, int i2, int i3) {
        if (evzVar.a.equals(obj)) {
            return z ? evzVar.b == i && evzVar.c == i2 : evzVar.b == -1 && evzVar.e == i3;
        }
        return false;
    }

    public final eay a(evz evzVar) {
        return (eay) this.f.get(evzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(eay eayVar) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (this.b.isEmpty()) {
            d(builder, this.d, eayVar);
            if (!Objects.equals(this.e, this.d)) {
                d(builder, this.e, eayVar);
            }
            if (!Objects.equals(this.c, this.d) && !Objects.equals(this.c, this.e)) {
                d(builder, this.c, eayVar);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                d(builder, (evz) this.b.get(i), eayVar);
            }
            if (!this.b.contains(this.c)) {
                d(builder, this.c, eayVar);
            }
        }
        this.f = builder.buildOrThrow();
    }
}
