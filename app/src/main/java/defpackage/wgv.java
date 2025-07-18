package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgv {
    public static Object a(Context context, Class cls, AccountId accountId) {
        Object obj;
        wij wijVarEu = ((wgu) wgw.a(context.getApplicationContext(), wgu.class)).eu();
        Map map = wijVarEu.a;
        synchronized (map) {
            if (!map.containsKey(accountId)) {
                eto etoVar = (eto) wijVarEu.b.a();
                etoVar.b = accountId;
                map.put(accountId, new etr(etoVar.a, etoVar.b));
            }
            obj = map.get(accountId);
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }
}
