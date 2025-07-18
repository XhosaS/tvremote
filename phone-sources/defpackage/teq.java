package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class teq extends ifk implements IInterface {
    final /* synthetic */ teo b;
    public final kwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teq(teo teoVar, kwy kwyVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.b = teoVar;
        this.c = kwyVar;
    }

    public void a(Bundle bundle) {
        this.b.a.f(this.c);
    }

    public void b(Bundle bundle) {
        this.b.a.f(this.c);
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
            ifl.b(parcel);
            b(bundle);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
        ifl.b(parcel);
        a(bundle2);
        return true;
    }
}
