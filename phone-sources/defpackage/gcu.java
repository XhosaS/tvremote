package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.MaterialDialogActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.StreamingWarningDialogActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcu implements DialogInterface.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gcu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, yjk] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((gcv) obj).a = i;
                ((gde) obj).e = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                ((ie) this.a).c.l(true);
                break;
            case 2:
                ((ixp) this.a).b.a();
                break;
            case 3:
                Toast.makeText((MaterialDialogActivity) this.a, "Good choice", 0).show();
                break;
            case 4:
                Toast.makeText((MaterialDialogActivity) this.a, "Took the easy way out", 0).show();
                break;
            case 5:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked confirm", 0).show();
                break;
            case 6:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked dismiss", 0).show();
                break;
            case 7:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked neutral", 0).show();
                break;
            case 8:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked ok", 0).show();
                break;
            case 9:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked cancel", 0).show();
                break;
            case 10:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked discard", 0).show();
                break;
            case 11:
                Toast.makeText((MaterialDialogActivity) this.a, "Clicked cancel", 0).show();
                break;
            case 12:
                jdd jddVar = (jdd) this.a;
                jddVar.d().edit().putBoolean(krh.WARNING_STREAMING_BANDWIDTH, false).apply();
                jddVar.j().a.Q();
                dialogInterface.dismiss();
                break;
            case 13:
                dialogInterface.dismiss();
                ((jdd) this.a).j().a.Q();
                break;
            case 14:
                dialogInterface.dismiss();
                Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                intent.addFlags(268435456);
                ((bv) this.a).startActivity(intent);
                break;
            case 15:
                this.a.a();
                break;
            case 16:
                dialogInterface.dismiss();
                by byVarF = hju.F((Context) this.a);
                byVarF.getClass();
                byVarF.finish();
                break;
            case 17:
                Intent action = new Intent().setAction("android.intent.action.VIEW");
                Object obj2 = this.a;
                ((bv) obj2).startActivity(action.setData(((mnt) obj2).b));
                dialogInterface.dismiss();
                break;
            case 18:
                Intent intent2 = new Intent("android.settings.WIFI_SETTINGS");
                intent2.addFlags(268435456);
                ((StreamingWarningDialogActivity) this.a).startActivity(intent2);
                break;
            default:
                ((StreamingWarningDialogActivity) this.a).setResult(-1);
                break;
        }
    }

    public /* synthetic */ gcu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
