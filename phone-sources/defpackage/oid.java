package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oid extends ocg {
    public static final Parcelable.Creator<oid> CREATOR = new oic();
    public byte[] a;
    public ParcelFileDescriptor b;

    public oid() {
        this.a = new byte[0];
    }

    public static void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oid) {
            return Arrays.equals(this.a, ((oid) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x009b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:156), block:B:41:0x009b */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        File file;
        byte[] bArr = this.a;
        Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.b == null) {
                    try {
                        try {
                            file = ocv.a;
                        } catch (IllegalStateException e) {
                            e = e;
                            dataOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (closeable2 != null) {
                                a(closeable2);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        dataOutputStream = null;
                    }
                    if (file == null) {
                        throw new IllegalStateException("Must set temp dir before writing this object to a parcel");
                    }
                    try {
                        File fileCreateTempFile = File.createTempFile("teleporter" + SystemClock.elapsedRealtime(), ".tmp", file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                            fileCreateTempFile.delete();
                            Pair pairCreate = Pair.create(fileOutputStream, parcelFileDescriptorOpen);
                            dataOutputStream = new DataOutputStream(new BufferedOutputStream((OutputStream) pairCreate.first));
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                parcelFileDescriptor = (ParcelFileDescriptor) pairCreate.second;
                                a(dataOutputStream);
                            } catch (IOException e3) {
                                e = e3;
                                Log.e("ParcelByteArray", hhh.c(e, "Could not write into unlinked file. "));
                                if (dataOutputStream != null) {
                                    a(dataOutputStream);
                                }
                                parcelFileDescriptor = null;
                                this.b = parcelFileDescriptor;
                                int iV = ocv.v(parcel);
                                ocv.N(parcel, 1, this.b, i | 1);
                                ocv.x(parcel, iV);
                                this.b = null;
                            } catch (IllegalStateException e4) {
                                e = e4;
                                Log.e("ParcelByteArray", hhh.c(e, "Could not create unlinked file. "));
                                if (dataOutputStream != null) {
                                    a(dataOutputStream);
                                }
                                parcelFileDescriptor = null;
                                this.b = parcelFileDescriptor;
                                int iV2 = ocv.v(parcel);
                                ocv.N(parcel, 1, this.b, i | 1);
                                ocv.x(parcel, iV2);
                                this.b = null;
                            }
                            this.b = parcelFileDescriptor;
                        } catch (FileNotFoundException e5) {
                            throw new IllegalStateException("Temporary file is somehow already deleted", e5);
                        }
                    } catch (IOException e6) {
                        throw new IllegalStateException("Could not create temporary file", e6);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        }
        int iV22 = ocv.v(parcel);
        ocv.N(parcel, 1, this.b, i | 1);
        ocv.x(parcel, iV22);
        this.b = null;
    }

    public oid(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new byte[0];
        this.b = parcelFileDescriptor;
    }
}
