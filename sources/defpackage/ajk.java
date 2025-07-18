package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajk implements aho {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.aho
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            ajj ajjVar = (ajj) ((ajn) obj).t();
            Parcel parcelC = ajjVar.c();
            acl.c(parcelC, this.a);
            ajjVar.f(1, parcelC);
            ((adx) obj2).f(null);
            return;
        }
        if (i == 1) {
            AtomicBoolean atomicBoolean = aed.a;
            aea aeaVar = new aea((adx) obj2);
            aeh aehVar = (aeh) ((aee) obj).t();
            Parcel parcelC2 = aehVar.c();
            int i2 = acl.a;
            parcelC2.writeStrongBinder(aeaVar);
            acl.c(parcelC2, this.a);
            aehVar.f(8, parcelC2);
            return;
        }
        if (i == 2) {
            int i3 = alh.a;
            ((alj) ((alk) obj).t()).a(new ane((adx) obj2, 1), (String) this.a);
        } else {
            if (i != 3) {
                agb agbVar = (agb) this.a;
                ((ank) obj).F(((amz) agbVar.d).b, null, new amv(agbVar, (adx) obj2));
                return;
            }
            int i4 = alh.a;
            ane aneVar = new ane((adx) obj2, 1);
            alj aljVar = (alj) ((alk) obj).t();
            byte[] bArrG = ((cke) this.a).g();
            Parcel parcelC3 = aljVar.c();
            int i5 = acl.a;
            parcelC3.writeStrongBinder(aneVar);
            parcelC3.writeByteArray(bArrG);
            aljVar.e(31, parcelC3);
        }
    }
}
