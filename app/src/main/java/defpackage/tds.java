package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tds {
    public static vtu a(final Context context, vft vftVar, Map map, Executor executor, Executor executor2) {
        return new vuv(context, vftVar, map, executor, executor2, new yqi() { // from class: tdr
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((tdq) wgv.a(context, tdq.class, (AccountId) obj)).f();
            }
        });
    }
}
