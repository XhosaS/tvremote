package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itp implements ServiceConnection {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public itp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yoe] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Class<?> cls;
        int i = this.b;
        String canonicalName = null;
        kpv kpvVar = null;
        canonicalName = null;
        if (i != 0) {
            if (i != 1) {
                ((tfs) this.a).c(new tfq(this, iBinder));
                return;
            }
            int i2 = hiy.a;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                kpvVar = iInterfaceQueryLocalInterface instanceof kpv ? (kpv) iInterfaceQueryLocalInterface : new kpv(iBinder);
            }
            hif hifVar = (hif) this.a;
            hifVar.t = kpvVar;
            hifVar.s = 2;
            hifVar.E(26);
            return;
        }
        if (iBinder instanceof itn) {
            itk itkVar = ((itn) iBinder).a;
            if (itkVar == null) {
                this.a.resumeWith(ybn.e(new NullPointerException("MediaDeviceController received from service was null.")));
                return;
            } else {
                this.a.resumeWith(itkVar);
                return;
            }
        }
        ?? r3 = this.a;
        if (iBinder != null && (cls = iBinder.getClass()) != null) {
            canonicalName = cls.getCanonicalName();
        }
        r3.resumeWith(ybn.e(new IllegalArgumentException("Binder received was of type=".concat(String.valueOf(canonicalName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.b;
        if (i == 0) {
            ((tug) itq.a.e().h(tvo.a, "MediaDeviceControllerFromService").j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerFromServiceImpl$getMediaDeviceControllerFromForegroundService$2$serviceConnectionHandler$1", "onServiceDisconnected", 81, "MediaDeviceControllerFromServiceImpl.kt")).v("Service was disconnected. name=", componentName);
            return;
        }
        if (i != 1) {
            ((tfs) this.a).c(new tfr(this));
        } else {
            hiy.e("BillingClientTesting", "Billing Override Service disconnected.");
            hif hifVar = (hif) this.a;
            hifVar.t = null;
            hifVar.s = 0;
        }
    }
}
