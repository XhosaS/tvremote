package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gou extends vww {
    private final Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gou(Context context, Executor executor, wxc wxcVar) {
        super(wxcVar, "DeviceNameObserver", executor);
        context.getClass();
        executor.getClass();
        wxcVar.getClass();
        this.a = context;
    }

    @Override // defpackage.vww
    public final void a(boolean z, Uri uri) {
        Intent intent = new Intent("com.google.android.apps.tvsearch.observers.DEVICE_NAME_UPDATED");
        ComponentName componentName = irm.a;
        Intent component = intent.setComponent(irm.g);
        component.getClass();
        this.a.sendBroadcast(component);
    }
}
