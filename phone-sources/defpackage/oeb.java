package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.apps.googletv.app.presentation.pages.webview.WebViewActivity;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeb extends ocg {
    public static final Parcelable.Creator<oeb> CREATOR = new obd(8);
    ParcelFileDescriptor a;
    final String b;
    final String c;
    byte[] d;
    public File e;

    public oeb(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    static final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        if (this.a == null) {
            File file = this.e;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.a = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    try {
                        try {
                            dataOutputStream.writeInt(this.d.length);
                            dataOutputStream.writeUTF(this.b);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.write(this.d);
                        } finally {
                            a(dataOutputStream);
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException("Could not write into unlinked file", e);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted.");
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not create temporary file:", e2);
            }
        }
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.a, i);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }

    public oeb(byte[] bArr) {
        this(null, WebViewActivity.URL_MIME_TYPE, "play_movies.txt");
        this.d = bArr;
    }
}
