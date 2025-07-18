package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fna implements ecl {
    public final ecl a;
    public cvi b;

    public fna(ecl eclVar) {
        this.a = eclVar;
    }

    @Override // defpackage.ecl
    public final uhp a(byte[] bArr) {
        Object obj;
        cvi cviVar = this.b;
        if (cviVar != null && (obj = cviVar.b) != null && Arrays.equals((byte[]) obj, bArr)) {
            return this.b.M();
        }
        uhp uhpVarSubmit = ((eeu) this.a).b.submit(new eet(bArr, 0));
        this.b = new cvi(bArr, uhpVarSubmit);
        return uhpVarSubmit;
    }
}
