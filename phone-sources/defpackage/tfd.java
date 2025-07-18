package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tfd implements tfp {
    private final /* synthetic */ int a;

    @Override // defpackage.tfp
    public final Object a(IBinder iBinder) {
        if (this.a != 0) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            return iInterfaceQueryLocalInterface instanceof tep ? (tep) iInterfaceQueryLocalInterface : new tep(iBinder);
        }
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface2 instanceof ter ? (ter) iInterfaceQueryLocalInterface2 : new ter(iBinder);
    }
}
