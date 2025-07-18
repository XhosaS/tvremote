package defpackage;

import android.accounts.Account;
import com.google.android.apps.tvsearch.providers.launcher.WidgetInfoProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hch extends agtu implements agvb {
    int a;
    final /* synthetic */ WidgetInfoProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(WidgetInfoProvider widgetInfoProvider, agsw agswVar) {
        super(2, agswVar);
        this.b = widgetInfoProvider;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hch) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gtu gtuVar = this.b.b;
            if (gtuVar == null) {
                agvy.b("katnissAccountManager");
                gtuVar = null;
            }
            this.a = 1;
            obj = gtuVar.j(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        Account account = (Account) obj;
        String str = account != null ? account.name : null;
        return str == null ? "" : str;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hch(this.b, agswVar);
    }
}
