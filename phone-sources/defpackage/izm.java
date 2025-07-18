package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.googletv.app.internal.MaterialDialogActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class izm implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ izm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            Toast.makeText((MaterialDialogActivity) this.a, "Chose ".concat(String.valueOf(((String[]) this.b)[i])), 0).show();
            return;
        }
        if (i2 == 1) {
            Toast.makeText((MaterialDialogActivity) this.a, "Clicked ".concat(String.valueOf(((String[]) this.b)[i])), 0).show();
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ((vrj) this.b).d.a(((bv) this.a).getContext());
                return;
            } else if (i2 != 4) {
                bv bvVar = (bv) this.b;
                bvVar.getTargetFragment().onActivityResult(bvVar.getTargetRequestCode(), -1, (Intent) this.a);
                return;
            } else {
                bv bvVar2 = (bv) this.b;
                bvVar2.getTargetFragment().onActivityResult(bvVar2.getTargetRequestCode(), -1, (Intent) this.a);
                return;
            }
        }
        Object obj = this.a;
        irc ircVar = ((mnt) obj).c;
        if (ircVar == null) {
            yks.c("actionManager");
            ircVar = null;
        }
        wkg wkgVar = ((wpg) this.b).d;
        if (wkgVar == null) {
            wkgVar = wkg.a;
        }
        wkgVar.getClass();
        Context context = ((bv) obj).getContext();
        context.getClass();
        ircVar.e(wkgVar, context, "");
        dialogInterface.dismiss();
    }

    public /* synthetic */ izm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
