package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bul extends ack implements IInterface {
    final /* synthetic */ Context a;
    final /* synthetic */ bny b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bul(Context context, bny bnyVar) {
        super("com.google.android.tv.remote.virtual.host.gboard.ipc.IImeEntryPoint");
        this.a = context;
        this.b = bnyVar;
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        bum bumVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            bumVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.tv.remote.virtual.host.gboard.ipc.IImeRequestHandler");
            bumVar = iInterfaceQueryLocalInterface instanceof bum ? (bum) iInterfaceQueryLocalInterface : new bum(strongBinder);
        }
        acl.b(parcel);
        Context context = this.a;
        int callingUid = Binder.getCallingUid();
        if (!afq.b(context).c(callingUid)) {
            ((cbs) boq.a.f().j("com/google/android/tv/remote/service/IpcImeService$1", "connect", 41, "IpcImeService.java")).t("Non-Google app %s is trying to get access to a sensitive API", context.getPackageManager().getNameForUid(callingUid));
            throw new SecurityException("API access is not allowed");
        }
        ((cbs) ((cbs) boq.a.e().g(btt.a)).j("com/google/android/tv/remote/service/IpcImeService$1", "connect", 46, "IpcImeService.java")).p("Incoming IPC connection from IME service");
        ali aliVar = new ali(new boq(this.b, bumVar), 4);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(aliVar);
        return true;
    }

    public bul() {
        super("com.google.android.tv.remote.virtual.host.gboard.ipc.IImeEntryPoint");
    }
}
