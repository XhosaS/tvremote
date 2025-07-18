package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohw extends ifk implements IInterface {
    public ohw() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    public final synchronized void a(ohz ohzVar) {
        String str;
        if (ohzVar.d != null && ((str = ohzVar.a) == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str))) {
            throw null;
        }
        String str2 = ohzVar.a;
        throw null;
    }

    public final synchronized void b(oia oiaVar) {
        String str = oiaVar.a;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c() {
        is isVar = new is(null);
        if (!isVar.hasNext()) {
            throw null;
        }
        throw null;
    }

    public final synchronized void d() {
        throw null;
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            ohz ohzVar = (ohz) ifl.a(parcel, ohz.CREATOR);
            ifl.b(parcel);
            a(ohzVar);
            return true;
        }
        if (i == 3) {
            oia oiaVar = (oia) ifl.a(parcel, oia.CREATOR);
            ifl.b(parcel);
            b(oiaVar);
            return true;
        }
        if (i == 4) {
            ifl.b(parcel);
            return true;
        }
        if (i != 5) {
            return false;
        }
        ifl.b(parcel);
        d();
        return true;
    }
}
