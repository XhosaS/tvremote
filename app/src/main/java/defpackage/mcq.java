package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcq implements SodaTransportFactory {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/s3client/SodaTikTokGrpcTransportFactory");
    public final Context b;
    public final Optional c;
    public final agow d;
    private final wxc e;

    public mcq(Context context, Optional optional, agow agowVar, wxc wxcVar) {
        this.b = context;
        this.c = optional;
        this.d = agowVar;
        this.e = wxcVar;
    }

    @Override // com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory
    public final mcr a(final adrn adrnVar) {
        return new mco(new Callable() { // from class: mcp
            @Override // java.util.concurrent.Callable
            public final Object call() throws PackageManager.NameNotFoundException {
                mcq mcqVar = this.a;
                adkp adkpVar = (adkp) mcqVar.d.a();
                String str = adrnVar.b;
                if (TextUtils.isEmpty(str)) {
                    mcqVar.c.isPresent();
                }
                Context context = mcqVar.b;
                afih afihVar = null;
                String str2 = "com.google.android.googlequicksearchbox";
                if (TextUtils.isEmpty(str)) {
                    str = true != TextUtils.equals(context.getApplicationInfo().packageName, "com.google.android.googlequicksearchbox") ? null : "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU";
                }
                String str3 = context.getApplicationInfo().packageName;
                String strA = mcm.a(context);
                if (Objects.equals(str3, "com.google.android.tts") && Objects.equals(str, "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU")) {
                    ((zdv) ((zdv) mcm.a.b()).q("com/google/android/libraries/assistant/soda/s3client/GrpcTransportUtils", "createExtraHeaders", 98, "GrpcTransportUtils.java")).u("Treate TTS apk to pretend to be AGSA and using its API key.");
                    strA = "58E1C4133F7441EC3D2C270270A14802DA47BA0E";
                } else {
                    str2 = str3;
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(strA)) {
                    ((zdv) ((zdv) mcm.a.d()).q("com/google/android/libraries/assistant/soda/s3client/GrpcTransportUtils", "createExtraHeaders", 107, "GrpcTransportUtils.java")).u("One of the required header values is empty.");
                } else {
                    afihVar = new afih();
                    afib afibVar = afih.b;
                    int i = afid.c;
                    afihVar.e(new afia("X-Goog-Api-Key", afibVar), str);
                    afihVar.e(new afia("X-Android-Package", afibVar), str2);
                    afihVar.e(new afia("X-Android-Cert", afibVar), strA);
                }
                if (afihVar != null) {
                    return (adkp) adkpVar.g(new ageq(afihVar));
                }
                ((zdv) ((zdv) mcq.a.d()).q("com/google/android/libraries/assistant/soda/s3client/SodaTikTokGrpcTransportFactory", "createTransport", 50, "SodaTikTokGrpcTransportFactory.java")).u("Soda gRPC Metadata is null! Transport connection likely to fail.");
                return adkpVar;
            }
        }, this.e);
    }
}
