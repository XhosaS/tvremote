package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nqb implements nqd {
    final /* synthetic */ Status a;
    private final /* synthetic */ int b;

    public nqb(Status status, int i) {
        this.b = i;
        this.a = status;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.b != 0 ? this.a : this.a;
    }
}
