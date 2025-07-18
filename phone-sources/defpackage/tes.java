package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tes extends ifk implements IInterface {
    final /* synthetic */ tfg a;
    public final kwy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tes(tfg tfgVar, kwy kwyVar) {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.a = tfgVar;
        this.b = kwyVar;
    }

    public void a(Bundle bundle) {
        tfs tfsVar = this.a.a;
        if (tfsVar != null) {
            tfsVar.f(this.b);
        }
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
        ifl.b(parcel);
        a(bundle);
        return true;
    }
}
