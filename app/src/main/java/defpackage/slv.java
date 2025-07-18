package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaSyncEvent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slv extends AudioRecord {
    public final Context b;
    public final int c;
    private final yrp e;
    private static final zdy d = zdy.h("com/google/android/libraries/search/audio/extensions/apps/emulatormicrophone/EmulatedUriAudioRecord");
    public static final Uri a = Uri.parse("content://com.google.android.apps.gsa.testing.ui.audio.recorded/emulated_mic_audio");

    public slv(int i, Context context) {
        super(1999, i, 16, 2, 128000);
        this.e = yru.a(new yrp() { // from class: slu
            @Override // defpackage.yrp
            public final Object eV() {
                slv slvVar = this.a;
                ContentResolver contentResolver = slvVar.b.getContentResolver();
                if (contentResolver == null) {
                    zer zerVar = zfi.a;
                    return ypv.a;
                }
                try {
                    return yqt.i(new ParcelFileDescriptor.AutoCloseInputStream(contentResolver.openFileDescriptor(Uri.withAppendedPath(slv.a, String.valueOf(slvVar.c)), "r")));
                } catch (FileNotFoundException unused) {
                    zer zerVar2 = zfi.a;
                    return ypv.a;
                }
            }
        });
        this.c = i;
        this.b = context;
    }

    @Override // android.media.AudioRecord
    public final int getRecordingState() {
        return 3;
    }

    @Override // android.media.AudioRecord
    public final int read(byte[] bArr, int i, int i2) {
        yqt yqtVar = (yqt) this.e.eV();
        if (!yqtVar.g()) {
            int iMin = Math.min(bArr.length, i2 + i);
            Arrays.fill(bArr, i, iMin, (byte) 0);
            return iMin - i;
        }
        try {
            return ((ParcelFileDescriptor.AutoCloseInputStream) yqtVar.c()).read(bArr, i, i2);
        } catch (IOException e) {
            ((zdv) ((zdv) ((zdv) d.c().o(zfi.a, "EmulatedMic")).p(e)).q("com/google/android/libraries/search/audio/extensions/apps/emulatormicrophone/EmulatedUriAudioRecord", "read", 'i', "EmulatedUriAudioRecord.java")).u("#audio# IOException");
            return 0;
        }
    }

    @Override // android.media.AudioRecord
    public final void release() throws IOException {
        yqt yqtVar = (yqt) this.e.eV();
        if (yqtVar.g()) {
            try {
                ((ParcelFileDescriptor.AutoCloseInputStream) yqtVar.c()).close();
            } catch (IOException e) {
                ((zdv) ((zdv) ((zdv) d.c().o(zfi.a, "EmulatedMic")).p(e)).q("com/google/android/libraries/search/audio/extensions/apps/emulatormicrophone/EmulatedUriAudioRecord", "release", (char) 129, "EmulatedUriAudioRecord.java")).u("#audio# IOException on close");
            }
        }
    }

    @Override // android.media.AudioRecord
    public final void startRecording() {
    }

    @Override // android.media.AudioRecord
    public final void startRecording(MediaSyncEvent mediaSyncEvent) {
    }

    @Override // android.media.AudioRecord
    public final void stop() {
    }
}
