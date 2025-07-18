package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujd implements oab {
    private final /* synthetic */ int a;

    public ujd(int i) {
        this.a = i;
    }

    @Override // defpackage.oab
    public final Exception a(Status status) {
        return this.a != 0 ? ocv.aL(status) : status.f == 8 ? new ujc(status.a()) : new uiw(status.a());
    }
}
