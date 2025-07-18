package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrt extends obe {
    private final CastDevice a;
    private final long b;
    private final Bundle c;
    private final String d;

    static {
        new nsf("CastClientImplCxless");
    }

    public nrt(Context context, Looper looper, oav oavVar, CastDevice castDevice, long j, Bundle bundle, String str, nws nwsVar, nwt nwtVar) {
        super(context, looper, 10, oavVar, nwsVar, nwtVar);
        this.a = castDevice;
        this.b = j;
        this.c = bundle;
        this.d = str;
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 19390000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        return sew.g(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return nks.o;
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        nsf.e();
        this.a.f(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.b);
        bundle.putString("connectionless_client_record_id", this.d);
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final void n() {
        try {
            try {
                ((nsa) L()).a(ocv.q());
            } catch (RemoteException | IllegalStateException unused) {
                nsf.e();
            }
        } finally {
            super.n();
        }
    }
}
