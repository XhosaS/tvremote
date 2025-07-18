package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpk extends cpi {
    public int aL = 0;
    public int aM = 0;
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public boolean aR = false;
    public int aS = 0;
    public int aT = 0;
    protected final cpm aU = new cpm();
    cqf aV = null;

    @Override // defpackage.cpi
    public final void Y() {
        for (int i = 0; i < this.aK; i++) {
            cpd cpdVar = this.aJ[i];
            if (cpdVar != null) {
                cpdVar.H = true;
            }
        }
    }

    public final void Z(int i, int i2) {
        this.aS = i;
        this.aT = i2;
    }

    protected final void aa(cpd cpdVar, int i, int i2, int i3, int i4) {
        cqf cqfVar;
        cpd cpdVar2;
        while (true) {
            cqfVar = this.aV;
            if (cqfVar != null || (cpdVar2 = this.V) == null) {
                break;
            } else {
                this.aV = ((cpe) cpdVar2).aH;
            }
        }
        cpm cpmVar = this.aU;
        cpmVar.i = i;
        cpmVar.j = i3;
        cpmVar.a = i2;
        cpmVar.b = i4;
        cqfVar.a(cpdVar, cpmVar);
        cpdVar.E(cpmVar.c);
        cpdVar.z(cpmVar.d);
        cpdVar.G = cpmVar.f;
        cpdVar.w(cpmVar.e);
    }

    public void W(int i, int i2, int i3, int i4) {
    }
}
