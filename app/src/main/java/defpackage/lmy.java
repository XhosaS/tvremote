package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lmy extends kes {
    public lmy(Context context) {
        super(context, null, lmq.a, kee.a, ker.a);
    }

    public final lvf a(Uri uri) {
        final DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri);
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lms
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lnc lncVar = (lnc) obj;
                lvj lvjVar = (lvj) obj2;
                lmv lmvVar = new lmv(lvjVar);
                DeleteFileRequest deleteFileRequest2 = deleteFileRequest;
                try {
                    lmo lmoVar = (lmo) lncVar.v();
                    Context context = lncVar.b;
                    ApiMetadata apiMetadataA = knv.a();
                    Parcel parcelA = lmoVar.a();
                    erv.c(parcelA, lmvVar);
                    erv.b(parcelA, deleteFileRequest2);
                    erv.b(parcelA, apiMetadataA);
                    lmoVar.J(2, parcelA);
                } catch (RemoteException unused) {
                    kid.a(Status.c, null, lvjVar);
                }
            }
        };
        kibVar.c = new Feature[]{knr.c};
        kibVar.d = 7802;
        return super.g(0, kibVar.a());
    }

    public final lvf b(Uri uri, int i) {
        final OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri, i);
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lmt
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lnc lncVar = (lnc) obj;
                lvj lvjVar = (lvj) obj2;
                lmu lmuVar = new lmu(lvjVar);
                OpenFileDescriptorRequest openFileDescriptorRequest2 = openFileDescriptorRequest;
                try {
                    lmo lmoVar = (lmo) lncVar.v();
                    Context context = lncVar.b;
                    ApiMetadata apiMetadataA = knv.a();
                    Parcel parcelA = lmoVar.a();
                    erv.c(parcelA, lmuVar);
                    erv.b(parcelA, openFileDescriptorRequest2);
                    erv.b(parcelA, apiMetadataA);
                    lmoVar.J(1, parcelA);
                } catch (RemoteException unused) {
                    kid.a(Status.c, null, lvjVar);
                }
            }
        };
        kibVar.c = i == 1 ? new Feature[]{knr.c} : null;
        kibVar.d = 7801;
        return super.g(0, kibVar.a());
    }

    public final lvf c(Uri uri, Uri uri2) {
        final RenameRequest renameRequest = new RenameRequest(uri, uri2);
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lmr
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lnc lncVar = (lnc) obj;
                lvj lvjVar = (lvj) obj2;
                lmw lmwVar = new lmw(lvjVar);
                RenameRequest renameRequest2 = renameRequest;
                try {
                    lmo lmoVar = (lmo) lncVar.v();
                    Context context = lncVar.b;
                    ApiMetadata apiMetadataA = knv.a();
                    Parcel parcelA = lmoVar.a();
                    erv.c(parcelA, lmwVar);
                    erv.b(parcelA, renameRequest2);
                    erv.b(parcelA, apiMetadataA);
                    lmoVar.J(3, parcelA);
                } catch (RemoteException unused) {
                    kid.a(Status.c, null, lvjVar);
                }
            }
        };
        kibVar.c = new Feature[]{knr.d};
        kibVar.b = false;
        kibVar.d = 7803;
        return super.g(0, kibVar.a());
    }
}
