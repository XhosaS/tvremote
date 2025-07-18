package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.system.ErrnoException;
import j$.time.LocalDateTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmn extends agtu implements agvb {
    final /* synthetic */ gmq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmn(gmq gmqVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gmqVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gmn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws IOException, ErrnoException {
        FileOutputStream fileOutputStreamCreateOutputStream;
        agpl.b(obj);
        gmq gmqVar = this.a;
        LocalDateTime localDateTime = gmqVar.d.a().atZone(ztx.a).toLocalDateTime();
        Objects.toString(localDateTime);
        String strValueOf = String.valueOf(localDateTime);
        int i = Build.VERSION.SDK_INT;
        String strConcat = "katniss-primes-".concat(strValueOf);
        if (i <= 28) {
            gmqVar.e = new reo(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), strConcat));
        } else {
            Context context = gmqVar.b;
            ContentResolver contentResolver = gmqVar.c;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", strConcat);
            contentValues.put("mime_type", "text/plain");
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            contentValues.put("owner_package_name", context.getPackageName());
            Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (uriInsert != null) {
                try {
                    ((zdv) gmq.a.b().q("com/google/android/apps/tvsearch/logging/primes/transmitter/KatnissMetricTransmitter$maybeInitLocalStorageTransmitter$2$1", "invokeSuspend", 98, "KatnissMetricTransmitter.kt")).u("Creating entry for TVTS.");
                    AssetFileDescriptor assetFileDescriptorA = tpn.a(context, uriInsert, "w", tpm.a);
                    if (assetFileDescriptorA != null) {
                        try {
                            fileOutputStreamCreateOutputStream = assetFileDescriptorA.createOutputStream();
                        } catch (IOException e) {
                            FileNotFoundException fileNotFoundException = new FileNotFoundException("Unable to create stream");
                            fileNotFoundException.initCause(e);
                            tpn.b(assetFileDescriptorA, fileNotFoundException);
                            throw fileNotFoundException;
                        }
                    } else {
                        fileOutputStreamCreateOutputStream = null;
                    }
                    gmq gmqVar2 = this.a;
                    fileOutputStreamCreateOutputStream.getClass();
                    gmqVar2.e = new reo(fileOutputStreamCreateOutputStream);
                } catch (FileNotFoundException e2) {
                    ((zdv) ((zdv) gmq.a.c()).p(e2).q("com/google/android/apps/tvsearch/logging/primes/transmitter/KatnissMetricTransmitter$maybeInitLocalStorageTransmitter$2$1", "invokeSuspend", 104, "KatnissMetricTransmitter.kt")).u("Failed to open the file");
                }
            } else {
                ((zdv) gmq.a.c().q("com/google/android/apps/tvsearch/logging/primes/transmitter/KatnissMetricTransmitter$maybeInitLocalStorageTransmitter$2$1", "invokeSuspend", 107, "KatnissMetricTransmitter.kt")).u("Failed to insert to MediaStore.");
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gmn(this.a, agswVar);
    }
}
