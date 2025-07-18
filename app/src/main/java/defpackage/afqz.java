package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afqz extends afvn {
    private boolean b;
    private final Status c;
    private final afof d;
    private final afev[] e;

    public afqz(Status status, afof afofVar, afev[] afevVarArr) {
        yqw.B(!status.e(), "error must not be OK");
        this.c = status;
        this.d = afofVar;
        this.e = afevVarArr;
    }

    @Override // defpackage.afvn, defpackage.afoe
    public final void m(afry afryVar) {
        afryVar.b("error", this.c);
        afryVar.b("progress", this.d);
    }

    @Override // defpackage.afvn, defpackage.afoe
    public final void u(afog afogVar) {
        yqw.M(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            afev[] afevVarArr = this.e;
            if (i >= afevVarArr.length) {
                afogVar.a(this.c, this.d, new afih());
                return;
            } else {
                afev afevVar = afevVarArr[i];
                i++;
            }
        }
    }
}
