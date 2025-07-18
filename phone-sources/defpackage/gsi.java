package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gsi extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        gpn.a("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gpn.b();
        Objects.toString(intent);
        context.startService(gsh.b(context));
    }
}
