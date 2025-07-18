package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cgv extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;
    private static final String b = cbx.d("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cbx cbxVarC = cbx.c();
        String str = b;
        Objects.toString(intent);
        cbxVarC.a(str, "onReceive : ".concat(String.valueOf(intent)));
        context.startService(cgu.b(context));
    }
}
