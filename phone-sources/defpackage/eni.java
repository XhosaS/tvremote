package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eni implements emu {
    private final eer a;
    private final hin b = new hin((byte[]) null);

    public eni(eer eerVar) {
        this.a = eerVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fjg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fjg, java.lang.Object] */
    @Override // defpackage.emu
    public final dze a(dze dzeVar) {
        hin hinVar = this.b;
        if (!hinVar.a || !hinVar.b.c(dzeVar)) {
            return dzeVar;
        }
        dzd dzdVar = new dzd(dzeVar);
        dzdVar.d("application/x-media3-cues");
        dzdVar.K = hinVar.b.a(dzeVar);
        String str = dzeVar.Y;
        String str2 = dzeVar.U;
        dzdVar.j = String.valueOf(str).concat(str2 != null ? " ".concat(str2) : "");
        dzdVar.r = Long.MAX_VALUE;
        return new dze(dzdVar);
    }

    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ void b(boolean z) {
        this.b.a = z;
    }

    @Override // defpackage.emu
    public final /* synthetic */ void c(fjg fjgVar) {
        this.b.b = fjgVar;
    }

    @Override // defpackage.emu
    public final enl d(ezy ezyVar, enr enrVar, iom iomVar, int i, int[] iArr, ezf ezfVar, int i2, long j, boolean z, List list, enn ennVar, efy efyVar) {
        ees eesVarA = this.a.a();
        if (efyVar != null) {
            eesVarA.f(efyVar);
        }
        return new enl(this.b, ezyVar, enrVar, iomVar, i, iArr, ezfVar, i2, eesVarA, j, z, list, ennVar);
    }
}
