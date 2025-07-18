package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmp implements emu {
    private final eer a;
    private final enz b;
    private fdg c;
    private final lml d;

    public lmp(enz enzVar, lml lmlVar, eer eerVar) {
        this.b = enzVar;
        this.d = lmlVar;
        this.a = eerVar;
    }

    @Override // defpackage.emu
    public final enl d(ezy ezyVar, enr enrVar, iom iomVar, int i, int[] iArr, ezf ezfVar, int i2, long j, boolean z, List list, enn ennVar, efy efyVar) {
        int i3;
        egh eghVarA = ((egg) this.a).a();
        if (efyVar != null) {
            eghVarA.f(efyVar);
        }
        if (this.c != null) {
            i3 = i2;
        } else {
            try {
                i3 = i2;
                try {
                    fdg fdgVarD = clw.D(eghVarA, i3, this.b);
                    this.c = fdgVarD;
                    if (fdgVarD != null) {
                        this.d.a(fdgVarD);
                    } else {
                        krd.f("No Trunk Index found for source: ".concat(String.valueOf(this.d.b)));
                    }
                } catch (IOException e) {
                    e = e;
                    krd.c("Could not get Trunk Index: " + this.d.b + " " + e.getMessage());
                    e.printStackTrace();
                    return new enl(exo.b, ezyVar, enrVar, iomVar, i, iArr, ezfVar, i3, eghVarA, j, z, list, ennVar);
                }
            } catch (IOException e2) {
                e = e2;
                i3 = i2;
            }
        }
        return new enl(exo.b, ezyVar, enrVar, iomVar, i, iArr, ezfVar, i3, eghVarA, j, z, list, ennVar);
    }

    @Override // defpackage.emu
    public final /* synthetic */ dze a(dze dzeVar) {
        return dzeVar;
    }

    @Override // defpackage.emu
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.emu
    public final /* synthetic */ void c(fjg fjgVar) {
    }
}
