package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldd extends mgq {
    @Override // defpackage.mgq, defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        ApiActivity apiActivity = (ApiActivity) getActivity();
        krd.e("User canceled convertion of ".concat(String.valueOf(apiActivity.b)));
        lze lzeVar = apiActivity.g;
        mfm.a(null);
        lzeVar.f.a();
        mfi mfiVar = mfi.a;
        lzeVar.f = mfiVar;
        lzeVar.g.a();
        lzeVar.g = mfiVar;
        apiActivity.a(0, new Throwable());
    }
}
