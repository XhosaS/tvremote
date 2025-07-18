package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oox implements nxc {
    public final oou a;
    private final Status b;

    public oox(Status status, oou oouVar) {
        this.b = status;
        this.a = oouVar;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.b;
    }

    public final String toString() {
        oou oouVar = this.a;
        ocv.aF(oouVar);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(oouVar.a == 1));
    }
}
