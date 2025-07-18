package defpackage;

import android.app.AppOpsManager;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.tv.remote.service.IAtvAudioProviderService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnu extends ack implements IAtvAudioProviderService {
    public final /* synthetic */ bqw a;

    public bnu() {
        super("com.google.android.tv.remote.service.IAtvAudioProviderService");
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        ParcelFileDescriptor[] parcelFileDescriptorArrH;
        if (i != 1) {
            return false;
        }
        bqw bqwVar = this.a;
        bqwVar.h++;
        PackageManager packageManager = bqwVar.e;
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
        if (!atg.l(packagesForUid, bqw.b)) {
            throw new SecurityException("Permission denied: unknown calling package");
        }
        AppOpsManager appOpsManager = bqwVar.d;
        bmr bmrVarA = null;
        if (appOpsManager != null) {
            if (appOpsManager.checkOp("android:record_audio", callingUid, packagesForUid[0]) != 0) {
                ((cbs) bqw.a.g().j("com/google/android/tv/remote/service/audio/provider/AudioProviderService$1", "verifyCaller", 105, "AudioProviderService.java")).p("Caller is not allowed to perform audio record");
            }
            parcel2.writeNoException();
            acl.d(parcel2, bmrVarA);
            return true;
        }
        bqwVar.c.enforceCallingPermission("android.permission.RECORD_AUDIO", "Caller is not allowed to perform audio record");
        bqp bqpVar = bqwVar.f.d;
        if (bqpVar == null) {
            ((cbs) bqw.a.b().j("com/google/android/tv/remote/service/audio/provider/AudioProviderService$1", "provideAudioStream", 119, "AudioProviderService.java")).p("No active audio device available");
        } else {
            bqz bqzVar = new bqz(bqwVar.g, callingUid, packagesForUid[0], new bsk(this, 1));
            if (bqzVar.b.b(bqzVar.c, false, bqzVar.f, bqzVar.g) && (parcelFileDescriptorArrH = bqz.h()) != null) {
                bqzVar.h = bqpVar.b(bqzVar);
                bqzVar.f(parcelFileDescriptorArrH);
                ((cbs) bqw.a.b().j("com/google/android/tv/remote/service/audio/provider/AudioProviderService$1", "provideAudioStream", 134, "AudioProviderService.java")).p("Created AudioStream");
                bqwVar.i++;
                bmq bmqVar = new bmq();
                bmqVar.e(16000);
                bmqVar.c(1);
                bmqVar.b(16);
                bmqVar.d(0);
                bmqVar.a = bqzVar.e();
                bmrVarA = bmqVar.a();
            }
        }
        parcel2.writeNoException();
        acl.d(parcel2, bmrVarA);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnu(bqw bqwVar) {
        super("com.google.android.tv.remote.service.IAtvAudioProviderService");
        this.a = bqwVar;
    }
}
