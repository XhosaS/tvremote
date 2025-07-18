package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enn implements fel {
    public final eww a;
    public final /* synthetic */ eno c;
    private final hig e = new hig();
    private final ffq d = new ffq();
    public long b = -9223372036854775807L;

    public enn(eno enoVar, ezp ezpVar) {
        this.c = enoVar;
        this.a = new eww(ezpVar, null, null);
    }

    @Override // defpackage.fel
    public final /* synthetic */ int a(dyu dyuVar, int i, boolean z) {
        return fki.L(this, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final void b(dze dzeVar) {
        this.a.b(dzeVar);
    }

    @Override // defpackage.fel
    public final /* synthetic */ void c(edi ediVar, int i) {
        fki.M(this, ediVar, i);
    }

    @Override // defpackage.fel
    public final void d(edi ediVar, int i, int i2) {
        fki.M(this.a, ediVar, i);
    }

    @Override // defpackage.fel
    public final void e(long j, int i, int i2, int i3, fek fekVar) {
        long jZ;
        eww ewwVar = this.a;
        ewwVar.e(j, i, i2, i3, fekVar);
        while (ewwVar.F(false)) {
            ffq ffqVar = this.d;
            ffqVar.clear();
            if (ewwVar.J(this.e, ffqVar, 0, false) == -4) {
                ffqVar.b();
            } else {
                ffqVar = null;
            }
            if (ffqVar != null) {
                eno enoVar = this.c;
                long j2 = ffqVar.e;
                ead eadVarA = enoVar.a.a(ffqVar);
                if (eadVarA != null) {
                    ffu ffuVar = (ffu) eadVarA.b(0);
                    String str = ffuVar.a;
                    String str2 = ffuVar.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jZ = edt.z(edt.S(ffuVar.e));
                        } catch (eaf unused) {
                            jZ = -9223372036854775807L;
                        }
                        if (jZ != -9223372036854775807L) {
                            fhk fhkVar = new fhk(j2, jZ);
                            Handler handler = this.c.b;
                            handler.sendMessage(handler.obtainMessage(1, fhkVar));
                        }
                    }
                }
            }
        }
        eww ewwVar2 = this.a;
        ewwVar2.a.c(ewwVar2.n());
    }

    @Override // defpackage.fel
    public final int g(dyu dyuVar, int i, boolean z) {
        return fki.L(this.a, dyuVar, i, z);
    }

    @Override // defpackage.fel
    public final /* synthetic */ void f() {
    }
}
