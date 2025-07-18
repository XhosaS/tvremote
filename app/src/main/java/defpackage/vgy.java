package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgy implements vft {
    public final Context a;
    public final vrm b;
    public final String c = "com.google.android.katniss.TIKTOK_ACCOUNTS_MULTIPROCESS_BROADCAST";
    private final vft d;

    public vgy(Context context, vga vgaVar, vrm vrmVar) {
        this.a = context;
        this.d = vgaVar;
        this.b = vrmVar;
    }

    @Override // defpackage.vft
    public final zyd a(AccountId accountId) {
        int i = yyk.e;
        return ((vga) this.d).e(accountId, zcg.b);
    }

    @Override // defpackage.vft
    public final void b() {
        wvx wvxVarF = wzg.f("Notify requirement state changed", wwb.a, true);
        try {
            final Intent intent = new Intent("com.google.apps.tiktok.account.api.controller.REQUIREMENT_STATE_CHANGED");
            intent.setFlags(1073741824);
            intent.setPackage(this.a.getPackageName());
            final wyt wytVarB = wyt.b();
            wvxVarF.a(xt.a(new xq() { // from class: vgw
                @Override // defpackage.xq
                public final Object a(xo xoVar) {
                    vgx vgxVar = new vgx(wytVarB, xoVar);
                    wyo wyoVar = wyo.a;
                    vgy vgyVar = this.a;
                    Context context = vgyVar.a;
                    context.getClass();
                    Intent intent2 = new Intent(intent);
                    wyb wybVarO = wyo.o(intent2);
                    try {
                        context.sendOrderedBroadcast(intent2, vgyVar.c, new wyn(vgxVar), vgyVar.b, -1, null, null);
                        aguc.a(wybVarO, null);
                        return "MultiProcessAccountRequirementManager sendOrderedBroadcast";
                    } finally {
                    }
                }
            }));
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vft
    public final zyd c(AccountId accountId, yyk yykVar) {
        return ((vga) this.d).e(accountId, yykVar);
    }
}
