package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aflv extends aflw {
    public Status a;
    public afih b;

    public aflv(afla aflaVar, int i, afzw afzwVar) {
        super(aflaVar, i, afzwVar);
    }

    @Override // defpackage.aflw
    protected final int a(Parcel parcel) {
        int iA = afma.a(parcel, this.a);
        aflo.a(parcel, this.b);
        this.c.m(this.d);
        return iA;
    }

    @Override // defpackage.aflw
    protected final void b(Parcel parcel) {
        aflo.a(parcel, null);
    }
}
