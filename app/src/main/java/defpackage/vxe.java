package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxe {
    public final vsw a;
    public final Context b;
    public final vyj c;
    public final zyg d;
    public final wxc e;
    public final Executor f;

    public vxe(vsw vswVar, Context context, vyj vyjVar, zyg zygVar, wxc wxcVar, Executor executor) {
        this.a = vswVar;
        this.b = context;
        this.c = vyjVar;
        this.d = zygVar;
        this.e = wxcVar;
        this.f = executor;
    }

    public final void a(Uri uri, boolean z, vww vwwVar) {
        this.b.getContentResolver().registerContentObserver(uri, z, vwwVar);
    }

    public final void b(vww vwwVar) {
        this.b.getContentResolver().unregisterContentObserver(vwwVar);
    }
}
