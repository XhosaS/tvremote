package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjb {
    public final Context b;
    public final vyj c;
    public final vrm d;
    public final wxc f;
    public final String e = "com.google.android.katniss.TIKTOK_ACCOUNTS_MULTIPROCESS_BROADCAST";
    public final yrp a = yru.a(new yrp() { // from class: viy
        @Override // defpackage.yrp
        public final Object eV() {
            IntentFilter intentFilter = new IntentFilter("com.google.apps.tiktok.account.data.tiktok_account_data_source_changed");
            int i = Build.VERSION.SDK_INT;
            vjb vjbVar = this.a;
            if (i >= 33) {
                vjbVar.b.registerReceiver(new viz(vjbVar), intentFilter, vjbVar.e, vjbVar.d, 4);
            } else {
                vjbVar.b.registerReceiver(new vja(vjbVar), intentFilter, vjbVar.e, vjbVar.d);
            }
            return true;
        }
    });

    public vjb(Context context, vyj vyjVar, vrm vrmVar, wxc wxcVar) {
        this.b = context;
        this.c = vyjVar;
        this.d = vrmVar;
        this.f = wxcVar;
    }
}
