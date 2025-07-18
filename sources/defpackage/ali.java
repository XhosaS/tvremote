package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.gms.common.api.Status;
import com.google.android.tv.remote.service.AtvSearchAssistantService;
import com.google.android.tv.remote.service.RemoteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ali extends ack implements IInterface {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ali(adx adxVar, int i) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = i;
        this.a = adxVar;
    }

    private final void b(Runnable runnable) {
        boq boqVar = (boq) this.a;
        if (boqVar.c) {
            boqVar.b.post(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.b;
        int iH = 0;
        iH = 0;
        if (i2 == 0) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) acl.a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            acl.b(parcel);
            if (!status.a()) {
                qp.v(status, null, (adx) this.a);
                return true;
            }
            try {
                cli cliVar = cli.a;
                cni cniVar = cni.a;
                clt cltVarQ = clt.q(bbv.a, bArrCreateByteArray, 0, bArrCreateByteArray.length, cli.a);
                clt.B(cltVarQ);
                qp.v(status, (bbv) cltVarQ, (adx) this.a);
                return true;
            } catch (cmh e) {
                ((adx) this.a).e(e);
                return true;
            }
        }
        if (i2 == 1) {
            if (i != 2) {
                return false;
            }
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            acl.b(parcel);
            ((ahi) this.a).a(new alg(bArrCreateByteArray2));
            return true;
        }
        if (i2 == 2) {
            if (i == 1) {
                cbt cbtVar = AtvSearchAssistantService.a;
                ((cbs) ((cbs) cbtVar.b().g(btt.a)).j("com/google/android/tv/remote/service/AtvSearchAssistantService$SetupServiceBinder", "isSearchAssistantSetup", 91, "AtvSearchAssistantService.java")).p("isSearchAssistantSetup()");
                Object obj = this.a;
                if (atg.m((Context) obj, bnf.a())) {
                    RemoteService remoteService = ((AtvSearchAssistantService) obj).b;
                    if (remoteService == null) {
                        ((cbs) cbtVar.f().j("com/google/android/tv/remote/service/AtvSearchAssistantService", "isSearchAssistantSetupLocal", 72, "AtvSearchAssistantService.java")).p("Local Callback interface is not set.");
                    } else {
                        iH = remoteService.h();
                    }
                } else {
                    ((cbs) cbtVar.f().j("com/google/android/tv/remote/service/AtvSearchAssistantService$SetupServiceBinder", "isSearchAssistantSetup", 99, "AtvSearchAssistantService.java")).t("Unknown caller: %s", ((AtvSearchAssistantService) obj).getApplicationContext().getPackageManager().getNameForUid(Binder.getCallingUid()));
                }
                parcel2.writeNoException();
                int i3 = acl.a;
                parcel2.writeInt(iH);
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i4 = parcel.readInt();
            acl.b(parcel);
            cbt cbtVar2 = AtvSearchAssistantService.a;
            cch cchVarB = cbtVar2.b();
            cck cckVar = btt.a;
            ((cbs) ((cbs) cchVarB.g(cckVar)).j("com/google/android/tv/remote/service/AtvSearchAssistantService$SetupServiceBinder", "sendKeyEvent", 107, "AtvSearchAssistantService.java")).r("sendKeyEvent: keyCode: %d", i4);
            Object obj2 = this.a;
            if (!atg.m((Context) obj2, bnf.a())) {
                ((cbs) cbtVar2.f().j("com/google/android/tv/remote/service/AtvSearchAssistantService$SetupServiceBinder", "sendKeyEvent", 118, "AtvSearchAssistantService.java")).t("Unknown caller: %s", ((AtvSearchAssistantService) obj2).getApplicationContext().getPackageManager().getNameForUid(Binder.getCallingUid()));
            } else if (bnf.a.contains(Integer.valueOf(i4))) {
                ((cbs) ((cbs) cbtVar2.b().g(cckVar)).j("com/google/android/tv/remote/service/AtvSearchAssistantService", "sendKeyEventLocal", 62, "AtvSearchAssistantService.java")).r("sendKeyEventLocal() keyCode: %s", i4);
                RemoteService remoteService2 = ((AtvSearchAssistantService) obj2).b;
                if (remoteService2 == null) {
                    ((cbs) cbtVar2.f().j("com/google/android/tv/remote/service/AtvSearchAssistantService", "sendKeyEventLocal", 64, "AtvSearchAssistantService.java")).p("Local Callback interface is not set.");
                } else {
                    remoteService2.c(i4);
                }
            } else {
                ((cbs) cbtVar2.f().j("com/google/android/tv/remote/service/AtvSearchAssistantService", "isKeyCodeSupported", 80, "AtvSearchAssistantService.java")).r("Unsupported keycode [%d] request denied", i4);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 3) {
            if (i == 1) {
                int i5 = parcel.readInt();
                acl.b(parcel);
                ((box) this.a).a(1, i5);
            } else if (i == 2) {
                int i6 = parcel.readInt();
                acl.b(parcel);
                ((box) this.a).a(2, i6);
            } else {
                if (i != 3) {
                    return false;
                }
                int i7 = parcel.readInt();
                acl.b(parcel);
                ((box) this.a).a(3, i7);
            }
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 1:
                bny bnyVar = ((boq) this.a).d;
                bnyVar.getClass();
                b(new bid(bnyVar, 10));
                return true;
            case 2:
                final int i8 = parcel.readInt();
                final EditorInfo editorInfo = (EditorInfo) acl.a(parcel, EditorInfo.CREATOR);
                final int i9 = parcel.readInt();
                final ExtractedText extractedText = (ExtractedText) acl.a(parcel, ExtractedText.CREATOR);
                acl.b(parcel);
                b(new Runnable() { // from class: bom
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((boq) this.e.a).d.h(i8, editorInfo, i9, extractedText);
                    }
                });
                return true;
            case 3:
                int i10 = parcel.readInt();
                ExtractedText extractedText2 = (ExtractedText) acl.a(parcel, ExtractedText.CREATOR);
                acl.b(parcel);
                b(new bee(this, i10, extractedText2, 4));
                return true;
            case 4:
                final int i11 = parcel.readInt();
                final int i12 = parcel.readInt();
                acl.b(parcel);
                b(new Runnable() { // from class: boo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((boq) this.c.a).d.i(i11, i12);
                    }
                });
                return true;
            case 5:
                int i13 = parcel.readInt();
                CompletionInfo[] completionInfoArr = (CompletionInfo[]) parcel.createTypedArray(CompletionInfo.CREATOR);
                acl.b(parcel);
                b(new bee(this, i13, completionInfoArr, 3));
                return true;
            case 6:
                final boolean zE = acl.e(parcel);
                final int i14 = parcel.readInt();
                acl.b(parcel);
                b(new Runnable() { // from class: bon
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((boq) this.c.a).d.j(zE, i14);
                    }
                });
                return true;
            case 7:
                Object obj3 = this.a;
                ((boq) obj3).b.post(new bid(this, 11));
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ali(ahi ahiVar, int i) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = i;
        this.a = ahiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ali(AtvSearchAssistantService atvSearchAssistantService, int i) {
        super("com.google.android.tv.remote.service.IAtvSearchAssistantService");
        this.b = i;
        this.a = atvSearchAssistantService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ali(boq boqVar, int i) {
        super("com.google.android.tv.remote.virtual.host.gboard.ipc.IImeService");
        this.b = i;
        this.a = boqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ali(box boxVar, int i) {
        super("com.google.android.tv.remote.service.IOnscreenRemoteService");
        this.b = i;
        this.a = boxVar;
    }
}
