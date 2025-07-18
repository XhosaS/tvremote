package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class set implements sdp {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource");
    private final String b;
    private final Context c;
    private yqt d = ypv.a;
    private final sly e;

    public set(String str, Context context, sly slyVar) {
        this.b = str;
        this.c = context;
        this.e = slyVar;
    }

    @Override // defpackage.sdp
    public final synchronized rxd a() {
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b().o(zfi.a, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "closeAudioSource", 75, "AudioUriAudioSource.java")).x("#audio# close audio source(%s)", szx.a(this));
        if (!this.d.g()) {
            ((zdv) ((zdv) zdyVar.d().o(zfi.a, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "closeAudioSource", 89, "AudioUriAudioSource.java")).x("#audio# close audio source(%s) failed: no audio stream", szx.a(this));
            return skj.f(107);
        }
        try {
            ((sew) this.d.c()).b();
            return skj.g();
        } catch (IOException e) {
            ((zdv) ((zdv) ((zdv) a.d().o(zfi.a, "ALT.URIAudioSource")).p(e)).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "closeAudioSource", 81, "AudioUriAudioSource.java")).x("#audio# close audio source(%s) failed: error closing audio stream", szx.a(this));
            return skj.f(202);
        }
    }

    @Override // defpackage.sdp
    public final sds b() {
        return sds.a.a(sdw.SOURCE_URI);
    }

    @Override // defpackage.sdp
    public final synchronized yqt c() {
        tpm tpmVarA;
        yqt yqtVarI;
        zdy zdyVar = a;
        zeo zeoVarB = zdyVar.b();
        zer zerVar = zfi.a;
        ((zdv) ((zdv) zeoVarB.o(zerVar, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "openAudioSource", 64, "AudioUriAudioSource.java")).x("#audio# open audio source(%s)", szx.a(this));
        Uri uri = Uri.parse(this.b);
        try {
            if (this.e.a(uri)) {
                tpmVarA = tpm.b;
            } else {
                String authority = uri.getAuthority();
                if (authority == null) {
                    ((zdv) ((zdv) zdyVar.d().o(zerVar, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 110, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream failed: URI authority absent.");
                    throw new sln("#createAudioUriStream failed: URI authority absent.", skj.b(rxh.FAILED_OPENING_URI_AUTHORITY_ABSENT));
                }
                ProviderInfo providerInfoResolveContentProvider = this.c.getPackageManager().resolveContentProvider(authority, 0);
                if (providerInfoResolveContentProvider == null) {
                    ((zdv) ((zdv) zdyVar.d().o(zerVar, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 118, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream failed: content provider not found.");
                    throw new sln("#createAudioUriStream failed: content provider not found.", skj.b(rxh.FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND));
                }
                String str = providerInfoResolveContentProvider.packageName;
                tpm tpmVar = tpm.a;
                tpl tplVar = new tpl();
                tplVar.c();
                tplVar.b = true;
                tplVar.b(new tpj(str));
                tpmVarA = tplVar.a();
            }
            AssetFileDescriptor assetFileDescriptorA = tpn.a(this.c, uri, "r", tpmVarA);
            if (assetFileDescriptorA == null) {
                ((zdv) ((zdv) zdyVar.d().o(zerVar, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 131, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream failed: opening file descriptor failed.");
                throw new sln("#createAudioUriStream failed: opening file descriptor failed.", skj.b(rxh.FAILED_OPENING_FILE_DESCRIPTOR_ERROR));
            }
            ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptorA.getParcelFileDescriptor();
            if (parcelFileDescriptor == null) {
                ((zdv) ((zdv) zdyVar.d().o(zerVar, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 140, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream failed: opening file descriptor failed.");
                throw new sln("#createAudioUriStream failed: opening file descriptor failed.", skj.b(rxh.FAILED_OPENING_FILE_DESCRIPTOR_ERROR));
            }
            ((zdv) ((zdv) zdyVar.b().o(zerVar, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 147, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream returning AudioPfdStream");
            yqtVarI = yqt.i(new sew(parcelFileDescriptor));
            this.d = yqtVarI;
        } catch (FileNotFoundException e) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 157, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream failed: file not found.");
            throw new sln("#createAudioUriStream failed: file not found.", skj.b(rxh.FAILED_OPENING_FILE_NOT_FOUND), e);
        } catch (SecurityException e2) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.URIAudioSource")).q("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "createAudioUriStream", 150, "AudioUriAudioSource.java")).u("#audio# createAudioUriStream failed: error opening file descriptor.");
            throw new sln("#createAudioUriStream failed: error opening file descriptor.", skj.b(rxh.FAILED_OPENING_FILE_SECURITY), e2);
        }
        return yqtVarI.g() ? yqt.i(this.d.c()) : ypv.a;
    }
}
