package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.tv.remote.service.AudioStream;
import com.google.android.tv.remote.service.IAtvAudioProviderService;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbw implements jbu {
    public static final /* synthetic */ int b = 0;
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/voice/controller/FileBasedAudioInputImpl");
    public IAtvAudioProviderService a;
    private final Context d;
    private final ghr e;
    private veo f;

    static {
        ComponentName.createRelative("com.google.android.tv.remote.service", ".RemoteService").getClass();
    }

    public jbw(Context context, ghr ghrVar) {
        context.getClass();
        ghrVar.getClass();
        this.d = context;
        this.e = ghrVar;
    }

    @Override // defpackage.jbu
    public final AudioStream a() throws IOException {
        IAtvAudioProviderService iAtvAudioProviderService = this.a;
        if (iAtvAudioProviderService == null) {
            ((zdv) c.b().q("com/google/android/apps/tvsearch/voice/controller/FileBasedAudioInputImpl", "getAudioStream", 63, "FileBasedAudioInputImpl.kt")).u("AudioProviderSource is null. Looks like the service is not connected.");
            return null;
        }
        try {
            AudioStream audioStreamE = iAtvAudioProviderService.e();
            int i = 3;
            if (audioStreamE == null) {
                this.e.G(3);
                return null;
            }
            int iD = audioStreamE.d();
            int iB = audioStreamE.b();
            int iA = audioStreamE.a();
            if (iA != 8) {
                if (iA != 16) {
                    throw new IllegalStateException("Unknown audio format.");
                }
                i = 2;
            }
            if (iD == 16000) {
                if (iB == 1) {
                    if (i == 2) {
                        return audioStreamE;
                    }
                    iB = 1;
                }
                iD = 16000;
            }
            ParcelFileDescriptor parcelFileDescriptorE = audioStreamE.e();
            if (parcelFileDescriptorE != null) {
                parcelFileDescriptorE.closeWithError("Stream configuration mismatch (expected, actual). Sample rate (16000, " + iD + "), channels (1, " + iB + "), audio format (2, " + i + ")");
            }
            this.e.G(4);
            return null;
        } catch (RemoteException unused) {
            this.e.G(2);
            return null;
        } catch (RuntimeException unused2) {
            this.e.G(2);
            return null;
        }
    }

    @Override // defpackage.jbu
    public final synchronized void b() {
        if (this.f == null) {
            veo veoVar = new veo(this.d, ComponentName.createRelative("com.google.android.tv.remote.service", ".RemoteService"), new jbv(this));
            veoVar.a();
            this.f = veoVar;
        }
    }
}
