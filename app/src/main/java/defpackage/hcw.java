package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.slice.Slice;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcw implements usc {
    private final hcq a;
    private final Context b;

    public hcw(hcq hcqVar, Context context) {
        hcqVar.getClass();
        context.getClass();
        this.a = hcqVar;
        this.b = context;
    }

    @Override // defpackage.usc
    public final Slice a(Uri uri) {
        cxf cxfVar = new cxf(uri);
        hcx hcxVarA = this.a.a();
        cxe cxeVar = new cxe();
        Context context = this.b;
        cxeVar.e = context.getString(R.string.slice_broadcast_title);
        cxeVar.c = ahow.SYSTEM_ASSISTANT_BROADCAST.fV;
        cxfVar.a.b(cxeVar, "TYPE_PREFERENCE_SCREEN_TITLE");
        cxe cxeVar2 = new cxe();
        cxeVar2.p = "KEY_BROADCAST_ENABLE_TOGGLE";
        cxeVar2.e = context.getString(R.string.slice_broadcast_enable);
        cxeVar2.c = ahow.SYSTEM_ASSISTANT_BROADCAST_ENABLE.fV;
        Intent intent = new Intent("ACTION_BROADCAST_ENABLE_CHANGED");
        ComponentName componentName = irm.a;
        Intent data = intent.setComponent(irm.d).putExtra("display_id", uri.getLastPathSegment()).setData(uri);
        data.getClass();
        cxeVar2.c(tpf.b(context, data, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0, 5), hcxVarA != null ? hcxVarA.a : true, 0);
        cxfVar.a.b(cxeVar2, "TYPE_PREFERENCE");
        return cxfVar.d();
    }

    @Override // defpackage.usc
    public final void b(Uri uri) {
        uri.toString();
        this.a.d();
    }

    @Override // defpackage.usc
    public final void c(Uri uri) {
        uri.toString();
        this.a.b();
    }
}
