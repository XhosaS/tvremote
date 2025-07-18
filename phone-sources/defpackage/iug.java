package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iug extends sqg {
    final /* synthetic */ iui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iug(iui iuiVar, Context context) {
        super(context, R.style.MediaDeviceBottomSheetDialogStyle);
        this.a = iuiVar;
    }

    @Override // defpackage.sqg, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        yjk yjkVar = this.a.f;
        if (yjkVar != null) {
            yjkVar.a();
        }
    }
}
