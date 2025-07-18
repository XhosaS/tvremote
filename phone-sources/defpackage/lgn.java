package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgn {
    private static final tui a = tui.l("com/google/android/apps/play/movies/common/service/drm/WidevineMediaDrmWrapperFactory");

    public static lhe a(ksn ksnVar, String str, ksy ksyVar, byte[] bArr, int i, boolean z, lrq lrqVar, idf idfVar, Executor executor, lfn lfnVar, ContentResolver contentResolver, String str2) {
        ((tug) ((tug) a.g()).j("com/google/android/apps/play/movies/common/service/drm/WidevineMediaDrmWrapperFactory", "getOfflineTaskMediaDrmWrapperInstanceV2", 74, "WidevineMediaDrmWrapperFactory.java")).z("[Playback] getOfflineTaskMediaDrmWrapperInstanceV2: cencKeySetId=%s, forcedSecurityLevel=%s", bArr, i);
        return new lhe(ksnVar, str, ksyVar, true != z ? 2 : 3, bArr, i, null, trk.a, null, lrqVar, idfVar, executor, lfnVar, kdw.o(), contentResolver, str2);
    }
}
