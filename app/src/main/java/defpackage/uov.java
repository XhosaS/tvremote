package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uov {
    private final agow a;
    private final agow b;
    private final agow c;

    public uov(agow agowVar, agow agowVar2, agow agowVar3) {
        this.a = agowVar;
        this.b = agowVar2;
        this.c = agowVar3;
    }

    public final uot a(final String str, uqe uqeVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.a();
        scheduledExecutorService.getClass();
        upu upuVar = (upu) this.c.a();
        upuVar.getClass();
        zvh zvhVar = new zvh() { // from class: uou
            @Override // defpackage.zvh
            public final zyd a() {
                return zxn.h(str);
            }
        };
        uqeVar.getClass();
        return new uot(new upv(context, scheduledExecutorService, upuVar, zvhVar, uqeVar));
    }
}
