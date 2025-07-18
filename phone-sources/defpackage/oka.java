package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oka extends oju {
    final /* synthetic */ Context a;
    final /* synthetic */ kwy b;
    private final WeakReference c;

    public oka(Context context, kwy kwyVar) {
        this.a = context;
        this.b = kwyVar;
        this.c = new WeakReference(context);
    }

    @Override // defpackage.oju
    public final void c(Status status, String str) {
        if (status.b()) {
            Intent intent = new Intent(str);
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            Context context = (Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            ocv.aS(status, null, this.b);
        }
    }
}
