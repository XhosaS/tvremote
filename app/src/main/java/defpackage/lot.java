package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class lot extends lof {
    final /* synthetic */ Context a;
    final /* synthetic */ lvj b;
    private final WeakReference c;

    public lot(Context context, lvj lvjVar) {
        this.a = context;
        this.b = lvjVar;
        this.c = new WeakReference(context);
    }

    @Override // defpackage.lof, defpackage.loi
    public final void e(Status status, String str) {
        if (status.c()) {
            Intent intent = new Intent(str);
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            Context context = (Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            kid.a(status, null, this.b);
        }
    }
}
