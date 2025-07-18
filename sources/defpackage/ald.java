package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ald implements aho {
    private final /* synthetic */ int a;

    public /* synthetic */ ald(int i) {
        this.a = i;
    }

    @Override // defpackage.aho
    public final void a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            int i2 = alh.a;
            return;
        }
        if (i != 1) {
            amt amtVar = new amt((adx) obj2);
            anf anfVar = (anf) ((ank) obj).t();
            Parcel parcelC = anfVar.c();
            int i3 = acl.a;
            parcelC.writeStrongBinder(amtVar);
            anfVar.e(2, parcelC);
            return;
        }
        int i4 = alh.a;
        alj aljVar = (alj) ((alk) obj).t();
        ali aliVar = new ali((adx) obj2, 0);
        Parcel parcelC2 = aljVar.c();
        int i5 = acl.a;
        parcelC2.writeStrongBinder(aliVar);
        aljVar.e(27, parcelC2);
    }
}
