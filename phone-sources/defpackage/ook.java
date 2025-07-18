package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ook implements nzz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ook(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nzz
    public final void a(Object obj, Object obj2) {
        if (this.b == 0) {
            nwq nwqVar = (nwq) this.a;
            ((opa) obj).m(((oor) nwqVar.y).a, null, new oon(nwqVar, (kwy) obj2));
            return;
        }
        int i = omi.a;
        omo omoVar = new omo((kwy) obj2);
        omp ompVar = (omp) ((omq) obj).L();
        byte[] bArrH = ((vsg) this.a).h();
        Parcel parcelK = ompVar.k();
        ifl.e(parcelK, omoVar);
        parcelK.writeByteArray(bArrH);
        ompVar.m(31, parcelK);
    }
}
