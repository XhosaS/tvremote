package defpackage;

import io.grpc.Status;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftn extends afyf {
    final /* synthetic */ afil a;
    final /* synthetic */ afem b;
    final /* synthetic */ affp c;
    final /* synthetic */ afto d;

    /* JADX WARN: Illegal instructions before constructor call */
    public aftn(afto aftoVar, afil afilVar, afih afihVar, afem afemVar, afyg afygVar, afrr afrrVar, affp affpVar) {
        this.a = afilVar;
        this.b = afemVar;
        this.c = affpVar;
        this.d = aftoVar;
        afun afunVar = aftoVar.b;
        super(afilVar, afihVar, afunVar.Q, afunVar.R, afunVar.S, afunVar.g(afemVar), afunVar.i.c(), afygVar, afrrVar, aftoVar.a);
    }

    @Override // defpackage.afyf
    public final Status b() {
        afum afumVar = this.d.b.B;
        synchronized (afumVar.a) {
            Status status = afumVar.c;
            if (status != null) {
                return status;
            }
            afumVar.b.add(this);
            return null;
        }
    }

    @Override // defpackage.afyf
    public final afoe g(afih afihVar, afeu afeuVar, int i, boolean z) {
        afem afemVarG = this.b.g(afeuVar);
        afev[] afevVarArrK = afrq.k(afemVarG);
        affp affpVarA = this.c.a();
        try {
            return this.d.b.A.b(this.a, afihVar, afemVarG, afevVarArrK);
        } finally {
            this.c.f(affpVarA);
        }
    }

    @Override // defpackage.afyf
    public final void j() {
        Status status;
        afum afumVar = this.d.b.B;
        synchronized (afumVar.a) {
            afumVar.b.remove(this);
            if (afumVar.b.isEmpty()) {
                status = afumVar.c;
                afumVar.b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            afumVar.d.A.f(status);
        }
    }
}
