package defpackage;

import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgq extends beb {
    public int a;
    public vhg b;
    public int c;
    public boolean d;
    public final boolean e;

    public vgq(bdl bdlVar) {
        bdlVar.getClass();
        this.a = -1;
        vhg vhgVar = vhg.a;
        vhgVar.getClass();
        this.b = vhgVar;
        Bundle bundle = (Bundle) bdlVar.b.b("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.e = true;
            this.a = bundle.getInt("state_account_id", -1);
            try {
                MessageLite messageLiteA = acas.a(bundle, "state_account_info", vhgVar, ExtensionRegistryLite.getGeneratedRegistry());
                messageLiteA.getClass();
                this.b = (vhg) messageLiteA;
                this.c = bundle.getInt("state_account_state", 0);
                this.d = bundle.getBoolean("tiktok_accounts_disabled");
            } catch (abxv e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        } else {
            this.e = false;
        }
        bdlVar.b.d("tiktok_activity_account_state_saved_instance_state", new bqn() { // from class: vgp
            @Override // defpackage.bqn
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                vgq vgqVar = this.a;
                bundle2.putInt("state_account_id", vgqVar.a);
                acas.b(bundle2, "state_account_info", vgqVar.b);
                bundle2.putInt("state_account_state", vgqVar.c);
                bundle2.putBoolean("tiktok_accounts_disabled", vgqVar.d);
                return bundle2;
            }
        });
    }
}
