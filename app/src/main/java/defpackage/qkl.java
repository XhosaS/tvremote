package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qkl extends qku {
    public qkl(final Context context, final ScheduledExecutorService scheduledExecutorService) {
        super(new yrp() { // from class: qkk
            @Override // defpackage.yrp
            public final Object eV() {
                Context context2 = context;
                return new qlk(scheduledExecutorService, new uqn(context2, "STREAMZ_ONEGOOGLE_ANDROID"), context2 instanceof Application ? (Application) context2 : null);
            }
        });
    }
}
