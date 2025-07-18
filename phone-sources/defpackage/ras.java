package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ras implements View.OnClickListener {
    private final /* synthetic */ int a;

    public /* synthetic */ ras(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                view.getContext().startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("http://support.google.com/googletv?p=watch_purchase_gtv")));
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    Property property = rme.a;
                    return;
                }
                shh shhVar = new shh();
                shhVar.a(new siu(vgl.a));
                shhVar.c(null);
                throw null;
            }
        }
    }
}
