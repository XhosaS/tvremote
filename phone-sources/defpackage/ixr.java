package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ixr implements DialogInterface.OnClickListener {
    private final /* synthetic */ int a;

    public /* synthetic */ ixr(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 7:
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            case 5:
                int i2 = SherlogMenuButton.d;
                break;
            case 6:
                int i3 = SherlogMenuButton.d;
                break;
            case 8:
                dialogInterface.cancel();
                break;
            case 9:
                dialogInterface.dismiss();
                break;
            case 10:
                dialogInterface.dismiss();
                break;
            case 11:
                dialogInterface.dismiss();
                break;
            case 12:
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
